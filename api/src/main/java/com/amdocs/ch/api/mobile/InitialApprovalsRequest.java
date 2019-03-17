/**
 * InitialApprovalsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class InitialApprovalsRequest  implements java.io.Serializable {
    private java.lang.Boolean acceptTermsConditions;

    private java.lang.Boolean approvePrivatePolicy;

    private java.lang.Boolean authorizeLocationSharing;

    private java.lang.Boolean authorizeMarketingMessage;

    private java.lang.String username;

    public InitialApprovalsRequest() {
    }

    public InitialApprovalsRequest(
           java.lang.Boolean acceptTermsConditions,
           java.lang.Boolean approvePrivatePolicy,
           java.lang.Boolean authorizeLocationSharing,
           java.lang.Boolean authorizeMarketingMessage,
           java.lang.String username) {
           this.acceptTermsConditions = acceptTermsConditions;
           this.approvePrivatePolicy = approvePrivatePolicy;
           this.authorizeLocationSharing = authorizeLocationSharing;
           this.authorizeMarketingMessage = authorizeMarketingMessage;
           this.username = username;
    }


    /**
     * Gets the acceptTermsConditions value for this InitialApprovalsRequest.
     * 
     * @return acceptTermsConditions
     */
    public java.lang.Boolean getAcceptTermsConditions() {
        return acceptTermsConditions;
    }


    /**
     * Sets the acceptTermsConditions value for this InitialApprovalsRequest.
     * 
     * @param acceptTermsConditions
     */
    public void setAcceptTermsConditions(java.lang.Boolean acceptTermsConditions) {
        this.acceptTermsConditions = acceptTermsConditions;
    }


    /**
     * Gets the approvePrivatePolicy value for this InitialApprovalsRequest.
     * 
     * @return approvePrivatePolicy
     */
    public java.lang.Boolean getApprovePrivatePolicy() {
        return approvePrivatePolicy;
    }


    /**
     * Sets the approvePrivatePolicy value for this InitialApprovalsRequest.
     * 
     * @param approvePrivatePolicy
     */
    public void setApprovePrivatePolicy(java.lang.Boolean approvePrivatePolicy) {
        this.approvePrivatePolicy = approvePrivatePolicy;
    }


    /**
     * Gets the authorizeLocationSharing value for this InitialApprovalsRequest.
     * 
     * @return authorizeLocationSharing
     */
    public java.lang.Boolean getAuthorizeLocationSharing() {
        return authorizeLocationSharing;
    }


    /**
     * Sets the authorizeLocationSharing value for this InitialApprovalsRequest.
     * 
     * @param authorizeLocationSharing
     */
    public void setAuthorizeLocationSharing(java.lang.Boolean authorizeLocationSharing) {
        this.authorizeLocationSharing = authorizeLocationSharing;
    }


    /**
     * Gets the authorizeMarketingMessage value for this InitialApprovalsRequest.
     * 
     * @return authorizeMarketingMessage
     */
    public java.lang.Boolean getAuthorizeMarketingMessage() {
        return authorizeMarketingMessage;
    }


    /**
     * Sets the authorizeMarketingMessage value for this InitialApprovalsRequest.
     * 
     * @param authorizeMarketingMessage
     */
    public void setAuthorizeMarketingMessage(java.lang.Boolean authorizeMarketingMessage) {
        this.authorizeMarketingMessage = authorizeMarketingMessage;
    }


    /**
     * Gets the username value for this InitialApprovalsRequest.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this InitialApprovalsRequest.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitialApprovalsRequest)) return false;
        InitialApprovalsRequest other = (InitialApprovalsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acceptTermsConditions==null && other.getAcceptTermsConditions()==null) || 
             (this.acceptTermsConditions!=null &&
              this.acceptTermsConditions.equals(other.getAcceptTermsConditions()))) &&
            ((this.approvePrivatePolicy==null && other.getApprovePrivatePolicy()==null) || 
             (this.approvePrivatePolicy!=null &&
              this.approvePrivatePolicy.equals(other.getApprovePrivatePolicy()))) &&
            ((this.authorizeLocationSharing==null && other.getAuthorizeLocationSharing()==null) || 
             (this.authorizeLocationSharing!=null &&
              this.authorizeLocationSharing.equals(other.getAuthorizeLocationSharing()))) &&
            ((this.authorizeMarketingMessage==null && other.getAuthorizeMarketingMessage()==null) || 
             (this.authorizeMarketingMessage!=null &&
              this.authorizeMarketingMessage.equals(other.getAuthorizeMarketingMessage()))) &&
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
        if (getAcceptTermsConditions() != null) {
            _hashCode += getAcceptTermsConditions().hashCode();
        }
        if (getApprovePrivatePolicy() != null) {
            _hashCode += getApprovePrivatePolicy().hashCode();
        }
        if (getAuthorizeLocationSharing() != null) {
            _hashCode += getAuthorizeLocationSharing().hashCode();
        }
        if (getAuthorizeMarketingMessage() != null) {
            _hashCode += getAuthorizeMarketingMessage().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitialApprovalsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "initialApprovalsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptTermsConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptTermsConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvePrivatePolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvePrivatePolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizeLocationSharing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizeLocationSharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizeMarketingMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizeMarketingMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
