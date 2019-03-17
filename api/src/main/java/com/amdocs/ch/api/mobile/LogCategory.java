/**
 * LogCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class LogCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LogCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INFO = "INFO";
    public static final java.lang.String _ALARM = "ALARM";
    public static final java.lang.String _ALARM_RESTORE = "ALARM_RESTORE";
    public static final java.lang.String _ALERT = "ALERT";
    public static final java.lang.String _ALERT_RESTORE = "ALERT_RESTORE";
    public static final java.lang.String _TECH = "TECH";
    public static final java.lang.String _TECH_RESTORE = "TECH_RESTORE";
    public static final java.lang.String _ARM = "ARM";
    public static final java.lang.String _BO = "BO";
    public static final java.lang.String _MONITORED_ENTRANCE = "MONITORED_ENTRANCE";
    public static final LogCategory INFO = new LogCategory(_INFO);
    public static final LogCategory ALARM = new LogCategory(_ALARM);
    public static final LogCategory ALARM_RESTORE = new LogCategory(_ALARM_RESTORE);
    public static final LogCategory ALERT = new LogCategory(_ALERT);
    public static final LogCategory ALERT_RESTORE = new LogCategory(_ALERT_RESTORE);
    public static final LogCategory TECH = new LogCategory(_TECH);
    public static final LogCategory TECH_RESTORE = new LogCategory(_TECH_RESTORE);
    public static final LogCategory ARM = new LogCategory(_ARM);
    public static final LogCategory BO = new LogCategory(_BO);
    public static final LogCategory MONITORED_ENTRANCE = new LogCategory(_MONITORED_ENTRANCE);
    public java.lang.String getValue() { return _value_;}
    public static LogCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LogCategory enumeration = (LogCategory)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LogCategory fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LogCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logCategory"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
