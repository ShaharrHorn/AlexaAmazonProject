/**
 * ProtocolName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ProtocolName implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProtocolName(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UnUsed = "UnUsed";
    public static final java.lang.String _ZWAVE = "ZWAVE";
    public static final java.lang.String _ZIGBEE = "ZIGBEE";
    public static final java.lang.String _UPNP = "UPNP";
    public static final java.lang.String _BLUETOOTH = "BLUETOOTH";
    public static final java.lang.String _SIMULATOR = "SIMULATOR";
    public static final ProtocolName UnUsed = new ProtocolName(_UnUsed);
    public static final ProtocolName ZWAVE = new ProtocolName(_ZWAVE);
    public static final ProtocolName ZIGBEE = new ProtocolName(_ZIGBEE);
    public static final ProtocolName UPNP = new ProtocolName(_UPNP);
    public static final ProtocolName BLUETOOTH = new ProtocolName(_BLUETOOTH);
    public static final ProtocolName SIMULATOR = new ProtocolName(_SIMULATOR);
    public java.lang.String getValue() { return _value_;}
    public static ProtocolName fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProtocolName enumeration = (ProtocolName)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProtocolName fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProtocolName.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "protocolName"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
