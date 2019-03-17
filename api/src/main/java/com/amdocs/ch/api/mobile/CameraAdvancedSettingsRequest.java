/**
 * CameraAdvancedSettingsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CameraAdvancedSettingsRequest  implements java.io.Serializable {
    private long gatewayId;

    private long deviceId;

    private com.amdocs.ch.api.mobile.CameraVideoQuality cameraVideoQuality;

    private boolean recordingCameraOnAlert;

    public CameraAdvancedSettingsRequest() {
    }

    public CameraAdvancedSettingsRequest(
           long gatewayId,
           long deviceId,
           com.amdocs.ch.api.mobile.CameraVideoQuality cameraVideoQuality,
           boolean recordingCameraOnAlert) {
           this.gatewayId = gatewayId;
           this.deviceId = deviceId;
           this.cameraVideoQuality = cameraVideoQuality;
           this.recordingCameraOnAlert = recordingCameraOnAlert;
    }


    /**
     * Gets the gatewayId value for this CameraAdvancedSettingsRequest.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this CameraAdvancedSettingsRequest.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the deviceId value for this CameraAdvancedSettingsRequest.
     * 
     * @return deviceId
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this CameraAdvancedSettingsRequest.
     * 
     * @param deviceId
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the cameraVideoQuality value for this CameraAdvancedSettingsRequest.
     * 
     * @return cameraVideoQuality
     */
    public com.amdocs.ch.api.mobile.CameraVideoQuality getCameraVideoQuality() {
        return cameraVideoQuality;
    }


    /**
     * Sets the cameraVideoQuality value for this CameraAdvancedSettingsRequest.
     * 
     * @param cameraVideoQuality
     */
    public void setCameraVideoQuality(com.amdocs.ch.api.mobile.CameraVideoQuality cameraVideoQuality) {
        this.cameraVideoQuality = cameraVideoQuality;
    }


    /**
     * Gets the recordingCameraOnAlert value for this CameraAdvancedSettingsRequest.
     * 
     * @return recordingCameraOnAlert
     */
    public boolean isRecordingCameraOnAlert() {
        return recordingCameraOnAlert;
    }


    /**
     * Sets the recordingCameraOnAlert value for this CameraAdvancedSettingsRequest.
     * 
     * @param recordingCameraOnAlert
     */
    public void setRecordingCameraOnAlert(boolean recordingCameraOnAlert) {
        this.recordingCameraOnAlert = recordingCameraOnAlert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CameraAdvancedSettingsRequest)) return false;
        CameraAdvancedSettingsRequest other = (CameraAdvancedSettingsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gatewayId == other.getGatewayId() &&
            this.deviceId == other.getDeviceId() &&
            ((this.cameraVideoQuality==null && other.getCameraVideoQuality()==null) || 
             (this.cameraVideoQuality!=null &&
              this.cameraVideoQuality.equals(other.getCameraVideoQuality()))) &&
            this.recordingCameraOnAlert == other.isRecordingCameraOnAlert();
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
        _hashCode += new Long(getGatewayId()).hashCode();
        _hashCode += new Long(getDeviceId()).hashCode();
        if (getCameraVideoQuality() != null) {
            _hashCode += getCameraVideoQuality().hashCode();
        }
        _hashCode += (isRecordingCameraOnAlert() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraAdvancedSettingsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraAdvancedSettingsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraVideoQuality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cameraVideoQuality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraVideoQuality"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordingCameraOnAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordingCameraOnAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
