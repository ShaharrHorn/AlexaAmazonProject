/**
 * DevicesAttributesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class DevicesAttributesResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.DeviceAttributes[] listDeviceAtrributes;

    public DevicesAttributesResponse() {
    }

    public DevicesAttributesResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.DeviceAttributes[] listDeviceAtrributes) {
        super(
            success,
            faultCode,
            faultDescription);
        this.listDeviceAtrributes = listDeviceAtrributes;
    }


    /**
     * Gets the listDeviceAtrributes value for this DevicesAttributesResponse.
     * 
     * @return listDeviceAtrributes
     */
    public com.amdocs.ch.api.mobile.DeviceAttributes[] getListDeviceAtrributes() {
        return listDeviceAtrributes;
    }


    /**
     * Sets the listDeviceAtrributes value for this DevicesAttributesResponse.
     * 
     * @param listDeviceAtrributes
     */
    public void setListDeviceAtrributes(com.amdocs.ch.api.mobile.DeviceAttributes[] listDeviceAtrributes) {
        this.listDeviceAtrributes = listDeviceAtrributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DevicesAttributesResponse)) return false;
        DevicesAttributesResponse other = (DevicesAttributesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.listDeviceAtrributes==null && other.getListDeviceAtrributes()==null) || 
             (this.listDeviceAtrributes!=null &&
              java.util.Arrays.equals(this.listDeviceAtrributes, other.getListDeviceAtrributes())));
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
        if (getListDeviceAtrributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListDeviceAtrributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListDeviceAtrributes(), i);
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
        new org.apache.axis.description.TypeDesc(DevicesAttributesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "devicesAttributesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDeviceAtrributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listDeviceAtrributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "deviceAtrributes"));
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
