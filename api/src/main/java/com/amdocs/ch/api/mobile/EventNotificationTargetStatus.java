/**
 * EventNotificationTargetStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class EventNotificationTargetStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EventNotificationTargetStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_CALLED_YET = "NOT_CALLED_YET";
    public static final java.lang.String _CALLED_FAILED = "CALLED_FAILED";
    public static final java.lang.String _CALLED_DELIVERED_NOT_ACKED = "CALLED_DELIVERED_NOT_ACKED";
    public static final java.lang.String _CALL_DELIVERED_ACKED = "CALL_DELIVERED_ACKED";
    public static final java.lang.String _CALL_COMPLETE = "CALL_COMPLETE";
    public static final EventNotificationTargetStatus NOT_CALLED_YET = new EventNotificationTargetStatus(_NOT_CALLED_YET);
    public static final EventNotificationTargetStatus CALLED_FAILED = new EventNotificationTargetStatus(_CALLED_FAILED);
    public static final EventNotificationTargetStatus CALLED_DELIVERED_NOT_ACKED = new EventNotificationTargetStatus(_CALLED_DELIVERED_NOT_ACKED);
    public static final EventNotificationTargetStatus CALL_DELIVERED_ACKED = new EventNotificationTargetStatus(_CALL_DELIVERED_ACKED);
    public static final EventNotificationTargetStatus CALL_COMPLETE = new EventNotificationTargetStatus(_CALL_COMPLETE);
    public java.lang.String getValue() { return _value_;}
    public static EventNotificationTargetStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EventNotificationTargetStatus enumeration = (EventNotificationTargetStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EventNotificationTargetStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EventNotificationTargetStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
