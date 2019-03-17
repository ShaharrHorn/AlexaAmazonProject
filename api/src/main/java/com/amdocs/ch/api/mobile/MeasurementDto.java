/**
 * MeasurementDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MeasurementDto  extends com.amdocs.ch.api.mobile.BaseMeasurementData  implements java.io.Serializable {
    private int frameId;

    private int numOfSamples;

    private int numberOfPeriods;

    private float periodAverage;

    private java.lang.String type;

    private float value;

    public MeasurementDto() {
    }

    public MeasurementDto(
           java.lang.String deviceSerial,
           java.util.Calendar eventDate,
           java.lang.String eventTimezone,
           long gatewayId,
           int frameId,
           int numOfSamples,
           int numberOfPeriods,
           float periodAverage,
           java.lang.String type,
           float value) {
        super(
            deviceSerial,
            eventDate,
            eventTimezone,
            gatewayId);
        this.frameId = frameId;
        this.numOfSamples = numOfSamples;
        this.numberOfPeriods = numberOfPeriods;
        this.periodAverage = periodAverage;
        this.type = type;
        this.value = value;
    }


    /**
     * Gets the frameId value for this MeasurementDto.
     * 
     * @return frameId
     */
    public int getFrameId() {
        return frameId;
    }


    /**
     * Sets the frameId value for this MeasurementDto.
     * 
     * @param frameId
     */
    public void setFrameId(int frameId) {
        this.frameId = frameId;
    }


    /**
     * Gets the numOfSamples value for this MeasurementDto.
     * 
     * @return numOfSamples
     */
    public int getNumOfSamples() {
        return numOfSamples;
    }


    /**
     * Sets the numOfSamples value for this MeasurementDto.
     * 
     * @param numOfSamples
     */
    public void setNumOfSamples(int numOfSamples) {
        this.numOfSamples = numOfSamples;
    }


    /**
     * Gets the numberOfPeriods value for this MeasurementDto.
     * 
     * @return numberOfPeriods
     */
    public int getNumberOfPeriods() {
        return numberOfPeriods;
    }


    /**
     * Sets the numberOfPeriods value for this MeasurementDto.
     * 
     * @param numberOfPeriods
     */
    public void setNumberOfPeriods(int numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }


    /**
     * Gets the periodAverage value for this MeasurementDto.
     * 
     * @return periodAverage
     */
    public float getPeriodAverage() {
        return periodAverage;
    }


    /**
     * Sets the periodAverage value for this MeasurementDto.
     * 
     * @param periodAverage
     */
    public void setPeriodAverage(float periodAverage) {
        this.periodAverage = periodAverage;
    }


    /**
     * Gets the type value for this MeasurementDto.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this MeasurementDto.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the value value for this MeasurementDto.
     * 
     * @return value
     */
    public float getValue() {
        return value;
    }


    /**
     * Sets the value value for this MeasurementDto.
     * 
     * @param value
     */
    public void setValue(float value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeasurementDto)) return false;
        MeasurementDto other = (MeasurementDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.frameId == other.getFrameId() &&
            this.numOfSamples == other.getNumOfSamples() &&
            this.numberOfPeriods == other.getNumberOfPeriods() &&
            this.periodAverage == other.getPeriodAverage() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.value == other.getValue();
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
        _hashCode += getFrameId();
        _hashCode += getNumOfSamples();
        _hashCode += getNumberOfPeriods();
        _hashCode += new Float(getPeriodAverage()).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Float(getValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MeasurementDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frameId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frameId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfSamples");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numOfSamples"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfPeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAverage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodAverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
