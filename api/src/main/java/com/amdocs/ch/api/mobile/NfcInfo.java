/**
 * NfcInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class NfcInfo  implements java.io.Serializable {
    private long deviceId;

    private long gatewayId;

    private java.lang.String nfcInfo;

    private java.lang.String nfcName;

    public NfcInfo() {
    }

    public NfcInfo(
           long deviceId,
           long gatewayId,
           java.lang.String nfcInfo,
           java.lang.String nfcName) {
           this.deviceId = deviceId;
           this.gatewayId = gatewayId;
           this.nfcInfo = nfcInfo;
           this.nfcName = nfcName;
    }


    /**
     * Gets the deviceId value for this NfcInfo.
     * 
     * @return deviceId
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this NfcInfo.
     * 
     * @param deviceId
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the gatewayId value for this NfcInfo.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this NfcInfo.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the nfcInfo value for this NfcInfo.
     * 
     * @return nfcInfo
     */
    public java.lang.String getNfcInfo() {
        return nfcInfo;
    }


    /**
     * Sets the nfcInfo value for this NfcInfo.
     * 
     * @param nfcInfo
     */
    public void setNfcInfo(java.lang.String nfcInfo) {
        this.nfcInfo = nfcInfo;
    }


    /**
     * Gets the nfcName value for this NfcInfo.
     * 
     * @return nfcName
     */
    public java.lang.String getNfcName() {
        return nfcName;
    }


    /**
     * Sets the nfcName value for this NfcInfo.
     * 
     * @param nfcName
     */
    public void setNfcName(java.lang.String nfcName) {
        this.nfcName = nfcName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfcInfo)) return false;
        NfcInfo other = (NfcInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceId == other.getDeviceId() &&
            this.gatewayId == other.getGatewayId() &&
            ((this.nfcInfo==null && other.getNfcInfo()==null) || 
             (this.nfcInfo!=null &&
              this.nfcInfo.equals(other.getNfcInfo()))) &&
            ((this.nfcName==null && other.getNfcName()==null) || 
             (this.nfcName!=null &&
              this.nfcName.equals(other.getNfcName())));
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
        _hashCode += new Long(getDeviceId()).hashCode();
        _hashCode += new Long(getGatewayId()).hashCode();
        if (getNfcInfo() != null) {
            _hashCode += getNfcInfo().hashCode();
        }
        if (getNfcName() != null) {
            _hashCode += getNfcName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NfcInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfcInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nfcInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfcName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nfcName"));
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
