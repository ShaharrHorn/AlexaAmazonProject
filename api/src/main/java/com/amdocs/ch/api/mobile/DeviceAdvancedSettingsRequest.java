/**
 * DeviceAdvancedSettingsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class DeviceAdvancedSettingsRequest  implements java.io.Serializable {
    private long gatewayId;

    private long deviceId;

    private com.amdocs.ch.api.mobile.SecurityPanelConfiguration[] deviceAdvancedSettingsList;

    public DeviceAdvancedSettingsRequest() {
    }

    public DeviceAdvancedSettingsRequest(
           long gatewayId,
           long deviceId,
           com.amdocs.ch.api.mobile.SecurityPanelConfiguration[] deviceAdvancedSettingsList) {
           this.gatewayId = gatewayId;
           this.deviceId = deviceId;
           this.deviceAdvancedSettingsList = deviceAdvancedSettingsList;
    }


    /**
     * Gets the gatewayId value for this DeviceAdvancedSettingsRequest.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this DeviceAdvancedSettingsRequest.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the deviceId value for this DeviceAdvancedSettingsRequest.
     * 
     * @return deviceId
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this DeviceAdvancedSettingsRequest.
     * 
     * @param deviceId
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the deviceAdvancedSettingsList value for this DeviceAdvancedSettingsRequest.
     * 
     * @return deviceAdvancedSettingsList
     */
    public com.amdocs.ch.api.mobile.SecurityPanelConfiguration[] getDeviceAdvancedSettingsList() {
        return deviceAdvancedSettingsList;
    }


    /**
     * Sets the deviceAdvancedSettingsList value for this DeviceAdvancedSettingsRequest.
     * 
     * @param deviceAdvancedSettingsList
     */
    public void setDeviceAdvancedSettingsList(com.amdocs.ch.api.mobile.SecurityPanelConfiguration[] deviceAdvancedSettingsList) {
        this.deviceAdvancedSettingsList = deviceAdvancedSettingsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceAdvancedSettingsRequest)) return false;
        DeviceAdvancedSettingsRequest other = (DeviceAdvancedSettingsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gatewayId == other.getGatewayId() &&
            this.deviceId == other.getDeviceId() &&
            ((this.deviceAdvancedSettingsList==null && other.getDeviceAdvancedSettingsList()==null) || 
             (this.deviceAdvancedSettingsList!=null &&
              java.util.Arrays.equals(this.deviceAdvancedSettingsList, other.getDeviceAdvancedSettingsList())));
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
        _hashCode += new Long(getGatewayId()).hashCode();
        _hashCode += new Long(getDeviceId()).hashCode();
        if (getDeviceAdvancedSettingsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceAdvancedSettingsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceAdvancedSettingsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceAdvancedSettingsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAdvancedSettingsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceAdvancedSettingsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceAdvancedSettingsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "deviceAdvancedSettings"));
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
