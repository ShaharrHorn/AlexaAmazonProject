/**
 * DeviceAttributesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class DeviceAttributesResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.DeviceAttribute[] deviceAtrribute;

    public DeviceAttributesResponse() {
    }

    public DeviceAttributesResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.DeviceAttribute[] deviceAtrribute) {
        super(
            success,
            faultCode,
            faultDescription);
        this.deviceAtrribute = deviceAtrribute;
    }


    /**
     * Gets the deviceAtrribute value for this DeviceAttributesResponse.
     * 
     * @return deviceAtrribute
     */
    public com.amdocs.ch.api.mobile.DeviceAttribute[] getDeviceAtrribute() {
        return deviceAtrribute;
    }


    /**
     * Sets the deviceAtrribute value for this DeviceAttributesResponse.
     * 
     * @param deviceAtrribute
     */
    public void setDeviceAtrribute(com.amdocs.ch.api.mobile.DeviceAttribute[] deviceAtrribute) {
        this.deviceAtrribute = deviceAtrribute;
    }

    public com.amdocs.ch.api.mobile.DeviceAttribute getDeviceAtrribute(int i) {
        return this.deviceAtrribute[i];
    }

    public void setDeviceAtrribute(int i, com.amdocs.ch.api.mobile.DeviceAttribute _value) {
        this.deviceAtrribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceAttributesResponse)) return false;
        DeviceAttributesResponse other = (DeviceAttributesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceAtrribute==null && other.getDeviceAtrribute()==null) || 
             (this.deviceAtrribute!=null &&
              java.util.Arrays.equals(this.deviceAtrribute, other.getDeviceAtrribute())));
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
        if (getDeviceAtrribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceAtrribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceAtrribute(), i);
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
        new org.apache.axis.description.TypeDesc(DeviceAttributesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttributesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceAtrribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceAtrribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttribute"));
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
