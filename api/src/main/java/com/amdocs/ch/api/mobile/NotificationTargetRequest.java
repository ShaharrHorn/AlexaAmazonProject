/**
 * NotificationTargetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class NotificationTargetRequest  extends com.amdocs.ch.api.mobile.INotificationTargetRequest  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.NotificationTarget[] notificationTarget;

    public NotificationTargetRequest() {
    }

    public NotificationTargetRequest(
           long gatewayId,
           com.amdocs.ch.api.mobile.NotificationTarget[] notificationTarget) {
        super(
            gatewayId);
        this.notificationTarget = notificationTarget;
    }


    /**
     * Gets the notificationTarget value for this NotificationTargetRequest.
     * 
     * @return notificationTarget
     */
    public com.amdocs.ch.api.mobile.NotificationTarget[] getNotificationTarget() {
        return notificationTarget;
    }


    /**
     * Sets the notificationTarget value for this NotificationTargetRequest.
     * 
     * @param notificationTarget
     */
    public void setNotificationTarget(com.amdocs.ch.api.mobile.NotificationTarget[] notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    public com.amdocs.ch.api.mobile.NotificationTarget getNotificationTarget(int i) {
        return this.notificationTarget[i];
    }

    public void setNotificationTarget(int i, com.amdocs.ch.api.mobile.NotificationTarget _value) {
        this.notificationTarget[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationTargetRequest)) return false;
        NotificationTargetRequest other = (NotificationTargetRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notificationTarget==null && other.getNotificationTarget()==null) || 
             (this.notificationTarget!=null &&
              java.util.Arrays.equals(this.notificationTarget, other.getNotificationTarget())));
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
        if (getNotificationTarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationTarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotificationTarget(), i);
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
        new org.apache.axis.description.TypeDesc(NotificationTargetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTargetRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
