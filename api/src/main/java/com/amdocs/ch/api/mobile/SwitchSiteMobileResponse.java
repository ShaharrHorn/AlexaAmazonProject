/**
 * SwitchSiteMobileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SwitchSiteMobileResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.SiteGatewayDetails gatewayDetails;

    private com.amdocs.ch.api.mobile.AuthDetails authDetails;

    public SwitchSiteMobileResponse() {
    }

    public SwitchSiteMobileResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.SiteGatewayDetails gatewayDetails,
           com.amdocs.ch.api.mobile.AuthDetails authDetails) {
        super(
            success,
            faultCode,
            faultDescription);
        this.gatewayDetails = gatewayDetails;
        this.authDetails = authDetails;
    }


    /**
     * Gets the gatewayDetails value for this SwitchSiteMobileResponse.
     * 
     * @return gatewayDetails
     */
    public com.amdocs.ch.api.mobile.SiteGatewayDetails getGatewayDetails() {
        return gatewayDetails;
    }


    /**
     * Sets the gatewayDetails value for this SwitchSiteMobileResponse.
     * 
     * @param gatewayDetails
     */
    public void setGatewayDetails(com.amdocs.ch.api.mobile.SiteGatewayDetails gatewayDetails) {
        this.gatewayDetails = gatewayDetails;
    }


    /**
     * Gets the authDetails value for this SwitchSiteMobileResponse.
     * 
     * @return authDetails
     */
    public com.amdocs.ch.api.mobile.AuthDetails getAuthDetails() {
        return authDetails;
    }


    /**
     * Sets the authDetails value for this SwitchSiteMobileResponse.
     * 
     * @param authDetails
     */
    public void setAuthDetails(com.amdocs.ch.api.mobile.AuthDetails authDetails) {
        this.authDetails = authDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwitchSiteMobileResponse)) return false;
        SwitchSiteMobileResponse other = (SwitchSiteMobileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gatewayDetails==null && other.getGatewayDetails()==null) || 
             (this.gatewayDetails!=null &&
              this.gatewayDetails.equals(other.getGatewayDetails()))) &&
            ((this.authDetails==null && other.getAuthDetails()==null) || 
             (this.authDetails!=null &&
              this.authDetails.equals(other.getAuthDetails())));
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
        if (getGatewayDetails() != null) {
            _hashCode += getGatewayDetails().hashCode();
        }
        if (getAuthDetails() != null) {
            _hashCode += getAuthDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwitchSiteMobileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "switchSiteMobileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "siteGatewayDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "authDetails"));
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
