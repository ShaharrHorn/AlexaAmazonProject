/**
 * BillableActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class BillableActionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillableActionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SMS = "SMS";
    public static final java.lang.String _EMAIL = "EMAIL";
    public static final java.lang.String _MMS = "MMS";
    public static final java.lang.String _VOICE = "VOICE";
    public static final java.lang.String _PUSH = "PUSH";
    public static final java.lang.String _VIDEO = "VIDEO";
    public static final BillableActionType SMS = new BillableActionType(_SMS);
    public static final BillableActionType EMAIL = new BillableActionType(_EMAIL);
    public static final BillableActionType MMS = new BillableActionType(_MMS);
    public static final BillableActionType VOICE = new BillableActionType(_VOICE);
    public static final BillableActionType PUSH = new BillableActionType(_PUSH);
    public static final BillableActionType VIDEO = new BillableActionType(_VIDEO);
    public java.lang.String getValue() { return _value_;}
    public static BillableActionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BillableActionType enumeration = (BillableActionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillableActionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillableActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "billableActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
