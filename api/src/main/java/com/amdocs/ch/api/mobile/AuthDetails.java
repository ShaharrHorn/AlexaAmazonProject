/**
 * AuthDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class AuthDetails  implements java.io.Serializable {
    private java.lang.Boolean acceptTermsConditions;

    private java.lang.Boolean approvePrivatePolicy;

    private java.lang.Boolean authorizeLocationSharing;

    private java.lang.Boolean authorizeMarketingMessage;

    private java.lang.String[] grantedAuthorities;

    private com.amdocs.ch.api.mobile.Site lastVisitedSite;

    private java.lang.String securityToken;

    private java.lang.String siteMainUser;

    private java.lang.String userName;

    private long userSiteId;

    private long validUntil;

    public AuthDetails() {
    }

    public AuthDetails(
           java.lang.Boolean acceptTermsConditions,
           java.lang.Boolean approvePrivatePolicy,
           java.lang.Boolean authorizeLocationSharing,
           java.lang.Boolean authorizeMarketingMessage,
           java.lang.String[] grantedAuthorities,
           com.amdocs.ch.api.mobile.Site lastVisitedSite,
           java.lang.String securityToken,
           java.lang.String siteMainUser,
           java.lang.String userName,
           long userSiteId,
           long validUntil) {
           this.acceptTermsConditions = acceptTermsConditions;
           this.approvePrivatePolicy = approvePrivatePolicy;
           this.authorizeLocationSharing = authorizeLocationSharing;
           this.authorizeMarketingMessage = authorizeMarketingMessage;
           this.grantedAuthorities = grantedAuthorities;
           this.lastVisitedSite = lastVisitedSite;
           this.securityToken = securityToken;
           this.siteMainUser = siteMainUser;
           this.userName = userName;
           this.userSiteId = userSiteId;
           this.validUntil = validUntil;
    }


    /**
     * Gets the acceptTermsConditions value for this AuthDetails.
     * 
     * @return acceptTermsConditions
     */
    public java.lang.Boolean getAcceptTermsConditions() {
        return acceptTermsConditions;
    }


    /**
     * Sets the acceptTermsConditions value for this AuthDetails.
     * 
     * @param acceptTermsConditions
     */
    public void setAcceptTermsConditions(java.lang.Boolean acceptTermsConditions) {
        this.acceptTermsConditions = acceptTermsConditions;
    }


    /**
     * Gets the approvePrivatePolicy value for this AuthDetails.
     * 
     * @return approvePrivatePolicy
     */
    public java.lang.Boolean getApprovePrivatePolicy() {
        return approvePrivatePolicy;
    }


    /**
     * Sets the approvePrivatePolicy value for this AuthDetails.
     * 
     * @param approvePrivatePolicy
     */
    public void setApprovePrivatePolicy(java.lang.Boolean approvePrivatePolicy) {
        this.approvePrivatePolicy = approvePrivatePolicy;
    }


    /**
     * Gets the authorizeLocationSharing value for this AuthDetails.
     * 
     * @return authorizeLocationSharing
     */
    public java.lang.Boolean getAuthorizeLocationSharing() {
        return authorizeLocationSharing;
    }


    /**
     * Sets the authorizeLocationSharing value for this AuthDetails.
     * 
     * @param authorizeLocationSharing
     */
    public void setAuthorizeLocationSharing(java.lang.Boolean authorizeLocationSharing) {
        this.authorizeLocationSharing = authorizeLocationSharing;
    }


    /**
     * Gets the authorizeMarketingMessage value for this AuthDetails.
     * 
     * @return authorizeMarketingMessage
     */
    public java.lang.Boolean getAuthorizeMarketingMessage() {
        return authorizeMarketingMessage;
    }


    /**
     * Sets the authorizeMarketingMessage value for this AuthDetails.
     * 
     * @param authorizeMarketingMessage
     */
    public void setAuthorizeMarketingMessage(java.lang.Boolean authorizeMarketingMessage) {
        this.authorizeMarketingMessage = authorizeMarketingMessage;
    }


    /**
     * Gets the grantedAuthorities value for this AuthDetails.
     * 
     * @return grantedAuthorities
     */
    public java.lang.String[] getGrantedAuthorities() {
        return grantedAuthorities;
    }


    /**
     * Sets the grantedAuthorities value for this AuthDetails.
     * 
     * @param grantedAuthorities
     */
    public void setGrantedAuthorities(java.lang.String[] grantedAuthorities) {
        this.grantedAuthorities = grantedAuthorities;
    }

    public java.lang.String getGrantedAuthorities(int i) {
        return this.grantedAuthorities[i];
    }

    public void setGrantedAuthorities(int i, java.lang.String _value) {
        this.grantedAuthorities[i] = _value;
    }


    /**
     * Gets the lastVisitedSite value for this AuthDetails.
     * 
     * @return lastVisitedSite
     */
    public com.amdocs.ch.api.mobile.Site getLastVisitedSite() {
        return lastVisitedSite;
    }


    /**
     * Sets the lastVisitedSite value for this AuthDetails.
     * 
     * @param lastVisitedSite
     */
    public void setLastVisitedSite(com.amdocs.ch.api.mobile.Site lastVisitedSite) {
        this.lastVisitedSite = lastVisitedSite;
    }


    /**
     * Gets the securityToken value for this AuthDetails.
     * 
     * @return securityToken
     */
    public java.lang.String getSecurityToken() {
        return securityToken;
    }


    /**
     * Sets the securityToken value for this AuthDetails.
     * 
     * @param securityToken
     */
    public void setSecurityToken(java.lang.String securityToken) {
        this.securityToken = securityToken;
    }


    /**
     * Gets the siteMainUser value for this AuthDetails.
     * 
     * @return siteMainUser
     */
    public java.lang.String getSiteMainUser() {
        return siteMainUser;
    }


    /**
     * Sets the siteMainUser value for this AuthDetails.
     * 
     * @param siteMainUser
     */
    public void setSiteMainUser(java.lang.String siteMainUser) {
        this.siteMainUser = siteMainUser;
    }


    /**
     * Gets the userName value for this AuthDetails.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this AuthDetails.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userSiteId value for this AuthDetails.
     * 
     * @return userSiteId
     */
    public long getUserSiteId() {
        return userSiteId;
    }


    /**
     * Sets the userSiteId value for this AuthDetails.
     * 
     * @param userSiteId
     */
    public void setUserSiteId(long userSiteId) {
        this.userSiteId = userSiteId;
    }


    /**
     * Gets the validUntil value for this AuthDetails.
     * 
     * @return validUntil
     */
    public long getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this AuthDetails.
     * 
     * @param validUntil
     */
    public void setValidUntil(long validUntil) {
        this.validUntil = validUntil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthDetails)) return false;
        AuthDetails other = (AuthDetails) obj;
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
            ((this.grantedAuthorities==null && other.getGrantedAuthorities()==null) || 
             (this.grantedAuthorities!=null &&
              java.util.Arrays.equals(this.grantedAuthorities, other.getGrantedAuthorities()))) &&
            ((this.lastVisitedSite==null && other.getLastVisitedSite()==null) || 
             (this.lastVisitedSite!=null &&
              this.lastVisitedSite.equals(other.getLastVisitedSite()))) &&
            ((this.securityToken==null && other.getSecurityToken()==null) || 
             (this.securityToken!=null &&
              this.securityToken.equals(other.getSecurityToken()))) &&
            ((this.siteMainUser==null && other.getSiteMainUser()==null) || 
             (this.siteMainUser!=null &&
              this.siteMainUser.equals(other.getSiteMainUser()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            this.userSiteId == other.getUserSiteId() &&
            this.validUntil == other.getValidUntil();
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
        if (getGrantedAuthorities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrantedAuthorities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrantedAuthorities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastVisitedSite() != null) {
            _hashCode += getLastVisitedSite().hashCode();
        }
        if (getSecurityToken() != null) {
            _hashCode += getSecurityToken().hashCode();
        }
        if (getSiteMainUser() != null) {
            _hashCode += getSiteMainUser().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        _hashCode += new Long(getUserSiteId()).hashCode();
        _hashCode += new Long(getValidUntil()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "authDetails"));
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
        elemField.setFieldName("grantedAuthorities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grantedAuthorities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastVisitedSite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastVisitedSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "site"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteMainUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteMainUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validUntil"));
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
