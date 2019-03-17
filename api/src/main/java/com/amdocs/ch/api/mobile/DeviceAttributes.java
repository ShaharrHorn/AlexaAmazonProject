/**
 * DeviceAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class DeviceAttributes  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.DeviceAttribute[] deviceAtrributeList;

    private long deviceId;

    public DeviceAttributes() {
    }

    public DeviceAttributes(
           com.amdocs.ch.api.mobile.DeviceAttribute[] deviceAtrributeList,
           long deviceId) {
           this.deviceAtrributeList = deviceAtrributeList;
           this.deviceId = deviceId;
    }


    /**
     * Gets the deviceAtrributeList value for this DeviceAttributes.
     * 
     * @return deviceAtrributeList
     */
    public com.amdocs.ch.api.mobile.DeviceAttribute[] getDeviceAtrributeList() {
        return deviceAtrributeList;
    }


    /**
     * Sets the deviceAtrributeList value for this DeviceAttributes.
     * 
     * @param deviceAtrributeList
     */
    public void setDeviceAtrributeList(com.amdocs.ch.api.mobile.DeviceAttribute[] deviceAtrributeList) {
        this.deviceAtrributeList = deviceAtrributeList;
    }


    /**
     * Gets the deviceId value for this DeviceAttributes.
     * 
     * @return deviceId
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this DeviceAttributes.
     * 
     * @param deviceId
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceAttributes)) return false;
        DeviceAttributes other = (DeviceAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceAtrributeList==null && other.getDeviceAtrributeList()==null) || 
             (this.deviceAtrributeList!=null &&
              java.util.Arrays.equals(this.deviceAtrributeList, other.getDeviceAtrributeList()))) &&
            this.deviceId == other.getDeviceId();
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
        if (getDeviceAtrributeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceAtrributeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceAtrributeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getDeviceId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceAtrributeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceAtrributeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
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
