/**
 * VideoSessionAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VideoSessionAction  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.Id deviceId;

    private java.lang.String deviceSerial;

    private java.util.Calendar eligibleForExec;

    private java.lang.String eventDescription;

    private java.util.Calendar eventHandled;

    private java.util.Calendar eventTime;

    private com.amdocs.ch.api.mobile.VideoSessionActionType eventType;

    private int order;

    private com.amdocs.ch.api.mobile.LogRecordReason reason;

    public VideoSessionAction() {
    }

    public VideoSessionAction(
           com.amdocs.ch.api.mobile.Id deviceId,
           java.lang.String deviceSerial,
           java.util.Calendar eligibleForExec,
           java.lang.String eventDescription,
           java.util.Calendar eventHandled,
           java.util.Calendar eventTime,
           com.amdocs.ch.api.mobile.VideoSessionActionType eventType,
           int order,
           com.amdocs.ch.api.mobile.LogRecordReason reason) {
           this.deviceId = deviceId;
           this.deviceSerial = deviceSerial;
           this.eligibleForExec = eligibleForExec;
           this.eventDescription = eventDescription;
           this.eventHandled = eventHandled;
           this.eventTime = eventTime;
           this.eventType = eventType;
           this.order = order;
           this.reason = reason;
    }


    /**
     * Gets the deviceId value for this VideoSessionAction.
     * 
     * @return deviceId
     */
    public com.amdocs.ch.api.mobile.Id getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this VideoSessionAction.
     * 
     * @param deviceId
     */
    public void setDeviceId(com.amdocs.ch.api.mobile.Id deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the deviceSerial value for this VideoSessionAction.
     * 
     * @return deviceSerial
     */
    public java.lang.String getDeviceSerial() {
        return deviceSerial;
    }


    /**
     * Sets the deviceSerial value for this VideoSessionAction.
     * 
     * @param deviceSerial
     */
    public void setDeviceSerial(java.lang.String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }


    /**
     * Gets the eligibleForExec value for this VideoSessionAction.
     * 
     * @return eligibleForExec
     */
    public java.util.Calendar getEligibleForExec() {
        return eligibleForExec;
    }


    /**
     * Sets the eligibleForExec value for this VideoSessionAction.
     * 
     * @param eligibleForExec
     */
    public void setEligibleForExec(java.util.Calendar eligibleForExec) {
        this.eligibleForExec = eligibleForExec;
    }


    /**
     * Gets the eventDescription value for this VideoSessionAction.
     * 
     * @return eventDescription
     */
    public java.lang.String getEventDescription() {
        return eventDescription;
    }


    /**
     * Sets the eventDescription value for this VideoSessionAction.
     * 
     * @param eventDescription
     */
    public void setEventDescription(java.lang.String eventDescription) {
        this.eventDescription = eventDescription;
    }


    /**
     * Gets the eventHandled value for this VideoSessionAction.
     * 
     * @return eventHandled
     */
    public java.util.Calendar getEventHandled() {
        return eventHandled;
    }


    /**
     * Sets the eventHandled value for this VideoSessionAction.
     * 
     * @param eventHandled
     */
    public void setEventHandled(java.util.Calendar eventHandled) {
        this.eventHandled = eventHandled;
    }


    /**
     * Gets the eventTime value for this VideoSessionAction.
     * 
     * @return eventTime
     */
    public java.util.Calendar getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this VideoSessionAction.
     * 
     * @param eventTime
     */
    public void setEventTime(java.util.Calendar eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the eventType value for this VideoSessionAction.
     * 
     * @return eventType
     */
    public com.amdocs.ch.api.mobile.VideoSessionActionType getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this VideoSessionAction.
     * 
     * @param eventType
     */
    public void setEventType(com.amdocs.ch.api.mobile.VideoSessionActionType eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the order value for this VideoSessionAction.
     * 
     * @return order
     */
    public int getOrder() {
        return order;
    }


    /**
     * Sets the order value for this VideoSessionAction.
     * 
     * @param order
     */
    public void setOrder(int order) {
        this.order = order;
    }


    /**
     * Gets the reason value for this VideoSessionAction.
     * 
     * @return reason
     */
    public com.amdocs.ch.api.mobile.LogRecordReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this VideoSessionAction.
     * 
     * @param reason
     */
    public void setReason(com.amdocs.ch.api.mobile.LogRecordReason reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoSessionAction)) return false;
        VideoSessionAction other = (VideoSessionAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.deviceSerial==null && other.getDeviceSerial()==null) || 
             (this.deviceSerial!=null &&
              this.deviceSerial.equals(other.getDeviceSerial()))) &&
            ((this.eligibleForExec==null && other.getEligibleForExec()==null) || 
             (this.eligibleForExec!=null &&
              this.eligibleForExec.equals(other.getEligibleForExec()))) &&
            ((this.eventDescription==null && other.getEventDescription()==null) || 
             (this.eventDescription!=null &&
              this.eventDescription.equals(other.getEventDescription()))) &&
            ((this.eventHandled==null && other.getEventHandled()==null) || 
             (this.eventHandled!=null &&
              this.eventHandled.equals(other.getEventHandled()))) &&
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            this.order == other.getOrder() &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getDeviceSerial() != null) {
            _hashCode += getDeviceSerial().hashCode();
        }
        if (getEligibleForExec() != null) {
            _hashCode += getEligibleForExec().hashCode();
        }
        if (getEventDescription() != null) {
            _hashCode += getEventDescription().hashCode();
        }
        if (getEventHandled() != null) {
            _hashCode += getEventHandled().hashCode();
        }
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        _hashCode += getOrder();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoSessionAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("eligibleForExec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eligibleForExec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventHandled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventHandled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionActionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logRecordReason"));
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
