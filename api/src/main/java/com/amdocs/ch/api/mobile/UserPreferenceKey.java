/**
 * UserPreferenceKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UserPreferenceKey implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserPreferenceKey(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RECORDED_VIDEO_LIST_ON_ALERT = "RECORDED_VIDEO_LIST_ON_ALERT";
    public static final java.lang.String _RECORDED_VIDEO_LIST_ON_MONITORED_ENTRANCE = "RECORDED_VIDEO_LIST_ON_MONITORED_ENTRANCE";
    public static final java.lang.String _RECORDED_VIDEO_LIST_ON_DEMAND = "RECORDED_VIDEO_LIST_ON_DEMAND";
    public static final java.lang.String _RECORDED_VIDEO_LIST_ON_SCENARIO = "RECORDED_VIDEO_LIST_ON_SCENARIO";
    public static final java.lang.String _RECORDED_VIDEO_LIST_CAMERAS = "RECORDED_VIDEO_LIST_CAMERAS";
    public static final UserPreferenceKey RECORDED_VIDEO_LIST_ON_ALERT = new UserPreferenceKey(_RECORDED_VIDEO_LIST_ON_ALERT);
    public static final UserPreferenceKey RECORDED_VIDEO_LIST_ON_MONITORED_ENTRANCE = new UserPreferenceKey(_RECORDED_VIDEO_LIST_ON_MONITORED_ENTRANCE);
    public static final UserPreferenceKey RECORDED_VIDEO_LIST_ON_DEMAND = new UserPreferenceKey(_RECORDED_VIDEO_LIST_ON_DEMAND);
    public static final UserPreferenceKey RECORDED_VIDEO_LIST_ON_SCENARIO = new UserPreferenceKey(_RECORDED_VIDEO_LIST_ON_SCENARIO);
    public static final UserPreferenceKey RECORDED_VIDEO_LIST_CAMERAS = new UserPreferenceKey(_RECORDED_VIDEO_LIST_CAMERAS);
    public java.lang.String getValue() { return _value_;}
    public static UserPreferenceKey fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UserPreferenceKey enumeration = (UserPreferenceKey)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserPreferenceKey fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UserPreferenceKey.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPreferenceKey"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
