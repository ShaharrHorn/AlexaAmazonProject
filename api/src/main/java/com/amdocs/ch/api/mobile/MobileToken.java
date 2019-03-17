/**
 * MobileToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MobileToken  implements java.io.Serializable {
    private java.lang.String deviceModel;

    private java.lang.String deviceName;

    private java.lang.String deviceToken;

    private com.amdocs.ch.api.mobile.DeviceType deviceType;

    private com.amdocs.ch.api.mobile.Id gatewayId;

    private com.amdocs.ch.api.mobile.Id mobileTokenId;

    private java.lang.String systemVersion;

    private com.amdocs.ch.api.mobile.Id userId;

    private java.lang.String username;

    public MobileToken() {
    }

    public MobileToken(
           java.lang.String deviceModel,
           java.lang.String deviceName,
           java.lang.String deviceToken,
           com.amdocs.ch.api.mobile.DeviceType deviceType,
           com.amdocs.ch.api.mobile.Id gatewayId,
           com.amdocs.ch.api.mobile.Id mobileTokenId,
           java.lang.String systemVersion,
           com.amdocs.ch.api.mobile.Id userId,
           java.lang.String username) {
           this.deviceModel = deviceModel;
           this.deviceName = deviceName;
           this.deviceToken = deviceToken;
           this.deviceType = deviceType;
           this.gatewayId = gatewayId;
           this.mobileTokenId = mobileTokenId;
           this.systemVersion = systemVersion;
           this.userId = userId;
           this.username = username;
    }


    /**
     * Gets the deviceModel value for this MobileToken.
     * 
     * @return deviceModel
     */
    public java.lang.String getDeviceModel() {
        return deviceModel;
    }


    /**
     * Sets the deviceModel value for this MobileToken.
     * 
     * @param deviceModel
     */
    public void setDeviceModel(java.lang.String deviceModel) {
        this.deviceModel = deviceModel;
    }


    /**
     * Gets the deviceName value for this MobileToken.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this MobileToken.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceToken value for this MobileToken.
     * 
     * @return deviceToken
     */
    public java.lang.String getDeviceToken() {
        return deviceToken;
    }


    /**
     * Sets the deviceToken value for this MobileToken.
     * 
     * @param deviceToken
     */
    public void setDeviceToken(java.lang.String deviceToken) {
        this.deviceToken = deviceToken;
    }


    /**
     * Gets the deviceType value for this MobileToken.
     * 
     * @return deviceType
     */
    public com.amdocs.ch.api.mobile.DeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this MobileToken.
     * 
     * @param deviceType
     */
    public void setDeviceType(com.amdocs.ch.api.mobile.DeviceType deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the gatewayId value for this MobileToken.
     * 
     * @return gatewayId
     */
    public com.amdocs.ch.api.mobile.Id getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this MobileToken.
     * 
     * @param gatewayId
     */
    public void setGatewayId(com.amdocs.ch.api.mobile.Id gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the mobileTokenId value for this MobileToken.
     * 
     * @return mobileTokenId
     */
    public com.amdocs.ch.api.mobile.Id getMobileTokenId() {
        return mobileTokenId;
    }


    /**
     * Sets the mobileTokenId value for this MobileToken.
     * 
     * @param mobileTokenId
     */
    public void setMobileTokenId(com.amdocs.ch.api.mobile.Id mobileTokenId) {
        this.mobileTokenId = mobileTokenId;
    }


    /**
     * Gets the systemVersion value for this MobileToken.
     * 
     * @return systemVersion
     */
    public java.lang.String getSystemVersion() {
        return systemVersion;
    }


    /**
     * Sets the systemVersion value for this MobileToken.
     * 
     * @param systemVersion
     */
    public void setSystemVersion(java.lang.String systemVersion) {
        this.systemVersion = systemVersion;
    }


    /**
     * Gets the userId value for this MobileToken.
     * 
     * @return userId
     */
    public com.amdocs.ch.api.mobile.Id getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this MobileToken.
     * 
     * @param userId
     */
    public void setUserId(com.amdocs.ch.api.mobile.Id userId) {
        this.userId = userId;
    }


    /**
     * Gets the username value for this MobileToken.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this MobileToken.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileToken)) return false;
        MobileToken other = (MobileToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceModel==null && other.getDeviceModel()==null) || 
             (this.deviceModel!=null &&
              this.deviceModel.equals(other.getDeviceModel()))) &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.deviceToken==null && other.getDeviceToken()==null) || 
             (this.deviceToken!=null &&
              this.deviceToken.equals(other.getDeviceToken()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.mobileTokenId==null && other.getMobileTokenId()==null) || 
             (this.mobileTokenId!=null &&
              this.mobileTokenId.equals(other.getMobileTokenId()))) &&
            ((this.systemVersion==null && other.getSystemVersion()==null) || 
             (this.systemVersion!=null &&
              this.systemVersion.equals(other.getSystemVersion()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
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
        if (getDeviceModel() != null) {
            _hashCode += getDeviceModel().hashCode();
        }
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getDeviceToken() != null) {
            _hashCode += getDeviceToken().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getMobileTokenId() != null) {
            _hashCode += getMobileTokenId().hashCode();
        }
        if (getSystemVersion() != null) {
            _hashCode += getSystemVersion().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobileToken"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileTokenId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileTokenId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
