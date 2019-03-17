/**
 * DoorLockSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class DoorLockSettings  implements java.io.Serializable {
    private boolean doorLockAutoRelock;

    private int doorLockAutoRelockSeconds;

    private com.amdocs.ch.api.mobile.DoorLockMode doorLockMode;

    private com.amdocs.ch.api.mobile.UserCodeName[] doorLockUserCodeNames;

    private com.amdocs.ch.api.mobile.UserCodeName editUserCodeName;

    private boolean userCodesSupported;

    public DoorLockSettings() {
    }

    public DoorLockSettings(
           boolean doorLockAutoRelock,
           int doorLockAutoRelockSeconds,
           com.amdocs.ch.api.mobile.DoorLockMode doorLockMode,
           com.amdocs.ch.api.mobile.UserCodeName[] doorLockUserCodeNames,
           com.amdocs.ch.api.mobile.UserCodeName editUserCodeName,
           boolean userCodesSupported) {
           this.doorLockAutoRelock = doorLockAutoRelock;
           this.doorLockAutoRelockSeconds = doorLockAutoRelockSeconds;
           this.doorLockMode = doorLockMode;
           this.doorLockUserCodeNames = doorLockUserCodeNames;
           this.editUserCodeName = editUserCodeName;
           this.userCodesSupported = userCodesSupported;
    }


    /**
     * Gets the doorLockAutoRelock value for this DoorLockSettings.
     * 
     * @return doorLockAutoRelock
     */
    public boolean isDoorLockAutoRelock() {
        return doorLockAutoRelock;
    }


    /**
     * Sets the doorLockAutoRelock value for this DoorLockSettings.
     * 
     * @param doorLockAutoRelock
     */
    public void setDoorLockAutoRelock(boolean doorLockAutoRelock) {
        this.doorLockAutoRelock = doorLockAutoRelock;
    }


    /**
     * Gets the doorLockAutoRelockSeconds value for this DoorLockSettings.
     * 
     * @return doorLockAutoRelockSeconds
     */
    public int getDoorLockAutoRelockSeconds() {
        return doorLockAutoRelockSeconds;
    }


    /**
     * Sets the doorLockAutoRelockSeconds value for this DoorLockSettings.
     * 
     * @param doorLockAutoRelockSeconds
     */
    public void setDoorLockAutoRelockSeconds(int doorLockAutoRelockSeconds) {
        this.doorLockAutoRelockSeconds = doorLockAutoRelockSeconds;
    }


    /**
     * Gets the doorLockMode value for this DoorLockSettings.
     * 
     * @return doorLockMode
     */
    public com.amdocs.ch.api.mobile.DoorLockMode getDoorLockMode() {
        return doorLockMode;
    }


    /**
     * Sets the doorLockMode value for this DoorLockSettings.
     * 
     * @param doorLockMode
     */
    public void setDoorLockMode(com.amdocs.ch.api.mobile.DoorLockMode doorLockMode) {
        this.doorLockMode = doorLockMode;
    }


    /**
     * Gets the doorLockUserCodeNames value for this DoorLockSettings.
     * 
     * @return doorLockUserCodeNames
     */
    public com.amdocs.ch.api.mobile.UserCodeName[] getDoorLockUserCodeNames() {
        return doorLockUserCodeNames;
    }


    /**
     * Sets the doorLockUserCodeNames value for this DoorLockSettings.
     * 
     * @param doorLockUserCodeNames
     */
    public void setDoorLockUserCodeNames(com.amdocs.ch.api.mobile.UserCodeName[] doorLockUserCodeNames) {
        this.doorLockUserCodeNames = doorLockUserCodeNames;
    }

    public com.amdocs.ch.api.mobile.UserCodeName getDoorLockUserCodeNames(int i) {
        return this.doorLockUserCodeNames[i];
    }

    public void setDoorLockUserCodeNames(int i, com.amdocs.ch.api.mobile.UserCodeName _value) {
        this.doorLockUserCodeNames[i] = _value;
    }


    /**
     * Gets the editUserCodeName value for this DoorLockSettings.
     * 
     * @return editUserCodeName
     */
    public com.amdocs.ch.api.mobile.UserCodeName getEditUserCodeName() {
        return editUserCodeName;
    }


    /**
     * Sets the editUserCodeName value for this DoorLockSettings.
     * 
     * @param editUserCodeName
     */
    public void setEditUserCodeName(com.amdocs.ch.api.mobile.UserCodeName editUserCodeName) {
        this.editUserCodeName = editUserCodeName;
    }


    /**
     * Gets the userCodesSupported value for this DoorLockSettings.
     * 
     * @return userCodesSupported
     */
    public boolean isUserCodesSupported() {
        return userCodesSupported;
    }


    /**
     * Sets the userCodesSupported value for this DoorLockSettings.
     * 
     * @param userCodesSupported
     */
    public void setUserCodesSupported(boolean userCodesSupported) {
        this.userCodesSupported = userCodesSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoorLockSettings)) return false;
        DoorLockSettings other = (DoorLockSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.doorLockAutoRelock == other.isDoorLockAutoRelock() &&
            this.doorLockAutoRelockSeconds == other.getDoorLockAutoRelockSeconds() &&
            ((this.doorLockMode==null && other.getDoorLockMode()==null) || 
             (this.doorLockMode!=null &&
              this.doorLockMode.equals(other.getDoorLockMode()))) &&
            ((this.doorLockUserCodeNames==null && other.getDoorLockUserCodeNames()==null) || 
             (this.doorLockUserCodeNames!=null &&
              java.util.Arrays.equals(this.doorLockUserCodeNames, other.getDoorLockUserCodeNames()))) &&
            ((this.editUserCodeName==null && other.getEditUserCodeName()==null) || 
             (this.editUserCodeName!=null &&
              this.editUserCodeName.equals(other.getEditUserCodeName()))) &&
            this.userCodesSupported == other.isUserCodesSupported();
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
        _hashCode += (isDoorLockAutoRelock() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDoorLockAutoRelockSeconds();
        if (getDoorLockMode() != null) {
            _hashCode += getDoorLockMode().hashCode();
        }
        if (getDoorLockUserCodeNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDoorLockUserCodeNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDoorLockUserCodeNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEditUserCodeName() != null) {
            _hashCode += getEditUserCodeName().hashCode();
        }
        _hashCode += (isUserCodesSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoorLockSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "doorLockSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doorLockAutoRelock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doorLockAutoRelock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doorLockAutoRelockSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doorLockAutoRelockSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doorLockMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doorLockMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "doorLockMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doorLockUserCodeNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doorLockUserCodeNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userCodeName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editUserCodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editUserCodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userCodeName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCodesSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCodesSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
