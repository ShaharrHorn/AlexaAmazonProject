/**
 * SecurityDeviceBypassRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SecurityDeviceBypassRequest  implements java.io.Serializable {
    private boolean byPass;

    private long deviceId;

    private long gatewayId;

    public SecurityDeviceBypassRequest() {
    }

    public SecurityDeviceBypassRequest(
           boolean byPass,
           long deviceId,
           long gatewayId) {
           this.byPass = byPass;
           this.deviceId = deviceId;
           this.gatewayId = gatewayId;
    }


    /**
     * Gets the byPass value for this SecurityDeviceBypassRequest.
     * 
     * @return byPass
     */
    public boolean isByPass() {
        return byPass;
    }


    /**
     * Sets the byPass value for this SecurityDeviceBypassRequest.
     * 
     * @param byPass
     */
    public void setByPass(boolean byPass) {
        this.byPass = byPass;
    }


    /**
     * Gets the deviceId value for this SecurityDeviceBypassRequest.
     * 
     * @return deviceId
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this SecurityDeviceBypassRequest.
     * 
     * @param deviceId
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the gatewayId value for this SecurityDeviceBypassRequest.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this SecurityDeviceBypassRequest.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityDeviceBypassRequest)) return false;
        SecurityDeviceBypassRequest other = (SecurityDeviceBypassRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.byPass == other.isByPass() &&
            this.deviceId == other.getDeviceId() &&
            this.gatewayId == other.getGatewayId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isByPass() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getDeviceId()).hashCode();
        _hashCode += new Long(getGatewayId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityDeviceBypassRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityDeviceBypassRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byPass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "byPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
