/**
 * VideoRecordsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VideoRecordsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.VideoRecord[] recordedVideos;

    private long totalCount;

    public VideoRecordsResponse() {
    }

    public VideoRecordsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.VideoRecord[] recordedVideos,
           long totalCount) {
        super(
            success,
            faultCode,
            faultDescription);
        this.recordedVideos = recordedVideos;
        this.totalCount = totalCount;
    }


    /**
     * Gets the recordedVideos value for this VideoRecordsResponse.
     * 
     * @return recordedVideos
     */
    public com.amdocs.ch.api.mobile.VideoRecord[] getRecordedVideos() {
        return recordedVideos;
    }


    /**
     * Sets the recordedVideos value for this VideoRecordsResponse.
     * 
     * @param recordedVideos
     */
    public void setRecordedVideos(com.amdocs.ch.api.mobile.VideoRecord[] recordedVideos) {
        this.recordedVideos = recordedVideos;
    }

    public com.amdocs.ch.api.mobile.VideoRecord getRecordedVideos(int i) {
        return this.recordedVideos[i];
    }

    public void setRecordedVideos(int i, com.amdocs.ch.api.mobile.VideoRecord _value) {
        this.recordedVideos[i] = _value;
    }


    /**
     * Gets the totalCount value for this VideoRecordsResponse.
     * 
     * @return totalCount
     */
    public long getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this VideoRecordsResponse.
     * 
     * @param totalCount
     */
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoRecordsResponse)) return false;
        VideoRecordsResponse other = (VideoRecordsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recordedVideos==null && other.getRecordedVideos()==null) || 
             (this.recordedVideos!=null &&
              java.util.Arrays.equals(this.recordedVideos, other.getRecordedVideos()))) &&
            this.totalCount == other.getTotalCount();
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
        if (getRecordedVideos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordedVideos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordedVideos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalCount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoRecordsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordedVideos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordedVideos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
