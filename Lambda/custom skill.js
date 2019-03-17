let https = require('https');

exports.handler = (event, context) => {
    console.log(JSON.stringify(event));
    let request = event.request;
    if((request.type === 'IntentRequest')&&(request.intent.name === "GetAmdocsVideo")){
        console.log(`INTENT REQUEST`);
        let videoName = 'rec_cam_';
        let date = request.intent.slots.date.value;
        let cameraNumber = request.intent.slots.cameraNumber.value;
        date.replace('9','8');
        videoName += cameraNumber + '_' + date;
        //let endpoint = 'https://std.ch.amdocs.com/alexa-rest-service/rest/playSavedVideo?name='+videoName+'&access_token=' + event.session.user.accessToken;
        let body;
        let returnJson = {
            "version": "1.0",
            "sessionAttributes": null,
            "response": {
                "outputSpeech": null,
                "card": null,
                "directives": [
                    {
                        "type": "VideoApp.Launch",
                        "videoItem":
                            {
                                "source": "https://www.example.com/video/sample-video-1.mp4",
                                "metadata": {
                                    "title": "Title for Sample Video",
                                    "subtitle": "Secondary Title for Sample Video"
                                }
                            }
                    }
                ],
                "reprompt": null
            }
        };
        let errorJson = {
            "version": "1.0",
            "sessionAttributes": null,
            "response": {
                "outputSpeech": {
                    "type": "PlainText",
                    "text": null
                },
                "card":{
                    "type": "Standard",
                    "title" : "Something Went Wrong",
                    "text" : null,
                    "image" : {
                        "largeImageUrl": "https://s3.amazonaws.com/alexamta/9436653177_fd00cc9d2c_b.jpg"
                    }
                },
                "shouldEndSession": true
            }
        };
        // http request not implemeted
        //console.log('The access url: ' + endpoint);
        //https.get(endpoint, (response) => {
        //    response.on('data', (chunk) => { body += chunk });
        //    response.on('end', () => {
        //       console.log(body);
        //        let data = JSON.parse(body.replace('undefined',''));
        //        console.log(JSON.stringify(body));
        console.log(errorJson);
        console.log(videoName);
        if(cameraNumber !== '5'){
            console.log('wrong camera nubmer ' + cameraNumber);
            errorJson.response.outputSpeech.text = 'Can you please repeat the camera number, I didnt get it right';
            errorJson.response.card.text = 'Can you please repeat the camera number, I didnt get it righ';
            console.log(JSON.stringify(errorJson));
            context.succeed(errorJson);
        }
        else{
            console.log('good camera nubmer ' + cameraNumber)
            let url;
            let urls = ["https://s3.amazonaws.com/alexamta/rec_cam_5_2018-01-05-09-49-17.mp4",
                "https://s3.amazonaws.com/alexamta/rec_cam_5_2018-01-25-10-08-32.mp4"];
            for (let m_url in urls) {
                console.log(urls[m_url], m_url);
                if (urls[m_url].includes(videoName))
                    url = urls[m_url];
            }
            console.log("the url: " + url);
            if(url){
                console.log('good url ' + url)
                returnJson.response.directives[0].videoItem.source = url;
                returnJson.response.directives[0].videoItem.metadata.title = 'Amdocs camera video';
                returnJson.response.directives[0].videoItem.metadata.subtitle = 'Amdocs video: '+videoName;
                console.log(JSON.stringify(returnJson));
                context.succeed(returnJson);
            }
            else{
                console.log('wrong url ' + url)
                errorJson.response.outputSpeech.text = 'Can you please repeat the date, I didnt get it right';
                errorJson.response.card.text = 'Can you please repeat the date, I didnt get it right';
                console.log(JSON.stringify(errorJson));
                context.succeed(errorJson);
            }
        }

    }
};