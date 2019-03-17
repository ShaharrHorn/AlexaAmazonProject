/**
 * SecurityQuestionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SecurityQuestionsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private java.lang.String[] secutiyQuestions;

    public SecurityQuestionsResponse() {
    }

    public SecurityQuestionsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           java.lang.String[] secutiyQuestions) {
        super(
            success,
            faultCode,
            faultDescription);
        this.secutiyQuestions = secutiyQuestions;
    }


    /**
     * Gets the secutiyQuestions value for this SecurityQuestionsResponse.
     * 
     * @return secutiyQuestions
     */
    public java.lang.String[] getSecutiyQuestions() {
        return secutiyQuestions;
    }


    /**
     * Sets the secutiyQuestions value for this SecurityQuestionsResponse.
     * 
     * @param secutiyQuestions
     */
    public void setSecutiyQuestions(java.lang.String[] secutiyQuestions) {
        this.secutiyQuestions = secutiyQuestions;
    }

    public java.lang.String getSecutiyQuestions(int i) {
        return this.secutiyQuestions[i];
    }

    public void setSecutiyQuestions(int i, java.lang.String _value) {
        this.secutiyQuestions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityQuestionsResponse)) return false;
        SecurityQuestionsResponse other = (SecurityQuestionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.secutiyQuestions==null && other.getSecutiyQuestions()==null) || 
             (this.secutiyQuestions!=null &&
              java.util.Arrays.equals(this.secutiyQuestions, other.getSecutiyQuestions())));
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
        if (getSecutiyQuestions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecutiyQuestions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecutiyQuestions(), i);
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
        new org.apache.axis.description.TypeDesc(SecurityQuestionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityQuestionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secutiyQuestions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secutiyQuestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
