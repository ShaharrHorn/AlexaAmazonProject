/**
 * EnergyInstantPowerSummaryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class EnergyInstantPowerSummaryRequest  implements java.io.Serializable {
    private long gatewayId;

    private java.lang.String[] deviceSerialNumbers;

    public EnergyInstantPowerSummaryRequest() {
    }

    public EnergyInstantPowerSummaryRequest(
           long gatewayId,
           java.lang.String[] deviceSerialNumbers) {
           this.gatewayId = gatewayId;
           this.deviceSerialNumbers = deviceSerialNumbers;
    }


    /**
     * Gets the gatewayId value for this EnergyInstantPowerSummaryRequest.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this EnergyInstantPowerSummaryRequest.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the deviceSerialNumbers value for this EnergyInstantPowerSummaryRequest.
     * 
     * @return deviceSerialNumbers
     */
    public java.lang.String[] getDeviceSerialNumbers() {
        return deviceSerialNumbers;
    }


    /**
     * Sets the deviceSerialNumbers value for this EnergyInstantPowerSummaryRequest.
     * 
     * @param deviceSerialNumbers
     */
    public void setDeviceSerialNumbers(java.lang.String[] deviceSerialNumbers) {
        this.deviceSerialNumbers = deviceSerialNumbers;
    }

    public java.lang.String getDeviceSerialNumbers(int i) {
        return this.deviceSerialNumbers[i];
    }

    public void setDeviceSerialNumbers(int i, java.lang.String _value) {
        this.deviceSerialNumbers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnergyInstantPowerSummaryRequest)) return false;
        EnergyInstantPowerSummaryRequest other = (EnergyInstantPowerSummaryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gatewayId == other.getGatewayId() &&
            ((this.deviceSerialNumbers==null && other.getDeviceSerialNumbers()==null) || 
             (this.deviceSerialNumbers!=null &&
              java.util.Arrays.equals(this.deviceSerialNumbers, other.getDeviceSerialNumbers())));
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
        if (getDeviceSerialNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceSerialNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceSerialNumbers(), i);
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
        new org.apache.axis.description.TypeDesc(EnergyInstantPowerSummaryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "energyInstantPowerSummaryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceSerialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
