/**
 * EnergyInstantPowerSummaryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class EnergyInstantPowerSummaryResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.DevicePowerSummary[] deviceInstantPower;

    private double totalInstantPower;

    public EnergyInstantPowerSummaryResponse() {
    }

    public EnergyInstantPowerSummaryResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.DevicePowerSummary[] deviceInstantPower,
           double totalInstantPower) {
        super(
            success,
            faultCode,
            faultDescription);
        this.deviceInstantPower = deviceInstantPower;
        this.totalInstantPower = totalInstantPower;
    }


    /**
     * Gets the deviceInstantPower value for this EnergyInstantPowerSummaryResponse.
     * 
     * @return deviceInstantPower
     */
    public com.amdocs.ch.api.mobile.DevicePowerSummary[] getDeviceInstantPower() {
        return deviceInstantPower;
    }


    /**
     * Sets the deviceInstantPower value for this EnergyInstantPowerSummaryResponse.
     * 
     * @param deviceInstantPower
     */
    public void setDeviceInstantPower(com.amdocs.ch.api.mobile.DevicePowerSummary[] deviceInstantPower) {
        this.deviceInstantPower = deviceInstantPower;
    }

    public com.amdocs.ch.api.mobile.DevicePowerSummary getDeviceInstantPower(int i) {
        return this.deviceInstantPower[i];
    }

    public void setDeviceInstantPower(int i, com.amdocs.ch.api.mobile.DevicePowerSummary _value) {
        this.deviceInstantPower[i] = _value;
    }


    /**
     * Gets the totalInstantPower value for this EnergyInstantPowerSummaryResponse.
     * 
     * @return totalInstantPower
     */
    public double getTotalInstantPower() {
        return totalInstantPower;
    }


    /**
     * Sets the totalInstantPower value for this EnergyInstantPowerSummaryResponse.
     * 
     * @param totalInstantPower
     */
    public void setTotalInstantPower(double totalInstantPower) {
        this.totalInstantPower = totalInstantPower;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnergyInstantPowerSummaryResponse)) return false;
        EnergyInstantPowerSummaryResponse other = (EnergyInstantPowerSummaryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceInstantPower==null && other.getDeviceInstantPower()==null) || 
             (this.deviceInstantPower!=null &&
              java.util.Arrays.equals(this.deviceInstantPower, other.getDeviceInstantPower()))) &&
            this.totalInstantPower == other.getTotalInstantPower();
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
        if (getDeviceInstantPower() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceInstantPower());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceInstantPower(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getTotalInstantPower()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnergyInstantPowerSummaryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "energyInstantPowerSummaryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInstantPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceInstantPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "devicePowerSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInstantPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalInstantPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
