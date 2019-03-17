/**
 * AuthenticationService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.publicapi.service;

public interface AuthenticationService_PortType extends java.rmi.Remote {
    public com.amdocs.ch.publicapi.service.AuthenticationResponse authenticate(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
}
