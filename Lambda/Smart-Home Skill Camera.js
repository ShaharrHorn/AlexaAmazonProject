'use strict';
const https = require('https');

function processDeviceList(data) {
    let endpoints = [];
    for (let camera in data){
        let endpoint = getEndPoint();
        endpoint.endpointId = data[camera].deviceId.id;
        endpoint.friendlyName = data[camera].name;
        endpoint.description = data[camera].productTypeDisplayName;
        endpoints.push(endpoint);
    }
    return { "endpoints" : endpoints };
}


function getEndPoint(){
    return {
            "endpointId": "endpoint-001",
            "manufacturerName": "Amdocs",
            "friendlyName": "front camera",
            "description": "amdocs 001 front camera",
            "displayCategories": [
                "CAMERA"
            ],
            "cookie": {},
            "capabilities": [
                {
                    "type": "AlexaInterface",
                    "interface": "Alexa",
                    "version": "3"
                },
                {
                    "type": "AlexaInterface",
                    "interface": "Alexa.CameraStreamController",
                    "version": "3",
                    "cameraStreamConfigurations": [
                        {
                            "protocols": [
                                "RTSP"
                            ],
                            "resolutions": [
                                {
                                    "width": 1280,
                                    "height": 720
                                }
                            ],
                            "authorizationTypes": [
                                "NONE"
                            ],
                            "videoCodecs": [
                                "H264"
                            ],
                            "audioCodecs": [
                                "AAC"
                            ]
                        }
                    ]
                }]
    };
}

function generateMessageID() {
    return '12592fe4-bc0c-4a02-97a4-758e5fd239ce'; // Dummy
}

function handleDiscovery(request, context) {
    console.log('updating devices');
    let url = 'https://std.ch.amdocs.com/alexa-rest-service/rest/getAllDevices?access_token=' + request.directive.payload.scope.token;
    return httpsGet(url, request, context);
}

function httpsGet(url,request, context) {
    let body;
    console.log('what'+url);
    https.get(url, (response) => {
        response.on('data', (chunk) => {
            body += chunk
        });
        response.on('end', () => {
            let data = JSON.parse(body.slice(9));
            let header =  request.directive.header;
            header.name = "Discover.Response";
            header.messageId = generateMessageID();
            let payload = processDeviceList(data);
            console.log(JSON.stringify(header));
            console.log(JSON.stringify(payload));
            context.succeed({"event" : {header, payload}});
            console.log(JSON.stringify({"event" : {header, payload}}));
        })
    });
}


function handleControl(request, context) {
    console.log('updating uri');
    let event = {};
    let appId = request.directive.endpoint.endpointId;
    let url = 'https://std.ch.amdocs.com/alexa-rest-service/rest/startVideoStream?access_token=' + request.directive.endpoint.scope.token + '&id=' + appId;
    let body;
    event.header = request.directive.header;
    event.endpoint = {"endpointId" : appId};
    event.header.name = "Response";
    event.header.messageId = generateMessageID();
    https.get(url, (response) => {
        response.on('data', (chunk) => {
            body += chunk
        });
        response.on('end', () => {
            let data = JSON.parse(body.slice(9));
            let streamRtspUri = data.streamRtspUrl;
            let payload = getCameraStream();
            payload.cameraStreams[0].uri = streamRtspUri;
            event.payload = payload;
            console.log(JSON.stringify(data));
            console.log(JSON.stringify({'event': event}));
            context.succeed({'event': event});
        })
    })
}


function getCameraStream() {
    return {
        "cameraStreams": [{
            "uri": "rtsp://username:password@link.to.video:443/feed1.mp4",
            "protocol": "RTSP",
            "resolution": {
                "width": 1920,
                "height": 1080
            },
            "authorizationType": "NONE",
            "videoCodec": "H264",
            "audioCodec": "AAC"
        }],
        "imageUri": "https://i.pinimg.com/736x/7d/44/1f/7d441fa1467d5e2e92d6b2622455c586--thor-marvel-the-avengers.jpg"
    }
}
exports.handler = (request, context, callback) => {
    let resp;
    console.log(JSON.stringify(request));
    if (request.directive.header.namespace === 'Alexa.Discovery'){
        resp = handleDiscovery(request, context);
    }
    if (request.directive.header.namespace === 'Alexa.CameraStreamController' || request.directive.header.namespace.name === 'Alexa.InitializeCameraStreams'){
        resp = handleControl(request, context);
    }
    console.log(JSON.stringify(resp));

};
