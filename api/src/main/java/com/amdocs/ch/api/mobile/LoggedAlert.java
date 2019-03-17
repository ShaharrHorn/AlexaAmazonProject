/**
 * LoggedAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class LoggedAlert  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.EventNotificationTargetStatus ack;

    private java.util.Calendar alertDate;

    private com.amdocs.ch.api.mobile.Id loggedAlertId;

    private java.lang.String target;

    private com.amdocs.ch.api.mobile.EventNotificationTargetType targetType;

    public LoggedAlert() {
    }

    public LoggedAlert(
           com.amdocs.ch.api.mobile.EventNotificationTargetStatus ack,
           java.util.Calendar alertDate,
           com.amdocs.ch.api.mobile.Id loggedAlertId,
           java.lang.String target,
           com.amdocs.ch.api.mobile.EventNotificationTargetType targetType) {
           this.ack = ack;
           this.alertDate = alertDate;
           this.loggedAlertId = loggedAlertId;
           this.target = target;
           this.targetType = targetType;
    }


    /**
     * Gets the ack value for this LoggedAlert.
     * 
     * @return ack
     */
    public com.amdocs.ch.api.mobile.EventNotificationTargetStatus getAck() {
        return ack;
    }


    /**
     * Sets the ack value for this LoggedAlert.
     * 
     * @param ack
     */
    public void setAck(com.amdocs.ch.api.mobile.EventNotificationTargetStatus ack) {
        this.ack = ack;
    }


    /**
     * Gets the alertDate value for this LoggedAlert.
     * 
     * @return alertDate
     */
    public java.util.Calendar getAlertDate() {
        return alertDate;
    }


    /**
     * Sets the alertDate value for this LoggedAlert.
     * 
     * @param alertDate
     */
    public void setAlertDate(java.util.Calendar alertDate) {
        this.alertDate = alertDate;
    }


    /**
     * Gets the loggedAlertId value for this LoggedAlert.
     * 
     * @return loggedAlertId
     */
    public com.amdocs.ch.api.mobile.Id getLoggedAlertId() {
        return loggedAlertId;
    }


    /**
     * Sets the loggedAlertId value for this LoggedAlert.
     * 
     * @param loggedAlertId
     */
    public void setLoggedAlertId(com.amdocs.ch.api.mobile.Id loggedAlertId) {
        this.loggedAlertId = loggedAlertId;
    }


    /**
     * Gets the target value for this LoggedAlert.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this LoggedAlert.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the targetType value for this LoggedAlert.
     * 
     * @return targetType
     */
    public com.amdocs.ch.api.mobile.EventNotificationTargetType getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this LoggedAlert.
     * 
     * @param targetType
     */
    public void setTargetType(com.amdocs.ch.api.mobile.EventNotificationTargetType targetType) {
        this.targetType = targetType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoggedAlert)) return false;
        LoggedAlert other = (LoggedAlert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ack==null && other.getAck()==null) || 
             (this.ack!=null &&
              this.ack.equals(other.getAck()))) &&
            ((this.alertDate==null && other.getAlertDate()==null) || 
             (this.alertDate!=null &&
              this.alertDate.equals(other.getAlertDate()))) &&
            ((this.loggedAlertId==null && other.getLoggedAlertId()==null) || 
             (this.loggedAlertId!=null &&
              this.loggedAlertId.equals(other.getLoggedAlertId()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.targetType==null && other.getTargetType()==null) || 
             (this.targetType!=null &&
              this.targetType.equals(other.getTargetType())));
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
        if (getAck() != null) {
            _hashCode += getAck().hashCode();
        }
        if (getAlertDate() != null) {
            _hashCode += getAlertDate().hashCode();
        }
        if (getLoggedAlertId() != null) {
            _hashCode += getLoggedAlertId().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getTargetType() != null) {
            _hashCode += getTargetType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoggedAlert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "loggedAlert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loggedAlertId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loggedAlertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetType"));
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
