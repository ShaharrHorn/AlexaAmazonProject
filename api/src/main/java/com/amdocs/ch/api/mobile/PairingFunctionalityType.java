/**
 * PairingFunctionalityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class PairingFunctionalityType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PairingFunctionalityType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UnUsed = "UnUsed";
    public static final java.lang.String _Zwave = "Zwave";
    public static final java.lang.String _Camera = "Camera";
    public static final java.lang.String _Camera_SmartVue = "Camera_SmartVue";
    public static final java.lang.String _Zigbee = "Zigbee";
    public static final java.lang.String _PowerG = "PowerG";
    public static final PairingFunctionalityType UnUsed = new PairingFunctionalityType(_UnUsed);
    public static final PairingFunctionalityType Zwave = new PairingFunctionalityType(_Zwave);
    public static final PairingFunctionalityType Camera = new PairingFunctionalityType(_Camera);
    public static final PairingFunctionalityType Camera_SmartVue = new PairingFunctionalityType(_Camera_SmartVue);
    public static final PairingFunctionalityType Zigbee = new PairingFunctionalityType(_Zigbee);
    public static final PairingFunctionalityType PowerG = new PairingFunctionalityType(_PowerG);
    public java.lang.String getValue() { return _value_;}
    public static PairingFunctionalityType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PairingFunctionalityType enumeration = (PairingFunctionalityType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PairingFunctionalityType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PairingFunctionalityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "pairingFunctionalityType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
