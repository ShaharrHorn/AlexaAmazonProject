/**
 * IvrNotificationTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class IvrNotificationTarget  extends com.amdocs.ch.api.mobile.PhoneNotificationTarget  implements java.io.Serializable {
    private java.lang.String ivrLanguage;

    private int order;

    public IvrNotificationTarget() {
    }

    public IvrNotificationTarget(
           java.lang.String media,
           com.amdocs.ch.api.mobile.EventNotificationTargetType targetType,
           java.lang.String message,
           com.amdocs.ch.api.mobile.NotificationCategory notificationCategory,
           java.lang.String title,
           com.amdocs.ch.api.mobile.Id userId,
           com.amdocs.ch.api.mobile.Id userSiteId,
           java.lang.String phoneNumber,
           java.lang.String ivrLanguage,
           int order) {
        super(
            media,
            targetType,
            message,
            notificationCategory,
            title,
            userId,
            userSiteId,
            phoneNumber);
        this.ivrLanguage = ivrLanguage;
        this.order = order;
    }


    /**
     * Gets the ivrLanguage value for this IvrNotificationTarget.
     * 
     * @return ivrLanguage
     */
    public java.lang.String getIvrLanguage() {
        return ivrLanguage;
    }


    /**
     * Sets the ivrLanguage value for this IvrNotificationTarget.
     * 
     * @param ivrLanguage
     */
    public void setIvrLanguage(java.lang.String ivrLanguage) {
        this.ivrLanguage = ivrLanguage;
    }


    /**
     * Gets the order value for this IvrNotificationTarget.
     * 
     * @return order
     */
    public int getOrder() {
        return order;
    }


    /**
     * Sets the order value for this IvrNotificationTarget.
     * 
     * @param order
     */
    public void setOrder(int order) {
        this.order = order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IvrNotificationTarget)) return false;
        IvrNotificationTarget other = (IvrNotificationTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ivrLanguage==null && other.getIvrLanguage()==null) || 
             (this.ivrLanguage!=null &&
              this.ivrLanguage.equals(other.getIvrLanguage()))) &&
            this.order == other.getOrder();
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
        if (getIvrLanguage() != null) {
            _hashCode += getIvrLanguage().hashCode();
        }
        _hashCode += getOrder();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IvrNotificationTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "ivrNotificationTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivrLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivrLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
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
