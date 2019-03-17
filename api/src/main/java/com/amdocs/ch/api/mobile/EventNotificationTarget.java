/**
 * EventNotificationTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public abstract class EventNotificationTarget  implements java.io.Serializable {
    private java.lang.String media;

    private com.amdocs.ch.api.mobile.EventNotificationTargetType targetType;

    private java.lang.String message;

    private com.amdocs.ch.api.mobile.NotificationCategory notificationCategory;

    private java.lang.String title;

    private com.amdocs.ch.api.mobile.Id userId;

    private com.amdocs.ch.api.mobile.Id userSiteId;

    public EventNotificationTarget() {
    }

    public EventNotificationTarget(
           java.lang.String media,
           com.amdocs.ch.api.mobile.EventNotificationTargetType targetType,
           java.lang.String message,
           com.amdocs.ch.api.mobile.NotificationCategory notificationCategory,
           java.lang.String title,
           com.amdocs.ch.api.mobile.Id userId,
           com.amdocs.ch.api.mobile.Id userSiteId) {
           this.media = media;
           this.targetType = targetType;
           this.message = message;
           this.notificationCategory = notificationCategory;
           this.title = title;
           this.userId = userId;
           this.userSiteId = userSiteId;
    }


    /**
     * Gets the media value for this EventNotificationTarget.
     * 
     * @return media
     */
    public java.lang.String getMedia() {
        return media;
    }


    /**
     * Sets the media value for this EventNotificationTarget.
     * 
     * @param media
     */
    public void setMedia(java.lang.String media) {
        this.media = media;
    }


    /**
     * Gets the targetType value for this EventNotificationTarget.
     * 
     * @return targetType
     */
    public com.amdocs.ch.api.mobile.EventNotificationTargetType getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this EventNotificationTarget.
     * 
     * @param targetType
     */
    public void setTargetType(com.amdocs.ch.api.mobile.EventNotificationTargetType targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the message value for this EventNotificationTarget.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this EventNotificationTarget.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the notificationCategory value for this EventNotificationTarget.
     * 
     * @return notificationCategory
     */
    public com.amdocs.ch.api.mobile.NotificationCategory getNotificationCategory() {
        return notificationCategory;
    }


    /**
     * Sets the notificationCategory value for this EventNotificationTarget.
     * 
     * @param notificationCategory
     */
    public void setNotificationCategory(com.amdocs.ch.api.mobile.NotificationCategory notificationCategory) {
        this.notificationCategory = notificationCategory;
    }


    /**
     * Gets the title value for this EventNotificationTarget.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this EventNotificationTarget.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the userId value for this EventNotificationTarget.
     * 
     * @return userId
     */
    public com.amdocs.ch.api.mobile.Id getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this EventNotificationTarget.
     * 
     * @param userId
     */
    public void setUserId(com.amdocs.ch.api.mobile.Id userId) {
        this.userId = userId;
    }


    /**
     * Gets the userSiteId value for this EventNotificationTarget.
     * 
     * @return userSiteId
     */
    public com.amdocs.ch.api.mobile.Id getUserSiteId() {
        return userSiteId;
    }


    /**
     * Sets the userSiteId value for this EventNotificationTarget.
     * 
     * @param userSiteId
     */
    public void setUserSiteId(com.amdocs.ch.api.mobile.Id userSiteId) {
        this.userSiteId = userSiteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventNotificationTarget)) return false;
        EventNotificationTarget other = (EventNotificationTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.media==null && other.getMedia()==null) || 
             (this.media!=null &&
              this.media.equals(other.getMedia()))) &&
            ((this.targetType==null && other.getTargetType()==null) || 
             (this.targetType!=null &&
              this.targetType.equals(other.getTargetType()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.notificationCategory==null && other.getNotificationCategory()==null) || 
             (this.notificationCategory!=null &&
              this.notificationCategory.equals(other.getNotificationCategory()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userSiteId==null && other.getUserSiteId()==null) || 
             (this.userSiteId!=null &&
              this.userSiteId.equals(other.getUserSiteId())));
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
        if (getMedia() != null) {
            _hashCode += getMedia().hashCode();
        }
        if (getTargetType() != null) {
            _hashCode += getTargetType().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getNotificationCategory() != null) {
            _hashCode += getNotificationCategory().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserSiteId() != null) {
            _hashCode += getUserSiteId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventNotificationTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new javax.xml.namespace.QName("", "media"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
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
