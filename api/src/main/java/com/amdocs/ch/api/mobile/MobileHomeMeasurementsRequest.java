/**
 * MobileHomeMeasurementsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MobileHomeMeasurementsRequest  implements java.io.Serializable {
    private int day;

    private java.lang.String[] deviceSerialNumbers;

    private long endDate;

    private long gatewayId;

    private com.amdocs.ch.api.mobile.PeriodUnitEnum measurementPeriod;

    private com.amdocs.ch.api.mobile.MeasurementType measurementType;

    private com.amdocs.ch.api.mobile.MeasurementUnitType measurementUnitType;

    private int month;

    private com.amdocs.ch.api.mobile.SearchOrder resultOrder;

    private boolean returnAverage;

    private long startDate;

    private java.lang.String username;

    private int week;

    private int year;

    public MobileHomeMeasurementsRequest() {
    }

    public MobileHomeMeasurementsRequest(
           int day,
           java.lang.String[] deviceSerialNumbers,
           long endDate,
           long gatewayId,
           com.amdocs.ch.api.mobile.PeriodUnitEnum measurementPeriod,
           com.amdocs.ch.api.mobile.MeasurementType measurementType,
           com.amdocs.ch.api.mobile.MeasurementUnitType measurementUnitType,
           int month,
           com.amdocs.ch.api.mobile.SearchOrder resultOrder,
           boolean returnAverage,
           long startDate,
           java.lang.String username,
           int week,
           int year) {
           this.day = day;
           this.deviceSerialNumbers = deviceSerialNumbers;
           this.endDate = endDate;
           this.gatewayId = gatewayId;
           this.measurementPeriod = measurementPeriod;
           this.measurementType = measurementType;
           this.measurementUnitType = measurementUnitType;
           this.month = month;
           this.resultOrder = resultOrder;
           this.returnAverage = returnAverage;
           this.startDate = startDate;
           this.username = username;
           this.week = week;
           this.year = year;
    }


    /**
     * Gets the day value for this MobileHomeMeasurementsRequest.
     * 
     * @return day
     */
    public int getDay() {
        return day;
    }


    /**
     * Sets the day value for this MobileHomeMeasurementsRequest.
     * 
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * Gets the deviceSerialNumbers value for this MobileHomeMeasurementsRequest.
     * 
     * @return deviceSerialNumbers
     */
    public java.lang.String[] getDeviceSerialNumbers() {
        return deviceSerialNumbers;
    }


    /**
     * Sets the deviceSerialNumbers value for this MobileHomeMeasurementsRequest.
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


    /**
     * Gets the endDate value for this MobileHomeMeasurementsRequest.
     * 
     * @return endDate
     */
    public long getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this MobileHomeMeasurementsRequest.
     * 
     * @param endDate
     */
    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the gatewayId value for this MobileHomeMeasurementsRequest.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this MobileHomeMeasurementsRequest.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the measurementPeriod value for this MobileHomeMeasurementsRequest.
     * 
     * @return measurementPeriod
     */
    public com.amdocs.ch.api.mobile.PeriodUnitEnum getMeasurementPeriod() {
        return measurementPeriod;
    }


    /**
     * Sets the measurementPeriod value for this MobileHomeMeasurementsRequest.
     * 
     * @param measurementPeriod
     */
    public void setMeasurementPeriod(com.amdocs.ch.api.mobile.PeriodUnitEnum measurementPeriod) {
        this.measurementPeriod = measurementPeriod;
    }


    /**
     * Gets the measurementType value for this MobileHomeMeasurementsRequest.
     * 
     * @return measurementType
     */
    public com.amdocs.ch.api.mobile.MeasurementType getMeasurementType() {
        return measurementType;
    }


    /**
     * Sets the measurementType value for this MobileHomeMeasurementsRequest.
     * 
     * @param measurementType
     */
    public void setMeasurementType(com.amdocs.ch.api.mobile.MeasurementType measurementType) {
        this.measurementType = measurementType;
    }


    /**
     * Gets the measurementUnitType value for this MobileHomeMeasurementsRequest.
     * 
     * @return measurementUnitType
     */
    public com.amdocs.ch.api.mobile.MeasurementUnitType getMeasurementUnitType() {
        return measurementUnitType;
    }


    /**
     * Sets the measurementUnitType value for this MobileHomeMeasurementsRequest.
     * 
     * @param measurementUnitType
     */
    public void setMeasurementUnitType(com.amdocs.ch.api.mobile.MeasurementUnitType measurementUnitType) {
        this.measurementUnitType = measurementUnitType;
    }


    /**
     * Gets the month value for this MobileHomeMeasurementsRequest.
     * 
     * @return month
     */
    public int getMonth() {
        return month;
    }


    /**
     * Sets the month value for this MobileHomeMeasurementsRequest.
     * 
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }


    /**
     * Gets the resultOrder value for this MobileHomeMeasurementsRequest.
     * 
     * @return resultOrder
     */
    public com.amdocs.ch.api.mobile.SearchOrder getResultOrder() {
        return resultOrder;
    }


    /**
     * Sets the resultOrder value for this MobileHomeMeasurementsRequest.
     * 
     * @param resultOrder
     */
    public void setResultOrder(com.amdocs.ch.api.mobile.SearchOrder resultOrder) {
        this.resultOrder = resultOrder;
    }


    /**
     * Gets the returnAverage value for this MobileHomeMeasurementsRequest.
     * 
     * @return returnAverage
     */
    public boolean isReturnAverage() {
        return returnAverage;
    }


    /**
     * Sets the returnAverage value for this MobileHomeMeasurementsRequest.
     * 
     * @param returnAverage
     */
    public void setReturnAverage(boolean returnAverage) {
        this.returnAverage = returnAverage;
    }


    /**
     * Gets the startDate value for this MobileHomeMeasurementsRequest.
     * 
     * @return startDate
     */
    public long getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this MobileHomeMeasurementsRequest.
     * 
     * @param startDate
     */
    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the username value for this MobileHomeMeasurementsRequest.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this MobileHomeMeasurementsRequest.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the week value for this MobileHomeMeasurementsRequest.
     * 
     * @return week
     */
    public int getWeek() {
        return week;
    }


    /**
     * Sets the week value for this MobileHomeMeasurementsRequest.
     * 
     * @param week
     */
    public void setWeek(int week) {
        this.week = week;
    }


    /**
     * Gets the year value for this MobileHomeMeasurementsRequest.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this MobileHomeMeasurementsRequest.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileHomeMeasurementsRequest)) return false;
        MobileHomeMeasurementsRequest other = (MobileHomeMeasurementsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.day == other.getDay() &&
            ((this.deviceSerialNumbers==null && other.getDeviceSerialNumbers()==null) || 
             (this.deviceSerialNumbers!=null &&
              java.util.Arrays.equals(this.deviceSerialNumbers, other.getDeviceSerialNumbers()))) &&
            this.endDate == other.getEndDate() &&
            this.gatewayId == other.getGatewayId() &&
            ((this.measurementPeriod==null && other.getMeasurementPeriod()==null) || 
             (this.measurementPeriod!=null &&
              this.measurementPeriod.equals(other.getMeasurementPeriod()))) &&
            ((this.measurementType==null && other.getMeasurementType()==null) || 
             (this.measurementType!=null &&
              this.measurementType.equals(other.getMeasurementType()))) &&
            ((this.measurementUnitType==null && other.getMeasurementUnitType()==null) || 
             (this.measurementUnitType!=null &&
              this.measurementUnitType.equals(other.getMeasurementUnitType()))) &&
            this.month == other.getMonth() &&
            ((this.resultOrder==null && other.getResultOrder()==null) || 
             (this.resultOrder!=null &&
              this.resultOrder.equals(other.getResultOrder()))) &&
            this.returnAverage == other.isReturnAverage() &&
            this.startDate == other.getStartDate() &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            this.week == other.getWeek() &&
            this.year == other.getYear();
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
        _hashCode += getDay();
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
        _hashCode += new Long(getEndDate()).hashCode();
        _hashCode += new Long(getGatewayId()).hashCode();
        if (getMeasurementPeriod() != null) {
            _hashCode += getMeasurementPeriod().hashCode();
        }
        if (getMeasurementType() != null) {
            _hashCode += getMeasurementType().hashCode();
        }
        if (getMeasurementUnitType() != null) {
            _hashCode += getMeasurementUnitType().hashCode();
        }
        _hashCode += getMonth();
        if (getResultOrder() != null) {
            _hashCode += getResultOrder().hashCode();
        }
        _hashCode += (isReturnAverage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getStartDate()).hashCode();
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        _hashCode += getWeek();
        _hashCode += getYear();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileHomeMeasurementsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileHomeMeasurementsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measurementPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measurementPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "periodUnitEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measurementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measurementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measurementUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measurementUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementUnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "searchOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAverage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnAverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("week");
        elemField.setXmlName(new javax.xml.namespace.QName("", "week"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
