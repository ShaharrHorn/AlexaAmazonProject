/**
 * VideoRecordingTriggerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VideoRecordingTriggerType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoRecordingTriggerType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ON_ALERT = "ON_ALERT";
    public static final java.lang.String _ON_DEMAND = "ON_DEMAND";
    public static final java.lang.String _ON_SCENARIO = "ON_SCENARIO";
    public static final java.lang.String _ON_MONITORED_ENTRANCE = "ON_MONITORED_ENTRANCE";
    public static final VideoRecordingTriggerType ON_ALERT = new VideoRecordingTriggerType(_ON_ALERT);
    public static final VideoRecordingTriggerType ON_DEMAND = new VideoRecordingTriggerType(_ON_DEMAND);
    public static final VideoRecordingTriggerType ON_SCENARIO = new VideoRecordingTriggerType(_ON_SCENARIO);
    public static final VideoRecordingTriggerType ON_MONITORED_ENTRANCE = new VideoRecordingTriggerType(_ON_MONITORED_ENTRANCE);
    public java.lang.String getValue() { return _value_;}
    public static VideoRecordingTriggerType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoRecordingTriggerType enumeration = (VideoRecordingTriggerType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoRecordingTriggerType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoRecordingTriggerType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordingTriggerType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
