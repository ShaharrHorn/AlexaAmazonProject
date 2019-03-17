/**
 * CustomerPermissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CustomerPermissions implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerPermissions(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SECURITY = "SECURITY";
    public static final java.lang.String _PROTECTION = "PROTECTION";
    public static final java.lang.String _AUTOMATION = "AUTOMATION";
    public static final java.lang.String _ENERGY = "ENERGY";
    public static final java.lang.String _HEALTH = "HEALTH";
    public static final java.lang.String _VIDEO = "VIDEO";
    public static final java.lang.String _SCENARIO_OPERATE = "SCENARIO_OPERATE";
    public static final java.lang.String _SCENARIO_VIEW_EDIT = "SCENARIO_VIEW_EDIT";
    public static final java.lang.String _DEVICE_OPERATE = "DEVICE_OPERATE";
    public static final java.lang.String _DEVICE_MODIFY = "DEVICE_MODIFY";
    public static final java.lang.String _NOTIFICATION = "NOTIFICATION";
    public static final java.lang.String _SHOPPING = "SHOPPING";
    public static final java.lang.String _REQUEST_INSTALLER = "REQUEST_INSTALLER";
    public static final java.lang.String _SET_UNSET_ARMING_MODE = "SET_UNSET_ARMING_MODE";
    public static final java.lang.String _MANAGE_USERS = "MANAGE_USERS";
    public static final java.lang.String _MANAGE_ALERT = "MANAGE_ALERT";
    public static final CustomerPermissions SECURITY = new CustomerPermissions(_SECURITY);
    public static final CustomerPermissions PROTECTION = new CustomerPermissions(_PROTECTION);
    public static final CustomerPermissions AUTOMATION = new CustomerPermissions(_AUTOMATION);
    public static final CustomerPermissions ENERGY = new CustomerPermissions(_ENERGY);
    public static final CustomerPermissions HEALTH = new CustomerPermissions(_HEALTH);
    public static final CustomerPermissions VIDEO = new CustomerPermissions(_VIDEO);
    public static final CustomerPermissions SCENARIO_OPERATE = new CustomerPermissions(_SCENARIO_OPERATE);
    public static final CustomerPermissions SCENARIO_VIEW_EDIT = new CustomerPermissions(_SCENARIO_VIEW_EDIT);
    public static final CustomerPermissions DEVICE_OPERATE = new CustomerPermissions(_DEVICE_OPERATE);
    public static final CustomerPermissions DEVICE_MODIFY = new CustomerPermissions(_DEVICE_MODIFY);
    public static final CustomerPermissions NOTIFICATION = new CustomerPermissions(_NOTIFICATION);
    public static final CustomerPermissions SHOPPING = new CustomerPermissions(_SHOPPING);
    public static final CustomerPermissions REQUEST_INSTALLER = new CustomerPermissions(_REQUEST_INSTALLER);
    public static final CustomerPermissions SET_UNSET_ARMING_MODE = new CustomerPermissions(_SET_UNSET_ARMING_MODE);
    public static final CustomerPermissions MANAGE_USERS = new CustomerPermissions(_MANAGE_USERS);
    public static final CustomerPermissions MANAGE_ALERT = new CustomerPermissions(_MANAGE_ALERT);
    public java.lang.String getValue() { return _value_;}
    public static CustomerPermissions fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerPermissions enumeration = (CustomerPermissions)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerPermissions fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerPermissions.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerPermissions"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
