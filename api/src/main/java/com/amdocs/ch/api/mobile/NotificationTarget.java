/**
 * NotificationTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class NotificationTarget  extends com.amdocs.ch.api.mobile.INotificationTarget  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.NotificationCategory notificationCategory;

    private com.amdocs.ch.api.mobile.EventNotificationTargetType targetType;

    public NotificationTarget() {
    }

    public NotificationTarget(
           java.lang.String target,
           long userId,
           long userSiteId,
           com.amdocs.ch.api.mobile.NotificationCategory notificationCategory,
           com.amdocs.ch.api.mobile.EventNotificationTargetType targetType) {
        super(
            target,
            userId,
            userSiteId);
        this.notificationCategory = notificationCategory;
        this.targetType = targetType;
    }


    /**
     * Gets the notificationCategory value for this NotificationTarget.
     * 
     * @return notificationCategory
     */
    public com.amdocs.ch.api.mobile.NotificationCategory getNotificationCategory() {
        return notificationCategory;
    }


    /**
     * Sets the notificationCategory value for this NotificationTarget.
     * 
     * @param notificationCategory
     */
    public void setNotificationCategory(com.amdocs.ch.api.mobile.NotificationCategory notificationCategory) {
        this.notificationCategory = notificationCategory;
    }


    /**
     * Gets the targetType value for this NotificationTarget.
     * 
     * @return targetType
     */
    public com.amdocs.ch.api.mobile.EventNotificationTargetType getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this NotificationTarget.
     * 
     * @param targetType
     */
    public void setTargetType(com.amdocs.ch.api.mobile.EventNotificationTargetType targetType) {
        this.targetType = targetType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationTarget)) return false;
        NotificationTarget other = (NotificationTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notificationCategory==null && other.getNotificationCategory()==null) || 
             (this.notificationCategory!=null &&
              this.notificationCategory.equals(other.getNotificationCategory()))) &&
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
        if (getNotificationCategory() != null) {
            _hashCode += getNotificationCategory().hashCode();
        }
        if (getTargetType() != null) {
            _hashCode += getTargetType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategory"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetType"));
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
