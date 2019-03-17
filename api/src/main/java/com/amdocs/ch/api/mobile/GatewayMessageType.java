/**
 * GatewayMessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class GatewayMessageType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GatewayMessageType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _GATEWAY_PAIRING_MODE = "GATEWAY_PAIRING_MODE";
    public static final java.lang.String _PAIRING_ADD_ERROR = "PAIRING_ADD_ERROR";
    public static final java.lang.String _PAIRING_ADD_WARNING = "PAIRING_ADD_WARNING";
    public static final java.lang.String _PAIRING_ADD_SUCCESS = "PAIRING_ADD_SUCCESS";
    public static final java.lang.String _ZWAVE_ADD_ALLOWED = "ZWAVE_ADD_ALLOWED";
    public static final java.lang.String _ZWAVE_ADD_DISALLOWED = "ZWAVE_ADD_DISALLOWED";
    public static final java.lang.String _ZWAVE_ADD_START = "ZWAVE_ADD_START";
    public static final java.lang.String _ZWAVE_ADD_READ_CC_INFO = "ZWAVE_ADD_READ_CC_INFO";
    public static final java.lang.String _ZWAVE_ADD_READ_CC = "ZWAVE_ADD_READ_CC";
    public static final java.lang.String _ZWAVE_ADD_END = "ZWAVE_ADD_END";
    public static final java.lang.String _ZWAVE_ADD_HDM_START = "ZWAVE_ADD_HDM_START";
    public static final java.lang.String _ZWAVE_ADD_HDM_DC = "ZWAVE_ADD_HDM_DC";
    public static final java.lang.String _ZWAVE_ADD_ERROR = "ZWAVE_ADD_ERROR";
    public static final java.lang.String _ZWAVE_ADD_WARNING = "ZWAVE_ADD_WARNING";
    public static final java.lang.String _ZWAVE_REMOVE_HDM_START = "ZWAVE_REMOVE_HDM_START";
    public static final java.lang.String _ZWAVE_REPLACE_ALLOWED = "ZWAVE_REPLACE_ALLOWED";
    public static final java.lang.String _ZWAVE_REPLACE_DISALLOWED = "ZWAVE_REPLACE_DISALLOWED";
    public static final java.lang.String _ZWAVE_REPLACE_START = "ZWAVE_REPLACE_START";
    public static final java.lang.String _ZWAVE_REPLACE_DONE = "ZWAVE_REPLACE_DONE";
    public static final java.lang.String _ZWAVE_REPLACE_ERROR = "ZWAVE_REPLACE_ERROR";
    public static final java.lang.String _ZWAVE_REPLACE_END = "ZWAVE_REPLACE_END";
    public static final java.lang.String _GATEWAY_PARTITION_CHANGE = "GATEWAY_PARTITION_CHANGE";
    public static final java.lang.String _GATEWAY_INACTIVATE = "GATEWAY_INACTIVATE";
    public static final java.lang.String _GATEWAY_CONNECTION_INITIALIZING = "GATEWAY_CONNECTION_INITIALIZING";
    public static final java.lang.String _TIMEZONE_CHANGED = "TIMEZONE_CHANGED";
    public static final GatewayMessageType GATEWAY_PAIRING_MODE = new GatewayMessageType(_GATEWAY_PAIRING_MODE);
    public static final GatewayMessageType PAIRING_ADD_ERROR = new GatewayMessageType(_PAIRING_ADD_ERROR);
    public static final GatewayMessageType PAIRING_ADD_WARNING = new GatewayMessageType(_PAIRING_ADD_WARNING);
    public static final GatewayMessageType PAIRING_ADD_SUCCESS = new GatewayMessageType(_PAIRING_ADD_SUCCESS);
    public static final GatewayMessageType ZWAVE_ADD_ALLOWED = new GatewayMessageType(_ZWAVE_ADD_ALLOWED);
    public static final GatewayMessageType ZWAVE_ADD_DISALLOWED = new GatewayMessageType(_ZWAVE_ADD_DISALLOWED);
    public static final GatewayMessageType ZWAVE_ADD_START = new GatewayMessageType(_ZWAVE_ADD_START);
    public static final GatewayMessageType ZWAVE_ADD_READ_CC_INFO = new GatewayMessageType(_ZWAVE_ADD_READ_CC_INFO);
    public static final GatewayMessageType ZWAVE_ADD_READ_CC = new GatewayMessageType(_ZWAVE_ADD_READ_CC);
    public static final GatewayMessageType ZWAVE_ADD_END = new GatewayMessageType(_ZWAVE_ADD_END);
    public static final GatewayMessageType ZWAVE_ADD_HDM_START = new GatewayMessageType(_ZWAVE_ADD_HDM_START);
    public static final GatewayMessageType ZWAVE_ADD_HDM_DC = new GatewayMessageType(_ZWAVE_ADD_HDM_DC);
    public static final GatewayMessageType ZWAVE_ADD_ERROR = new GatewayMessageType(_ZWAVE_ADD_ERROR);
    public static final GatewayMessageType ZWAVE_ADD_WARNING = new GatewayMessageType(_ZWAVE_ADD_WARNING);
    public static final GatewayMessageType ZWAVE_REMOVE_HDM_START = new GatewayMessageType(_ZWAVE_REMOVE_HDM_START);
    public static final GatewayMessageType ZWAVE_REPLACE_ALLOWED = new GatewayMessageType(_ZWAVE_REPLACE_ALLOWED);
    public static final GatewayMessageType ZWAVE_REPLACE_DISALLOWED = new GatewayMessageType(_ZWAVE_REPLACE_DISALLOWED);
    public static final GatewayMessageType ZWAVE_REPLACE_START = new GatewayMessageType(_ZWAVE_REPLACE_START);
    public static final GatewayMessageType ZWAVE_REPLACE_DONE = new GatewayMessageType(_ZWAVE_REPLACE_DONE);
    public static final GatewayMessageType ZWAVE_REPLACE_ERROR = new GatewayMessageType(_ZWAVE_REPLACE_ERROR);
    public static final GatewayMessageType ZWAVE_REPLACE_END = new GatewayMessageType(_ZWAVE_REPLACE_END);
    public static final GatewayMessageType GATEWAY_PARTITION_CHANGE = new GatewayMessageType(_GATEWAY_PARTITION_CHANGE);
    public static final GatewayMessageType GATEWAY_INACTIVATE = new GatewayMessageType(_GATEWAY_INACTIVATE);
    public static final GatewayMessageType GATEWAY_CONNECTION_INITIALIZING = new GatewayMessageType(_GATEWAY_CONNECTION_INITIALIZING);
    public static final GatewayMessageType TIMEZONE_CHANGED = new GatewayMessageType(_TIMEZONE_CHANGED);
    public java.lang.String getValue() { return _value_;}
    public static GatewayMessageType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GatewayMessageType enumeration = (GatewayMessageType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GatewayMessageType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GatewayMessageType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayMessageType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
