/**
 * UserSite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UserSite  extends com.amdocs.ch.api.mobile.User  implements java.io.Serializable {
    private java.lang.Boolean authorizeLocationSharing;

    private java.lang.Integer ivrAttempts;

    private java.lang.String ivrSecret;

    private java.util.Calendar ivrUpdateDate;

    private com.amdocs.ch.api.mobile.CustomerPermissions[] permissions;

    private java.lang.String registrationPINCode;

    private com.amdocs.ch.api.mobile.Site site;

    private com.amdocs.ch.api.mobile.SecurityPanelUserCode userCode;

    private com.amdocs.ch.api.mobile.UserSiteUserPreferencesEntry[] userPreferences;

    private java.util.Calendar userSiteCreationDate;

    private com.amdocs.ch.api.mobile.Id userSiteId;

    private com.amdocs.ch.api.mobile.UserStatus userSiteStatus;

    private com.amdocs.ch.api.mobile.UserType userType;

    public UserSite() {
    }

    public UserSite(
           java.lang.Boolean acceptTermsConditions,
           java.lang.Boolean approvePrivatePolicy,
           java.lang.Boolean authorizeMarketingMessage,
           java.util.Calendar creationDate,
           java.lang.String email,
           java.lang.String firstName,
           java.lang.String lastName,
           java.util.Calendar lastUpdateDate,
           com.amdocs.ch.api.mobile.Id lastVisitedUserSiteId,
           java.lang.String middleName,
           com.amdocs.ch.api.mobile.MobileToken[] mobileTokens,
           java.lang.String phone,
           java.lang.String[] roles,
           java.lang.String salt,
           java.lang.String[] secretQuestions,
           com.amdocs.ch.api.mobile.UserStatus status,
           com.amdocs.ch.api.mobile.Title title,
           com.amdocs.ch.api.mobile.Id userId,
           java.lang.String userLocale,
           java.lang.String userName,
           java.lang.Boolean authorizeLocationSharing,
           java.lang.Integer ivrAttempts,
           java.lang.String ivrSecret,
           java.util.Calendar ivrUpdateDate,
           com.amdocs.ch.api.mobile.CustomerPermissions[] permissions,
           java.lang.String registrationPINCode,
           com.amdocs.ch.api.mobile.Site site,
           com.amdocs.ch.api.mobile.SecurityPanelUserCode userCode,
           com.amdocs.ch.api.mobile.UserSiteUserPreferencesEntry[] userPreferences,
           java.util.Calendar userSiteCreationDate,
           com.amdocs.ch.api.mobile.Id userSiteId,
           com.amdocs.ch.api.mobile.UserStatus userSiteStatus,
           com.amdocs.ch.api.mobile.UserType userType) {
        super(
            acceptTermsConditions,
            approvePrivatePolicy,
            authorizeMarketingMessage,
            creationDate,
            email,
            firstName,
            lastName,
            lastUpdateDate,
            lastVisitedUserSiteId,
            middleName,
            mobileTokens,
            phone,
            roles,
            salt,
            secretQuestions,
            status,
            title,
            userId,
            userLocale,
            userName);
        this.authorizeLocationSharing = authorizeLocationSharing;
        this.ivrAttempts = ivrAttempts;
        this.ivrSecret = ivrSecret;
        this.ivrUpdateDate = ivrUpdateDate;
        this.permissions = permissions;
        this.registrationPINCode = registrationPINCode;
        this.site = site;
        this.userCode = userCode;
        this.userPreferences = userPreferences;
        this.userSiteCreationDate = userSiteCreationDate;
        this.userSiteId = userSiteId;
        this.userSiteStatus = userSiteStatus;
        this.userType = userType;
    }


    /**
     * Gets the authorizeLocationSharing value for this UserSite.
     * 
     * @return authorizeLocationSharing
     */
    public java.lang.Boolean getAuthorizeLocationSharing() {
        return authorizeLocationSharing;
    }


    /**
     * Sets the authorizeLocationSharing value for this UserSite.
     * 
     * @param authorizeLocationSharing
     */
    public void setAuthorizeLocationSharing(java.lang.Boolean authorizeLocationSharing) {
        this.authorizeLocationSharing = authorizeLocationSharing;
    }


    /**
     * Gets the ivrAttempts value for this UserSite.
     * 
     * @return ivrAttempts
     */
    public java.lang.Integer getIvrAttempts() {
        return ivrAttempts;
    }


    /**
     * Sets the ivrAttempts value for this UserSite.
     * 
     * @param ivrAttempts
     */
    public void setIvrAttempts(java.lang.Integer ivrAttempts) {
        this.ivrAttempts = ivrAttempts;
    }


    /**
     * Gets the ivrSecret value for this UserSite.
     * 
     * @return ivrSecret
     */
    public java.lang.String getIvrSecret() {
        return ivrSecret;
    }


    /**
     * Sets the ivrSecret value for this UserSite.
     * 
     * @param ivrSecret
     */
    public void setIvrSecret(java.lang.String ivrSecret) {
        this.ivrSecret = ivrSecret;
    }


    /**
     * Gets the ivrUpdateDate value for this UserSite.
     * 
     * @return ivrUpdateDate
     */
    public java.util.Calendar getIvrUpdateDate() {
        return ivrUpdateDate;
    }


    /**
     * Sets the ivrUpdateDate value for this UserSite.
     * 
     * @param ivrUpdateDate
     */
    public void setIvrUpdateDate(java.util.Calendar ivrUpdateDate) {
        this.ivrUpdateDate = ivrUpdateDate;
    }


    /**
     * Gets the permissions value for this UserSite.
     * 
     * @return permissions
     */
    public com.amdocs.ch.api.mobile.CustomerPermissions[] getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this UserSite.
     * 
     * @param permissions
     */
    public void setPermissions(com.amdocs.ch.api.mobile.CustomerPermissions[] permissions) {
        this.permissions = permissions;
    }

    public com.amdocs.ch.api.mobile.CustomerPermissions getPermissions(int i) {
        return this.permissions[i];
    }

    public void setPermissions(int i, com.amdocs.ch.api.mobile.CustomerPermissions _value) {
        this.permissions[i] = _value;
    }


    /**
     * Gets the registrationPINCode value for this UserSite.
     * 
     * @return registrationPINCode
     */
    public java.lang.String getRegistrationPINCode() {
        return registrationPINCode;
    }


    /**
     * Sets the registrationPINCode value for this UserSite.
     * 
     * @param registrationPINCode
     */
    public void setRegistrationPINCode(java.lang.String registrationPINCode) {
        this.registrationPINCode = registrationPINCode;
    }


    /**
     * Gets the site value for this UserSite.
     * 
     * @return site
     */
    public com.amdocs.ch.api.mobile.Site getSite() {
        return site;
    }


    /**
     * Sets the site value for this UserSite.
     * 
     * @param site
     */
    public void setSite(com.amdocs.ch.api.mobile.Site site) {
        this.site = site;
    }


    /**
     * Gets the userCode value for this UserSite.
     * 
     * @return userCode
     */
    public com.amdocs.ch.api.mobile.SecurityPanelUserCode getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this UserSite.
     * 
     * @param userCode
     */
    public void setUserCode(com.amdocs.ch.api.mobile.SecurityPanelUserCode userCode) {
        this.userCode = userCode;
    }


    /**
     * Gets the userPreferences value for this UserSite.
     * 
     * @return userPreferences
     */
    public com.amdocs.ch.api.mobile.UserSiteUserPreferencesEntry[] getUserPreferences() {
        return userPreferences;
    }


    /**
     * Sets the userPreferences value for this UserSite.
     * 
     * @param userPreferences
     */
    public void setUserPreferences(com.amdocs.ch.api.mobile.UserSiteUserPreferencesEntry[] userPreferences) {
        this.userPreferences = userPreferences;
    }


    /**
     * Gets the userSiteCreationDate value for this UserSite.
     * 
     * @return userSiteCreationDate
     */
    public java.util.Calendar getUserSiteCreationDate() {
        return userSiteCreationDate;
    }


    /**
     * Sets the userSiteCreationDate value for this UserSite.
     * 
     * @param userSiteCreationDate
     */
    public void setUserSiteCreationDate(java.util.Calendar userSiteCreationDate) {
        this.userSiteCreationDate = userSiteCreationDate;
    }


    /**
     * Gets the userSiteId value for this UserSite.
     * 
     * @return userSiteId
     */
    public com.amdocs.ch.api.mobile.Id getUserSiteId() {
        return userSiteId;
    }


    /**
     * Sets the userSiteId value for this UserSite.
     * 
     * @param userSiteId
     */
    public void setUserSiteId(com.amdocs.ch.api.mobile.Id userSiteId) {
        this.userSiteId = userSiteId;
    }


    /**
     * Gets the userSiteStatus value for this UserSite.
     * 
     * @return userSiteStatus
     */
    public com.amdocs.ch.api.mobile.UserStatus getUserSiteStatus() {
        return userSiteStatus;
    }


    /**
     * Sets the userSiteStatus value for this UserSite.
     * 
     * @param userSiteStatus
     */
    public void setUserSiteStatus(com.amdocs.ch.api.mobile.UserStatus userSiteStatus) {
        this.userSiteStatus = userSiteStatus;
    }


    /**
     * Gets the userType value for this UserSite.
     * 
     * @return userType
     */
    public com.amdocs.ch.api.mobile.UserType getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this UserSite.
     * 
     * @param userType
     */
    public void setUserType(com.amdocs.ch.api.mobile.UserType userType) {
        this.userType = userType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSite)) return false;
        UserSite other = (UserSite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authorizeLocationSharing==null && other.getAuthorizeLocationSharing()==null) || 
             (this.authorizeLocationSharing!=null &&
              this.authorizeLocationSharing.equals(other.getAuthorizeLocationSharing()))) &&
            ((this.ivrAttempts==null && other.getIvrAttempts()==null) || 
             (this.ivrAttempts!=null &&
              this.ivrAttempts.equals(other.getIvrAttempts()))) &&
            ((this.ivrSecret==null && other.getIvrSecret()==null) || 
             (this.ivrSecret!=null &&
              this.ivrSecret.equals(other.getIvrSecret()))) &&
            ((this.ivrUpdateDate==null && other.getIvrUpdateDate()==null) || 
             (this.ivrUpdateDate!=null &&
              this.ivrUpdateDate.equals(other.getIvrUpdateDate()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              java.util.Arrays.equals(this.permissions, other.getPermissions()))) &&
            ((this.registrationPINCode==null && other.getRegistrationPINCode()==null) || 
             (this.registrationPINCode!=null &&
              this.registrationPINCode.equals(other.getRegistrationPINCode()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.userCode==null && other.getUserCode()==null) || 
             (this.userCode!=null &&
              this.userCode.equals(other.getUserCode()))) &&
            ((this.userPreferences==null && other.getUserPreferences()==null) || 
             (this.userPreferences!=null &&
              java.util.Arrays.equals(this.userPreferences, other.getUserPreferences()))) &&
            ((this.userSiteCreationDate==null && other.getUserSiteCreationDate()==null) || 
             (this.userSiteCreationDate!=null &&
              this.userSiteCreationDate.equals(other.getUserSiteCreationDate()))) &&
            ((this.userSiteId==null && other.getUserSiteId()==null) || 
             (this.userSiteId!=null &&
              this.userSiteId.equals(other.getUserSiteId()))) &&
            ((this.userSiteStatus==null && other.getUserSiteStatus()==null) || 
             (this.userSiteStatus!=null &&
              this.userSiteStatus.equals(other.getUserSiteStatus()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType())));
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
        if (getAuthorizeLocationSharing() != null) {
            _hashCode += getAuthorizeLocationSharing().hashCode();
        }
        if (getIvrAttempts() != null) {
            _hashCode += getIvrAttempts().hashCode();
        }
        if (getIvrSecret() != null) {
            _hashCode += getIvrSecret().hashCode();
        }
        if (getIvrUpdateDate() != null) {
            _hashCode += getIvrUpdateDate().hashCode();
        }
        if (getPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegistrationPINCode() != null) {
            _hashCode += getRegistrationPINCode().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        if (getUserPreferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserPreferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserPreferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserSiteCreationDate() != null) {
            _hashCode += getUserSiteCreationDate().hashCode();
        }
        if (getUserSiteId() != null) {
            _hashCode += getUserSiteId().hashCode();
        }
        if (getUserSiteStatus() != null) {
            _hashCode += getUserSiteStatus().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserSite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizeLocationSharing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizeLocationSharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivrAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivrAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivrSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivrSecret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivrUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivrUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationPINCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationPINCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "site"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>userSite>userPreferences>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSiteCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSiteCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSiteStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSiteStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userType"));
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
