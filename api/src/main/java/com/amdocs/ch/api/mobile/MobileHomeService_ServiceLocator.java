/**
 * MobileHomeService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MobileHomeService_ServiceLocator extends org.apache.axis.client.Service implements com.amdocs.ch.api.mobile.MobileHomeService_Service {

    public MobileHomeService_ServiceLocator() {
    }


    public MobileHomeService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MobileHomeService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MobileHomeServicePort
    private java.lang.String MobileHomeServicePort_address = "https://dox4.ch.amdocs.com/mobile-gateway/ws/HomeService";

    public java.lang.String getMobileHomeServicePortAddress() {
        return MobileHomeServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MobileHomeServicePortWSDDServiceName = "MobileHomeServicePort";

    public java.lang.String getMobileHomeServicePortWSDDServiceName() {
        return MobileHomeServicePortWSDDServiceName;
    }

    public void setMobileHomeServicePortWSDDServiceName(java.lang.String name) {
        MobileHomeServicePortWSDDServiceName = name;
    }

    public com.amdocs.ch.api.mobile.MobileHomeService_PortType getMobileHomeServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MobileHomeServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMobileHomeServicePort(endpoint);
    }

    public com.amdocs.ch.api.mobile.MobileHomeService_PortType getMobileHomeServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amdocs.ch.api.mobile.MobileHomeServiceSoapBindingStub _stub = new com.amdocs.ch.api.mobile.MobileHomeServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMobileHomeServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMobileHomeServicePortEndpointAddress(java.lang.String address) {
        MobileHomeServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.amdocs.ch.api.mobile.MobileHomeService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amdocs.ch.api.mobile.MobileHomeServiceSoapBindingStub _stub = new com.amdocs.ch.api.mobile.MobileHomeServiceSoapBindingStub(new java.net.URL(MobileHomeServicePort_address), this);
                _stub.setPortName(getMobileHomeServicePortWSDDServiceName());
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
        if ("MobileHomeServicePort".equals(inputPortName)) {
            return getMobileHomeServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "MobileHomeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "MobileHomeServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MobileHomeServicePort".equals(portName)) {
            setMobileHomeServicePortEndpointAddress(address);
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
