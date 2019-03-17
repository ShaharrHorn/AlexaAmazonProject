/**
 * MultiValueMeasurementsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MultiValueMeasurementsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private long totalMeasurementsCount;

    private com.amdocs.ch.api.mobile.MultiValueMeasurement[] results;

    private long gatewayId;

    private java.lang.String deviceSerial;

    public MultiValueMeasurementsResponse() {
    }

    public MultiValueMeasurementsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           long totalMeasurementsCount,
           com.amdocs.ch.api.mobile.MultiValueMeasurement[] results,
           long gatewayId,
           java.lang.String deviceSerial) {
        super(
            success,
            faultCode,
            faultDescription);
        this.totalMeasurementsCount = totalMeasurementsCount;
        this.results = results;
        this.gatewayId = gatewayId;
        this.deviceSerial = deviceSerial;
    }


    /**
     * Gets the totalMeasurementsCount value for this MultiValueMeasurementsResponse.
     * 
     * @return totalMeasurementsCount
     */
    public long getTotalMeasurementsCount() {
        return totalMeasurementsCount;
    }


    /**
     * Sets the totalMeasurementsCount value for this MultiValueMeasurementsResponse.
     * 
     * @param totalMeasurementsCount
     */
    public void setTotalMeasurementsCount(long totalMeasurementsCount) {
        this.totalMeasurementsCount = totalMeasurementsCount;
    }


    /**
     * Gets the results value for this MultiValueMeasurementsResponse.
     * 
     * @return results
     */
    public com.amdocs.ch.api.mobile.MultiValueMeasurement[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this MultiValueMeasurementsResponse.
     * 
     * @param results
     */
    public void setResults(com.amdocs.ch.api.mobile.MultiValueMeasurement[] results) {
        this.results = results;
    }


    /**
     * Gets the gatewayId value for this MultiValueMeasurementsResponse.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this MultiValueMeasurementsResponse.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the deviceSerial value for this MultiValueMeasurementsResponse.
     * 
     * @return deviceSerial
     */
    public java.lang.String getDeviceSerial() {
        return deviceSerial;
    }


    /**
     * Sets the deviceSerial value for this MultiValueMeasurementsResponse.
     * 
     * @param deviceSerial
     */
    public void setDeviceSerial(java.lang.String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultiValueMeasurementsResponse)) return false;
        MultiValueMeasurementsResponse other = (MultiValueMeasurementsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.totalMeasurementsCount == other.getTotalMeasurementsCount() &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults()))) &&
            this.gatewayId == other.getGatewayId() &&
            ((this.deviceSerial==null && other.getDeviceSerial()==null) || 
             (this.deviceSerial!=null &&
              this.deviceSerial.equals(other.getDeviceSerial())));
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
        _hashCode += new Long(getTotalMeasurementsCount()).hashCode();
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getGatewayId()).hashCode();
        if (getDeviceSerial() != null) {
            _hashCode += getDeviceSerial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultiValueMeasurementsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "multiValueMeasurementsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMeasurementsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalMeasurementsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "multiValueMeasurement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "multiValueMeasurement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceSerial"));
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
