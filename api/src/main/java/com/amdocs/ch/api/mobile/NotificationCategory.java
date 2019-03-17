/**
 * NotificationCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class NotificationCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NotificationCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SECURITY_ALARM = "SECURITY_ALARM";
    public static final java.lang.String _SAFETY_ALERT = "SAFETY_ALERT";
    public static final java.lang.String _ARM_DISARM = "ARM_DISARM";
    public static final java.lang.String _TECHNICAL = "TECHNICAL";
    public static final java.lang.String _MONITORED_ENTRANCE = "MONITORED_ENTRANCE";
    public static final java.lang.String _SCENARIO_ALERT = "SCENARIO_ALERT";
    public static final NotificationCategory SECURITY_ALARM = new NotificationCategory(_SECURITY_ALARM);
    public static final NotificationCategory SAFETY_ALERT = new NotificationCategory(_SAFETY_ALERT);
    public static final NotificationCategory ARM_DISARM = new NotificationCategory(_ARM_DISARM);
    public static final NotificationCategory TECHNICAL = new NotificationCategory(_TECHNICAL);
    public static final NotificationCategory MONITORED_ENTRANCE = new NotificationCategory(_MONITORED_ENTRANCE);
    public static final NotificationCategory SCENARIO_ALERT = new NotificationCategory(_SCENARIO_ALERT);
    public java.lang.String getValue() { return _value_;}
    public static NotificationCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NotificationCategory enumeration = (NotificationCategory)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NotificationCategory fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NotificationCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategory"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
