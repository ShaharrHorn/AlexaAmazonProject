/**
 * LogRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class LogRecordType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LogRecordType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INFO = "INFO";
    public static final java.lang.String _ALERT = "ALERT";
    public static final java.lang.String _SECURITY_PANEL_ALARM = "SECURITY_PANEL_ALARM";
    public static final java.lang.String _SECURITY_PANEL_ALARM_RESTORE = "SECURITY_PANEL_ALARM_RESTORE";
    public static final java.lang.String _SECURITY_PANEL_ALERT = "SECURITY_PANEL_ALERT";
    public static final java.lang.String _SECURITY_PANEL_ALERT_RESTORE = "SECURITY_PANEL_ALERT_RESTORE";
    public static final java.lang.String _SECURITY_PANEL_TECH = "SECURITY_PANEL_TECH";
    public static final java.lang.String _SECURITY_PANEL_ARM = "SECURITY_PANEL_ARM";
    public static final java.lang.String _SECURITY_PANEL_LOG_ONLY = "SECURITY_PANEL_LOG_ONLY";
    public static final java.lang.String _BO_LOG_ONLY = "BO_LOG_ONLY";
    public static final LogRecordType INFO = new LogRecordType(_INFO);
    public static final LogRecordType ALERT = new LogRecordType(_ALERT);
    public static final LogRecordType SECURITY_PANEL_ALARM = new LogRecordType(_SECURITY_PANEL_ALARM);
    public static final LogRecordType SECURITY_PANEL_ALARM_RESTORE = new LogRecordType(_SECURITY_PANEL_ALARM_RESTORE);
    public static final LogRecordType SECURITY_PANEL_ALERT = new LogRecordType(_SECURITY_PANEL_ALERT);
    public static final LogRecordType SECURITY_PANEL_ALERT_RESTORE = new LogRecordType(_SECURITY_PANEL_ALERT_RESTORE);
    public static final LogRecordType SECURITY_PANEL_TECH = new LogRecordType(_SECURITY_PANEL_TECH);
    public static final LogRecordType SECURITY_PANEL_ARM = new LogRecordType(_SECURITY_PANEL_ARM);
    public static final LogRecordType SECURITY_PANEL_LOG_ONLY = new LogRecordType(_SECURITY_PANEL_LOG_ONLY);
    public static final LogRecordType BO_LOG_ONLY = new LogRecordType(_BO_LOG_ONLY);
    public java.lang.String getValue() { return _value_;}
    public static LogRecordType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LogRecordType enumeration = (LogRecordType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LogRecordType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LogRecordType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logRecordType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
