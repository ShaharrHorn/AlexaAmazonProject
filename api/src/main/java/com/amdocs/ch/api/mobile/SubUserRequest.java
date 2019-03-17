/**
 * SubUserRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SubUserRequest  implements java.io.Serializable {
    private java.lang.String email;

    private java.lang.String firstName;

    private long gatewayId;

    private java.lang.String lastName;

    private com.amdocs.ch.api.mobile.NotificationTarget[] targets;

    private java.lang.String PINcode;

    private com.amdocs.ch.api.mobile.CustomerPermissions[] permissionsList;

    private java.lang.String phone;

    private long siteId;

    private java.lang.Integer userCode;

    private java.lang.String username;

    public SubUserRequest() {
    }

    public SubUserRequest(
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
           java.lang.String username) {
           this.email = email;
           this.firstName = firstName;
           this.gatewayId = gatewayId;
           this.lastName = lastName;
           this.targets = targets;
           this.PINcode = PINcode;
           this.permissionsList = permissionsList;
           this.phone = phone;
           this.siteId = siteId;
           this.userCode = userCode;
           this.username = username;
    }


    /**
     * Gets the email value for this SubUserRequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SubUserRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the firstName value for this SubUserRequest.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this SubUserRequest.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the gatewayId value for this SubUserRequest.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this SubUserRequest.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the lastName value for this SubUserRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this SubUserRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the targets value for this SubUserRequest.
     * 
     * @return targets
     */
    public com.amdocs.ch.api.mobile.NotificationTarget[] getTargets() {
        return targets;
    }


    /**
     * Sets the targets value for this SubUserRequest.
     * 
     * @param targets
     */
    public void setTargets(com.amdocs.ch.api.mobile.NotificationTarget[] targets) {
        this.targets = targets;
    }


    /**
     * Gets the PINcode value for this SubUserRequest.
     * 
     * @return PINcode
     */
    public java.lang.String getPINcode() {
        return PINcode;
    }


    /**
     * Sets the PINcode value for this SubUserRequest.
     * 
     * @param PINcode
     */
    public void setPINcode(java.lang.String PINcode) {
        this.PINcode = PINcode;
    }


    /**
     * Gets the permissionsList value for this SubUserRequest.
     * 
     * @return permissionsList
     */
    public com.amdocs.ch.api.mobile.CustomerPermissions[] getPermissionsList() {
        return permissionsList;
    }


    /**
     * Sets the permissionsList value for this SubUserRequest.
     * 
     * @param permissionsList
     */
    public void setPermissionsList(com.amdocs.ch.api.mobile.CustomerPermissions[] permissionsList) {
        this.permissionsList = permissionsList;
    }


    /**
     * Gets the phone value for this SubUserRequest.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this SubUserRequest.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the siteId value for this SubUserRequest.
     * 
     * @return siteId
     */
    public long getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this SubUserRequest.
     * 
     * @param siteId
     */
    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the userCode value for this SubUserRequest.
     * 
     * @return userCode
     */
    public java.lang.Integer getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this SubUserRequest.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.Integer userCode) {
        this.userCode = userCode;
    }


    /**
     * Gets the username value for this SubUserRequest.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this SubUserRequest.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubUserRequest)) return false;
        SubUserRequest other = (SubUserRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            this.gatewayId == other.getGatewayId() &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.targets==null && other.getTargets()==null) || 
             (this.targets!=null &&
              java.util.Arrays.equals(this.targets, other.getTargets()))) &&
            ((this.PINcode==null && other.getPINcode()==null) || 
             (this.PINcode!=null &&
              this.PINcode.equals(other.getPINcode()))) &&
            ((this.permissionsList==null && other.getPermissionsList()==null) || 
             (this.permissionsList!=null &&
              java.util.Arrays.equals(this.permissionsList, other.getPermissionsList()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            this.siteId == other.getSiteId() &&
            ((this.userCode==null && other.getUserCode()==null) || 
             (this.userCode!=null &&
              this.userCode.equals(other.getUserCode()))) &&
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        _hashCode += new Long(getGatewayId()).hashCode();
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPINcode() != null) {
            _hashCode += getPINcode().hashCode();
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
        _hashCode += new Long(getSiteId()).hashCode();
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubUserRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "subUserRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("targets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "target"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PINcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
