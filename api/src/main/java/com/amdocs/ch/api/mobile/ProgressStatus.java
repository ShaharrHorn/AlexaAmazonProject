/**
 * ProgressStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ProgressStatus  implements java.io.Serializable {
    private java.lang.String message;

    private com.amdocs.ch.api.mobile.GatewayMessageType messageType;

    private java.lang.String progressMessage;

    private int progressPercentage;

    public ProgressStatus() {
    }

    public ProgressStatus(
           java.lang.String message,
           com.amdocs.ch.api.mobile.GatewayMessageType messageType,
           java.lang.String progressMessage,
           int progressPercentage) {
           this.message = message;
           this.messageType = messageType;
           this.progressMessage = progressMessage;
           this.progressPercentage = progressPercentage;
    }


    /**
     * Gets the message value for this ProgressStatus.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ProgressStatus.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the messageType value for this ProgressStatus.
     * 
     * @return messageType
     */
    public com.amdocs.ch.api.mobile.GatewayMessageType getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this ProgressStatus.
     * 
     * @param messageType
     */
    public void setMessageType(com.amdocs.ch.api.mobile.GatewayMessageType messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the progressMessage value for this ProgressStatus.
     * 
     * @return progressMessage
     */
    public java.lang.String getProgressMessage() {
        return progressMessage;
    }


    /**
     * Sets the progressMessage value for this ProgressStatus.
     * 
     * @param progressMessage
     */
    public void setProgressMessage(java.lang.String progressMessage) {
        this.progressMessage = progressMessage;
    }


    /**
     * Gets the progressPercentage value for this ProgressStatus.
     * 
     * @return progressPercentage
     */
    public int getProgressPercentage() {
        return progressPercentage;
    }


    /**
     * Sets the progressPercentage value for this ProgressStatus.
     * 
     * @param progressPercentage
     */
    public void setProgressPercentage(int progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgressStatus)) return false;
        ProgressStatus other = (ProgressStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.progressMessage==null && other.getProgressMessage()==null) || 
             (this.progressMessage!=null &&
              this.progressMessage.equals(other.getProgressMessage()))) &&
            this.progressPercentage == other.getProgressPercentage();
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getProgressMessage() != null) {
            _hashCode += getProgressMessage().hashCode();
        }
        _hashCode += getProgressPercentage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgressStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "progressStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayMessageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressPercentage"));
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
