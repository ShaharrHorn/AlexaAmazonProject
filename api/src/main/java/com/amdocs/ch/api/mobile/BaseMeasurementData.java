/**
 * BaseMeasurementData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public abstract class BaseMeasurementData  implements java.io.Serializable {
    private java.lang.String deviceSerial;

    private java.util.Calendar eventDate;

    private java.lang.String eventTimezone;

    private long gatewayId;

    public BaseMeasurementData() {
    }

    public BaseMeasurementData(
           java.lang.String deviceSerial,
           java.util.Calendar eventDate,
           java.lang.String eventTimezone,
           long gatewayId) {
           this.deviceSerial = deviceSerial;
           this.eventDate = eventDate;
           this.eventTimezone = eventTimezone;
           this.gatewayId = gatewayId;
    }


    /**
     * Gets the deviceSerial value for this BaseMeasurementData.
     * 
     * @return deviceSerial
     */
    public java.lang.String getDeviceSerial() {
        return deviceSerial;
    }


    /**
     * Sets the deviceSerial value for this BaseMeasurementData.
     * 
     * @param deviceSerial
     */
    public void setDeviceSerial(java.lang.String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }


    /**
     * Gets the eventDate value for this BaseMeasurementData.
     * 
     * @return eventDate
     */
    public java.util.Calendar getEventDate() {
        return eventDate;
    }


    /**
     * Sets the eventDate value for this BaseMeasurementData.
     * 
     * @param eventDate
     */
    public void setEventDate(java.util.Calendar eventDate) {
        this.eventDate = eventDate;
    }


    /**
     * Gets the eventTimezone value for this BaseMeasurementData.
     * 
     * @return eventTimezone
     */
    public java.lang.String getEventTimezone() {
        return eventTimezone;
    }


    /**
     * Sets the eventTimezone value for this BaseMeasurementData.
     * 
     * @param eventTimezone
     */
    public void setEventTimezone(java.lang.String eventTimezone) {
        this.eventTimezone = eventTimezone;
    }


    /**
     * Gets the gatewayId value for this BaseMeasurementData.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this BaseMeasurementData.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseMeasurementData)) return false;
        BaseMeasurementData other = (BaseMeasurementData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceSerial==null && other.getDeviceSerial()==null) || 
             (this.deviceSerial!=null &&
              this.deviceSerial.equals(other.getDeviceSerial()))) &&
            ((this.eventDate==null && other.getEventDate()==null) || 
             (this.eventDate!=null &&
              this.eventDate.equals(other.getEventDate()))) &&
            ((this.eventTimezone==null && other.getEventTimezone()==null) || 
             (this.eventTimezone!=null &&
              this.eventTimezone.equals(other.getEventTimezone()))) &&
            this.gatewayId == other.getGatewayId();
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
        if (getDeviceSerial() != null) {
            _hashCode += getDeviceSerial().hashCode();
        }
        if (getEventDate() != null) {
            _hashCode += getEventDate().hashCode();
        }
        if (getEventTimezone() != null) {
            _hashCode += getEventTimezone().hashCode();
        }
        _hashCode += new Long(getGatewayId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseMeasurementData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "baseMeasurementData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTimezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTimezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
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
