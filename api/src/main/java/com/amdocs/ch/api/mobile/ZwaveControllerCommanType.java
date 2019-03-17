/**
 * ZwaveControllerCommanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ZwaveControllerCommanType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ZwaveControllerCommanType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RESTART_ZWAVE_CONTROLLER = "RESTART_ZWAVE_CONTROLLER";
    public static final java.lang.String _RESET_ZWAVE_CONROLLER = "RESET_ZWAVE_CONROLLER";
    public static final java.lang.String _RUN_ZWAVE_NETWORK_UPDATE = "RUN_ZWAVE_NETWORK_UPDATE";
    public static final java.lang.String _SET_ZWAVE_LEARN_MODE = "SET_ZWAVE_LEARN_MODE";
    public static final java.lang.String _SET_ZWAVE_SHIFT_MODE = "SET_ZWAVE_SHIFT_MODE";
    public static final ZwaveControllerCommanType RESTART_ZWAVE_CONTROLLER = new ZwaveControllerCommanType(_RESTART_ZWAVE_CONTROLLER);
    public static final ZwaveControllerCommanType RESET_ZWAVE_CONROLLER = new ZwaveControllerCommanType(_RESET_ZWAVE_CONROLLER);
    public static final ZwaveControllerCommanType RUN_ZWAVE_NETWORK_UPDATE = new ZwaveControllerCommanType(_RUN_ZWAVE_NETWORK_UPDATE);
    public static final ZwaveControllerCommanType SET_ZWAVE_LEARN_MODE = new ZwaveControllerCommanType(_SET_ZWAVE_LEARN_MODE);
    public static final ZwaveControllerCommanType SET_ZWAVE_SHIFT_MODE = new ZwaveControllerCommanType(_SET_ZWAVE_SHIFT_MODE);
    public java.lang.String getValue() { return _value_;}
    public static ZwaveControllerCommanType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ZwaveControllerCommanType enumeration = (ZwaveControllerCommanType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ZwaveControllerCommanType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ZwaveControllerCommanType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "zwaveControllerCommanType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
