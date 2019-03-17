/**
 * MobileHomeServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MobileHomeServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.amdocs.ch.api.mobile.MobileHomeService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[143];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSecurityPanelUserCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCodesRequest"), com.amdocs.ch.api.mobile.SecurityPanelUserCodesRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCodesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("synchronizeDevices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("callProfessionalSupport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerForPush");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resetMobileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushUserID"), com.amdocs.ch.api.mobile.MobilePushUserID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateGatewayPartitions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partitions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "armingPartition"), com.amdocs.ch.api.mobile.ArmingPartition[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserSecurityQuestions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityQuestionsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.SecurityQuestionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPairingMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setPairingModeRequest"), com.amdocs.ch.api.mobile.SetPairingModeRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeNFCInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoRequest"), com.amdocs.ch.api.mobile.NfcInfoRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignDeviceUsername");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "assignDeviceUsernameRequest"), com.amdocs.ch.api.mobile.AssignDeviceUsernameRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeSecurityQuestions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "changeSecurityQuestionsRequest"), com.amdocs.ch.api.mobile.ChangeSecurityQuestionsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startMotionCameraViewOnDemand");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateScenarioDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scenarioDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioBaseDetails"), com.amdocs.ch.api.mobile.ScenarioBaseDetails.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetPushMessageCounter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resetMobileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "resetMobileRequest"), com.amdocs.ch.api.mobile.ResetMobileRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startVideoStreaming");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "protocol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoStreamProtocol"), com.amdocs.ch.api.mobile.VideoStreamProtocol.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSession"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.VideoSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "videoTranslationSession"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMobileTokensByCustomerId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileTokenUserIdResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileTokenUserIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPermissionsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.UserPermissionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSecurityDeviceAdvancedSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAdvancedSettingsRequest"), com.amdocs.ch.api.mobile.DeviceAdvancedSettingsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAdvancedSettingsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllCustomerUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allCustomerUsersResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.AllCustomerUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogHistoryDepth");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllGatewayScenarios");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayScenariosResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.GatewayScenariosResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveImageSnapshot");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSecurityDeviceAdvancedSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAdvancedSettingsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNotificationCategoriesAndTargetTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategoriesAndTargetTypesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.NotificationCategoriesAndTargetTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendNotificationMobilePush");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "text"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNFCInfoList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoListResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.NfcInfoListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCameraAdvancedSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraAdvancedSettingsRequest"), com.amdocs.ch.api.mobile.CameraAdvancedSettingsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeviceAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttributesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.DeviceAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllScenariosExecutionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allScenariosExecutionStatusResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.AllScenariosExecutionStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDeviceAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttribute"), com.amdocs.ch.api.mobile.DeviceAttribute[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unregisterForPush");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resetMobileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushUserID"), com.amdocs.ch.api.mobile.MobilePushUserID.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDeviceStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newDeviceStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceStatus"), com.amdocs.ch.api.mobile.DeviceStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeSucceeded"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRecordedVideosCamerasNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "recordedVideosCamerasNamesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.RecordedVideosCamerasNamesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPushHistoryData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushHistoryResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobilePushHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setSecuritySirensState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setSecuritySirensStateRequest"), com.amdocs.ch.api.mobile.SetSecuritySirensStateRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserPreferencesByUserName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPreferenceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.UserPreferenceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setSecurityDeviceBypass");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityDeviceBypassRequest"), com.amdocs.ch.api.mobile.SecurityDeviceBypassRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllGatewayUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayUsersResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.GatewayUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("triggerNfcScenarios");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoRequest"), com.amdocs.ch.api.mobile.NfcInfoRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGatewayScenario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scenarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayScenarioResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.GatewayScenarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevicesByType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productType"), com.amdocs.ch.api.mobile.ProductType[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerDevice"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CustomerDevice[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "customerDevices"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllSecurityQuestions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityQuestionsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.SecurityQuestionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendUpdateMobilePush");
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWPSStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayWPSStatusResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.GatewayWPSStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCamerasWifiStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "camerasWifiStatusResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CamerasWifiStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendScenarioExecutionCommand");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scenarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "command"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionCommand"), com.amdocs.ch.api.mobile.ScenarioExecutionCommand.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUIRelatedDevices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "uiRelatedDevicesRequest"), com.amdocs.ch.api.mobile.UiRelatedDevicesRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "uiRelatedDevicesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.UiRelatedDevicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "siteRequest"), com.amdocs.ch.api.mobile.SiteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevicesAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributeName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "devicesAttributesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.DevicesAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addNFCInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoRequest"), com.amdocs.ch.api.mobile.NfcInfoRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.NfcInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNewDeviceAfterPairing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "homeDeviceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.HomeDeviceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetEnergyInstantPower");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceSerial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopImageSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeSucceeded"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopMaintenanceMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateScenarioStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scenarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioStatus"), com.amdocs.ch.api.mobile.ScenarioStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isAcceptedTermsAndConditions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "acceptedTermsAndConditionsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.AcceptedTermsAndConditionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "changePasswordRequest"), com.amdocs.ch.api.mobile.ChangePasswordRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMobileTokensByUserId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileTokenUserIdResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileTokenUserIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGatewayPartitionArmingMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "basePartition"), com.amdocs.ch.api.mobile.BasePartition.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayArmingModeResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.GatewayArmingModeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("acceptTermsAndConditions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStreamingCamera");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.Id.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "streamingCamera"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("switchSite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "siteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "switchSiteMobileResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.SwitchSiteMobileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getImageSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "imageSession"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.ImageSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "imageTranslationSession"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateScenario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scenario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenario"), com.amdocs.ch.api.mobile.Scenario.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeviceBySerial");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceSerial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerDevice"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CustomerDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "customerDevice"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopVideoStreaming");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "existingVideoSession"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSession"), com.amdocs.ch.api.mobile.VideoSession.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeSucceeded"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBadge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushBadgeResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobilePushBadgeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendCameraCommand");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cameraCommand"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraCommand"), com.amdocs.ch.api.mobile.CameraCommand.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeSucceeded"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNFCInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.NfcInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductMetadataById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadataResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.ProductMetadataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPushHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "counter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushHistoryResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobilePushHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startVideoPlayback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "recordId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "protocol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoStreamProtocol"), com.amdocs.ch.api.mobile.VideoStreamProtocol.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSession"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.VideoSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "playbackVideoSession"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCameraAdvancedSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraAdvancedSettingsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CameraAdvancedSettingsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setWPSMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wpsMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayWPSMode"), com.amdocs.ch.api.mobile.GatewayWPSMode.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRecordedVideos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordsRequest"), com.amdocs.ch.api.mobile.VideoRecordsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.VideoRecordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeSubUserStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userSiteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userStatus"), com.amdocs.ch.api.mobile.UserStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDefaultLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "defaultUserLanguage"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerDevice"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CustomerDevice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "customerDevice"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVideoSessionInProgressByCameraId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionInProgressResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.VideoSessionInProgressResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevicesByProductGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productGroup"), com.amdocs.ch.api.mobile.ProductGroup.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "devicesByProductGroupResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.DevicesByProductGroupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "customerDevices"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLogHistoryDepth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getScenarioExecutionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scenarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatusResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.ScenarioExecutionStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSingleValueMeasurements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeMeasurementsRequest"), com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "singleValueMeasurementsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.SingleValueMeasurementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setGatewayPartitionArmingMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "armingPartition"), com.amdocs.ch.api.mobile.ArmingPartition.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllAvailableWifiConnections");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allAvailableWifiDetailsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.AllAvailableWifiDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUrlEncryptor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "urlEncryptor"), com.amdocs.ch.api.mobile.UrlEncryptor.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isProfessionalSupportServiceActive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteScenario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scenarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserVerticals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerVerticalsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CustomerVerticalsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPairingProgressStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "pairingProgressStatusResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.PairingProgressStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVideoSessionInProgress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "streamId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionInProgressResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.VideoSessionInProgressResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMultiValueMeasurements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeMeasurementsRequest"), com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "multiValueMeasurementsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MultiValueMeasurementsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreditUsageHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "toDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "creditSummary"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CreditSummary.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "creditSummary"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserExternalScenarios");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userExternalScenariosResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.UserExternalScenariosResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setGatewayNotificationTargets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTargets"), com.amdocs.ch.api.mobile.NotificationTargets.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isValidNotificationTarget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTargetRequest"), com.amdocs.ch.api.mobile.NotificationTargetRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMobileTokensByGatewayId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileTokenUserIdResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileTokenUserIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUserPersonalDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setPersonalDetailsRequest"), com.amdocs.ch.api.mobile.SetPersonalDetailsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "personalDetails"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRecordedVideo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "recordedVideoRequest"), com.amdocs.ch.api.mobile.RecordedVideoRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.VideoRecordsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startImage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "imageSession"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.ImageSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "imageTranslationSession"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("approvePrivacyPolicy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserPersonalDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPersonalDetailsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.UserPersonalDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "personalDetails"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllSiteUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "siteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allSiteUsersResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.AllSiteUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSecurityDevicesHavingAdvancedSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityDevicesHavingAdvancedSettingsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.SecurityDevicesHavingAdvancedSettingsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSubUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "subUserRequest"), com.amdocs.ch.api.mobile.SubUserRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSiteResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.UserSiteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getViewOnDemandMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileViewOnDemandResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileViewOnDemandResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("runZwaveControllerAdvancedCommand");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "command"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "zwaveControllerCommanType"), com.amdocs.ch.api.mobile.ZwaveControllerCommanType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMeasurementsStartTimestamp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeMeasurementsRequest"), com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementsStartTimestampResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MeasurementsStartTimestampResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllCustomerVerticals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerVerticalsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CustomerVerticalsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setGatewayTimezone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timezone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("triggerExternalScenarioEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scenarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isInMaintenance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSecurityPanelUserCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCodesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGatewayNotificationTargets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTargetsRequest"), com.amdocs.ch.api.mobile.NotificationTargetsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTargetsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.NotificationTargetsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUIRelatedHomeDevices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "uiRelatedDevicesRequest"), com.amdocs.ch.api.mobile.UiRelatedDevicesRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "uiRelatedHomeDevicesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.UiRelatedHomeDevicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendNotificationMobilePushMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "text"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMobileTokensByUserName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileTokenUserIdResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileTokenUserIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("refreshImageSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "imageSession"), com.amdocs.ch.api.mobile.ImageSession.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "imageSession"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.ImageSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "imageTranslationSession"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startVideoRecording");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "existingVideoSession"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSession"), com.amdocs.ch.api.mobile.VideoSession.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "recordId"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGatewayConrollerInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayConrollerInfoResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.GatewayConrollerInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUserPreferences");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPreferenceRequest"), com.amdocs.ch.api.mobile.UserPreferenceRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startMaintenanceMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopVideoRecording");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "currentlyRecordedSession"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSession"), com.amdocs.ch.api.mobile.VideoSession.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "recordingId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeSucceeded"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setGatewayArmingMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newGatewayArmingMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayArmingMode"), com.amdocs.ch.api.mobile.GatewayArmingMode.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "changeSucceeded"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDevices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerDevice"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CustomerDevice[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "customerDevice"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getGatewayId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "gatewayID"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setInitialApprovals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "initialApprovalsRequest"), com.amdocs.ch.api.mobile.InitialApprovalsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createScenario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scenario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenario"), com.amdocs.ch.api.mobile.Scenario.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "CreateScenarioResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CreateScenarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllUserSites");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allUserSitesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.AllUserSitesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getHistoryRequest"), com.amdocs.ch.api.mobile.GetHistoryRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "historyResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.HistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProductMetadataSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadataSetRequest"), com.amdocs.ch.api.mobile.ProductMetadataSetRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadataSetResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.ProductMetadataSetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPairingMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayPairingModeResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.GatewayPairingModeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreditCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "creditCount"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateSubUserRequest"), com.amdocs.ch.api.mobile.UpdateSubUserRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSiteResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.UserSiteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSiteDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "siteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "siteDetailsResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.SiteDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendRegistrationEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "siteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getImageSnapshot");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "imageSnapshotResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.ImageSnapshotResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isSupportRequestExist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerSupportStatus"), com.amdocs.ch.api.mobile.CustomerSupportStatus[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteVideoRecords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "recordedVideoId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAvailableUserCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "availableCodesRequest"), com.amdocs.ch.api.mobile.AvailableCodesRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "availableCodesResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.AvailableCodesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomerGatewayDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gatewayID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerGatewayDetails"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.CustomerGatewayDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "gatewayDetails"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configureSecondaryWifiSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "secondaryWifiSettingsRequest"), com.amdocs.ch.api.mobile.SecondaryWifiSettingsRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnergyInstantPower");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "energyInstantPowerSummaryRequest"), com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "energyInstantPowerSummaryResponse"));
        oper.setReturnClass(com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[142] = oper;

    }

    public MobileHomeServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MobileHomeServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MobileHomeServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>billableActionCreditConsumption>creaditPerDate>entry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.BillableActionCreditConsumptionCreaditPerDateEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>multiValueMeasurementDto>values>entry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MultiValueMeasurementDtoValuesEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>pushMessage>data>entry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.PushMessageDataEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>securityPanelConfiguration>parameters>entry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelConfigurationParametersEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>securityPanelConfiguration>validValues>entry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelConfigurationValidValuesEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>userPreferenceRequest>userPreferences>entry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPreferenceRequestUserPreferencesEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>userPreferenceResponse>userPreferences>entry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPreferenceResponseUserPreferencesEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>userSite>userPreferences>entry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserSiteUserPreferencesEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>videoRecord>filesStatus>entry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoRecordFilesStatusEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">allAvailableWifiDetailsResponse>wifiScanDetailsList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.WifiScanDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiScanDetails");
            qName2 = new javax.xml.namespace.QName("", "wifiScanDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">allCustomerUsersResponse>users");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPersonalDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPersonalDetails");
            qName2 = new javax.xml.namespace.QName("", "user");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">allScenariosExecutionStatusResponse>allScenariosStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatusDetail");
            qName2 = new javax.xml.namespace.QName("", "scenarioStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">allSiteUsersResponse>userSites");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserSiteFullInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSiteFullInfo");
            qName2 = new javax.xml.namespace.QName("", "userSite");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">allUserSitesResponse>userSites");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserSite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSite");
            qName2 = new javax.xml.namespace.QName("", "userSite");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">baseDashboardDevices>devices");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.HomeDevice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "homeDevice");
            qName2 = new javax.xml.namespace.QName("", "device");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">billableActionCreditConsumption>creaditPerDate");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.BillableActionCreditConsumptionCreaditPerDateEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>billableActionCreditConsumption>creaditPerDate>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">cameraAdvancedSettingsResponse>cameraVideoQualityDetailsList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CameraVideoQuality[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraVideoQuality");
            qName2 = new javax.xml.namespace.QName("", "cameraVideoQualityDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">camerasWifiStatusResponse>wifiStatusDetailsList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.WifiStatusDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiStatusDetails");
            qName2 = new javax.xml.namespace.QName("", "wifiStatusDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">changeSecurityQuestionsRequest>questionAnswers");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityQuestionAnswer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityQuestionAnswer");
            qName2 = new javax.xml.namespace.QName("", "questionAnswer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">customerGatewayDetails>partitions");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ArmingPartition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "armingPartition");
            qName2 = new javax.xml.namespace.QName("", "partition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">customerVerticalsResponse>verticalsList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "vertical");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">deviceAdvancedSettingsRequest>deviceAdvancedSettingsList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelConfiguration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelConfiguration");
            qName2 = new javax.xml.namespace.QName("", "deviceAdvancedSettings");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">deviceAdvancedSettingsResponse>deviceAdvancedSettingsList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelConfiguration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelConfiguration");
            qName2 = new javax.xml.namespace.QName("", "deviceAdvancedSettings");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">deviceAttributes>deviceAtrributeList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttribute");
            qName2 = new javax.xml.namespace.QName("", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">devicesAttributesResponse>listDeviceAtrributes");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceAttributes[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttributes");
            qName2 = new javax.xml.namespace.QName("", "deviceAtrributes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">gatewayConrollerInfoResponse>contollerInfoAttributes");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GeneralParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "generalParameter");
            qName2 = new javax.xml.namespace.QName("", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">gatewayScenariosResponse>scenariosList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.Scenario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenario");
            qName2 = new javax.xml.namespace.QName("", "scenario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">gatewayUsersResponse>usersInfo");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userInfo");
            qName2 = new javax.xml.namespace.QName("", "userInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">homeDevice>attributes");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttribute");
            qName2 = new javax.xml.namespace.QName("", "attribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">homeDevice>deviceProductGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "productGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">multiValueMeasurement>values");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ValueMeasurement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "ValueMeasurement");
            qName2 = new javax.xml.namespace.QName("", "measurement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">multiValueMeasurementDto>values");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MultiValueMeasurementDtoValuesEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>multiValueMeasurementDto>values>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">multiValueMeasurementsResponse>results");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MultiValueMeasurement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "multiValueMeasurement");
            qName2 = new javax.xml.namespace.QName("", "multiValueMeasurement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">nfcInfoListResponse>nfcInfos");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NfcInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfo");
            qName2 = new javax.xml.namespace.QName("", "nfcInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">notificationCategoriesAndTargetTypesResponse>categoriesToTargets");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationCategoryTargets[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategoryTargets");
            qName2 = new javax.xml.namespace.QName("", "categoryToTargets");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">notificationCategoryTargets>targetTypes");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.EventNotificationTargetType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetType");
            qName2 = new javax.xml.namespace.QName("", "targetType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">notificationTargets>targets");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationTarget[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget");
            qName2 = new javax.xml.namespace.QName("", "notificationTarget");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">notificationTargetsRequest>notificationCategories");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationCategory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategory");
            qName2 = new javax.xml.namespace.QName("", "notificationCategory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">notificationTargetsResponse>targets");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.EventNotificationTarget[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTarget");
            qName2 = new javax.xml.namespace.QName("", "target");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">productMetadata>characteristics");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductCharacteristic[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productCharacteristic");
            qName2 = new javax.xml.namespace.QName("", "characteristic");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">productMetadata>childProducts");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "name");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">productMetadata>productGroups");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productGroup");
            qName2 = new javax.xml.namespace.QName("", "group");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">productMetadata>protocols");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProtocolName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "protocolName");
            qName2 = new javax.xml.namespace.QName("", "protocolName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">pushMessage>data");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.PushMessageDataEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>pushMessage>data>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">scenario>actions");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioAction");
            qName2 = new javax.xml.namespace.QName("", "action");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">scenarioAction>parameters");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GeneralParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "generalParameter");
            qName2 = new javax.xml.namespace.QName("", "parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">securityDevicesHavingAdvancedSettingsResponse>securityDeviceIdList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.Id[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id");
            qName2 = new javax.xml.namespace.QName("", "securityDeviceId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">securityPanelConfiguration>parameters");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelConfigurationParametersEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>securityPanelConfiguration>parameters>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">securityPanelConfiguration>validValues");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelConfigurationValidValuesEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>securityPanelConfiguration>validValues>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">securityPanelUserCodesRequest>securityPanelUserCodesList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelUserCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCode");
            qName2 = new javax.xml.namespace.QName("", "securityPanelUserCodes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">securityPanelUserCodesResponse>securityPanelUserCodesList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelUserCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCode");
            qName2 = new javax.xml.namespace.QName("", "securityPanelUserCodes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">subUserRequest>permissionsList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CustomerPermissions[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerPermissions");
            qName2 = new javax.xml.namespace.QName("", "permission");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">subUserRequest>targets");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationTarget[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget");
            qName2 = new javax.xml.namespace.QName("", "target");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userExternalScenariosResponse>scenariosList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.Scenario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenario");
            qName2 = new javax.xml.namespace.QName("", "scenario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userPermissionsResponse>permissionsList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CustomerPermissions[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerPermissions");
            qName2 = new javax.xml.namespace.QName("", "permission");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userPersonalDetails>otherUserSites");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserSite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSite");
            qName2 = new javax.xml.namespace.QName("", "userSite");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userPersonalDetails>permissionsList");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CustomerPermissions[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerPermissions");
            qName2 = new javax.xml.namespace.QName("", "permission");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userPersonalDetails>securityQuestionsList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "securityQuestion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userPersonalDetailsResponse>targets");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationTarget[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget");
            qName2 = new javax.xml.namespace.QName("", "target");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userPreferenceRequest>userPreferences");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPreferenceRequestUserPreferencesEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>userPreferenceRequest>userPreferences>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userPreferenceResponse>userPreferences");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPreferenceResponseUserPreferencesEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>userPreferenceResponse>userPreferences>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userSite>userPreferences");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserSiteUserPreferencesEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>userSite>userPreferences>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">userSiteFullInfo>notificationTargets");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationTarget[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget");
            qName2 = new javax.xml.namespace.QName("", "target");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">verticalDevices>verticalDashboardDevices");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.BaseDashboardDevices[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "baseDashboardDevices");
            qName2 = new javax.xml.namespace.QName("", "dashboardDevices");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">videoRecord>filesStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoRecordFilesStatusEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>videoRecord>filesStatus>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "abstractGatewayDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AbstractGatewayDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "acceptedTermsAndConditionsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AcceptedTermsAndConditionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "address");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allAvailableWifiDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AllAvailableWifiDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allCustomerUsersResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AllCustomerUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allScenariosExecutionStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AllScenariosExecutionStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allSiteUsersResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AllSiteUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allUserSitesResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AllUserSitesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "armingPartition");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ArmingPartition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "assignDeviceUsernameRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AssignDeviceUsernameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "audioFile");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AudioFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "authDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AuthDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "availableCode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AvailableCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "availableCodesRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AvailableCodesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "availableCodesResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.AvailableCodesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "baseDashboardDevices");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.BaseDashboardDevices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "baseMeasurementData");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.BaseMeasurementData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "basePartition");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.BasePartition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "batteryStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.BatteryStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "billableActionCreditConsumption");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.BillableActionCreditConsumption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "billableActionType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.BillableActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraAdvancedSettingsRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CameraAdvancedSettingsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraAdvancedSettingsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CameraAdvancedSettingsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraCommand");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CameraCommand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraFixedQuality");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CameraFixedQuality.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraResoution");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CameraResoution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "camerasWifiStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CamerasWifiStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraVideoQuality");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CameraVideoQuality.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraVideoQualityOption");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CameraVideoQualityOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "changePasswordRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ChangePasswordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "changeSecurityQuestionsRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ChangeSecurityQuestionsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "CreateScenarioResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CreateScenarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "creditSummary");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CreditSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerDevice");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CustomerDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerGatewayDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CustomerGatewayDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerPermissions");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CustomerPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerSupportStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CustomerSupportStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerVerticalsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.CustomerVerticalsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "dashboardDevicePriority");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DashboardDevicePriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "dashboardDevices");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DashboardDevices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "dashboardHomeDevices");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DashboardHomeDevices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAdvancedSettingsRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceAdvancedSettingsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAdvancedSettingsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttribute");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttributes");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttributesResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "devicePowerSummary");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DevicePowerSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "devicesAttributesResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DevicesAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "devicesByProductGroupResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DevicesByProductGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DeviceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "doorLockMode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DoorLockMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "doorLockSettings");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.DoorLockSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "emailNotificationTarget");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.EmailNotificationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "energyInstantPowerSummaryRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "energyInstantPowerSummaryResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTarget");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.EventNotificationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.EventNotificationTargetStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.EventNotificationTargetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayArmingMode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayArmingMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayArmingModeResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayArmingModeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayAudioFile");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayAudioFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayConnectionType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayConnectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayConrollerInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayConrollerInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayMessageType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayMessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayMuteMode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayMuteMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayPairingMode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayPairingMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayPairingModeResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayPairingModeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayScenarioResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayScenarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayScenariosResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayScenariosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayUsersResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayWPSMode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayWPSMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayWPSStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayWPSStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayWPSStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GatewayWPSStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "generalParameter");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GeneralParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getHistoryRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.GetHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "historyEntry");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.HistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "historyResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.HistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "homeDevice");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.HomeDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "homeDeviceResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.HomeDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.Id.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "imageSession");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ImageSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "imageSnapshotResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ImageSnapshotResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "initialApprovalsRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.InitialApprovalsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "iNotificationTarget");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.INotificationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "iNotificationTargetRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.INotificationTargetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "ivrNotificationTarget");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.IvrNotificationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logCategory");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.LogCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "loggedAlert");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.LoggedAlert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logRecordReason");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.LogRecordReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logRecordType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.LogRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "manufacturerProduct");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ManufacturerProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurement");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.Measurement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementDto");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MeasurementDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementsStartTimestampResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MeasurementsStartTimestampResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MeasurementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementUnitType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MeasurementUnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mmsNotificationTarget");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MmsNotificationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeMeasurementsRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushBadgeResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MobilePushBadgeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MobilePushHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushNotificationTarget");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MobilePushNotificationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushUserID");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MobilePushUserID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileToken");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MobileToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileTokenUserIdResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MobileTokenUserIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileViewOnDemandResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MobileViewOnDemandResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "multiValueMeasurement");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MultiValueMeasurement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "multiValueMeasurementDto");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MultiValueMeasurementDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "multiValueMeasurementsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.MultiValueMeasurementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfo");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NfcInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoListResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NfcInfoListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NfcInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NfcInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategoriesAndTargetTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationCategoriesAndTargetTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategory");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategoryTargets");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationCategoryTargets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTargetRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationTargetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTargets");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationTargets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTargetsRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationTargetsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTargetsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.NotificationTargetsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "paginationInfo");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.PaginationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "pairingFunctionalityType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.PairingFunctionalityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "pairingProgressStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.PairingProgressStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "periodUnitEnum");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.PeriodUnitEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "phoneNotificationTarget");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.PhoneNotificationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.PowerTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productCharacteristic");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductCharacteristic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productGroup");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadata");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductMetadata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadataResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductMetadataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadataSetRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductMetadataSetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadataSetResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductMetadataSetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "progressStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProgressStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "protocolName");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ProtocolName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "pushMessage");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.PushMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "questionAnswer");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.QuestionAnswer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "questionAnswerDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.QuestionAnswerDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "recordedVideoRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.RecordedVideoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "recordedVideosCamerasNamesResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.RecordedVideosCamerasNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "resetMobileRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ResetMobileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenario");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.Scenario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioAction");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioActionAlert");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioActionAlert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioActionType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioBaseDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioBaseDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionCommand");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioExecutionCommand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioExecutionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatusDetail");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioExecutionStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioTriggerEvent");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioTriggerEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioTriggerType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioTriggerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioValidityPeriod");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ScenarioValidityPeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "searchOrder");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SearchOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "secondaryWifiSettingsRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecondaryWifiSettingsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityDeviceBypassRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityDeviceBypassRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityDevicesHavingAdvancedSettingsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityDevicesHavingAdvancedSettingsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelConfiguration");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelUserCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCodesRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelUserCodesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCodesResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityQuestionAnswer");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityQuestionAnswer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityQuestionsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SecurityQuestionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sensorTriggerMode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SensorTriggerMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setPairingModeRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SetPairingModeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setPersonalDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SetPersonalDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setSecuritySirensStateRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SetSecuritySirensStateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "singleValueMeasurementsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SingleValueMeasurementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "site");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.Site.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "siteDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SiteDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "siteDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SiteDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "siteGatewayDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SiteGatewayDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "siteRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SiteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "smsNotificationTarget");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SmsNotificationTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "subUserRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SubUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "switchSiteMobileResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.SwitchSiteMobileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "title");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.Title.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "uiRelatedDevicesRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UiRelatedDevicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "uiRelatedDevicesResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UiRelatedDevicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "uiRelatedHomeDevicesResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UiRelatedHomeDevicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateSubUserRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UpdateSubUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "urlEncryptor");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UrlEncryptor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "user");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userBaseInfo");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserBaseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userCodeName");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserCodeName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userCodeStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserCodeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userExternalScenariosResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserExternalScenariosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userInfo");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPermissionsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPermissionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPersonalDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPersonalDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPersonalDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPersonalDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPreferenceKey");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPreferenceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPreferenceRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPreferenceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPreferenceResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserPreferenceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSite");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserSite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSiteFullInfo");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserSiteFullInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSiteResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserSiteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "ValueMeasurement");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ValueMeasurement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "verticalDevices");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VerticalDevices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecord");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordingStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoRecordingStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordingTriggerType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoRecordingTriggerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordingType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoRecordingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordsRequest");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoRecordsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordsResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoRecordsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSession");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionAction");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoSessionAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionActionType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoSessionActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionInProgress");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoSessionInProgress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionInProgressResponse");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoSessionInProgressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionStatus");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoSessionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoStreamProtocol");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.VideoStreamProtocol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "viewOnDemandMode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ViewOnDemandMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiEncryptionType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.WifiEncryptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiMode");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.WifiMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiScanDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.WifiScanDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiSettings");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.WifiSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiStatusDetails");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.WifiStatusDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "zwaveControllerCommanType");
            cachedSerQNames.add(qName);
            cls = com.amdocs.ch.api.mobile.ZwaveControllerCommanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse updateSecurityPanelUserCodes(com.amdocs.ch.api.mobile.SecurityPanelUserCodesRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateSecurityPanelUserCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse synchronizeDevices(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "synchronizeDevices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse callProfessionalSupport(long customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "callProfessionalSupport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(customerID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse registerForPush(com.amdocs.ch.api.mobile.MobilePushUserID resetMobileRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "registerForPush"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetMobileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateGatewayPartitions(long gatewayID, com.amdocs.ch.api.mobile.ArmingPartition[] partitions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateGatewayPartitions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), partitions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.SecurityQuestionsResponse getUserSecurityQuestions(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getUserSecurityQuestions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.SecurityQuestionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.SecurityQuestionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.SecurityQuestionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setPairingMode(com.amdocs.ch.api.mobile.SetPairingModeRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setPairingMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse removeNFCInfo(com.amdocs.ch.api.mobile.NfcInfoRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "removeNFCInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse assignDeviceUsername(com.amdocs.ch.api.mobile.AssignDeviceUsernameRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "assignDeviceUsername"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse changeSecurityQuestions(com.amdocs.ch.api.mobile.ChangeSecurityQuestionsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "changeSecurityQuestions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse startMotionCameraViewOnDemand(long gatewayID, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "startMotionCameraViewOnDemand"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateScenarioDetails(com.amdocs.ch.api.mobile.ScenarioBaseDetails scenarioDetails) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateScenarioDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {scenarioDetails});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse resetPushMessageCounter(com.amdocs.ch.api.mobile.ResetMobileRequest resetMobileRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "resetPushMessageCounter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetMobileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.VideoSession startVideoStreaming(long deviceID, com.amdocs.ch.api.mobile.VideoStreamProtocol protocol) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "startVideoStreaming"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID), protocol});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.VideoSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.VideoSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.VideoSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileTokenUserIdResponse getMobileTokensByCustomerId(long customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getMobileTokensByCustomerId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(customerID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileTokenUserIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileTokenUserIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileTokenUserIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.UserPermissionsResponse getUserPermissions(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getUserPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.UserPermissionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.UserPermissionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.UserPermissionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse updateSecurityDeviceAdvancedSettings(com.amdocs.ch.api.mobile.DeviceAdvancedSettingsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateSecurityDeviceAdvancedSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.AllCustomerUsersResponse getAllCustomerUsers(long customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAllCustomerUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(customerID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.AllCustomerUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.AllCustomerUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.AllCustomerUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int getLogHistoryDepth() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getLogHistoryDepth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.GatewayScenariosResponse getAllGatewayScenarios(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAllGatewayScenarios"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.GatewayScenariosResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.GatewayScenariosResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.GatewayScenariosResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse saveImageSnapshot(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "saveImageSnapshot"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse getSecurityDeviceAdvancedSettings(long gatewayID, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getSecurityDeviceAdvancedSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.NotificationCategoriesAndTargetTypesResponse getNotificationCategoriesAndTargetTypes(long customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getNotificationCategoriesAndTargetTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(customerID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.NotificationCategoriesAndTargetTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.NotificationCategoriesAndTargetTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.NotificationCategoriesAndTargetTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendNotificationMobilePush(java.lang.String title, java.lang.String text, java.lang.String productType, java.lang.String reason) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sendNotificationMobilePush"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {title, text, productType, reason});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.NfcInfoListResponse getNFCInfoList(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getNFCInfoList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.NfcInfoListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.NfcInfoListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.NfcInfoListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateCameraAdvancedSettings(com.amdocs.ch.api.mobile.CameraAdvancedSettingsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateCameraAdvancedSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.DeviceAttributesResponse getDeviceAttributes(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getDeviceAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.DeviceAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.DeviceAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.DeviceAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.AllScenariosExecutionStatusResponse getAllScenariosExecutionStatus(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAllScenariosExecutionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.AllScenariosExecutionStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.AllScenariosExecutionStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.AllScenariosExecutionStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setDeviceAttributes(long deviceID, com.amdocs.ch.api.mobile.DeviceAttribute[] deviceAttribute) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setDeviceAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID), deviceAttribute});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse unregisterForPush(com.amdocs.ch.api.mobile.MobilePushUserID resetMobileRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "unregisterForPush"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetMobileRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean setDeviceStatus(long deviceID, com.amdocs.ch.api.mobile.DeviceStatus newDeviceStatus) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setDeviceStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID), newDeviceStatus});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.RecordedVideosCamerasNamesResponse getRecordedVideosCamerasNames(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getRecordedVideosCamerasNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.RecordedVideosCamerasNamesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.RecordedVideosCamerasNamesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.RecordedVideosCamerasNamesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobilePushHistoryResponse getPushHistoryData(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getPushHistoryData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobilePushHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobilePushHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobilePushHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setSecuritySirensState(com.amdocs.ch.api.mobile.SetSecuritySirensStateRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setSecuritySirensState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.UserPreferenceResponse getUserPreferencesByUserName(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getUserPreferencesByUserName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.UserPreferenceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.UserPreferenceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.UserPreferenceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setSecurityDeviceBypass(com.amdocs.ch.api.mobile.SecurityDeviceBypassRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setSecurityDeviceBypass"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.GatewayUsersResponse getAllGatewayUsers(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAllGatewayUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.GatewayUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.GatewayUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.GatewayUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse triggerNfcScenarios(com.amdocs.ch.api.mobile.NfcInfoRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "triggerNfcScenarios"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.GatewayScenarioResponse getGatewayScenario(long scenarioID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getGatewayScenario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(scenarioID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.GatewayScenarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.GatewayScenarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.GatewayScenarioResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CustomerDevice[] getDevicesByType(long gatewayID, com.amdocs.ch.api.mobile.ProductType[] deviceTypes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getDevicesByType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), deviceTypes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CustomerDevice[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CustomerDevice[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CustomerDevice[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.SecurityQuestionsResponse getAllSecurityQuestions(java.lang.String locale) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAllSecurityQuestions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {locale});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.SecurityQuestionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.SecurityQuestionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.SecurityQuestionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendUpdateMobilePush() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sendUpdateMobilePush"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.GatewayWPSStatusResponse getWPSStatus(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getWPSStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.GatewayWPSStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.GatewayWPSStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.GatewayWPSStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CamerasWifiStatusResponse getCamerasWifiStatus(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getCamerasWifiStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CamerasWifiStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CamerasWifiStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CamerasWifiStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendScenarioExecutionCommand(long gatewayID, long scenarioID, com.amdocs.ch.api.mobile.ScenarioExecutionCommand command) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sendScenarioExecutionCommand"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), new java.lang.Long(scenarioID), command});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.UiRelatedDevicesResponse getUIRelatedDevices(com.amdocs.ch.api.mobile.UiRelatedDevicesRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getUIRelatedDevices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.UiRelatedDevicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.UiRelatedDevicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.UiRelatedDevicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateSite(com.amdocs.ch.api.mobile.SiteRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateSite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.DevicesAttributesResponse getDevicesAttributes(long[] deviceID, java.lang.String[] attributeName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getDevicesAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deviceID, attributeName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.DevicesAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.DevicesAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.DevicesAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.NfcInfoResponse addNFCInfo(com.amdocs.ch.api.mobile.NfcInfoRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "addNFCInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.NfcInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.NfcInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.NfcInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.HomeDeviceResponse getNewDeviceAfterPairing(long gatewayID, long productID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getNewDeviceAfterPairing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), new java.lang.Long(productID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.HomeDeviceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.HomeDeviceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.HomeDeviceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse resetEnergyInstantPower(long gatewayID, java.lang.String deviceSerial) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "resetEnergyInstantPower"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), deviceSerial});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean stopImageSession(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "stopImageSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse stopMaintenanceMode(long customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "stopMaintenanceMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(customerID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateScenarioStatus(long scenarioID, com.amdocs.ch.api.mobile.ScenarioStatus status) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateScenarioStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(scenarioID), status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.AcceptedTermsAndConditionsResponse isAcceptedTermsAndConditions(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "isAcceptedTermsAndConditions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.AcceptedTermsAndConditionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.AcceptedTermsAndConditionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.AcceptedTermsAndConditionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse changePassword(com.amdocs.ch.api.mobile.ChangePasswordRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "changePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileTokenUserIdResponse getMobileTokensByUserId(long userID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getMobileTokensByUserId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(userID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileTokenUserIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileTokenUserIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileTokenUserIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.GatewayArmingModeResponse getGatewayPartitionArmingMode(long gatewayID, com.amdocs.ch.api.mobile.BasePartition partition) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getGatewayPartitionArmingMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), partition});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.GatewayArmingModeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.GatewayArmingModeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.GatewayArmingModeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse acceptTermsAndConditions(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "acceptTermsAndConditions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.Id getStreamingCamera(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getStreamingCamera"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.Id) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.Id) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.Id.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.SwitchSiteMobileResponse switchSite(java.lang.String username, long siteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "switchSite"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, new java.lang.Long(siteID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.SwitchSiteMobileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.SwitchSiteMobileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.SwitchSiteMobileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.ImageSession getImageSession(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getImageSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.ImageSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.ImageSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.ImageSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateScenario(com.amdocs.ch.api.mobile.Scenario scenario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateScenario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {scenario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CustomerDevice getDeviceBySerial(long gatewayID, java.lang.String deviceSerial) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getDeviceBySerial"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), deviceSerial});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CustomerDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CustomerDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CustomerDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean stopVideoStreaming(long deviceID, com.amdocs.ch.api.mobile.VideoSession existingVideoSession) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "stopVideoStreaming"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID), existingVideoSession});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobilePushBadgeResponse getBadge(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getBadge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobilePushBadgeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobilePushBadgeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobilePushBadgeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean sendCameraCommand(long deviceID, com.amdocs.ch.api.mobile.CameraCommand cameraCommand) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sendCameraCommand"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID), cameraCommand});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.NfcInfoResponse getNFCInfo(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getNFCInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.NfcInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.NfcInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.NfcInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.ProductMetadataResponse getProductMetadataById(long productID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getProductMetadataById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(productID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.ProductMetadataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.ProductMetadataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.ProductMetadataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobilePushHistoryResponse getPushHistory(java.lang.String username, int counter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getPushHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, new java.lang.Integer(counter)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobilePushHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobilePushHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobilePushHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.VideoSession startVideoPlayback(long recordId, com.amdocs.ch.api.mobile.VideoStreamProtocol protocol) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "startVideoPlayback"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(recordId), protocol});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.VideoSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.VideoSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.VideoSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CameraAdvancedSettingsResponse getCameraAdvancedSettings(long gatewayID, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getCameraAdvancedSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CameraAdvancedSettingsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CameraAdvancedSettingsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CameraAdvancedSettingsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setWPSMode(long gatewayID, com.amdocs.ch.api.mobile.GatewayWPSMode wpsMode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setWPSMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), wpsMode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.VideoRecordsResponse getRecordedVideos(com.amdocs.ch.api.mobile.VideoRecordsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getRecordedVideos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.VideoRecordsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.VideoRecordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.VideoRecordsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse changeSubUserStatus(long userSiteID, com.amdocs.ch.api.mobile.UserStatus status) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "changeSubUserStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(userSiteID), status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getDefaultLanguage(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getDefaultLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CustomerDevice getDevice(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CustomerDevice) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CustomerDevice) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CustomerDevice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.VideoSessionInProgressResponse getVideoSessionInProgressByCameraId(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getVideoSessionInProgressByCameraId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.VideoSessionInProgressResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.VideoSessionInProgressResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.VideoSessionInProgressResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.DevicesByProductGroupResponse getDevicesByProductGroup(long gatewayID, com.amdocs.ch.api.mobile.ProductGroup productGroup) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getDevicesByProductGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), productGroup});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.DevicesByProductGroupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.DevicesByProductGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.DevicesByProductGroupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setLogHistoryDepth(int arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setLogHistoryDepth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(arg0)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.ScenarioExecutionStatusResponse getScenarioExecutionStatus(long gatewayID, long scenarioID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getScenarioExecutionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), new java.lang.Long(scenarioID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.ScenarioExecutionStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.ScenarioExecutionStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.ScenarioExecutionStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.SingleValueMeasurementsResponse getSingleValueMeasurements(com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getSingleValueMeasurements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.SingleValueMeasurementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.SingleValueMeasurementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.SingleValueMeasurementsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setGatewayPartitionArmingMode(long gatewayID, com.amdocs.ch.api.mobile.ArmingPartition partition) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setGatewayPartitionArmingMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), partition});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.AllAvailableWifiDetailsResponse getAllAvailableWifiConnections(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAllAvailableWifiConnections"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.AllAvailableWifiDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.AllAvailableWifiDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.AllAvailableWifiDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setUrlEncryptor(com.amdocs.ch.api.mobile.UrlEncryptor arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setUrlEncryptor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse isProfessionalSupportServiceActive(long customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "isProfessionalSupportServiceActive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(customerID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse deleteScenario(long scenarioID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deleteScenario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(scenarioID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CustomerVerticalsResponse getUserVerticals(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getUserVerticals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CustomerVerticalsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CustomerVerticalsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CustomerVerticalsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.PairingProgressStatusResponse getPairingProgressStatus(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getPairingProgressStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.PairingProgressStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.PairingProgressStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.PairingProgressStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.VideoSessionInProgressResponse getVideoSessionInProgress(java.lang.String streamId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getVideoSessionInProgress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {streamId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.VideoSessionInProgressResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.VideoSessionInProgressResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.VideoSessionInProgressResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MultiValueMeasurementsResponse getMultiValueMeasurements(com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getMultiValueMeasurements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MultiValueMeasurementsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MultiValueMeasurementsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MultiValueMeasurementsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CreditSummary getCreditUsageHistory(java.lang.String username, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getCreditUsageHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CreditSummary) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CreditSummary) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CreditSummary.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.UserExternalScenariosResponse getUserExternalScenarios(long userID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getUserExternalScenarios"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(userID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.UserExternalScenariosResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.UserExternalScenariosResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.UserExternalScenariosResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setGatewayNotificationTargets(com.amdocs.ch.api.mobile.NotificationTargets request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setGatewayNotificationTargets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse isValidNotificationTarget(com.amdocs.ch.api.mobile.NotificationTargetRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "isValidNotificationTarget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileTokenUserIdResponse getMobileTokensByGatewayId(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getMobileTokensByGatewayId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileTokenUserIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileTokenUserIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileTokenUserIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setUserPersonalDetails(com.amdocs.ch.api.mobile.SetPersonalDetailsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setUserPersonalDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.VideoRecordsResponse getRecordedVideo(com.amdocs.ch.api.mobile.RecordedVideoRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getRecordedVideo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.VideoRecordsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.VideoRecordsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.VideoRecordsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.ImageSession startImage(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "startImage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.ImageSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.ImageSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.ImageSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse approvePrivacyPolicy(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "approvePrivacyPolicy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.UserPersonalDetailsResponse getUserPersonalDetails(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getUserPersonalDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.UserPersonalDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.UserPersonalDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.UserPersonalDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.AllSiteUsersResponse getAllSiteUsers(long siteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAllSiteUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(siteID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.AllSiteUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.AllSiteUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.AllSiteUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.SecurityDevicesHavingAdvancedSettingsResponse getSecurityDevicesHavingAdvancedSettings(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getSecurityDevicesHavingAdvancedSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.SecurityDevicesHavingAdvancedSettingsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.SecurityDevicesHavingAdvancedSettingsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.SecurityDevicesHavingAdvancedSettingsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.UserSiteResponse createSubUser(com.amdocs.ch.api.mobile.SubUserRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "createSubUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.UserSiteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.UserSiteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.UserSiteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileViewOnDemandResponse getViewOnDemandMode(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getViewOnDemandMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileViewOnDemandResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileViewOnDemandResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileViewOnDemandResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse runZwaveControllerAdvancedCommand(long gatewayID, com.amdocs.ch.api.mobile.ZwaveControllerCommanType command) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "runZwaveControllerAdvancedCommand"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), command});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MeasurementsStartTimestampResponse getMeasurementsStartTimestamp(com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getMeasurementsStartTimestamp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MeasurementsStartTimestampResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MeasurementsStartTimestampResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MeasurementsStartTimestampResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CustomerVerticalsResponse getAllCustomerVerticals(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAllCustomerVerticals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CustomerVerticalsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CustomerVerticalsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CustomerVerticalsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setGatewayTimezone(long gatewayID, java.lang.String timezone) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setGatewayTimezone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), timezone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse triggerExternalScenarioEvent(long gatewayID, long scenarioID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "triggerExternalScenarioEvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), new java.lang.Long(scenarioID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse isInMaintenance(long customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "isInMaintenance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(customerID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse getSecurityPanelUserCodes(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getSecurityPanelUserCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.NotificationTargetsResponse getGatewayNotificationTargets(com.amdocs.ch.api.mobile.NotificationTargetsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getGatewayNotificationTargets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.NotificationTargetsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.NotificationTargetsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.NotificationTargetsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.UiRelatedHomeDevicesResponse getUIRelatedHomeDevices(com.amdocs.ch.api.mobile.UiRelatedDevicesRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getUIRelatedHomeDevices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.UiRelatedHomeDevicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.UiRelatedHomeDevicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.UiRelatedHomeDevicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendNotificationMobilePushMessage(java.lang.String title, java.lang.String text, java.lang.String productType, java.lang.String reason, int messageType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sendNotificationMobilePushMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {title, text, productType, reason, new java.lang.Integer(messageType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileTokenUserIdResponse getMobileTokensByUserName(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getMobileTokensByUserName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileTokenUserIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileTokenUserIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileTokenUserIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.ImageSession refreshImageSession(com.amdocs.ch.api.mobile.ImageSession deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "refreshImageSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deviceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.ImageSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.ImageSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.ImageSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String startVideoRecording(long deviceID, com.amdocs.ch.api.mobile.VideoSession existingVideoSession) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "startVideoRecording"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID), existingVideoSession});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.GatewayConrollerInfoResponse getGatewayConrollerInfo(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getGatewayConrollerInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.GatewayConrollerInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.GatewayConrollerInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.GatewayConrollerInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateUserPreferences(com.amdocs.ch.api.mobile.UserPreferenceRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateUserPreferences"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse startMaintenanceMode(long customerID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "startMaintenanceMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(customerID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean stopVideoRecording(long deviceID, com.amdocs.ch.api.mobile.VideoSession currentlyRecordedSession, java.lang.String recordingId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "stopVideoRecording"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID), currentlyRecordedSession, recordingId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean setGatewayArmingMode(long gatewayID, com.amdocs.ch.api.mobile.GatewayArmingMode newGatewayArmingMode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setGatewayArmingMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID), newGatewayArmingMode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CustomerDevice[] getDevices(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getDevices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CustomerDevice[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CustomerDevice[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CustomerDevice[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public long getGatewayId(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getGatewayId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setInitialApprovals(com.amdocs.ch.api.mobile.InitialApprovalsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "setInitialApprovals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CreateScenarioResponse createScenario(com.amdocs.ch.api.mobile.Scenario scenario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "createScenario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {scenario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CreateScenarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CreateScenarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CreateScenarioResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.AllUserSitesResponse getAllUserSites(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAllUserSites"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.AllUserSitesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.AllUserSitesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.AllUserSitesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.HistoryResponse getHistory(com.amdocs.ch.api.mobile.GetHistoryRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.HistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.HistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.HistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.ProductMetadataSetResponse getProductMetadataSet(com.amdocs.ch.api.mobile.ProductMetadataSetRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getProductMetadataSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.ProductMetadataSetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.ProductMetadataSetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.ProductMetadataSetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.GatewayPairingModeResponse getPairingMode(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getPairingMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.GatewayPairingModeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.GatewayPairingModeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.GatewayPairingModeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int getCreditCount(java.lang.String username) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getCreditCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.UserSiteResponse updateSubUser(com.amdocs.ch.api.mobile.UpdateSubUserRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateSubUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.UserSiteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.UserSiteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.UserSiteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.SiteDetailsResponse getSiteDetails(long siteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getSiteDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(siteID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.SiteDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.SiteDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.SiteDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendRegistrationEmail(java.lang.String email, long siteID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sendRegistrationEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {email, new java.lang.Long(siteID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.ImageSnapshotResponse getImageSnapshot(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getImageSnapshot"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.ImageSnapshotResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.ImageSnapshotResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.ImageSnapshotResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse isSupportRequestExist(long customerID, com.amdocs.ch.api.mobile.CustomerSupportStatus[] requestStatus) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "isSupportRequestExist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(customerID), requestStatus});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse deleteVideoRecords(long[] recordedVideoId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deleteVideoRecords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {recordedVideoId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.AvailableCodesResponse getAvailableUserCodes(com.amdocs.ch.api.mobile.AvailableCodesRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getAvailableUserCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.AvailableCodesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.AvailableCodesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.AvailableCodesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.CustomerGatewayDetails getCustomerGatewayDetails(long gatewayID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getCustomerGatewayDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(gatewayID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.CustomerGatewayDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.CustomerGatewayDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.CustomerGatewayDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse removeDevice(long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "removeDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.MobileHomeServiceResponse configureSecondaryWifiSettings(com.amdocs.ch.api.mobile.SecondaryWifiSettingsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "configureSecondaryWifiSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.MobileHomeServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.MobileHomeServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryResponse getEnergyInstantPower(com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getEnergyInstantPower"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
