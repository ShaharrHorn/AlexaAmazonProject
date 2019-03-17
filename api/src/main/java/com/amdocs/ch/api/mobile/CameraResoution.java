/**
 * CameraResoution.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CameraResoution implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CameraResoution(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RESOLUTION_160x120 = "RESOLUTION_160x120";
    public static final java.lang.String _RESOLUTION_320x240 = "RESOLUTION_320x240";
    public static final java.lang.String _RESOLUTION_640x480 = "RESOLUTION_640x480";
    public static final java.lang.String _RESOLUTION_1280x720 = "RESOLUTION_1280x720";
    public static final java.lang.String _RESOLUTION_1920x1080 = "RESOLUTION_1920x1080";
    public static final CameraResoution RESOLUTION_160x120 = new CameraResoution(_RESOLUTION_160x120);
    public static final CameraResoution RESOLUTION_320x240 = new CameraResoution(_RESOLUTION_320x240);
    public static final CameraResoution RESOLUTION_640x480 = new CameraResoution(_RESOLUTION_640x480);
    public static final CameraResoution RESOLUTION_1280x720 = new CameraResoution(_RESOLUTION_1280x720);
    public static final CameraResoution RESOLUTION_1920x1080 = new CameraResoution(_RESOLUTION_1920x1080);
    public java.lang.String getValue() { return _value_;}
    public static CameraResoution fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CameraResoution enumeration = (CameraResoution)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CameraResoution fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CameraResoution.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraResoution"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
