/**
 * AuthenticationService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.publicapi.service;

public class AuthenticationService_ServiceLocator extends org.apache.axis.client.Service implements com.amdocs.ch.publicapi.service.AuthenticationService_Service {

    public AuthenticationService_ServiceLocator() {
    }


    public AuthenticationService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AuthenticationService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AuthenticationServicePort
    private java.lang.String AuthenticationServicePort_address = "https://dox4.ch.amdocs.com/public-apis/AuthenticationService";

    public java.lang.String getAuthenticationServicePortAddress() {
        return AuthenticationServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AuthenticationServicePortWSDDServiceName = "AuthenticationServicePort";

    public java.lang.String getAuthenticationServicePortWSDDServiceName() {
        return AuthenticationServicePortWSDDServiceName;
    }

    public void setAuthenticationServicePortWSDDServiceName(java.lang.String name) {
        AuthenticationServicePortWSDDServiceName = name;
    }

    public com.amdocs.ch.publicapi.service.AuthenticationService_PortType getAuthenticationServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AuthenticationServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAuthenticationServicePort(endpoint);
    }

    public com.amdocs.ch.publicapi.service.AuthenticationService_PortType getAuthenticationServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amdocs.ch.publicapi.service.AuthenticationServiceSoapBindingStub _stub = new com.amdocs.ch.publicapi.service.AuthenticationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAuthenticationServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAuthenticationServicePortEndpointAddress(java.lang.String address) {
        AuthenticationServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.amdocs.ch.publicapi.service.AuthenticationService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amdocs.ch.publicapi.service.AuthenticationServiceSoapBindingStub _stub = new com.amdocs.ch.publicapi.service.AuthenticationServiceSoapBindingStub(new java.net.URL(AuthenticationServicePort_address), this);
                _stub.setPortName(getAuthenticationServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AuthenticationServicePort".equals(inputPortName)) {
            return getAuthenticationServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.publicapi.ch.amdocs.com/", "AuthenticationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.publicapi.ch.amdocs.com/", "AuthenticationServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AuthenticationServicePort".equals(portName)) {
            setAuthenticationServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
