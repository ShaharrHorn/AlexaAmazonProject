/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class User  implements java.io.Serializable {
    private java.lang.Boolean acceptTermsConditions;

    private java.lang.Boolean approvePrivatePolicy;

    private java.lang.Boolean authorizeMarketingMessage;

    private java.util.Calendar creationDate;

    private java.lang.String email;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.util.Calendar lastUpdateDate;

    private com.amdocs.ch.api.mobile.Id lastVisitedUserSiteId;

    private java.lang.String middleName;

    private com.amdocs.ch.api.mobile.MobileToken[] mobileTokens;

    private java.lang.String phone;

    private java.lang.String[] roles;

    private java.lang.String salt;

    private java.lang.String[] secretQuestions;

    private com.amdocs.ch.api.mobile.UserStatus status;

    private com.amdocs.ch.api.mobile.Title title;

    private com.amdocs.ch.api.mobile.Id userId;

    private java.lang.String userLocale;

    private java.lang.String userName;

    public User() {
    }

    public User(
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
           java.lang.String userName) {
           this.acceptTermsConditions = acceptTermsConditions;
           this.approvePrivatePolicy = approvePrivatePolicy;
           this.authorizeMarketingMessage = authorizeMarketingMessage;
           this.creationDate = creationDate;
           this.email = email;
           this.firstName = firstName;
           this.lastName = lastName;
           this.lastUpdateDate = lastUpdateDate;
           this.lastVisitedUserSiteId = lastVisitedUserSiteId;
           this.middleName = middleName;
           this.mobileTokens = mobileTokens;
           this.phone = phone;
           this.roles = roles;
           this.salt = salt;
           this.secretQuestions = secretQuestions;
           this.status = status;
           this.title = title;
           this.userId = userId;
           this.userLocale = userLocale;
           this.userName = userName;
    }


    /**
     * Gets the acceptTermsConditions value for this User.
     * 
     * @return acceptTermsConditions
     */
    public java.lang.Boolean getAcceptTermsConditions() {
        return acceptTermsConditions;
    }


    /**
     * Sets the acceptTermsConditions value for this User.
     * 
     * @param acceptTermsConditions
     */
    public void setAcceptTermsConditions(java.lang.Boolean acceptTermsConditions) {
        this.acceptTermsConditions = acceptTermsConditions;
    }


    /**
     * Gets the approvePrivatePolicy value for this User.
     * 
     * @return approvePrivatePolicy
     */
    public java.lang.Boolean getApprovePrivatePolicy() {
        return approvePrivatePolicy;
    }


    /**
     * Sets the approvePrivatePolicy value for this User.
     * 
     * @param approvePrivatePolicy
     */
    public void setApprovePrivatePolicy(java.lang.Boolean approvePrivatePolicy) {
        this.approvePrivatePolicy = approvePrivatePolicy;
    }


    /**
     * Gets the authorizeMarketingMessage value for this User.
     * 
     * @return authorizeMarketingMessage
     */
    public java.lang.Boolean getAuthorizeMarketingMessage() {
        return authorizeMarketingMessage;
    }


    /**
     * Sets the authorizeMarketingMessage value for this User.
     * 
     * @param authorizeMarketingMessage
     */
    public void setAuthorizeMarketingMessage(java.lang.Boolean authorizeMarketingMessage) {
        this.authorizeMarketingMessage = authorizeMarketingMessage;
    }


    /**
     * Gets the creationDate value for this User.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this User.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the firstName value for this User.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this User.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this User.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this User.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastUpdateDate value for this User.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this User.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the lastVisitedUserSiteId value for this User.
     * 
     * @return lastVisitedUserSiteId
     */
    public com.amdocs.ch.api.mobile.Id getLastVisitedUserSiteId() {
        return lastVisitedUserSiteId;
    }


    /**
     * Sets the lastVisitedUserSiteId value for this User.
     * 
     * @param lastVisitedUserSiteId
     */
    public void setLastVisitedUserSiteId(com.amdocs.ch.api.mobile.Id lastVisitedUserSiteId) {
        this.lastVisitedUserSiteId = lastVisitedUserSiteId;
    }


    /**
     * Gets the middleName value for this User.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this User.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the mobileTokens value for this User.
     * 
     * @return mobileTokens
     */
    public com.amdocs.ch.api.mobile.MobileToken[] getMobileTokens() {
        return mobileTokens;
    }


    /**
     * Sets the mobileTokens value for this User.
     * 
     * @param mobileTokens
     */
    public void setMobileTokens(com.amdocs.ch.api.mobile.MobileToken[] mobileTokens) {
        this.mobileTokens = mobileTokens;
    }

    public com.amdocs.ch.api.mobile.MobileToken getMobileTokens(int i) {
        return this.mobileTokens[i];
    }

    public void setMobileTokens(int i, com.amdocs.ch.api.mobile.MobileToken _value) {
        this.mobileTokens[i] = _value;
    }


    /**
     * Gets the phone value for this User.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this User.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the roles value for this User.
     * 
     * @return roles
     */
    public java.lang.String[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this User.
     * 
     * @param roles
     */
    public void setRoles(java.lang.String[] roles) {
        this.roles = roles;
    }

    public java.lang.String getRoles(int i) {
        return this.roles[i];
    }

    public void setRoles(int i, java.lang.String _value) {
        this.roles[i] = _value;
    }


    /**
     * Gets the salt value for this User.
     * 
     * @return salt
     */
    public java.lang.String getSalt() {
        return salt;
    }


    /**
     * Sets the salt value for this User.
     * 
     * @param salt
     */
    public void setSalt(java.lang.String salt) {
        this.salt = salt;
    }


    /**
     * Gets the secretQuestions value for this User.
     * 
     * @return secretQuestions
     */
    public java.lang.String[] getSecretQuestions() {
        return secretQuestions;
    }


    /**
     * Sets the secretQuestions value for this User.
     * 
     * @param secretQuestions
     */
    public void setSecretQuestions(java.lang.String[] secretQuestions) {
        this.secretQuestions = secretQuestions;
    }

    public java.lang.String getSecretQuestions(int i) {
        return this.secretQuestions[i];
    }

    public void setSecretQuestions(int i, java.lang.String _value) {
        this.secretQuestions[i] = _value;
    }


    /**
     * Gets the status value for this User.
     * 
     * @return status
     */
    public com.amdocs.ch.api.mobile.UserStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this User.
     * 
     * @param status
     */
    public void setStatus(com.amdocs.ch.api.mobile.UserStatus status) {
        this.status = status;
    }


    /**
     * Gets the title value for this User.
     * 
     * @return title
     */
    public com.amdocs.ch.api.mobile.Title getTitle() {
        return title;
    }


    /**
     * Sets the title value for this User.
     * 
     * @param title
     */
    public void setTitle(com.amdocs.ch.api.mobile.Title title) {
        this.title = title;
    }


    /**
     * Gets the userId value for this User.
     * 
     * @return userId
     */
    public com.amdocs.ch.api.mobile.Id getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this User.
     * 
     * @param userId
     */
    public void setUserId(com.amdocs.ch.api.mobile.Id userId) {
        this.userId = userId;
    }


    /**
     * Gets the userLocale value for this User.
     * 
     * @return userLocale
     */
    public java.lang.String getUserLocale() {
        return userLocale;
    }


    /**
     * Sets the userLocale value for this User.
     * 
     * @param userLocale
     */
    public void setUserLocale(java.lang.String userLocale) {
        this.userLocale = userLocale;
    }


    /**
     * Gets the userName value for this User.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this User.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
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
            ((this.authorizeMarketingMessage==null && other.getAuthorizeMarketingMessage()==null) || 
             (this.authorizeMarketingMessage!=null &&
              this.authorizeMarketingMessage.equals(other.getAuthorizeMarketingMessage()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.lastVisitedUserSiteId==null && other.getLastVisitedUserSiteId()==null) || 
             (this.lastVisitedUserSiteId!=null &&
              this.lastVisitedUserSiteId.equals(other.getLastVisitedUserSiteId()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.mobileTokens==null && other.getMobileTokens()==null) || 
             (this.mobileTokens!=null &&
              java.util.Arrays.equals(this.mobileTokens, other.getMobileTokens()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              java.util.Arrays.equals(this.roles, other.getRoles()))) &&
            ((this.salt==null && other.getSalt()==null) || 
             (this.salt!=null &&
              this.salt.equals(other.getSalt()))) &&
            ((this.secretQuestions==null && other.getSecretQuestions()==null) || 
             (this.secretQuestions!=null &&
              java.util.Arrays.equals(this.secretQuestions, other.getSecretQuestions()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userLocale==null && other.getUserLocale()==null) || 
             (this.userLocale!=null &&
              this.userLocale.equals(other.getUserLocale()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getAuthorizeMarketingMessage() != null) {
            _hashCode += getAuthorizeMarketingMessage().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getLastVisitedUserSiteId() != null) {
            _hashCode += getLastVisitedUserSiteId().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getMobileTokens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobileTokens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobileTokens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalt() != null) {
            _hashCode += getSalt().hashCode();
        }
        if (getSecretQuestions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecretQuestions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecretQuestions(), i);
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserLocale() != null) {
            _hashCode += getUserLocale().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "user"));
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
        elemField.setFieldName("authorizeMarketingMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizeMarketingMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastVisitedUserSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastVisitedUserSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
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
        elemField.setFieldName("mobileTokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileTokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileToken"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secretQuestions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secretQuestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLocale"));
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
