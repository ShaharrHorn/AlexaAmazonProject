/**
 * WifiScanDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class WifiScanDetails  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.WifiEncryptionType encryptionType;

    private int quality;

    private java.lang.String ssid;

    public WifiScanDetails() {
    }

    public WifiScanDetails(
           com.amdocs.ch.api.mobile.WifiEncryptionType encryptionType,
           int quality,
           java.lang.String ssid) {
           this.encryptionType = encryptionType;
           this.quality = quality;
           this.ssid = ssid;
    }


    /**
     * Gets the encryptionType value for this WifiScanDetails.
     * 
     * @return encryptionType
     */
    public com.amdocs.ch.api.mobile.WifiEncryptionType getEncryptionType() {
        return encryptionType;
    }


    /**
     * Sets the encryptionType value for this WifiScanDetails.
     * 
     * @param encryptionType
     */
    public void setEncryptionType(com.amdocs.ch.api.mobile.WifiEncryptionType encryptionType) {
        this.encryptionType = encryptionType;
    }


    /**
     * Gets the quality value for this WifiScanDetails.
     * 
     * @return quality
     */
    public int getQuality() {
        return quality;
    }


    /**
     * Sets the quality value for this WifiScanDetails.
     * 
     * @param quality
     */
    public void setQuality(int quality) {
        this.quality = quality;
    }


    /**
     * Gets the ssid value for this WifiScanDetails.
     * 
     * @return ssid
     */
    public java.lang.String getSsid() {
        return ssid;
    }


    /**
     * Sets the ssid value for this WifiScanDetails.
     * 
     * @param ssid
     */
    public void setSsid(java.lang.String ssid) {
        this.ssid = ssid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WifiScanDetails)) return false;
        WifiScanDetails other = (WifiScanDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.encryptionType==null && other.getEncryptionType()==null) || 
             (this.encryptionType!=null &&
              this.encryptionType.equals(other.getEncryptionType()))) &&
            this.quality == other.getQuality() &&
            ((this.ssid==null && other.getSsid()==null) || 
             (this.ssid!=null &&
              this.ssid.equals(other.getSsid())));
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
        if (getEncryptionType() != null) {
            _hashCode += getEncryptionType().hashCode();
        }
        _hashCode += getQuality();
        if (getSsid() != null) {
            _hashCode += getSsid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WifiScanDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiScanDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiEncryptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssid"));
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
