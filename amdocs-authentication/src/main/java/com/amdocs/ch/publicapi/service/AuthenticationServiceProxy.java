package com.amdocs.ch.publicapi.service;

public class AuthenticationServiceProxy implements com.amdocs.ch.publicapi.service.AuthenticationService_PortType {
  private String _endpoint = null;
  private com.amdocs.ch.publicapi.service.AuthenticationService_PortType authenticationService_PortType = null;
  
  public AuthenticationServiceProxy() {
    _initAuthenticationServiceProxy();
  }
  
  public AuthenticationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAuthenticationServiceProxy();
  }
  
  private void _initAuthenticationServiceProxy() {
    try {
      authenticationService_PortType = (new com.amdocs.ch.publicapi.service.AuthenticationService_ServiceLocator()).getAuthenticationServicePort();
      if (authenticationService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)authenticationService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)authenticationService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (authenticationService_PortType != null)
      ((javax.xml.rpc.Stub)authenticationService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.amdocs.ch.publicapi.service.AuthenticationService_PortType getAuthenticationService_PortType() {
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType;
  }
  
  public com.amdocs.ch.publicapi.service.AuthenticationResponse authenticate(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.authenticate(username, password);
  }
  
  
}