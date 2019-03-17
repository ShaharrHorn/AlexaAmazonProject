/**
 * WifiStatusDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class WifiStatusDetails  implements java.io.Serializable {
    private int channel;

    private com.amdocs.ch.api.mobile.Id deviceId;

    private java.lang.String domain;

    private int noise;

    private int quality;

    private int rssi;

    private java.lang.String ssid;

    public WifiStatusDetails() {
    }

    public WifiStatusDetails(
           int channel,
           com.amdocs.ch.api.mobile.Id deviceId,
           java.lang.String domain,
           int noise,
           int quality,
           int rssi,
           java.lang.String ssid) {
           this.channel = channel;
           this.deviceId = deviceId;
           this.domain = domain;
           this.noise = noise;
           this.quality = quality;
           this.rssi = rssi;
           this.ssid = ssid;
    }


    /**
     * Gets the channel value for this WifiStatusDetails.
     * 
     * @return channel
     */
    public int getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this WifiStatusDetails.
     * 
     * @param channel
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }


    /**
     * Gets the deviceId value for this WifiStatusDetails.
     * 
     * @return deviceId
     */
    public com.amdocs.ch.api.mobile.Id getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this WifiStatusDetails.
     * 
     * @param deviceId
     */
    public void setDeviceId(com.amdocs.ch.api.mobile.Id deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the domain value for this WifiStatusDetails.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this WifiStatusDetails.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the noise value for this WifiStatusDetails.
     * 
     * @return noise
     */
    public int getNoise() {
        return noise;
    }


    /**
     * Sets the noise value for this WifiStatusDetails.
     * 
     * @param noise
     */
    public void setNoise(int noise) {
        this.noise = noise;
    }


    /**
     * Gets the quality value for this WifiStatusDetails.
     * 
     * @return quality
     */
    public int getQuality() {
        return quality;
    }


    /**
     * Sets the quality value for this WifiStatusDetails.
     * 
     * @param quality
     */
    public void setQuality(int quality) {
        this.quality = quality;
    }


    /**
     * Gets the rssi value for this WifiStatusDetails.
     * 
     * @return rssi
     */
    public int getRssi() {
        return rssi;
    }


    /**
     * Sets the rssi value for this WifiStatusDetails.
     * 
     * @param rssi
     */
    public void setRssi(int rssi) {
        this.rssi = rssi;
    }


    /**
     * Gets the ssid value for this WifiStatusDetails.
     * 
     * @return ssid
     */
    public java.lang.String getSsid() {
        return ssid;
    }


    /**
     * Sets the ssid value for this WifiStatusDetails.
     * 
     * @param ssid
     */
    public void setSsid(java.lang.String ssid) {
        this.ssid = ssid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WifiStatusDetails)) return false;
        WifiStatusDetails other = (WifiStatusDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.channel == other.getChannel() &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            this.noise == other.getNoise() &&
            this.quality == other.getQuality() &&
            this.rssi == other.getRssi() &&
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
        _hashCode += getChannel();
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        _hashCode += getNoise();
        _hashCode += getQuality();
        _hashCode += getRssi();
        if (getSsid() != null) {
            _hashCode += getSsid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WifiStatusDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiStatusDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noise");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rssi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rssi"));
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
