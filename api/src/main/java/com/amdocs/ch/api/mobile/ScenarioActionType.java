/**
 * ScenarioActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ScenarioActionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScenarioActionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALERT = "ALERT";
    public static final java.lang.String _DEVICE = "DEVICE";
    public static final java.lang.String _MESSAGE = "MESSAGE";
    public static final java.lang.String _MODE = "MODE";
    public static final java.lang.String _RECORD = "RECORD";
    public static final ScenarioActionType ALERT = new ScenarioActionType(_ALERT);
    public static final ScenarioActionType DEVICE = new ScenarioActionType(_DEVICE);
    public static final ScenarioActionType MESSAGE = new ScenarioActionType(_MESSAGE);
    public static final ScenarioActionType MODE = new ScenarioActionType(_MODE);
    public static final ScenarioActionType RECORD = new ScenarioActionType(_RECORD);
    public java.lang.String getValue() { return _value_;}
    public static ScenarioActionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScenarioActionType enumeration = (ScenarioActionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScenarioActionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScenarioActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
