/**
 * AuthenticationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.publicapi.service;

public class AuthenticationResponse  extends com.amdocs.ch.publicapi.service.PublicAPIResponse  implements java.io.Serializable {
    private com.amdocs.ch.publicapi.service.AuthDetails authenticationDetails;

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.publicapi.service.AuthDetails authenticationDetails) {
        super(
            success,
            faultCode,
            faultDescription);
        this.authenticationDetails = authenticationDetails;
    }


    /**
     * Gets the authenticationDetails value for this AuthenticationResponse.
     * 
     * @return authenticationDetails
     */
    public com.amdocs.ch.publicapi.service.AuthDetails getAuthenticationDetails() {
        return authenticationDetails;
    }


    /**
     * Sets the authenticationDetails value for this AuthenticationResponse.
     * 
     * @param authenticationDetails
     */
    public void setAuthenticationDetails(com.amdocs.ch.publicapi.service.AuthDetails authenticationDetails) {
        this.authenticationDetails = authenticationDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticationResponse)) return false;
        AuthenticationResponse other = (AuthenticationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authenticationDetails==null && other.getAuthenticationDetails()==null) || 
             (this.authenticationDetails!=null &&
              this.authenticationDetails.equals(other.getAuthenticationDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAuthenticationDetails() != null) {
            _hashCode += getAuthenticationDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.publicapi.ch.amdocs.com/", "authenticationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.publicapi.ch.amdocs.com/", "authDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
