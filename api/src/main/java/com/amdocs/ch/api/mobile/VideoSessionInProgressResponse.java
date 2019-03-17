/**
 * VideoSessionInProgressResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VideoSessionInProgressResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.VideoSessionInProgress videoSessionDetails;

    public VideoSessionInProgressResponse() {
    }

    public VideoSessionInProgressResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.VideoSessionInProgress videoSessionDetails) {
        super(
            success,
            faultCode,
            faultDescription);
        this.videoSessionDetails = videoSessionDetails;
    }


    /**
     * Gets the videoSessionDetails value for this VideoSessionInProgressResponse.
     * 
     * @return videoSessionDetails
     */
    public com.amdocs.ch.api.mobile.VideoSessionInProgress getVideoSessionDetails() {
        return videoSessionDetails;
    }


    /**
     * Sets the videoSessionDetails value for this VideoSessionInProgressResponse.
     * 
     * @param videoSessionDetails
     */
    public void setVideoSessionDetails(com.amdocs.ch.api.mobile.VideoSessionInProgress videoSessionDetails) {
        this.videoSessionDetails = videoSessionDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoSessionInProgressResponse)) return false;
        VideoSessionInProgressResponse other = (VideoSessionInProgressResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.videoSessionDetails==null && other.getVideoSessionDetails()==null) || 
             (this.videoSessionDetails!=null &&
              this.videoSessionDetails.equals(other.getVideoSessionDetails())));
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
        if (getVideoSessionDetails() != null) {
            _hashCode += getVideoSessionDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoSessionInProgressResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionInProgressResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoSessionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoSessionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionInProgress"));
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
