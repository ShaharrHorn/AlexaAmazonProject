/**
 * UiRelatedDevicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UiRelatedDevicesResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.VerticalDevices[] verticalsDevices;

    public UiRelatedDevicesResponse() {
    }

    public UiRelatedDevicesResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.VerticalDevices[] verticalsDevices) {
        super(
            success,
            faultCode,
            faultDescription);
        this.verticalsDevices = verticalsDevices;
    }


    /**
     * Gets the verticalsDevices value for this UiRelatedDevicesResponse.
     * 
     * @return verticalsDevices
     */
    public com.amdocs.ch.api.mobile.VerticalDevices[] getVerticalsDevices() {
        return verticalsDevices;
    }


    /**
     * Sets the verticalsDevices value for this UiRelatedDevicesResponse.
     * 
     * @param verticalsDevices
     */
    public void setVerticalsDevices(com.amdocs.ch.api.mobile.VerticalDevices[] verticalsDevices) {
        this.verticalsDevices = verticalsDevices;
    }

    public com.amdocs.ch.api.mobile.VerticalDevices getVerticalsDevices(int i) {
        return this.verticalsDevices[i];
    }

    public void setVerticalsDevices(int i, com.amdocs.ch.api.mobile.VerticalDevices _value) {
        this.verticalsDevices[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UiRelatedDevicesResponse)) return false;
        UiRelatedDevicesResponse other = (UiRelatedDevicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.verticalsDevices==null && other.getVerticalsDevices()==null) || 
             (this.verticalsDevices!=null &&
              java.util.Arrays.equals(this.verticalsDevices, other.getVerticalsDevices())));
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
        if (getVerticalsDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVerticalsDevices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVerticalsDevices(), i);
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
        new org.apache.axis.description.TypeDesc(UiRelatedDevicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "uiRelatedDevicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalsDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verticalsDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "verticalDevices"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
