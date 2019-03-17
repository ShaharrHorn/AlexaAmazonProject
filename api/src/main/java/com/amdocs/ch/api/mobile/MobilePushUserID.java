/**
 * MobilePushUserID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MobilePushUserID  implements java.io.Serializable {
    private java.lang.String deviceModel;

    private java.lang.String deviceName;

    private com.amdocs.ch.api.mobile.DeviceType deviceType;

    private long gatewayId;

    private int pushMessageCounter;

    private java.lang.String systemVersion;

    private java.lang.String token;

    private java.lang.String userName;

    public MobilePushUserID() {
    }

    public MobilePushUserID(
           java.lang.String deviceModel,
           java.lang.String deviceName,
           com.amdocs.ch.api.mobile.DeviceType deviceType,
           long gatewayId,
           int pushMessageCounter,
           java.lang.String systemVersion,
           java.lang.String token,
           java.lang.String userName) {
           this.deviceModel = deviceModel;
           this.deviceName = deviceName;
           this.deviceType = deviceType;
           this.gatewayId = gatewayId;
           this.pushMessageCounter = pushMessageCounter;
           this.systemVersion = systemVersion;
           this.token = token;
           this.userName = userName;
    }


    /**
     * Gets the deviceModel value for this MobilePushUserID.
     * 
     * @return deviceModel
     */
    public java.lang.String getDeviceModel() {
        return deviceModel;
    }


    /**
     * Sets the deviceModel value for this MobilePushUserID.
     * 
     * @param deviceModel
     */
    public void setDeviceModel(java.lang.String deviceModel) {
        this.deviceModel = deviceModel;
    }


    /**
     * Gets the deviceName value for this MobilePushUserID.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this MobilePushUserID.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceType value for this MobilePushUserID.
     * 
     * @return deviceType
     */
    public com.amdocs.ch.api.mobile.DeviceType getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this MobilePushUserID.
     * 
     * @param deviceType
     */
    public void setDeviceType(com.amdocs.ch.api.mobile.DeviceType deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the gatewayId value for this MobilePushUserID.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this MobilePushUserID.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the pushMessageCounter value for this MobilePushUserID.
     * 
     * @return pushMessageCounter
     */
    public int getPushMessageCounter() {
        return pushMessageCounter;
    }


    /**
     * Sets the pushMessageCounter value for this MobilePushUserID.
     * 
     * @param pushMessageCounter
     */
    public void setPushMessageCounter(int pushMessageCounter) {
        this.pushMessageCounter = pushMessageCounter;
    }


    /**
     * Gets the systemVersion value for this MobilePushUserID.
     * 
     * @return systemVersion
     */
    public java.lang.String getSystemVersion() {
        return systemVersion;
    }


    /**
     * Sets the systemVersion value for this MobilePushUserID.
     * 
     * @param systemVersion
     */
    public void setSystemVersion(java.lang.String systemVersion) {
        this.systemVersion = systemVersion;
    }


    /**
     * Gets the token value for this MobilePushUserID.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this MobilePushUserID.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the userName value for this MobilePushUserID.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this MobilePushUserID.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobilePushUserID)) return false;
        MobilePushUserID other = (MobilePushUserID) obj;
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
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            this.gatewayId == other.getGatewayId() &&
            this.pushMessageCounter == other.getPushMessageCounter() &&
            ((this.systemVersion==null && other.getSystemVersion()==null) || 
             (this.systemVersion!=null &&
              this.systemVersion.equals(other.getSystemVersion()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
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
        if (getDeviceModel() != null) {
            _hashCode += getDeviceModel().hashCode();
        }
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        _hashCode += new Long(getGatewayId()).hashCode();
        _hashCode += getPushMessageCounter();
        if (getSystemVersion() != null) {
            _hashCode += getSystemVersion().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobilePushUserID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "mobilePushUserID"));
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
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushMessageCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pushMessageCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
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
