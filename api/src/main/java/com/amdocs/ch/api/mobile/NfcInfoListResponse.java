/**
 * NfcInfoListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class NfcInfoListResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.NfcInfo[] nfcInfos;

    public NfcInfoListResponse() {
    }

    public NfcInfoListResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.NfcInfo[] nfcInfos) {
        super(
            success,
            faultCode,
            faultDescription);
        this.nfcInfos = nfcInfos;
    }


    /**
     * Gets the nfcInfos value for this NfcInfoListResponse.
     * 
     * @return nfcInfos
     */
    public com.amdocs.ch.api.mobile.NfcInfo[] getNfcInfos() {
        return nfcInfos;
    }


    /**
     * Sets the nfcInfos value for this NfcInfoListResponse.
     * 
     * @param nfcInfos
     */
    public void setNfcInfos(com.amdocs.ch.api.mobile.NfcInfo[] nfcInfos) {
        this.nfcInfos = nfcInfos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfcInfoListResponse)) return false;
        NfcInfoListResponse other = (NfcInfoListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nfcInfos==null && other.getNfcInfos()==null) || 
             (this.nfcInfos!=null &&
              java.util.Arrays.equals(this.nfcInfos, other.getNfcInfos())));
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
        if (getNfcInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNfcInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNfcInfos(), i);
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
        new org.apache.axis.description.TypeDesc(NfcInfoListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfoListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfcInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nfcInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "nfcInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "nfcInfo"));
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
