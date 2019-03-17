/**
 * NfcInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class NfcInfoRequest  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.NfcInfo nfcInfo;

    public NfcInfoRequest() {
    }

    public NfcInfoRequest(
           com.amdocs.ch.api.mobile.NfcInfo nfcInfo) {
           this.nfcInfo = nfcInfo;
    }


    /**
     * Gets the nfcInfo value for this NfcInfoRequest.
     * 
     * @return nfcInfo
     */
    public com.amdocs.ch.api.mobile.NfcInfo getNfcInfo() {
        return nfcInfo;
    }


    /**
     * Sets the nfcInfo value for this NfcInfoRequest.
     * 
     * @param nfcInfo
     */
    public void setNfcInfo(com.amdocs.ch.api.mobile.NfcInfo nfcInfo) {
        this.nfcInfo = nfcInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfcInfoRequest)) return false;
        NfcInfoRequest other = (NfcInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nfcInfo==null && other.getNfcInfo()==null) || 
             (this.nfcInfo!=null &&
              this.nfcInfo.equals(other.getNfcInfo())));
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
        if (getNfcInfo() != null) {
            _hashCode += getNfcInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NfcInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfcInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nfcInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfo"));
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
