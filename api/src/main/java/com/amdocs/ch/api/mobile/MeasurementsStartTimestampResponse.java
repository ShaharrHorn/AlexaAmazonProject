/**
 * MeasurementsStartTimestampResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MeasurementsStartTimestampResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private long firstMeasurementTimestamp;

    public MeasurementsStartTimestampResponse() {
    }

    public MeasurementsStartTimestampResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           long firstMeasurementTimestamp) {
        super(
            success,
            faultCode,
            faultDescription);
        this.firstMeasurementTimestamp = firstMeasurementTimestamp;
    }


    /**
     * Gets the firstMeasurementTimestamp value for this MeasurementsStartTimestampResponse.
     * 
     * @return firstMeasurementTimestamp
     */
    public long getFirstMeasurementTimestamp() {
        return firstMeasurementTimestamp;
    }


    /**
     * Sets the firstMeasurementTimestamp value for this MeasurementsStartTimestampResponse.
     * 
     * @param firstMeasurementTimestamp
     */
    public void setFirstMeasurementTimestamp(long firstMeasurementTimestamp) {
        this.firstMeasurementTimestamp = firstMeasurementTimestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeasurementsStartTimestampResponse)) return false;
        MeasurementsStartTimestampResponse other = (MeasurementsStartTimestampResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.firstMeasurementTimestamp == other.getFirstMeasurementTimestamp();
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
        _hashCode += new Long(getFirstMeasurementTimestamp()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MeasurementsStartTimestampResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementsStartTimestampResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstMeasurementTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstMeasurementTimestamp"));
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
