/**
 * MobilePushNotificationTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MobilePushNotificationTarget  extends com.amdocs.ch.api.mobile.EventNotificationTarget  implements java.io.Serializable {
    private java.lang.String logConfigReason;

    private com.amdocs.ch.api.mobile.EventNotificationTargetType targetType;

    public MobilePushNotificationTarget() {
    }

    public MobilePushNotificationTarget(
           java.lang.String media,
           com.amdocs.ch.api.mobile.EventNotificationTargetType _targetType,
           java.lang.String message,
           com.amdocs.ch.api.mobile.NotificationCategory notificationCategory,
           java.lang.String title,
           com.amdocs.ch.api.mobile.Id userId,
           com.amdocs.ch.api.mobile.Id userSiteId,
           java.lang.String logConfigReason,
           com.amdocs.ch.api.mobile.EventNotificationTargetType targetType) {
        super(
            media,
            _targetType,
            message,
            notificationCategory,
            title,
            userId,
            userSiteId);
        this.logConfigReason = logConfigReason;
        this.targetType = targetType;
    }


    /**
     * Gets the logConfigReason value for this MobilePushNotificationTarget.
     * 
     * @return logConfigReason
     */
    public java.lang.String getLogConfigReason() {
        return logConfigReason;
    }


    /**
     * Sets the logConfigReason value for this MobilePushNotificationTarget.
     * 
     * @param logConfigReason
     */
    public void setLogConfigReason(java.lang.String logConfigReason) {
        this.logConfigReason = logConfigReason;
    }


    /**
     * Gets the targetType value for this MobilePushNotificationTarget.
     * 
     * @return targetType
     */
    public com.amdocs.ch.api.mobile.EventNotificationTargetType getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this MobilePushNotificationTarget.
     * 
     * @param targetType
     */
    public void setTargetType(com.amdocs.ch.api.mobile.EventNotificationTargetType targetType) {
        this.targetType = targetType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobilePushNotificationTarget)) return false;
        MobilePushNotificationTarget other = (MobilePushNotificationTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.logConfigReason==null && other.getLogConfigReason()==null) || 
             (this.logConfigReason!=null &&
              this.logConfigReason.equals(other.getLogConfigReason()))) &&
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
        int _hashCode = super.hashCode();
        if (getLogConfigReason() != null) {
            _hashCode += getLogConfigReason().hashCode();
        }
        if (getTargetType() != null) {
            _hashCode += getTargetType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobilePushNotificationTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushNotificationTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logConfigReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logConfigReason"));
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
