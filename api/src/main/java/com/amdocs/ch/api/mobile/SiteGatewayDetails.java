/**
 * SiteGatewayDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SiteGatewayDetails  extends com.amdocs.ch.api.mobile.CustomerGatewayDetails  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.Id siteId;

    public SiteGatewayDetails() {
    }

    public SiteGatewayDetails(
           java.lang.String firmwareVersion,
           java.lang.String imei,
           java.lang.String manufacturerName,
           java.lang.String model,
           java.lang.String packageNumber,
           java.lang.String serial,
           java.lang.String status,
           java.util.Calendar activationDate,
           com.amdocs.ch.api.mobile.GatewayAudioFile activeWarningMessageFile,
           com.amdocs.ch.api.mobile.GatewayArmingMode armingMode,
           com.amdocs.ch.api.mobile.GatewayAudioFile[] audioFiles,
           int batteryLevel,
           com.amdocs.ch.api.mobile.GatewayConnectionType connectionType,
           com.amdocs.ch.api.mobile.Id customerId,
           boolean dualWifiEnabled,
           java.util.Calendar firmwareUpdateDate,
           com.amdocs.ch.api.mobile.Id gatewayId,
           int gsmLevel,
           java.lang.String ip,
           java.lang.String mainUsername,
           com.amdocs.ch.api.mobile.GatewayMuteMode muteMode,
           com.amdocs.ch.api.mobile.GatewayPairingMode pairingMode,
           com.amdocs.ch.api.mobile.ArmingPartition[] partitions,
           com.amdocs.ch.api.mobile.WifiSettings secondaryWifiSettings,
           java.lang.String timeZone,
           java.lang.String userName,
           java.lang.String vendor,
           boolean videoEnabled,
           com.amdocs.ch.api.mobile.SensorTriggerMode warningMessageTriggerModeWhenSystemArmed,
           com.amdocs.ch.api.mobile.SensorTriggerMode warningMessageTriggerModeWhenSystemCustomized,
           int wifiLevel,
           com.amdocs.ch.api.mobile.WifiSettings wifiSettings,
           com.amdocs.ch.api.mobile.Id siteId) {
        super(
            firmwareVersion,
            imei,
            manufacturerName,
            model,
            packageNumber,
            serial,
            status,
            activationDate,
            activeWarningMessageFile,
            armingMode,
            audioFiles,
            batteryLevel,
            connectionType,
            customerId,
            dualWifiEnabled,
            firmwareUpdateDate,
            gatewayId,
            gsmLevel,
            ip,
            mainUsername,
            muteMode,
            pairingMode,
            partitions,
            secondaryWifiSettings,
            timeZone,
            userName,
            vendor,
            videoEnabled,
            warningMessageTriggerModeWhenSystemArmed,
            warningMessageTriggerModeWhenSystemCustomized,
            wifiLevel,
            wifiSettings);
        this.siteId = siteId;
    }


    /**
     * Gets the siteId value for this SiteGatewayDetails.
     * 
     * @return siteId
     */
    public com.amdocs.ch.api.mobile.Id getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this SiteGatewayDetails.
     * 
     * @param siteId
     */
    public void setSiteId(com.amdocs.ch.api.mobile.Id siteId) {
        this.siteId = siteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteGatewayDetails)) return false;
        SiteGatewayDetails other = (SiteGatewayDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId())));
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
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteGatewayDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "siteGatewayDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
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
