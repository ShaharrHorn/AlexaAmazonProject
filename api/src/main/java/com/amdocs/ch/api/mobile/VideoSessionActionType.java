/**
 * VideoSessionActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VideoSessionActionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VideoSessionActionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _START_STREAM = "START_STREAM";
    public static final java.lang.String _DISPLAY_STREAM = "DISPLAY_STREAM";
    public static final java.lang.String _LOG_OPERATION = "LOG_OPERATION";
    public static final java.lang.String _LOCK_STREAM = "LOCK_STREAM";
    public static final java.lang.String _UNLOCK_STREAM = "UNLOCK_STREAM";
    public static final java.lang.String _REFRESH_STREAM = "REFRESH_STREAM";
    public static final java.lang.String _CONTINUE_STREAM = "CONTINUE_STREAM";
    public static final java.lang.String _CHECK_SECURITY_EVENT_ARRIVED = "CHECK_SECURITY_EVENT_ARRIVED";
    public static final java.lang.String _CHECK_SECURITY_EVENT_CANCELED = "CHECK_SECURITY_EVENT_CANCELED";
    public static final java.lang.String _START_ON_DEMAND_RECORDING = "START_ON_DEMAND_RECORDING";
    public static final java.lang.String _START_SCENARIO_RECORDING = "START_SCENARIO_RECORDING";
    public static final java.lang.String _START_SECURITY_RECORDING = "START_SECURITY_RECORDING";
    public static final java.lang.String _SWITCH_CAMERA = "SWITCH_CAMERA";
    public static final java.lang.String _STOP_STREAM = "STOP_STREAM";
    public static final java.lang.String _STOP_RECORDING = "STOP_RECORDING";
    public static final java.lang.String _START_VOD = "START_VOD";
    public static final VideoSessionActionType START_STREAM = new VideoSessionActionType(_START_STREAM);
    public static final VideoSessionActionType DISPLAY_STREAM = new VideoSessionActionType(_DISPLAY_STREAM);
    public static final VideoSessionActionType LOG_OPERATION = new VideoSessionActionType(_LOG_OPERATION);
    public static final VideoSessionActionType LOCK_STREAM = new VideoSessionActionType(_LOCK_STREAM);
    public static final VideoSessionActionType UNLOCK_STREAM = new VideoSessionActionType(_UNLOCK_STREAM);
    public static final VideoSessionActionType REFRESH_STREAM = new VideoSessionActionType(_REFRESH_STREAM);
    public static final VideoSessionActionType CONTINUE_STREAM = new VideoSessionActionType(_CONTINUE_STREAM);
    public static final VideoSessionActionType CHECK_SECURITY_EVENT_ARRIVED = new VideoSessionActionType(_CHECK_SECURITY_EVENT_ARRIVED);
    public static final VideoSessionActionType CHECK_SECURITY_EVENT_CANCELED = new VideoSessionActionType(_CHECK_SECURITY_EVENT_CANCELED);
    public static final VideoSessionActionType START_ON_DEMAND_RECORDING = new VideoSessionActionType(_START_ON_DEMAND_RECORDING);
    public static final VideoSessionActionType START_SCENARIO_RECORDING = new VideoSessionActionType(_START_SCENARIO_RECORDING);
    public static final VideoSessionActionType START_SECURITY_RECORDING = new VideoSessionActionType(_START_SECURITY_RECORDING);
    public static final VideoSessionActionType SWITCH_CAMERA = new VideoSessionActionType(_SWITCH_CAMERA);
    public static final VideoSessionActionType STOP_STREAM = new VideoSessionActionType(_STOP_STREAM);
    public static final VideoSessionActionType STOP_RECORDING = new VideoSessionActionType(_STOP_RECORDING);
    public static final VideoSessionActionType START_VOD = new VideoSessionActionType(_START_VOD);
    public java.lang.String getValue() { return _value_;}
    public static VideoSessionActionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VideoSessionActionType enumeration = (VideoSessionActionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VideoSessionActionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VideoSessionActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSessionActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
