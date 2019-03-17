/**
 * HistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class HistoryResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.HistoryEntry[] historyEntries;

    private long totalCount;

    public HistoryResponse() {
    }

    public HistoryResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.HistoryEntry[] historyEntries,
           long totalCount) {
        super(
            success,
            faultCode,
            faultDescription);
        this.historyEntries = historyEntries;
        this.totalCount = totalCount;
    }


    /**
     * Gets the historyEntries value for this HistoryResponse.
     * 
     * @return historyEntries
     */
    public com.amdocs.ch.api.mobile.HistoryEntry[] getHistoryEntries() {
        return historyEntries;
    }


    /**
     * Sets the historyEntries value for this HistoryResponse.
     * 
     * @param historyEntries
     */
    public void setHistoryEntries(com.amdocs.ch.api.mobile.HistoryEntry[] historyEntries) {
        this.historyEntries = historyEntries;
    }

    public com.amdocs.ch.api.mobile.HistoryEntry getHistoryEntries(int i) {
        return this.historyEntries[i];
    }

    public void setHistoryEntries(int i, com.amdocs.ch.api.mobile.HistoryEntry _value) {
        this.historyEntries[i] = _value;
    }


    /**
     * Gets the totalCount value for this HistoryResponse.
     * 
     * @return totalCount
     */
    public long getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this HistoryResponse.
     * 
     * @param totalCount
     */
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoryResponse)) return false;
        HistoryResponse other = (HistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.historyEntries==null && other.getHistoryEntries()==null) || 
             (this.historyEntries!=null &&
              java.util.Arrays.equals(this.historyEntries, other.getHistoryEntries()))) &&
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
        if (getHistoryEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoryEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoryEntries(), i);
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
        new org.apache.axis.description.TypeDesc(HistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "historyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historyEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "historyEntry"));
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
