/**
 * VideoSessionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VideoSessionStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoSessionStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NEW = "NEW";
    public static final java.lang.String _STARTING = "STARTING";
    public static final java.lang.String _ESTABLISHED = "ESTABLISHED";
    public static final java.lang.String _BROKEN_BY_PLAYER = "BROKEN_BY_PLAYER";
    public static final java.lang.String _BROKEN_BY_CAM = "BROKEN_BY_CAM";
    public static final VideoSessionStatus NEW = new VideoSessionStatus(_NEW);
    public static final VideoSessionStatus STARTING = new VideoSessionStatus(_STARTING);
    public static final VideoSessionStatus ESTABLISHED = new VideoSessionStatus(_ESTABLISHED);
    public static final VideoSessionStatus BROKEN_BY_PLAYER = new VideoSessionStatus(_BROKEN_BY_PLAYER);
    public static final VideoSessionStatus BROKEN_BY_CAM = new VideoSessionStatus(_BROKEN_BY_CAM);
    public java.lang.String getValue() { return _value_;}
    public static VideoSessionStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoSessionStatus enumeration = (VideoSessionStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoSessionStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoSessionStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
