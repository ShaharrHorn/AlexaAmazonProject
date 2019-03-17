/**
 * WifiSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class WifiSettings  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.WifiEncryptionType encryptionType;

    private boolean hidden;

    private java.lang.String key;

    private com.amdocs.ch.api.mobile.WifiMode mode;

    private java.lang.String ssid;

    private java.lang.String status;

    public WifiSettings() {
    }

    public WifiSettings(
           com.amdocs.ch.api.mobile.WifiEncryptionType encryptionType,
           boolean hidden,
           java.lang.String key,
           com.amdocs.ch.api.mobile.WifiMode mode,
           java.lang.String ssid,
           java.lang.String status) {
           this.encryptionType = encryptionType;
           this.hidden = hidden;
           this.key = key;
           this.mode = mode;
           this.ssid = ssid;
           this.status = status;
    }


    /**
     * Gets the encryptionType value for this WifiSettings.
     * 
     * @return encryptionType
     */
    public com.amdocs.ch.api.mobile.WifiEncryptionType getEncryptionType() {
        return encryptionType;
    }


    /**
     * Sets the encryptionType value for this WifiSettings.
     * 
     * @param encryptionType
     */
    public void setEncryptionType(com.amdocs.ch.api.mobile.WifiEncryptionType encryptionType) {
        this.encryptionType = encryptionType;
    }


    /**
     * Gets the hidden value for this WifiSettings.
     * 
     * @return hidden
     */
    public boolean isHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this WifiSettings.
     * 
     * @param hidden
     */
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets the key value for this WifiSettings.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this WifiSettings.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the mode value for this WifiSettings.
     * 
     * @return mode
     */
    public com.amdocs.ch.api.mobile.WifiMode getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this WifiSettings.
     * 
     * @param mode
     */
    public void setMode(com.amdocs.ch.api.mobile.WifiMode mode) {
        this.mode = mode;
    }


    /**
     * Gets the ssid value for this WifiSettings.
     * 
     * @return ssid
     */
    public java.lang.String getSsid() {
        return ssid;
    }


    /**
     * Sets the ssid value for this WifiSettings.
     * 
     * @param ssid
     */
    public void setSsid(java.lang.String ssid) {
        this.ssid = ssid;
    }


    /**
     * Gets the status value for this WifiSettings.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WifiSettings.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WifiSettings)) return false;
        WifiSettings other = (WifiSettings) obj;
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
            this.hidden == other.isHidden() &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.ssid==null && other.getSsid()==null) || 
             (this.ssid!=null &&
              this.ssid.equals(other.getSsid()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        _hashCode += (isHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getSsid() != null) {
            _hashCode += getSsid().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WifiSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encryptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiEncryptionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
