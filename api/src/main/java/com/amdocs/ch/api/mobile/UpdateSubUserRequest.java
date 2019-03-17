/**
 * UpdateSubUserRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UpdateSubUserRequest  extends com.amdocs.ch.api.mobile.SubUserRequest  implements java.io.Serializable {
    private long userSiteId;

    public UpdateSubUserRequest() {
    }

    public UpdateSubUserRequest(
           java.lang.String email,
           java.lang.String firstName,
           long gatewayId,
           java.lang.String lastName,
           com.amdocs.ch.api.mobile.NotificationTarget[] targets,
           java.lang.String PINcode,
           com.amdocs.ch.api.mobile.CustomerPermissions[] permissionsList,
           java.lang.String phone,
           long siteId,
           java.lang.Integer userCode,
           java.lang.String username,
           long userSiteId) {
        super(
            email,
            firstName,
            gatewayId,
            lastName,
            targets,
            PINcode,
            permissionsList,
            phone,
            siteId,
            userCode,
            username);
        this.userSiteId = userSiteId;
    }


    /**
     * Gets the userSiteId value for this UpdateSubUserRequest.
     * 
     * @return userSiteId
     */
    public long getUserSiteId() {
        return userSiteId;
    }


    /**
     * Sets the userSiteId value for this UpdateSubUserRequest.
     * 
     * @param userSiteId
     */
    public void setUserSiteId(long userSiteId) {
        this.userSiteId = userSiteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSubUserRequest)) return false;
        UpdateSubUserRequest other = (UpdateSubUserRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.userSiteId == other.getUserSiteId();
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
        _hashCode += new Long(getUserSiteId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSubUserRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "updateSubUserRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSiteId"));
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
