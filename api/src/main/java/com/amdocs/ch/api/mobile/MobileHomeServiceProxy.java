package com.amdocs.ch.api.mobile;

public class MobileHomeServiceProxy implements com.amdocs.ch.api.mobile.MobileHomeService_PortType {
  private String _endpoint = null;
  private com.amdocs.ch.api.mobile.MobileHomeService_PortType mobileHomeService_PortType = null;
  
  public MobileHomeServiceProxy() {
    _initMobileHomeServiceProxy();
  }
  
  public MobileHomeServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMobileHomeServiceProxy();
  }
  
  private void _initMobileHomeServiceProxy() {
    try {
      mobileHomeService_PortType = (new com.amdocs.ch.api.mobile.MobileHomeService_ServiceLocator()).getMobileHomeServicePort();
      if (mobileHomeService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mobileHomeService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mobileHomeService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mobileHomeService_PortType != null)
      ((javax.xml.rpc.Stub)mobileHomeService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeService_PortType getMobileHomeService_PortType() {
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType;
  }
  
  public com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse updateSecurityPanelUserCodes(com.amdocs.ch.api.mobile.SecurityPanelUserCodesRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateSecurityPanelUserCodes(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse synchronizeDevices(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.synchronizeDevices(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse callProfessionalSupport(long customerID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.callProfessionalSupport(customerID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse registerForPush(com.amdocs.ch.api.mobile.MobilePushUserID resetMobileRequest) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.registerForPush(resetMobileRequest);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateGatewayPartitions(long gatewayID, com.amdocs.ch.api.mobile.ArmingPartition[] partitions) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateGatewayPartitions(gatewayID, partitions);
  }
  
  public com.amdocs.ch.api.mobile.SecurityQuestionsResponse getUserSecurityQuestions(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getUserSecurityQuestions(username);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setPairingMode(com.amdocs.ch.api.mobile.SetPairingModeRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setPairingMode(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse removeNFCInfo(com.amdocs.ch.api.mobile.NfcInfoRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.removeNFCInfo(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse assignDeviceUsername(com.amdocs.ch.api.mobile.AssignDeviceUsernameRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.assignDeviceUsername(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse changeSecurityQuestions(com.amdocs.ch.api.mobile.ChangeSecurityQuestionsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.changeSecurityQuestions(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse startMotionCameraViewOnDemand(long gatewayID, long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.startMotionCameraViewOnDemand(gatewayID, deviceID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateScenarioDetails(com.amdocs.ch.api.mobile.ScenarioBaseDetails scenarioDetails) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateScenarioDetails(scenarioDetails);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse resetPushMessageCounter(com.amdocs.ch.api.mobile.ResetMobileRequest resetMobileRequest) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.resetPushMessageCounter(resetMobileRequest);
  }
  
  public com.amdocs.ch.api.mobile.VideoSession startVideoStreaming(long deviceID, com.amdocs.ch.api.mobile.VideoStreamProtocol protocol) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.startVideoStreaming(deviceID, protocol);
  }
  
  public com.amdocs.ch.api.mobile.MobileTokenUserIdResponse getMobileTokensByCustomerId(long customerID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getMobileTokensByCustomerId(customerID);
  }
  
  public com.amdocs.ch.api.mobile.UserPermissionsResponse getUserPermissions(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getUserPermissions(username);
  }
  
  public com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse updateSecurityDeviceAdvancedSettings(com.amdocs.ch.api.mobile.DeviceAdvancedSettingsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateSecurityDeviceAdvancedSettings(request);
  }
  
  public com.amdocs.ch.api.mobile.AllCustomerUsersResponse getAllCustomerUsers(long customerID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAllCustomerUsers(customerID);
  }
  
  public int getLogHistoryDepth() throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getLogHistoryDepth();
  }
  
  public com.amdocs.ch.api.mobile.GatewayScenariosResponse getAllGatewayScenarios(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAllGatewayScenarios(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse saveImageSnapshot(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.saveImageSnapshot(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.DeviceAdvancedSettingsResponse getSecurityDeviceAdvancedSettings(long gatewayID, long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getSecurityDeviceAdvancedSettings(gatewayID, deviceID);
  }
  
  public com.amdocs.ch.api.mobile.NotificationCategoriesAndTargetTypesResponse getNotificationCategoriesAndTargetTypes(long customerID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getNotificationCategoriesAndTargetTypes(customerID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendNotificationMobilePush(java.lang.String title, java.lang.String text, java.lang.String productType, java.lang.String reason) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.sendNotificationMobilePush(title, text, productType, reason);
  }
  
  public com.amdocs.ch.api.mobile.NfcInfoListResponse getNFCInfoList(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getNFCInfoList(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateCameraAdvancedSettings(com.amdocs.ch.api.mobile.CameraAdvancedSettingsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateCameraAdvancedSettings(request);
  }
  
  public com.amdocs.ch.api.mobile.DeviceAttributesResponse getDeviceAttributes(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getDeviceAttributes(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.AllScenariosExecutionStatusResponse getAllScenariosExecutionStatus(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAllScenariosExecutionStatus(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setDeviceAttributes(long deviceID, com.amdocs.ch.api.mobile.DeviceAttribute[] deviceAttribute) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setDeviceAttributes(deviceID, deviceAttribute);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse unregisterForPush(com.amdocs.ch.api.mobile.MobilePushUserID resetMobileRequest) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.unregisterForPush(resetMobileRequest);
  }
  
  public boolean setDeviceStatus(long deviceID, com.amdocs.ch.api.mobile.DeviceStatus newDeviceStatus) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setDeviceStatus(deviceID, newDeviceStatus);
  }
  
  public com.amdocs.ch.api.mobile.RecordedVideosCamerasNamesResponse getRecordedVideosCamerasNames(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getRecordedVideosCamerasNames(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobilePushHistoryResponse getPushHistoryData(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getPushHistoryData(username);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setSecuritySirensState(com.amdocs.ch.api.mobile.SetSecuritySirensStateRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setSecuritySirensState(request);
  }
  
  public com.amdocs.ch.api.mobile.UserPreferenceResponse getUserPreferencesByUserName(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getUserPreferencesByUserName(username);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setSecurityDeviceBypass(com.amdocs.ch.api.mobile.SecurityDeviceBypassRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setSecurityDeviceBypass(request);
  }
  
  public com.amdocs.ch.api.mobile.GatewayUsersResponse getAllGatewayUsers(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAllGatewayUsers(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse triggerNfcScenarios(com.amdocs.ch.api.mobile.NfcInfoRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.triggerNfcScenarios(request);
  }
  
  public com.amdocs.ch.api.mobile.GatewayScenarioResponse getGatewayScenario(long scenarioID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getGatewayScenario(scenarioID);
  }
  
  public com.amdocs.ch.api.mobile.CustomerDevice[] getDevicesByType(long gatewayID, com.amdocs.ch.api.mobile.ProductType[] deviceTypes) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getDevicesByType(gatewayID, deviceTypes);
  }
  
  public com.amdocs.ch.api.mobile.SecurityQuestionsResponse getAllSecurityQuestions(java.lang.String locale) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAllSecurityQuestions(locale);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendUpdateMobilePush() throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.sendUpdateMobilePush();
  }
  
  public com.amdocs.ch.api.mobile.GatewayWPSStatusResponse getWPSStatus(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getWPSStatus(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.CamerasWifiStatusResponse getCamerasWifiStatus(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getCamerasWifiStatus(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendScenarioExecutionCommand(long gatewayID, long scenarioID, com.amdocs.ch.api.mobile.ScenarioExecutionCommand command) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.sendScenarioExecutionCommand(gatewayID, scenarioID, command);
  }
  
  public com.amdocs.ch.api.mobile.UiRelatedDevicesResponse getUIRelatedDevices(com.amdocs.ch.api.mobile.UiRelatedDevicesRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getUIRelatedDevices(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateSite(com.amdocs.ch.api.mobile.SiteRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateSite(request);
  }
  
  public com.amdocs.ch.api.mobile.DevicesAttributesResponse getDevicesAttributes(long[] deviceID, java.lang.String[] attributeName) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getDevicesAttributes(deviceID, attributeName);
  }
  
  public com.amdocs.ch.api.mobile.NfcInfoResponse addNFCInfo(com.amdocs.ch.api.mobile.NfcInfoRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.addNFCInfo(request);
  }
  
  public com.amdocs.ch.api.mobile.HomeDeviceResponse getNewDeviceAfterPairing(long gatewayID, long productID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getNewDeviceAfterPairing(gatewayID, productID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse resetEnergyInstantPower(long gatewayID, java.lang.String deviceSerial) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.resetEnergyInstantPower(gatewayID, deviceSerial);
  }
  
  public boolean stopImageSession(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.stopImageSession(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse stopMaintenanceMode(long customerID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.stopMaintenanceMode(customerID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateScenarioStatus(long scenarioID, com.amdocs.ch.api.mobile.ScenarioStatus status) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateScenarioStatus(scenarioID, status);
  }
  
  public com.amdocs.ch.api.mobile.AcceptedTermsAndConditionsResponse isAcceptedTermsAndConditions(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.isAcceptedTermsAndConditions(username);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse changePassword(com.amdocs.ch.api.mobile.ChangePasswordRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.changePassword(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileTokenUserIdResponse getMobileTokensByUserId(long userID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getMobileTokensByUserId(userID);
  }
  
  public com.amdocs.ch.api.mobile.GatewayArmingModeResponse getGatewayPartitionArmingMode(long gatewayID, com.amdocs.ch.api.mobile.BasePartition partition) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getGatewayPartitionArmingMode(gatewayID, partition);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse acceptTermsAndConditions(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.acceptTermsAndConditions(username);
  }
  
  public com.amdocs.ch.api.mobile.Id getStreamingCamera(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getStreamingCamera(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.SwitchSiteMobileResponse switchSite(java.lang.String username, long siteID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.switchSite(username, siteID);
  }
  
  public com.amdocs.ch.api.mobile.ImageSession getImageSession(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getImageSession(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateScenario(com.amdocs.ch.api.mobile.Scenario scenario) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateScenario(scenario);
  }
  
  public com.amdocs.ch.api.mobile.CustomerDevice getDeviceBySerial(long gatewayID, java.lang.String deviceSerial) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getDeviceBySerial(gatewayID, deviceSerial);
  }
  
  public boolean stopVideoStreaming(long deviceID, com.amdocs.ch.api.mobile.VideoSession existingVideoSession) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.stopVideoStreaming(deviceID, existingVideoSession);
  }
  
  public com.amdocs.ch.api.mobile.MobilePushBadgeResponse getBadge(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getBadge(username);
  }
  
  public boolean sendCameraCommand(long deviceID, com.amdocs.ch.api.mobile.CameraCommand cameraCommand) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.sendCameraCommand(deviceID, cameraCommand);
  }
  
  public com.amdocs.ch.api.mobile.NfcInfoResponse getNFCInfo(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getNFCInfo(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.ProductMetadataResponse getProductMetadataById(long productID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getProductMetadataById(productID);
  }
  
  public com.amdocs.ch.api.mobile.MobilePushHistoryResponse getPushHistory(java.lang.String username, int counter) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getPushHistory(username, counter);
  }
  
  public com.amdocs.ch.api.mobile.VideoSession startVideoPlayback(long recordId, com.amdocs.ch.api.mobile.VideoStreamProtocol protocol) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.startVideoPlayback(recordId, protocol);
  }
  
  public com.amdocs.ch.api.mobile.CameraAdvancedSettingsResponse getCameraAdvancedSettings(long gatewayID, long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getCameraAdvancedSettings(gatewayID, deviceID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setWPSMode(long gatewayID, com.amdocs.ch.api.mobile.GatewayWPSMode wpsMode) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setWPSMode(gatewayID, wpsMode);
  }
  
  public com.amdocs.ch.api.mobile.VideoRecordsResponse getRecordedVideos(com.amdocs.ch.api.mobile.VideoRecordsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getRecordedVideos(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse changeSubUserStatus(long userSiteID, com.amdocs.ch.api.mobile.UserStatus status) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.changeSubUserStatus(userSiteID, status);
  }
  
  public java.lang.String getDefaultLanguage(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getDefaultLanguage(username);
  }
  
  public com.amdocs.ch.api.mobile.CustomerDevice getDevice(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getDevice(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.VideoSessionInProgressResponse getVideoSessionInProgressByCameraId(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getVideoSessionInProgressByCameraId(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.DevicesByProductGroupResponse getDevicesByProductGroup(long gatewayID, com.amdocs.ch.api.mobile.ProductGroup productGroup) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getDevicesByProductGroup(gatewayID, productGroup);
  }
  
  public void setLogHistoryDepth(int arg0) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    mobileHomeService_PortType.setLogHistoryDepth(arg0);
  }
  
  public com.amdocs.ch.api.mobile.ScenarioExecutionStatusResponse getScenarioExecutionStatus(long gatewayID, long scenarioID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getScenarioExecutionStatus(gatewayID, scenarioID);
  }
  
  public com.amdocs.ch.api.mobile.SingleValueMeasurementsResponse getSingleValueMeasurements(com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getSingleValueMeasurements(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setGatewayPartitionArmingMode(long gatewayID, com.amdocs.ch.api.mobile.ArmingPartition partition) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setGatewayPartitionArmingMode(gatewayID, partition);
  }
  
  public com.amdocs.ch.api.mobile.AllAvailableWifiDetailsResponse getAllAvailableWifiConnections(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAllAvailableWifiConnections(gatewayID);
  }
  
  public void setUrlEncryptor(com.amdocs.ch.api.mobile.UrlEncryptor arg0) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    mobileHomeService_PortType.setUrlEncryptor(arg0);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse isProfessionalSupportServiceActive(long customerID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.isProfessionalSupportServiceActive(customerID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse deleteScenario(long scenarioID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.deleteScenario(scenarioID);
  }
  
  public com.amdocs.ch.api.mobile.CustomerVerticalsResponse getUserVerticals(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getUserVerticals(username);
  }
  
  public com.amdocs.ch.api.mobile.PairingProgressStatusResponse getPairingProgressStatus(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getPairingProgressStatus(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.VideoSessionInProgressResponse getVideoSessionInProgress(java.lang.String streamId) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getVideoSessionInProgress(streamId);
  }
  
  public com.amdocs.ch.api.mobile.MultiValueMeasurementsResponse getMultiValueMeasurements(com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getMultiValueMeasurements(request);
  }
  
  public com.amdocs.ch.api.mobile.CreditSummary getCreditUsageHistory(java.lang.String username, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getCreditUsageHistory(username, fromDate, toDate);
  }
  
  public com.amdocs.ch.api.mobile.UserExternalScenariosResponse getUserExternalScenarios(long userID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getUserExternalScenarios(userID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setGatewayNotificationTargets(com.amdocs.ch.api.mobile.NotificationTargets request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setGatewayNotificationTargets(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse isValidNotificationTarget(com.amdocs.ch.api.mobile.NotificationTargetRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.isValidNotificationTarget(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileTokenUserIdResponse getMobileTokensByGatewayId(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getMobileTokensByGatewayId(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setUserPersonalDetails(com.amdocs.ch.api.mobile.SetPersonalDetailsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setUserPersonalDetails(request);
  }
  
  public com.amdocs.ch.api.mobile.VideoRecordsResponse getRecordedVideo(com.amdocs.ch.api.mobile.RecordedVideoRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getRecordedVideo(request);
  }
  
  public com.amdocs.ch.api.mobile.ImageSession startImage(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.startImage(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse approvePrivacyPolicy(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.approvePrivacyPolicy(username);
  }
  
  public com.amdocs.ch.api.mobile.UserPersonalDetailsResponse getUserPersonalDetails(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getUserPersonalDetails(username);
  }
  
  public com.amdocs.ch.api.mobile.AllSiteUsersResponse getAllSiteUsers(long siteID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAllSiteUsers(siteID);
  }
  
  public com.amdocs.ch.api.mobile.SecurityDevicesHavingAdvancedSettingsResponse getSecurityDevicesHavingAdvancedSettings(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getSecurityDevicesHavingAdvancedSettings(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.UserSiteResponse createSubUser(com.amdocs.ch.api.mobile.SubUserRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.createSubUser(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileViewOnDemandResponse getViewOnDemandMode(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getViewOnDemandMode(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse runZwaveControllerAdvancedCommand(long gatewayID, com.amdocs.ch.api.mobile.ZwaveControllerCommanType command) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.runZwaveControllerAdvancedCommand(gatewayID, command);
  }
  
  public com.amdocs.ch.api.mobile.MeasurementsStartTimestampResponse getMeasurementsStartTimestamp(com.amdocs.ch.api.mobile.MobileHomeMeasurementsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getMeasurementsStartTimestamp(request);
  }
  
  public com.amdocs.ch.api.mobile.CustomerVerticalsResponse getAllCustomerVerticals(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAllCustomerVerticals(username);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setGatewayTimezone(long gatewayID, java.lang.String timezone) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setGatewayTimezone(gatewayID, timezone);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse triggerExternalScenarioEvent(long gatewayID, long scenarioID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.triggerExternalScenarioEvent(gatewayID, scenarioID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse isInMaintenance(long customerID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.isInMaintenance(customerID);
  }
  
  public com.amdocs.ch.api.mobile.SecurityPanelUserCodesResponse getSecurityPanelUserCodes(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getSecurityPanelUserCodes(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.NotificationTargetsResponse getGatewayNotificationTargets(com.amdocs.ch.api.mobile.NotificationTargetsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getGatewayNotificationTargets(request);
  }
  
  public com.amdocs.ch.api.mobile.UiRelatedHomeDevicesResponse getUIRelatedHomeDevices(com.amdocs.ch.api.mobile.UiRelatedDevicesRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getUIRelatedHomeDevices(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendNotificationMobilePushMessage(java.lang.String title, java.lang.String text, java.lang.String productType, java.lang.String reason, int messageType) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.sendNotificationMobilePushMessage(title, text, productType, reason, messageType);
  }
  
  public com.amdocs.ch.api.mobile.MobileTokenUserIdResponse getMobileTokensByUserName(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getMobileTokensByUserName(username);
  }
  
  public com.amdocs.ch.api.mobile.ImageSession refreshImageSession(com.amdocs.ch.api.mobile.ImageSession deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.refreshImageSession(deviceID);
  }
  
  public java.lang.String startVideoRecording(long deviceID, com.amdocs.ch.api.mobile.VideoSession existingVideoSession) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.startVideoRecording(deviceID, existingVideoSession);
  }
  
  public com.amdocs.ch.api.mobile.GatewayConrollerInfoResponse getGatewayConrollerInfo(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getGatewayConrollerInfo(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse updateUserPreferences(com.amdocs.ch.api.mobile.UserPreferenceRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateUserPreferences(request);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse startMaintenanceMode(long customerID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.startMaintenanceMode(customerID);
  }
  
  public boolean stopVideoRecording(long deviceID, com.amdocs.ch.api.mobile.VideoSession currentlyRecordedSession, java.lang.String recordingId) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.stopVideoRecording(deviceID, currentlyRecordedSession, recordingId);
  }
  
  public boolean setGatewayArmingMode(long gatewayID, com.amdocs.ch.api.mobile.GatewayArmingMode newGatewayArmingMode) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setGatewayArmingMode(gatewayID, newGatewayArmingMode);
  }
  
  public com.amdocs.ch.api.mobile.CustomerDevice[] getDevices(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getDevices(gatewayID);
  }
  
  public long getGatewayId(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getGatewayId(username);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse setInitialApprovals(com.amdocs.ch.api.mobile.InitialApprovalsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.setInitialApprovals(request);
  }
  
  public com.amdocs.ch.api.mobile.CreateScenarioResponse createScenario(com.amdocs.ch.api.mobile.Scenario scenario) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.createScenario(scenario);
  }
  
  public com.amdocs.ch.api.mobile.AllUserSitesResponse getAllUserSites(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAllUserSites(username);
  }
  
  public com.amdocs.ch.api.mobile.HistoryResponse getHistory(com.amdocs.ch.api.mobile.GetHistoryRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getHistory(request);
  }
  
  public com.amdocs.ch.api.mobile.ProductMetadataSetResponse getProductMetadataSet(com.amdocs.ch.api.mobile.ProductMetadataSetRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getProductMetadataSet(request);
  }
  
  public com.amdocs.ch.api.mobile.GatewayPairingModeResponse getPairingMode(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getPairingMode(gatewayID);
  }
  
  public int getCreditCount(java.lang.String username) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getCreditCount(username);
  }
  
  public com.amdocs.ch.api.mobile.UserSiteResponse updateSubUser(com.amdocs.ch.api.mobile.UpdateSubUserRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.updateSubUser(request);
  }
  
  public com.amdocs.ch.api.mobile.SiteDetailsResponse getSiteDetails(long siteID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getSiteDetails(siteID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse sendRegistrationEmail(java.lang.String email, long siteID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.sendRegistrationEmail(email, siteID);
  }
  
  public com.amdocs.ch.api.mobile.ImageSnapshotResponse getImageSnapshot(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getImageSnapshot(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse isSupportRequestExist(long customerID, com.amdocs.ch.api.mobile.CustomerSupportStatus[] requestStatus) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.isSupportRequestExist(customerID, requestStatus);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse deleteVideoRecords(long[] recordedVideoId) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.deleteVideoRecords(recordedVideoId);
  }
  
  public com.amdocs.ch.api.mobile.AvailableCodesResponse getAvailableUserCodes(com.amdocs.ch.api.mobile.AvailableCodesRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getAvailableUserCodes(request);
  }
  
  public com.amdocs.ch.api.mobile.CustomerGatewayDetails getCustomerGatewayDetails(long gatewayID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getCustomerGatewayDetails(gatewayID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse removeDevice(long deviceID) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.removeDevice(deviceID);
  }
  
  public com.amdocs.ch.api.mobile.MobileHomeServiceResponse configureSecondaryWifiSettings(com.amdocs.ch.api.mobile.SecondaryWifiSettingsRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.configureSecondaryWifiSettings(request);
  }
  
  public com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryResponse getEnergyInstantPower(com.amdocs.ch.api.mobile.EnergyInstantPowerSummaryRequest request) throws java.rmi.RemoteException{
    if (mobileHomeService_PortType == null)
      _initMobileHomeServiceProxy();
    return mobileHomeService_PortType.getEnergyInstantPower(request);
  }
  
  
}