/**
 * SingleValueMeasurementsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SingleValueMeasurementsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private long totalResultCount;

    private com.amdocs.ch.api.mobile.MeasurementDto[] results;

    public SingleValueMeasurementsResponse() {
    }

    public SingleValueMeasurementsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           long totalResultCount,
           com.amdocs.ch.api.mobile.MeasurementDto[] results) {
        super(
            success,
            faultCode,
            faultDescription);
        this.totalResultCount = totalResultCount;
        this.results = results;
    }


    /**
     * Gets the totalResultCount value for this SingleValueMeasurementsResponse.
     * 
     * @return totalResultCount
     */
    public long getTotalResultCount() {
        return totalResultCount;
    }


    /**
     * Sets the totalResultCount value for this SingleValueMeasurementsResponse.
     * 
     * @param totalResultCount
     */
    public void setTotalResultCount(long totalResultCount) {
        this.totalResultCount = totalResultCount;
    }


    /**
     * Gets the results value for this SingleValueMeasurementsResponse.
     * 
     * @return results
     */
    public com.amdocs.ch.api.mobile.MeasurementDto[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this SingleValueMeasurementsResponse.
     * 
     * @param results
     */
    public void setResults(com.amdocs.ch.api.mobile.MeasurementDto[] results) {
        this.results = results;
    }

    public com.amdocs.ch.api.mobile.MeasurementDto getResults(int i) {
        return this.results[i];
    }

    public void setResults(int i, com.amdocs.ch.api.mobile.MeasurementDto _value) {
        this.results[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SingleValueMeasurementsResponse)) return false;
        SingleValueMeasurementsResponse other = (SingleValueMeasurementsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.totalResultCount == other.getTotalResultCount() &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults())));
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
        _hashCode += new Long(getTotalResultCount()).hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SingleValueMeasurementsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "singleValueMeasurementsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResultCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalResultCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementDto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
