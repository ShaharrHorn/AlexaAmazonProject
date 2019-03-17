/**
 * MobileTokenUserIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MobileTokenUserIdResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.MobilePushUserID[] tokens;

    private int totalCount;

    public MobileTokenUserIdResponse() {
    }

    public MobileTokenUserIdResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.MobilePushUserID[] tokens,
           int totalCount) {
        super(
            success,
            faultCode,
            faultDescription);
        this.tokens = tokens;
        this.totalCount = totalCount;
    }


    /**
     * Gets the tokens value for this MobileTokenUserIdResponse.
     * 
     * @return tokens
     */
    public com.amdocs.ch.api.mobile.MobilePushUserID[] getTokens() {
        return tokens;
    }


    /**
     * Sets the tokens value for this MobileTokenUserIdResponse.
     * 
     * @param tokens
     */
    public void setTokens(com.amdocs.ch.api.mobile.MobilePushUserID[] tokens) {
        this.tokens = tokens;
    }

    public com.amdocs.ch.api.mobile.MobilePushUserID getTokens(int i) {
        return this.tokens[i];
    }

    public void setTokens(int i, com.amdocs.ch.api.mobile.MobilePushUserID _value) {
        this.tokens[i] = _value;
    }


    /**
     * Gets the totalCount value for this MobileTokenUserIdResponse.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this MobileTokenUserIdResponse.
     * 
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileTokenUserIdResponse)) return false;
        MobileTokenUserIdResponse other = (MobileTokenUserIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tokens==null && other.getTokens()==null) || 
             (this.tokens!=null &&
              java.util.Arrays.equals(this.tokens, other.getTokens()))) &&
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
        if (getTokens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTokens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTokens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileTokenUserIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileTokenUserIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushUserID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCount"));
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
