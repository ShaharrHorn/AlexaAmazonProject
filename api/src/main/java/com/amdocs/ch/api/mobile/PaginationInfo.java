/**
 * PaginationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class PaginationInfo  implements java.io.Serializable {
    private int maxResults;

    private boolean retrieveTotalCount;

    private int startIndex;

    public PaginationInfo() {
    }

    public PaginationInfo(
           int maxResults,
           boolean retrieveTotalCount,
           int startIndex) {
           this.maxResults = maxResults;
           this.retrieveTotalCount = retrieveTotalCount;
           this.startIndex = startIndex;
    }


    /**
     * Gets the maxResults value for this PaginationInfo.
     * 
     * @return maxResults
     */
    public int getMaxResults() {
        return maxResults;
    }


    /**
     * Sets the maxResults value for this PaginationInfo.
     * 
     * @param maxResults
     */
    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }


    /**
     * Gets the retrieveTotalCount value for this PaginationInfo.
     * 
     * @return retrieveTotalCount
     */
    public boolean isRetrieveTotalCount() {
        return retrieveTotalCount;
    }


    /**
     * Sets the retrieveTotalCount value for this PaginationInfo.
     * 
     * @param retrieveTotalCount
     */
    public void setRetrieveTotalCount(boolean retrieveTotalCount) {
        this.retrieveTotalCount = retrieveTotalCount;
    }


    /**
     * Gets the startIndex value for this PaginationInfo.
     * 
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this PaginationInfo.
     * 
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaginationInfo)) return false;
        PaginationInfo other = (PaginationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maxResults == other.getMaxResults() &&
            this.retrieveTotalCount == other.isRetrieveTotalCount() &&
            this.startIndex == other.getStartIndex();
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
        _hashCode += getMaxResults();
        _hashCode += (isRetrieveTotalCount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getStartIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaginationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "paginationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveTotalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveTotalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
