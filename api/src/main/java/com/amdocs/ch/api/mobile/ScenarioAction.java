/**
 * ScenarioAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ScenarioAction  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.ScenarioActionAlert alert;

    private com.amdocs.ch.api.mobile.AudioFile audioMessage;

    private int delay;

    private long deviceId;

    private int duration;

    private int executionOrder;

    private com.amdocs.ch.api.mobile.GeneralParameter[] parameters;

    private long scenarioActionId;

    private java.lang.String serial;

    private java.lang.String state;

    private com.amdocs.ch.api.mobile.ScenarioActionType type;

    public ScenarioAction() {
    }

    public ScenarioAction(
           com.amdocs.ch.api.mobile.ScenarioActionAlert alert,
           com.amdocs.ch.api.mobile.AudioFile audioMessage,
           int delay,
           long deviceId,
           int duration,
           int executionOrder,
           com.amdocs.ch.api.mobile.GeneralParameter[] parameters,
           long scenarioActionId,
           java.lang.String serial,
           java.lang.String state,
           com.amdocs.ch.api.mobile.ScenarioActionType type) {
           this.alert = alert;
           this.audioMessage = audioMessage;
           this.delay = delay;
           this.deviceId = deviceId;
           this.duration = duration;
           this.executionOrder = executionOrder;
           this.parameters = parameters;
           this.scenarioActionId = scenarioActionId;
           this.serial = serial;
           this.state = state;
           this.type = type;
    }


    /**
     * Gets the alert value for this ScenarioAction.
     * 
     * @return alert
     */
    public com.amdocs.ch.api.mobile.ScenarioActionAlert getAlert() {
        return alert;
    }


    /**
     * Sets the alert value for this ScenarioAction.
     * 
     * @param alert
     */
    public void setAlert(com.amdocs.ch.api.mobile.ScenarioActionAlert alert) {
        this.alert = alert;
    }


    /**
     * Gets the audioMessage value for this ScenarioAction.
     * 
     * @return audioMessage
     */
    public com.amdocs.ch.api.mobile.AudioFile getAudioMessage() {
        return audioMessage;
    }


    /**
     * Sets the audioMessage value for this ScenarioAction.
     * 
     * @param audioMessage
     */
    public void setAudioMessage(com.amdocs.ch.api.mobile.AudioFile audioMessage) {
        this.audioMessage = audioMessage;
    }


    /**
     * Gets the delay value for this ScenarioAction.
     * 
     * @return delay
     */
    public int getDelay() {
        return delay;
    }


    /**
     * Sets the delay value for this ScenarioAction.
     * 
     * @param delay
     */
    public void setDelay(int delay) {
        this.delay = delay;
    }


    /**
     * Gets the deviceId value for this ScenarioAction.
     * 
     * @return deviceId
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this ScenarioAction.
     * 
     * @param deviceId
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the duration value for this ScenarioAction.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this ScenarioAction.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the executionOrder value for this ScenarioAction.
     * 
     * @return executionOrder
     */
    public int getExecutionOrder() {
        return executionOrder;
    }


    /**
     * Sets the executionOrder value for this ScenarioAction.
     * 
     * @param executionOrder
     */
    public void setExecutionOrder(int executionOrder) {
        this.executionOrder = executionOrder;
    }


    /**
     * Gets the parameters value for this ScenarioAction.
     * 
     * @return parameters
     */
    public com.amdocs.ch.api.mobile.GeneralParameter[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this ScenarioAction.
     * 
     * @param parameters
     */
    public void setParameters(com.amdocs.ch.api.mobile.GeneralParameter[] parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the scenarioActionId value for this ScenarioAction.
     * 
     * @return scenarioActionId
     */
    public long getScenarioActionId() {
        return scenarioActionId;
    }


    /**
     * Sets the scenarioActionId value for this ScenarioAction.
     * 
     * @param scenarioActionId
     */
    public void setScenarioActionId(long scenarioActionId) {
        this.scenarioActionId = scenarioActionId;
    }


    /**
     * Gets the serial value for this ScenarioAction.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this ScenarioAction.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the state value for this ScenarioAction.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ScenarioAction.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the type value for this ScenarioAction.
     * 
     * @return type
     */
    public com.amdocs.ch.api.mobile.ScenarioActionType getType() {
        return type;
    }


    /**
     * Sets the type value for this ScenarioAction.
     * 
     * @param type
     */
    public void setType(com.amdocs.ch.api.mobile.ScenarioActionType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScenarioAction)) return false;
        ScenarioAction other = (ScenarioAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alert==null && other.getAlert()==null) || 
             (this.alert!=null &&
              this.alert.equals(other.getAlert()))) &&
            ((this.audioMessage==null && other.getAudioMessage()==null) || 
             (this.audioMessage!=null &&
              this.audioMessage.equals(other.getAudioMessage()))) &&
            this.delay == other.getDelay() &&
            this.deviceId == other.getDeviceId() &&
            this.duration == other.getDuration() &&
            this.executionOrder == other.getExecutionOrder() &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            this.scenarioActionId == other.getScenarioActionId() &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getAlert() != null) {
            _hashCode += getAlert().hashCode();
        }
        if (getAudioMessage() != null) {
            _hashCode += getAudioMessage().hashCode();
        }
        _hashCode += getDelay();
        _hashCode += new Long(getDeviceId()).hashCode();
        _hashCode += getDuration();
        _hashCode += getExecutionOrder();
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
        _hashCode += new Long(getScenarioActionId()).hashCode();
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScenarioAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioActionAlert"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "audioMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "audioFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "executionOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "generalParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "parameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenarioActionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scenarioActionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioActionType"));
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
