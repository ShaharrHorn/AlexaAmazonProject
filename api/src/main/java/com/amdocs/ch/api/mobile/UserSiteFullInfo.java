/**
 * UserSiteFullInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UserSiteFullInfo  extends com.amdocs.ch.api.mobile.UserSite  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.NotificationTarget[] notificationTargets;

    public UserSiteFullInfo() {
    }

    public UserSiteFullInfo(
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
           com.amdocs.ch.api.mobile.UserType userType,
           com.amdocs.ch.api.mobile.NotificationTarget[] notificationTargets) {
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
            userName,
            authorizeLocationSharing,
            ivrAttempts,
            ivrSecret,
            ivrUpdateDate,
            permissions,
            registrationPINCode,
            site,
            userCode,
            userPreferences,
            userSiteCreationDate,
            userSiteId,
            userSiteStatus,
            userType);
        this.notificationTargets = notificationTargets;
    }


    /**
     * Gets the notificationTargets value for this UserSiteFullInfo.
     * 
     * @return notificationTargets
     */
    public com.amdocs.ch.api.mobile.NotificationTarget[] getNotificationTargets() {
        return notificationTargets;
    }


    /**
     * Sets the notificationTargets value for this UserSiteFullInfo.
     * 
     * @param notificationTargets
     */
    public void setNotificationTargets(com.amdocs.ch.api.mobile.NotificationTarget[] notificationTargets) {
        this.notificationTargets = notificationTargets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSiteFullInfo)) return false;
        UserSiteFullInfo other = (UserSiteFullInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notificationTargets==null && other.getNotificationTargets()==null) || 
             (this.notificationTargets!=null &&
              java.util.Arrays.equals(this.notificationTargets, other.getNotificationTargets())));
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
        if (getNotificationTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotificationTargets(), i);
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
        new org.apache.axis.description.TypeDesc(UserSiteFullInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userSiteFullInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationTargets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationTargets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "target"));
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
