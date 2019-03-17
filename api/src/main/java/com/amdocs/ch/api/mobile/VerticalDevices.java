/**
 * VerticalDevices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VerticalDevices  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.BaseDashboardDevices[] verticalDashboardDevices;

    private java.lang.String verticalName;  // attribute

    public VerticalDevices() {
    }

    public VerticalDevices(
           com.amdocs.ch.api.mobile.BaseDashboardDevices[] verticalDashboardDevices,
           java.lang.String verticalName) {
           this.verticalDashboardDevices = verticalDashboardDevices;
           this.verticalName = verticalName;
    }


    /**
     * Gets the verticalDashboardDevices value for this VerticalDevices.
     * 
     * @return verticalDashboardDevices
     */
    public com.amdocs.ch.api.mobile.BaseDashboardDevices[] getVerticalDashboardDevices() {
        return verticalDashboardDevices;
    }


    /**
     * Sets the verticalDashboardDevices value for this VerticalDevices.
     * 
     * @param verticalDashboardDevices
     */
    public void setVerticalDashboardDevices(com.amdocs.ch.api.mobile.BaseDashboardDevices[] verticalDashboardDevices) {
        this.verticalDashboardDevices = verticalDashboardDevices;
    }


    /**
     * Gets the verticalName value for this VerticalDevices.
     * 
     * @return verticalName
     */
    public java.lang.String getVerticalName() {
        return verticalName;
    }


    /**
     * Sets the verticalName value for this VerticalDevices.
     * 
     * @param verticalName
     */
    public void setVerticalName(java.lang.String verticalName) {
        this.verticalName = verticalName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerticalDevices)) return false;
        VerticalDevices other = (VerticalDevices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.verticalDashboardDevices==null && other.getVerticalDashboardDevices()==null) || 
             (this.verticalDashboardDevices!=null &&
              java.util.Arrays.equals(this.verticalDashboardDevices, other.getVerticalDashboardDevices()))) &&
            ((this.verticalName==null && other.getVerticalName()==null) || 
             (this.verticalName!=null &&
              this.verticalName.equals(other.getVerticalName())));
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
        if (getVerticalDashboardDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVerticalDashboardDevices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVerticalDashboardDevices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVerticalName() != null) {
            _hashCode += getVerticalName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerticalDevices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "verticalDevices"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("verticalName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "verticalName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalDashboardDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verticalDashboardDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "baseDashboardDevices"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "dashboardDevices"));
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
