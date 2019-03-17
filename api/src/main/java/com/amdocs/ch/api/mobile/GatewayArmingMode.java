/**
 * GatewayArmingMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class GatewayArmingMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GatewayArmingMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ON = "ON";
    public static final java.lang.String _OFF = "OFF";
    public static final java.lang.String _PRESENCE = "PRESENCE";
    public static final java.lang.String _OFF_NOT_READY = "OFF_NOT_READY";
    public static final java.lang.String _ON_EXIT_DELAY = "ON_EXIT_DELAY";
    public static final java.lang.String _PRESENCE_EXIT_DELAY = "PRESENCE_EXIT_DELAY";
    public static final java.lang.String _ON_ENTRY_DELAY = "ON_ENTRY_DELAY";
    public static final java.lang.String _PRESENCE_ENTRY_DELAY = "PRESENCE_ENTRY_DELAY";
    public static final java.lang.String _MAINTENANCE = "MAINTENANCE";
    public static final GatewayArmingMode ON = new GatewayArmingMode(_ON);
    public static final GatewayArmingMode OFF = new GatewayArmingMode(_OFF);
    public static final GatewayArmingMode PRESENCE = new GatewayArmingMode(_PRESENCE);
    public static final GatewayArmingMode OFF_NOT_READY = new GatewayArmingMode(_OFF_NOT_READY);
    public static final GatewayArmingMode ON_EXIT_DELAY = new GatewayArmingMode(_ON_EXIT_DELAY);
    public static final GatewayArmingMode PRESENCE_EXIT_DELAY = new GatewayArmingMode(_PRESENCE_EXIT_DELAY);
    public static final GatewayArmingMode ON_ENTRY_DELAY = new GatewayArmingMode(_ON_ENTRY_DELAY);
    public static final GatewayArmingMode PRESENCE_ENTRY_DELAY = new GatewayArmingMode(_PRESENCE_ENTRY_DELAY);
    public static final GatewayArmingMode MAINTENANCE = new GatewayArmingMode(_MAINTENANCE);
    public java.lang.String getValue() { return _value_;}
    public static GatewayArmingMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GatewayArmingMode enumeration = (GatewayArmingMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GatewayArmingMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GatewayArmingMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayArmingMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
