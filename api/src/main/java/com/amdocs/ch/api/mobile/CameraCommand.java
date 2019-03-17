/**
 * CameraCommand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CameraCommand implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CameraCommand(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MOVE_UP = "MOVE_UP";
    public static final java.lang.String _MOVE_DOWN = "MOVE_DOWN";
    public static final java.lang.String _MOVE_LEFT = "MOVE_LEFT";
    public static final java.lang.String _MOVE_RIGTH = "MOVE_RIGTH";
    public static final java.lang.String _MOVE_DEFAULT = "MOVE_DEFAULT";
    public static final java.lang.String _ZOOM_PLUS = "ZOOM_PLUS";
    public static final java.lang.String _ZOOM_MINUS = "ZOOM_MINUS";
    public static final java.lang.String _LED_ON = "LED_ON";
    public static final java.lang.String _LED_OFF = "LED_OFF";
    public static final java.lang.String _SET_DEFAULT = "SET_DEFAULT";
    public static final CameraCommand MOVE_UP = new CameraCommand(_MOVE_UP);
    public static final CameraCommand MOVE_DOWN = new CameraCommand(_MOVE_DOWN);
    public static final CameraCommand MOVE_LEFT = new CameraCommand(_MOVE_LEFT);
    public static final CameraCommand MOVE_RIGTH = new CameraCommand(_MOVE_RIGTH);
    public static final CameraCommand MOVE_DEFAULT = new CameraCommand(_MOVE_DEFAULT);
    public static final CameraCommand ZOOM_PLUS = new CameraCommand(_ZOOM_PLUS);
    public static final CameraCommand ZOOM_MINUS = new CameraCommand(_ZOOM_MINUS);
    public static final CameraCommand LED_ON = new CameraCommand(_LED_ON);
    public static final CameraCommand LED_OFF = new CameraCommand(_LED_OFF);
    public static final CameraCommand SET_DEFAULT = new CameraCommand(_SET_DEFAULT);
    public java.lang.String getValue() { return _value_;}
    public static CameraCommand fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CameraCommand enumeration = (CameraCommand)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CameraCommand fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CameraCommand.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraCommand"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
