/**
 * VideoSessionInProgress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VideoSessionInProgress  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.VideoSessionAction[] actions;

    private com.amdocs.ch.api.mobile.Id deviceId;

    private java.lang.String deviceSerial;

    private com.amdocs.ch.api.mobile.Id gatewayId;

    private java.util.Calendar lastUpdate;

    private boolean locked;

    private java.util.Calendar nextAction;

    private boolean recording;

    private java.lang.String recordingName;

    private com.amdocs.ch.api.mobile.VideoSession session;

    private com.amdocs.ch.api.mobile.VideoSessionStatus sessionStatus;

    public VideoSessionInProgress() {
    }

    public VideoSessionInProgress(
           com.amdocs.ch.api.mobile.VideoSessionAction[] actions,
           com.amdocs.ch.api.mobile.Id deviceId,
           java.lang.String deviceSerial,
           com.amdocs.ch.api.mobile.Id gatewayId,
           java.util.Calendar lastUpdate,
           boolean locked,
           java.util.Calendar nextAction,
           boolean recording,
           java.lang.String recordingName,
           com.amdocs.ch.api.mobile.VideoSession session,
           com.amdocs.ch.api.mobile.VideoSessionStatus sessionStatus) {
           this.actions = actions;
           this.deviceId = deviceId;
           this.deviceSerial = deviceSerial;
           this.gatewayId = gatewayId;
           this.lastUpdate = lastUpdate;
           this.locked = locked;
           this.nextAction = nextAction;
           this.recording = recording;
           this.recordingName = recordingName;
           this.session = session;
           this.sessionStatus = sessionStatus;
    }


    /**
     * Gets the actions value for this VideoSessionInProgress.
     * 
     * @return actions
     */
    public com.amdocs.ch.api.mobile.VideoSessionAction[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this VideoSessionInProgress.
     * 
     * @param actions
     */
    public void setActions(com.amdocs.ch.api.mobile.VideoSessionAction[] actions) {
        this.actions = actions;
    }

    public com.amdocs.ch.api.mobile.VideoSessionAction getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, com.amdocs.ch.api.mobile.VideoSessionAction _value) {
        this.actions[i] = _value;
    }


    /**
     * Gets the deviceId value for this VideoSessionInProgress.
     * 
     * @return deviceId
     */
    public com.amdocs.ch.api.mobile.Id getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this VideoSessionInProgress.
     * 
     * @param deviceId
     */
    public void setDeviceId(com.amdocs.ch.api.mobile.Id deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the deviceSerial value for this VideoSessionInProgress.
     * 
     * @return deviceSerial
     */
    public java.lang.String getDeviceSerial() {
        return deviceSerial;
    }


    /**
     * Sets the deviceSerial value for this VideoSessionInProgress.
     * 
     * @param deviceSerial
     */
    public void setDeviceSerial(java.lang.String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }


    /**
     * Gets the gatewayId value for this VideoSessionInProgress.
     * 
     * @return gatewayId
     */
    public com.amdocs.ch.api.mobile.Id getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this VideoSessionInProgress.
     * 
     * @param gatewayId
     */
    public void setGatewayId(com.amdocs.ch.api.mobile.Id gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the lastUpdate value for this VideoSessionInProgress.
     * 
     * @return lastUpdate
     */
    public java.util.Calendar getLastUpdate() {
        return lastUpdate;
    }


    /**
     * Sets the lastUpdate value for this VideoSessionInProgress.
     * 
     * @param lastUpdate
     */
    public void setLastUpdate(java.util.Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    /**
     * Gets the locked value for this VideoSessionInProgress.
     * 
     * @return locked
     */
    public boolean isLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this VideoSessionInProgress.
     * 
     * @param locked
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }


    /**
     * Gets the nextAction value for this VideoSessionInProgress.
     * 
     * @return nextAction
     */
    public java.util.Calendar getNextAction() {
        return nextAction;
    }


    /**
     * Sets the nextAction value for this VideoSessionInProgress.
     * 
     * @param nextAction
     */
    public void setNextAction(java.util.Calendar nextAction) {
        this.nextAction = nextAction;
    }


    /**
     * Gets the recording value for this VideoSessionInProgress.
     * 
     * @return recording
     */
    public boolean isRecording() {
        return recording;
    }


    /**
     * Sets the recording value for this VideoSessionInProgress.
     * 
     * @param recording
     */
    public void setRecording(boolean recording) {
        this.recording = recording;
    }


    /**
     * Gets the recordingName value for this VideoSessionInProgress.
     * 
     * @return recordingName
     */
    public java.lang.String getRecordingName() {
        return recordingName;
    }


    /**
     * Sets the recordingName value for this VideoSessionInProgress.
     * 
     * @param recordingName
     */
    public void setRecordingName(java.lang.String recordingName) {
        this.recordingName = recordingName;
    }


    /**
     * Gets the session value for this VideoSessionInProgress.
     * 
     * @return session
     */
    public com.amdocs.ch.api.mobile.VideoSession getSession() {
        return session;
    }


    /**
     * Sets the session value for this VideoSessionInProgress.
     * 
     * @param session
     */
    public void setSession(com.amdocs.ch.api.mobile.VideoSession session) {
        this.session = session;
    }


    /**
     * Gets the sessionStatus value for this VideoSessionInProgress.
     * 
     * @return sessionStatus
     */
    public com.amdocs.ch.api.mobile.VideoSessionStatus getSessionStatus() {
        return sessionStatus;
    }


    /**
     * Sets the sessionStatus value for this VideoSessionInProgress.
     * 
     * @param sessionStatus
     */
    public void setSessionStatus(com.amdocs.ch.api.mobile.VideoSessionStatus sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoSessionInProgress)) return false;
        VideoSessionInProgress other = (VideoSessionInProgress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.deviceSerial==null && other.getDeviceSerial()==null) || 
             (this.deviceSerial!=null &&
              this.deviceSerial.equals(other.getDeviceSerial()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.lastUpdate==null && other.getLastUpdate()==null) || 
             (this.lastUpdate!=null &&
              this.lastUpdate.equals(other.getLastUpdate()))) &&
            this.locked == other.isLocked() &&
            ((this.nextAction==null && other.getNextAction()==null) || 
             (this.nextAction!=null &&
              this.nextAction.equals(other.getNextAction()))) &&
            this.recording == other.isRecording() &&
            ((this.recordingName==null && other.getRecordingName()==null) || 
             (this.recordingName!=null &&
              this.recordingName.equals(other.getRecordingName()))) &&
            ((this.session==null && other.getSession()==null) || 
             (this.session!=null &&
              this.session.equals(other.getSession()))) &&
            ((this.sessionStatus==null && other.getSessionStatus()==null) || 
             (this.sessionStatus!=null &&
              this.sessionStatus.equals(other.getSessionStatus())));
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
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getDeviceSerial() != null) {
            _hashCode += getDeviceSerial().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getLastUpdate() != null) {
            _hashCode += getLastUpdate().hashCode();
        }
        _hashCode += (isLocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNextAction() != null) {
            _hashCode += getNextAction().hashCode();
        }
        _hashCode += (isRecording() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecordingName() != null) {
            _hashCode += getRecordingName().hashCode();
        }
        if (getSession() != null) {
            _hashCode += getSession().hashCode();
        }
        if (getSessionStatus() != null) {
            _hashCode += getSessionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoSessionInProgress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionInProgress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recording");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recording"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session");
        elemField.setXmlName(new javax.xml.namespace.QName("", "session"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSession"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionStatus"));
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
