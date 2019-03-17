/**
 * SecurityQuestionAnswer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SecurityQuestionAnswer  implements java.io.Serializable {
    private java.lang.String answer;

    private java.lang.String newQuestion;

    private java.lang.String previousQuestion;

    public SecurityQuestionAnswer() {
    }

    public SecurityQuestionAnswer(
           java.lang.String answer,
           java.lang.String newQuestion,
           java.lang.String previousQuestion) {
           this.answer = answer;
           this.newQuestion = newQuestion;
           this.previousQuestion = previousQuestion;
    }


    /**
     * Gets the answer value for this SecurityQuestionAnswer.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this SecurityQuestionAnswer.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }


    /**
     * Gets the newQuestion value for this SecurityQuestionAnswer.
     * 
     * @return newQuestion
     */
    public java.lang.String getNewQuestion() {
        return newQuestion;
    }


    /**
     * Sets the newQuestion value for this SecurityQuestionAnswer.
     * 
     * @param newQuestion
     */
    public void setNewQuestion(java.lang.String newQuestion) {
        this.newQuestion = newQuestion;
    }


    /**
     * Gets the previousQuestion value for this SecurityQuestionAnswer.
     * 
     * @return previousQuestion
     */
    public java.lang.String getPreviousQuestion() {
        return previousQuestion;
    }


    /**
     * Sets the previousQuestion value for this SecurityQuestionAnswer.
     * 
     * @param previousQuestion
     */
    public void setPreviousQuestion(java.lang.String previousQuestion) {
        this.previousQuestion = previousQuestion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityQuestionAnswer)) return false;
        SecurityQuestionAnswer other = (SecurityQuestionAnswer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer()))) &&
            ((this.newQuestion==null && other.getNewQuestion()==null) || 
             (this.newQuestion!=null &&
              this.newQuestion.equals(other.getNewQuestion()))) &&
            ((this.previousQuestion==null && other.getPreviousQuestion()==null) || 
             (this.previousQuestion!=null &&
              this.previousQuestion.equals(other.getPreviousQuestion())));
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
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        if (getNewQuestion() != null) {
            _hashCode += getNewQuestion().hashCode();
        }
        if (getPreviousQuestion() != null) {
            _hashCode += getPreviousQuestion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityQuestionAnswer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityQuestionAnswer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "answer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newQuestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "previousQuestion"));
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
