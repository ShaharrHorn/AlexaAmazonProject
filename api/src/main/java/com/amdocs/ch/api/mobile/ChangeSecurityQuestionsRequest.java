/**
 * ChangeSecurityQuestionsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ChangeSecurityQuestionsRequest  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.SecurityQuestionAnswer[] questionAnswers;

    private java.lang.String username;

    public ChangeSecurityQuestionsRequest() {
    }

    public ChangeSecurityQuestionsRequest(
           com.amdocs.ch.api.mobile.SecurityQuestionAnswer[] questionAnswers,
           java.lang.String username) {
           this.questionAnswers = questionAnswers;
           this.username = username;
    }


    /**
     * Gets the questionAnswers value for this ChangeSecurityQuestionsRequest.
     * 
     * @return questionAnswers
     */
    public com.amdocs.ch.api.mobile.SecurityQuestionAnswer[] getQuestionAnswers() {
        return questionAnswers;
    }


    /**
     * Sets the questionAnswers value for this ChangeSecurityQuestionsRequest.
     * 
     * @param questionAnswers
     */
    public void setQuestionAnswers(com.amdocs.ch.api.mobile.SecurityQuestionAnswer[] questionAnswers) {
        this.questionAnswers = questionAnswers;
    }


    /**
     * Gets the username value for this ChangeSecurityQuestionsRequest.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ChangeSecurityQuestionsRequest.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSecurityQuestionsRequest)) return false;
        ChangeSecurityQuestionsRequest other = (ChangeSecurityQuestionsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.questionAnswers==null && other.getQuestionAnswers()==null) || 
             (this.questionAnswers!=null &&
              java.util.Arrays.equals(this.questionAnswers, other.getQuestionAnswers()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getQuestionAnswers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestionAnswers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestionAnswers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSecurityQuestionsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "changeSecurityQuestionsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionAnswers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "questionAnswers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityQuestionAnswer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "questionAnswer"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
