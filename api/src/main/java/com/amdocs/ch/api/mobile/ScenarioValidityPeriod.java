/**
 * ScenarioValidityPeriod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ScenarioValidityPeriod  implements java.io.Serializable {
    private java.util.Calendar endDate;

    private boolean friday;

    private boolean monday;

    private boolean nonEvent;

    private boolean saturday;

    private java.lang.String startAt;

    private java.util.Calendar startDate;

    private java.lang.String stopAt;

    private boolean sunday;

    private boolean thursday;

    private boolean tuesday;

    private boolean wednesday;

    public ScenarioValidityPeriod() {
    }

    public ScenarioValidityPeriod(
           java.util.Calendar endDate,
           boolean friday,
           boolean monday,
           boolean nonEvent,
           boolean saturday,
           java.lang.String startAt,
           java.util.Calendar startDate,
           java.lang.String stopAt,
           boolean sunday,
           boolean thursday,
           boolean tuesday,
           boolean wednesday) {
           this.endDate = endDate;
           this.friday = friday;
           this.monday = monday;
           this.nonEvent = nonEvent;
           this.saturday = saturday;
           this.startAt = startAt;
           this.startDate = startDate;
           this.stopAt = stopAt;
           this.sunday = sunday;
           this.thursday = thursday;
           this.tuesday = tuesday;
           this.wednesday = wednesday;
    }


    /**
     * Gets the endDate value for this ScenarioValidityPeriod.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ScenarioValidityPeriod.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the friday value for this ScenarioValidityPeriod.
     * 
     * @return friday
     */
    public boolean isFriday() {
        return friday;
    }


    /**
     * Sets the friday value for this ScenarioValidityPeriod.
     * 
     * @param friday
     */
    public void setFriday(boolean friday) {
        this.friday = friday;
    }


    /**
     * Gets the monday value for this ScenarioValidityPeriod.
     * 
     * @return monday
     */
    public boolean isMonday() {
        return monday;
    }


    /**
     * Sets the monday value for this ScenarioValidityPeriod.
     * 
     * @param monday
     */
    public void setMonday(boolean monday) {
        this.monday = monday;
    }


    /**
     * Gets the nonEvent value for this ScenarioValidityPeriod.
     * 
     * @return nonEvent
     */
    public boolean isNonEvent() {
        return nonEvent;
    }


    /**
     * Sets the nonEvent value for this ScenarioValidityPeriod.
     * 
     * @param nonEvent
     */
    public void setNonEvent(boolean nonEvent) {
        this.nonEvent = nonEvent;
    }


    /**
     * Gets the saturday value for this ScenarioValidityPeriod.
     * 
     * @return saturday
     */
    public boolean isSaturday() {
        return saturday;
    }


    /**
     * Sets the saturday value for this ScenarioValidityPeriod.
     * 
     * @param saturday
     */
    public void setSaturday(boolean saturday) {
        this.saturday = saturday;
    }


    /**
     * Gets the startAt value for this ScenarioValidityPeriod.
     * 
     * @return startAt
     */
    public java.lang.String getStartAt() {
        return startAt;
    }


    /**
     * Sets the startAt value for this ScenarioValidityPeriod.
     * 
     * @param startAt
     */
    public void setStartAt(java.lang.String startAt) {
        this.startAt = startAt;
    }


    /**
     * Gets the startDate value for this ScenarioValidityPeriod.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ScenarioValidityPeriod.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the stopAt value for this ScenarioValidityPeriod.
     * 
     * @return stopAt
     */
    public java.lang.String getStopAt() {
        return stopAt;
    }


    /**
     * Sets the stopAt value for this ScenarioValidityPeriod.
     * 
     * @param stopAt
     */
    public void setStopAt(java.lang.String stopAt) {
        this.stopAt = stopAt;
    }


    /**
     * Gets the sunday value for this ScenarioValidityPeriod.
     * 
     * @return sunday
     */
    public boolean isSunday() {
        return sunday;
    }


    /**
     * Sets the sunday value for this ScenarioValidityPeriod.
     * 
     * @param sunday
     */
    public void setSunday(boolean sunday) {
        this.sunday = sunday;
    }


    /**
     * Gets the thursday value for this ScenarioValidityPeriod.
     * 
     * @return thursday
     */
    public boolean isThursday() {
        return thursday;
    }


    /**
     * Sets the thursday value for this ScenarioValidityPeriod.
     * 
     * @param thursday
     */
    public void setThursday(boolean thursday) {
        this.thursday = thursday;
    }


    /**
     * Gets the tuesday value for this ScenarioValidityPeriod.
     * 
     * @return tuesday
     */
    public boolean isTuesday() {
        return tuesday;
    }


    /**
     * Sets the tuesday value for this ScenarioValidityPeriod.
     * 
     * @param tuesday
     */
    public void setTuesday(boolean tuesday) {
        this.tuesday = tuesday;
    }


    /**
     * Gets the wednesday value for this ScenarioValidityPeriod.
     * 
     * @return wednesday
     */
    public boolean isWednesday() {
        return wednesday;
    }


    /**
     * Sets the wednesday value for this ScenarioValidityPeriod.
     * 
     * @param wednesday
     */
    public void setWednesday(boolean wednesday) {
        this.wednesday = wednesday;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScenarioValidityPeriod)) return false;
        ScenarioValidityPeriod other = (ScenarioValidityPeriod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.friday == other.isFriday() &&
            this.monday == other.isMonday() &&
            this.nonEvent == other.isNonEvent() &&
            this.saturday == other.isSaturday() &&
            ((this.startAt==null && other.getStartAt()==null) || 
             (this.startAt!=null &&
              this.startAt.equals(other.getStartAt()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.stopAt==null && other.getStopAt()==null) || 
             (this.stopAt!=null &&
              this.stopAt.equals(other.getStopAt()))) &&
            this.sunday == other.isSunday() &&
            this.thursday == other.isThursday() &&
            this.tuesday == other.isTuesday() &&
            this.wednesday == other.isWednesday();
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
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += (isFriday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMonday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNonEvent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSaturday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStartAt() != null) {
            _hashCode += getStartAt().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStopAt() != null) {
            _hashCode += getStopAt().hashCode();
        }
        _hashCode += (isSunday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isThursday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTuesday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWednesday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScenarioValidityPeriod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioValidityPeriod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "friday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saturday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stopAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sunday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sunday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thursday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thursday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuesday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tuesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wednesday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wednesday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
