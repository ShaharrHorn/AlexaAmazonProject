/**
 * CameraVideoQuality.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CameraVideoQuality  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.CameraFixedQuality fixedQuality;

    private int maxFrameRate;

    private com.amdocs.ch.api.mobile.CameraResoution resolution;

    private com.amdocs.ch.api.mobile.CameraVideoQualityOption videoQualityOption;

    public CameraVideoQuality() {
    }

    public CameraVideoQuality(
           com.amdocs.ch.api.mobile.CameraFixedQuality fixedQuality,
           int maxFrameRate,
           com.amdocs.ch.api.mobile.CameraResoution resolution,
           com.amdocs.ch.api.mobile.CameraVideoQualityOption videoQualityOption) {
           this.fixedQuality = fixedQuality;
           this.maxFrameRate = maxFrameRate;
           this.resolution = resolution;
           this.videoQualityOption = videoQualityOption;
    }


    /**
     * Gets the fixedQuality value for this CameraVideoQuality.
     * 
     * @return fixedQuality
     */
    public com.amdocs.ch.api.mobile.CameraFixedQuality getFixedQuality() {
        return fixedQuality;
    }


    /**
     * Sets the fixedQuality value for this CameraVideoQuality.
     * 
     * @param fixedQuality
     */
    public void setFixedQuality(com.amdocs.ch.api.mobile.CameraFixedQuality fixedQuality) {
        this.fixedQuality = fixedQuality;
    }


    /**
     * Gets the maxFrameRate value for this CameraVideoQuality.
     * 
     * @return maxFrameRate
     */
    public int getMaxFrameRate() {
        return maxFrameRate;
    }


    /**
     * Sets the maxFrameRate value for this CameraVideoQuality.
     * 
     * @param maxFrameRate
     */
    public void setMaxFrameRate(int maxFrameRate) {
        this.maxFrameRate = maxFrameRate;
    }


    /**
     * Gets the resolution value for this CameraVideoQuality.
     * 
     * @return resolution
     */
    public com.amdocs.ch.api.mobile.CameraResoution getResolution() {
        return resolution;
    }


    /**
     * Sets the resolution value for this CameraVideoQuality.
     * 
     * @param resolution
     */
    public void setResolution(com.amdocs.ch.api.mobile.CameraResoution resolution) {
        this.resolution = resolution;
    }


    /**
     * Gets the videoQualityOption value for this CameraVideoQuality.
     * 
     * @return videoQualityOption
     */
    public com.amdocs.ch.api.mobile.CameraVideoQualityOption getVideoQualityOption() {
        return videoQualityOption;
    }


    /**
     * Sets the videoQualityOption value for this CameraVideoQuality.
     * 
     * @param videoQualityOption
     */
    public void setVideoQualityOption(com.amdocs.ch.api.mobile.CameraVideoQualityOption videoQualityOption) {
        this.videoQualityOption = videoQualityOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CameraVideoQuality)) return false;
        CameraVideoQuality other = (CameraVideoQuality) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fixedQuality==null && other.getFixedQuality()==null) || 
             (this.fixedQuality!=null &&
              this.fixedQuality.equals(other.getFixedQuality()))) &&
            this.maxFrameRate == other.getMaxFrameRate() &&
            ((this.resolution==null && other.getResolution()==null) || 
             (this.resolution!=null &&
              this.resolution.equals(other.getResolution()))) &&
            ((this.videoQualityOption==null && other.getVideoQualityOption()==null) || 
             (this.videoQualityOption!=null &&
              this.videoQualityOption.equals(other.getVideoQualityOption())));
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
        if (getFixedQuality() != null) {
            _hashCode += getFixedQuality().hashCode();
        }
        _hashCode += getMaxFrameRate();
        if (getResolution() != null) {
            _hashCode += getResolution().hashCode();
        }
        if (getVideoQualityOption() != null) {
            _hashCode += getVideoQualityOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraVideoQuality.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraVideoQuality"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedQuality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fixedQuality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraFixedQuality"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFrameRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxFrameRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraResoution"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoQualityOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoQualityOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraVideoQualityOption"));
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
