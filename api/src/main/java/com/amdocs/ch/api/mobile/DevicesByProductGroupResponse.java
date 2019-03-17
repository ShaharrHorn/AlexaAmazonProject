/**
 * DevicesByProductGroupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class DevicesByProductGroupResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.CustomerDevice[] customerDevices;

    public DevicesByProductGroupResponse() {
    }

    public DevicesByProductGroupResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.CustomerDevice[] customerDevices) {
        super(
            success,
            faultCode,
            faultDescription);
        this.customerDevices = customerDevices;
    }


    /**
     * Gets the customerDevices value for this DevicesByProductGroupResponse.
     * 
     * @return customerDevices
     */
    public com.amdocs.ch.api.mobile.CustomerDevice[] getCustomerDevices() {
        return customerDevices;
    }


    /**
     * Sets the customerDevices value for this DevicesByProductGroupResponse.
     * 
     * @param customerDevices
     */
    public void setCustomerDevices(com.amdocs.ch.api.mobile.CustomerDevice[] customerDevices) {
        this.customerDevices = customerDevices;
    }

    public com.amdocs.ch.api.mobile.CustomerDevice getCustomerDevices(int i) {
        return this.customerDevices[i];
    }

    public void setCustomerDevices(int i, com.amdocs.ch.api.mobile.CustomerDevice _value) {
        this.customerDevices[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DevicesByProductGroupResponse)) return false;
        DevicesByProductGroupResponse other = (DevicesByProductGroupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customerDevices==null && other.getCustomerDevices()==null) || 
             (this.customerDevices!=null &&
              java.util.Arrays.equals(this.customerDevices, other.getCustomerDevices())));
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
        if (getCustomerDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerDevices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerDevices(), i);
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
        new org.apache.axis.description.TypeDesc(DevicesByProductGroupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "devicesByProductGroupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerDevice"));
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
