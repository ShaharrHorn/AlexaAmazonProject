/**
 * GatewayPairingMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class GatewayPairingMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GatewayPairingMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PAIRING = "PAIRING";
    public static final java.lang.String _PAIRING_CAMERA = "PAIRING_CAMERA";
    public static final java.lang.String _PAIRING_POWERG = "PAIRING_POWERG";
    public static final java.lang.String _UNPAIRING = "UNPAIRING";
    public static final java.lang.String _REPLACING = "REPLACING";
    public static final java.lang.String _OFF = "OFF";
    public static final GatewayPairingMode PAIRING = new GatewayPairingMode(_PAIRING);
    public static final GatewayPairingMode PAIRING_CAMERA = new GatewayPairingMode(_PAIRING_CAMERA);
    public static final GatewayPairingMode PAIRING_POWERG = new GatewayPairingMode(_PAIRING_POWERG);
    public static final GatewayPairingMode UNPAIRING = new GatewayPairingMode(_UNPAIRING);
    public static final GatewayPairingMode REPLACING = new GatewayPairingMode(_REPLACING);
    public static final GatewayPairingMode OFF = new GatewayPairingMode(_OFF);
    public java.lang.String getValue() { return _value_;}
    public static GatewayPairingMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GatewayPairingMode enumeration = (GatewayPairingMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GatewayPairingMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GatewayPairingMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayPairingMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
