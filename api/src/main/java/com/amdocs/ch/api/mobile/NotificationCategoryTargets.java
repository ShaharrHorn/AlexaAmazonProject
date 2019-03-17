/**
 * NotificationCategoryTargets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class NotificationCategoryTargets  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.NotificationCategory category;

    private com.amdocs.ch.api.mobile.EventNotificationTargetType[] targetTypes;

    public NotificationCategoryTargets() {
    }

    public NotificationCategoryTargets(
           com.amdocs.ch.api.mobile.NotificationCategory category,
           com.amdocs.ch.api.mobile.EventNotificationTargetType[] targetTypes) {
           this.category = category;
           this.targetTypes = targetTypes;
    }


    /**
     * Gets the category value for this NotificationCategoryTargets.
     * 
     * @return category
     */
    public com.amdocs.ch.api.mobile.NotificationCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this NotificationCategoryTargets.
     * 
     * @param category
     */
    public void setCategory(com.amdocs.ch.api.mobile.NotificationCategory category) {
        this.category = category;
    }


    /**
     * Gets the targetTypes value for this NotificationCategoryTargets.
     * 
     * @return targetTypes
     */
    public com.amdocs.ch.api.mobile.EventNotificationTargetType[] getTargetTypes() {
        return targetTypes;
    }


    /**
     * Sets the targetTypes value for this NotificationCategoryTargets.
     * 
     * @param targetTypes
     */
    public void setTargetTypes(com.amdocs.ch.api.mobile.EventNotificationTargetType[] targetTypes) {
        this.targetTypes = targetTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationCategoryTargets)) return false;
        NotificationCategoryTargets other = (NotificationCategoryTargets) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.targetTypes==null && other.getTargetTypes()==null) || 
             (this.targetTypes!=null &&
              java.util.Arrays.equals(this.targetTypes, other.getTargetTypes())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getTargetTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationCategoryTargets.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategoryTargets"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "targetType"));
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
