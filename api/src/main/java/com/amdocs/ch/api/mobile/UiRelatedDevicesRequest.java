/**
 * UiRelatedDevicesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UiRelatedDevicesRequest  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.DashboardDevicePriority dashboardPriority;

    private long gatewayId;

    private java.lang.String verticalName;

    public UiRelatedDevicesRequest() {
    }

    public UiRelatedDevicesRequest(
           com.amdocs.ch.api.mobile.DashboardDevicePriority dashboardPriority,
           long gatewayId,
           java.lang.String verticalName) {
           this.dashboardPriority = dashboardPriority;
           this.gatewayId = gatewayId;
           this.verticalName = verticalName;
    }


    /**
     * Gets the dashboardPriority value for this UiRelatedDevicesRequest.
     * 
     * @return dashboardPriority
     */
    public com.amdocs.ch.api.mobile.DashboardDevicePriority getDashboardPriority() {
        return dashboardPriority;
    }


    /**
     * Sets the dashboardPriority value for this UiRelatedDevicesRequest.
     * 
     * @param dashboardPriority
     */
    public void setDashboardPriority(com.amdocs.ch.api.mobile.DashboardDevicePriority dashboardPriority) {
        this.dashboardPriority = dashboardPriority;
    }


    /**
     * Gets the gatewayId value for this UiRelatedDevicesRequest.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this UiRelatedDevicesRequest.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the verticalName value for this UiRelatedDevicesRequest.
     * 
     * @return verticalName
     */
    public java.lang.String getVerticalName() {
        return verticalName;
    }


    /**
     * Sets the verticalName value for this UiRelatedDevicesRequest.
     * 
     * @param verticalName
     */
    public void setVerticalName(java.lang.String verticalName) {
        this.verticalName = verticalName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UiRelatedDevicesRequest)) return false;
        UiRelatedDevicesRequest other = (UiRelatedDevicesRequest) obj;
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
            this.gatewayId == other.getGatewayId() &&
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
        if (getDashboardPriority() != null) {
            _hashCode += getDashboardPriority().hashCode();
        }
        _hashCode += new Long(getGatewayId()).hashCode();
        if (getVerticalName() != null) {
            _hashCode += getVerticalName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UiRelatedDevicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "uiRelatedDevicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dashboardPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dashboardPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "dashboardDevicePriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verticalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
