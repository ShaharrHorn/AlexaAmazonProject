/**
 * ScenarioTriggerEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ScenarioTriggerEvent  implements java.io.Serializable {
    private java.lang.String activity;

    private long deviceId;

    private com.amdocs.ch.api.mobile.GeneralParameter[] parameters;

    private java.lang.String serial;

    private long triggerEventId;

    private com.amdocs.ch.api.mobile.ScenarioTriggerType triggerType;

    public ScenarioTriggerEvent() {
    }

    public ScenarioTriggerEvent(
           java.lang.String activity,
           long deviceId,
           com.amdocs.ch.api.mobile.GeneralParameter[] parameters,
           java.lang.String serial,
           long triggerEventId,
           com.amdocs.ch.api.mobile.ScenarioTriggerType triggerType) {
           this.activity = activity;
           this.deviceId = deviceId;
           this.parameters = parameters;
           this.serial = serial;
           this.triggerEventId = triggerEventId;
           this.triggerType = triggerType;
    }


    /**
     * Gets the activity value for this ScenarioTriggerEvent.
     * 
     * @return activity
     */
    public java.lang.String getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this ScenarioTriggerEvent.
     * 
     * @param activity
     */
    public void setActivity(java.lang.String activity) {
        this.activity = activity;
    }


    /**
     * Gets the deviceId value for this ScenarioTriggerEvent.
     * 
     * @return deviceId
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this ScenarioTriggerEvent.
     * 
     * @param deviceId
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the parameters value for this ScenarioTriggerEvent.
     * 
     * @return parameters
     */
    public com.amdocs.ch.api.mobile.GeneralParameter[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this ScenarioTriggerEvent.
     * 
     * @param parameters
     */
    public void setParameters(com.amdocs.ch.api.mobile.GeneralParameter[] parameters) {
        this.parameters = parameters;
    }

    public com.amdocs.ch.api.mobile.GeneralParameter getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, com.amdocs.ch.api.mobile.GeneralParameter _value) {
        this.parameters[i] = _value;
    }


    /**
     * Gets the serial value for this ScenarioTriggerEvent.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this ScenarioTriggerEvent.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the triggerEventId value for this ScenarioTriggerEvent.
     * 
     * @return triggerEventId
     */
    public long getTriggerEventId() {
        return triggerEventId;
    }


    /**
     * Sets the triggerEventId value for this ScenarioTriggerEvent.
     * 
     * @param triggerEventId
     */
    public void setTriggerEventId(long triggerEventId) {
        this.triggerEventId = triggerEventId;
    }


    /**
     * Gets the triggerType value for this ScenarioTriggerEvent.
     * 
     * @return triggerType
     */
    public com.amdocs.ch.api.mobile.ScenarioTriggerType getTriggerType() {
        return triggerType;
    }


    /**
     * Sets the triggerType value for this ScenarioTriggerEvent.
     * 
     * @param triggerType
     */
    public void setTriggerType(com.amdocs.ch.api.mobile.ScenarioTriggerType triggerType) {
        this.triggerType = triggerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScenarioTriggerEvent)) return false;
        ScenarioTriggerEvent other = (ScenarioTriggerEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            this.deviceId == other.getDeviceId() &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            this.triggerEventId == other.getTriggerEventId() &&
            ((this.triggerType==null && other.getTriggerType()==null) || 
             (this.triggerType!=null &&
              this.triggerType.equals(other.getTriggerType())));
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
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        _hashCode += new Long(getDeviceId()).hashCode();
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        _hashCode += new Long(getTriggerEventId()).hashCode();
        if (getTriggerType() != null) {
            _hashCode += getTriggerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScenarioTriggerEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioTriggerEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "generalParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioTriggerType"));
        elemField.setMinOccurs(0);
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
