/**
 * QuestionAnswer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class QuestionAnswer  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.Id answerId;

    private com.amdocs.ch.api.mobile.Id questionId;

    public QuestionAnswer() {
    }

    public QuestionAnswer(
           com.amdocs.ch.api.mobile.Id answerId,
           com.amdocs.ch.api.mobile.Id questionId) {
           this.answerId = answerId;
           this.questionId = questionId;
    }


    /**
     * Gets the answerId value for this QuestionAnswer.
     * 
     * @return answerId
     */
    public com.amdocs.ch.api.mobile.Id getAnswerId() {
        return answerId;
    }


    /**
     * Sets the answerId value for this QuestionAnswer.
     * 
     * @param answerId
     */
    public void setAnswerId(com.amdocs.ch.api.mobile.Id answerId) {
        this.answerId = answerId;
    }


    /**
     * Gets the questionId value for this QuestionAnswer.
     * 
     * @return questionId
     */
    public com.amdocs.ch.api.mobile.Id getQuestionId() {
        return questionId;
    }


    /**
     * Sets the questionId value for this QuestionAnswer.
     * 
     * @param questionId
     */
    public void setQuestionId(com.amdocs.ch.api.mobile.Id questionId) {
        this.questionId = questionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuestionAnswer)) return false;
        QuestionAnswer other = (QuestionAnswer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.answerId==null && other.getAnswerId()==null) || 
             (this.answerId!=null &&
              this.answerId.equals(other.getAnswerId()))) &&
            ((this.questionId==null && other.getQuestionId()==null) || 
             (this.questionId!=null &&
              this.questionId.equals(other.getQuestionId())));
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
        if (getAnswerId() != null) {
            _hashCode += getAnswerId().hashCode();
        }
        if (getQuestionId() != null) {
            _hashCode += getQuestionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuestionAnswer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "questionAnswer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "answerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "questionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
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
