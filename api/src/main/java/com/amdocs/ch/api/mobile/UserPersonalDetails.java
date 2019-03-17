/**
 * UserPersonalDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UserPersonalDetails  implements java.io.Serializable {
    private java.lang.Boolean acceptTermsConditions;

    private java.lang.Boolean approvePrivatePolicy;

    private java.lang.Boolean authorizeLocationSharing;

    private java.lang.Boolean authorizeMarketingMessage;

    private long customerId;

    private java.lang.String email;

    private java.lang.String firstName;

    private java.lang.String ivrSecret;

    private java.lang.String lastName;

    private java.lang.String locale;

    private java.lang.String middleName;

    private com.amdocs.ch.api.mobile.UserSite[] otherUserSites;

    private com.amdocs.ch.api.mobile.CustomerPermissions[] permissionsList;

    private java.lang.String phone;

    private java.lang.String[] securityQuestionsList;

    private com.amdocs.ch.api.mobile.UserStatus status;

    private com.amdocs.ch.api.mobile.Title title;

    private java.lang.Integer userCode;

    private long userId;

    private java.lang.String userName;

    private com.amdocs.ch.api.mobile.UserType userType;

    public UserPersonalDetails() {
    }

    public UserPersonalDetails(
           java.lang.Boolean acceptTermsConditions,
           java.lang.Boolean approvePrivatePolicy,
           java.lang.Boolean authorizeLocationSharing,
           java.lang.Boolean authorizeMarketingMessage,
           long customerId,
           java.lang.String email,
           java.lang.String firstName,
           java.lang.String ivrSecret,
           java.lang.String lastName,
           java.lang.String locale,
           java.lang.String middleName,
           com.amdocs.ch.api.mobile.UserSite[] otherUserSites,
           com.amdocs.ch.api.mobile.CustomerPermissions[] permissionsList,
           java.lang.String phone,
           java.lang.String[] securityQuestionsList,
           com.amdocs.ch.api.mobile.UserStatus status,
           com.amdocs.ch.api.mobile.Title title,
           java.lang.Integer userCode,
           long userId,
           java.lang.String userName,
           com.amdocs.ch.api.mobile.UserType userType) {
           this.acceptTermsConditions = acceptTermsConditions;
           this.approvePrivatePolicy = approvePrivatePolicy;
           this.authorizeLocationSharing = authorizeLocationSharing;
           this.authorizeMarketingMessage = authorizeMarketingMessage;
           this.customerId = customerId;
           this.email = email;
           this.firstName = firstName;
           this.ivrSecret = ivrSecret;
           this.lastName = lastName;
           this.locale = locale;
           this.middleName = middleName;
           this.otherUserSites = otherUserSites;
           this.permissionsList = permissionsList;
           this.phone = phone;
           this.securityQuestionsList = securityQuestionsList;
           this.status = status;
           this.title = title;
           this.userCode = userCode;
           this.userId = userId;
           this.userName = userName;
           this.userType = userType;
    }


    /**
     * Gets the acceptTermsConditions value for this UserPersonalDetails.
     * 
     * @return acceptTermsConditions
     */
    public java.lang.Boolean getAcceptTermsConditions() {
        return acceptTermsConditions;
    }


    /**
     * Sets the acceptTermsConditions value for this UserPersonalDetails.
     * 
     * @param acceptTermsConditions
     */
    public void setAcceptTermsConditions(java.lang.Boolean acceptTermsConditions) {
        this.acceptTermsConditions = acceptTermsConditions;
    }


    /**
     * Gets the approvePrivatePolicy value for this UserPersonalDetails.
     * 
     * @return approvePrivatePolicy
     */
    public java.lang.Boolean getApprovePrivatePolicy() {
        return approvePrivatePolicy;
    }


    /**
     * Sets the approvePrivatePolicy value for this UserPersonalDetails.
     * 
     * @param approvePrivatePolicy
     */
    public void setApprovePrivatePolicy(java.lang.Boolean approvePrivatePolicy) {
        this.approvePrivatePolicy = approvePrivatePolicy;
    }


    /**
     * Gets the authorizeLocationSharing value for this UserPersonalDetails.
     * 
     * @return authorizeLocationSharing
     */
    public java.lang.Boolean getAuthorizeLocationSharing() {
        return authorizeLocationSharing;
    }


    /**
     * Sets the authorizeLocationSharing value for this UserPersonalDetails.
     * 
     * @param authorizeLocationSharing
     */
    public void setAuthorizeLocationSharing(java.lang.Boolean authorizeLocationSharing) {
        this.authorizeLocationSharing = authorizeLocationSharing;
    }


    /**
     * Gets the authorizeMarketingMessage value for this UserPersonalDetails.
     * 
     * @return authorizeMarketingMessage
     */
    public java.lang.Boolean getAuthorizeMarketingMessage() {
        return authorizeMarketingMessage;
    }


    /**
     * Sets the authorizeMarketingMessage value for this UserPersonalDetails.
     * 
     * @param authorizeMarketingMessage
     */
    public void setAuthorizeMarketingMessage(java.lang.Boolean authorizeMarketingMessage) {
        this.authorizeMarketingMessage = authorizeMarketingMessage;
    }


    /**
     * Gets the customerId value for this UserPersonalDetails.
     * 
     * @return customerId
     */
    public long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this UserPersonalDetails.
     * 
     * @param customerId
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the email value for this UserPersonalDetails.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserPersonalDetails.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the firstName value for this UserPersonalDetails.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UserPersonalDetails.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the ivrSecret value for this UserPersonalDetails.
     * 
     * @return ivrSecret
     */
    public java.lang.String getIvrSecret() {
        return ivrSecret;
    }


    /**
     * Sets the ivrSecret value for this UserPersonalDetails.
     * 
     * @param ivrSecret
     */
    public void setIvrSecret(java.lang.String ivrSecret) {
        this.ivrSecret = ivrSecret;
    }


    /**
     * Gets the lastName value for this UserPersonalDetails.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UserPersonalDetails.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the locale value for this UserPersonalDetails.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this UserPersonalDetails.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the middleName value for this UserPersonalDetails.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this UserPersonalDetails.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the otherUserSites value for this UserPersonalDetails.
     * 
     * @return otherUserSites
     */
    public com.amdocs.ch.api.mobile.UserSite[] getOtherUserSites() {
        return otherUserSites;
    }


    /**
     * Sets the otherUserSites value for this UserPersonalDetails.
     * 
     * @param otherUserSites
     */
    public void setOtherUserSites(com.amdocs.ch.api.mobile.UserSite[] otherUserSites) {
        this.otherUserSites = otherUserSites;
    }


    /**
     * Gets the permissionsList value for this UserPersonalDetails.
     * 
     * @return permissionsList
     */
    public com.amdocs.ch.api.mobile.CustomerPermissions[] getPermissionsList() {
        return permissionsList;
    }


    /**
     * Sets the permissionsList value for this UserPersonalDetails.
     * 
     * @param permissionsList
     */
    public void setPermissionsList(com.amdocs.ch.api.mobile.CustomerPermissions[] permissionsList) {
        this.permissionsList = permissionsList;
    }


    /**
     * Gets the phone value for this UserPersonalDetails.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this UserPersonalDetails.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the securityQuestionsList value for this UserPersonalDetails.
     * 
     * @return securityQuestionsList
     */
    public java.lang.String[] getSecurityQuestionsList() {
        return securityQuestionsList;
    }


    /**
     * Sets the securityQuestionsList value for this UserPersonalDetails.
     * 
     * @param securityQuestionsList
     */
    public void setSecurityQuestionsList(java.lang.String[] securityQuestionsList) {
        this.securityQuestionsList = securityQuestionsList;
    }


    /**
     * Gets the status value for this UserPersonalDetails.
     * 
     * @return status
     */
    public com.amdocs.ch.api.mobile.UserStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserPersonalDetails.
     * 
     * @param status
     */
    public void setStatus(com.amdocs.ch.api.mobile.UserStatus status) {
        this.status = status;
    }


    /**
     * Gets the title value for this UserPersonalDetails.
     * 
     * @return title
     */
    public com.amdocs.ch.api.mobile.Title getTitle() {
        return title;
    }


    /**
     * Sets the title value for this UserPersonalDetails.
     * 
     * @param title
     */
    public void setTitle(com.amdocs.ch.api.mobile.Title title) {
        this.title = title;
    }


    /**
     * Gets the userCode value for this UserPersonalDetails.
     * 
     * @return userCode
     */
    public java.lang.Integer getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this UserPersonalDetails.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.Integer userCode) {
        this.userCode = userCode;
    }


    /**
     * Gets the userId value for this UserPersonalDetails.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserPersonalDetails.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this UserPersonalDetails.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserPersonalDetails.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userType value for this UserPersonalDetails.
     * 
     * @return userType
     */
    public com.amdocs.ch.api.mobile.UserType getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this UserPersonalDetails.
     * 
     * @param userType
     */
    public void setUserType(com.amdocs.ch.api.mobile.UserType userType) {
        this.userType = userType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPersonalDetails)) return false;
        UserPersonalDetails other = (UserPersonalDetails) obj;
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
            this.customerId == other.getCustomerId() &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.ivrSecret==null && other.getIvrSecret()==null) || 
             (this.ivrSecret!=null &&
              this.ivrSecret.equals(other.getIvrSecret()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.otherUserSites==null && other.getOtherUserSites()==null) || 
             (this.otherUserSites!=null &&
              java.util.Arrays.equals(this.otherUserSites, other.getOtherUserSites()))) &&
            ((this.permissionsList==null && other.getPermissionsList()==null) || 
             (this.permissionsList!=null &&
              java.util.Arrays.equals(this.permissionsList, other.getPermissionsList()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.securityQuestionsList==null && other.getSecurityQuestionsList()==null) || 
             (this.securityQuestionsList!=null &&
              java.util.Arrays.equals(this.securityQuestionsList, other.getSecurityQuestionsList()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.userCode==null && other.getUserCode()==null) || 
             (this.userCode!=null &&
              this.userCode.equals(other.getUserCode()))) &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
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
        _hashCode += new Long(getCustomerId()).hashCode();
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getIvrSecret() != null) {
            _hashCode += getIvrSecret().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getOtherUserSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherUserSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherUserSites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPermissionsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissionsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissionsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getSecurityQuestionsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecurityQuestionsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecurityQuestionsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPersonalDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPersonalDetails"));
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
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherUserSites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherUserSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSite"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "userSite"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "permission"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityQuestionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityQuestionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "securityQuestion"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
