/**
 * BaseDashboardDevices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public abstract class BaseDashboardDevices  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.DashboardDevicePriority dashboardPriority;

    private com.amdocs.ch.api.mobile.HomeDevice[] devices;

    public BaseDashboardDevices() {
    }

    public BaseDashboardDevices(
           com.amdocs.ch.api.mobile.DashboardDevicePriority dashboardPriority,
           com.amdocs.ch.api.mobile.HomeDevice[] devices) {
           this.dashboardPriority = dashboardPriority;
           this.devices = devices;
    }


    /**
     * Gets the dashboardPriority value for this BaseDashboardDevices.
     * 
     * @return dashboardPriority
     */
    public com.amdocs.ch.api.mobile.DashboardDevicePriority getDashboardPriority() {
        return dashboardPriority;
    }


    /**
     * Sets the dashboardPriority value for this BaseDashboardDevices.
     * 
     * @param dashboardPriority
     */
    public void setDashboardPriority(com.amdocs.ch.api.mobile.DashboardDevicePriority dashboardPriority) {
        this.dashboardPriority = dashboardPriority;
    }


    /**
     * Gets the devices value for this BaseDashboardDevices.
     * 
     * @return devices
     */
    public com.amdocs.ch.api.mobile.HomeDevice[] getDevices() {
        return devices;
    }


    /**
     * Sets the devices value for this BaseDashboardDevices.
     * 
     * @param devices
     */
    public void setDevices(com.amdocs.ch.api.mobile.HomeDevice[] devices) {
        this.devices = devices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseDashboardDevices)) return false;
        BaseDashboardDevices other = (BaseDashboardDevices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dashboardPriority==null && other.getDashboardPriority()==null) || 
             (this.dashboardPriority!=null &&
              this.dashboardPriority.equals(other.getDashboardPriority()))) &&
            ((this.devices==null && other.getDevices()==null) || 
             (this.devices!=null &&
              java.util.Arrays.equals(this.devices, other.getDevices())));
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
        if (getDashboardPriority() != null) {
            _hashCode += getDashboardPriority().hashCode();
        }
        if (getDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDevices(), i);
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
        new org.apache.axis.description.TypeDesc(BaseDashboardDevices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "baseDashboardDevices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dashboardPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "dashboardDevicePriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "homeDevice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "device"));
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
