/**
 * DeviceAdvancedSettingsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class DeviceAdvancedSettingsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.SecurityPanelConfiguration[] deviceAdvancedSettingsList;

    public DeviceAdvancedSettingsResponse() {
    }

    public DeviceAdvancedSettingsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.SecurityPanelConfiguration[] deviceAdvancedSettingsList) {
        super(
            success,
            faultCode,
            faultDescription);
        this.deviceAdvancedSettingsList = deviceAdvancedSettingsList;
    }


    /**
     * Gets the deviceAdvancedSettingsList value for this DeviceAdvancedSettingsResponse.
     * 
     * @return deviceAdvancedSettingsList
     */
    public com.amdocs.ch.api.mobile.SecurityPanelConfiguration[] getDeviceAdvancedSettingsList() {
        return deviceAdvancedSettingsList;
    }


    /**
     * Sets the deviceAdvancedSettingsList value for this DeviceAdvancedSettingsResponse.
     * 
     * @param deviceAdvancedSettingsList
     */
    public void setDeviceAdvancedSettingsList(com.amdocs.ch.api.mobile.SecurityPanelConfiguration[] deviceAdvancedSettingsList) {
        this.deviceAdvancedSettingsList = deviceAdvancedSettingsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceAdvancedSettingsResponse)) return false;
        DeviceAdvancedSettingsResponse other = (DeviceAdvancedSettingsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        int _hashCode = super.hashCode();
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
        new org.apache.axis.description.TypeDesc(DeviceAdvancedSettingsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAdvancedSettingsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
