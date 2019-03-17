/**
 * ScenarioTriggerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ScenarioTriggerType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScenarioTriggerType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TIME = "TIME";
    public static final java.lang.String _ARMED = "ARMED";
    public static final java.lang.String _DISARMED = "DISARMED";
    public static final java.lang.String _PERSONALIZED = "PERSONALIZED";
    public static final java.lang.String _SENSOR = "SENSOR";
    public static final java.lang.String _KEYPAD = "KEYPAD";
    public static final java.lang.String _DOOR_LOCK_OPENED = "DOOR_LOCK_OPENED";
    public static final java.lang.String _DOOR_LOCK_CLOSED = "DOOR_LOCK_CLOSED";
    public static final java.lang.String _LOCATION_ENTER = "LOCATION_ENTER";
    public static final java.lang.String _LOCATION_EXIT = "LOCATION_EXIT";
    public static final java.lang.String _NFC = "NFC";
    public static final java.lang.String _MANUAL = "MANUAL";
    public static final ScenarioTriggerType TIME = new ScenarioTriggerType(_TIME);
    public static final ScenarioTriggerType ARMED = new ScenarioTriggerType(_ARMED);
    public static final ScenarioTriggerType DISARMED = new ScenarioTriggerType(_DISARMED);
    public static final ScenarioTriggerType PERSONALIZED = new ScenarioTriggerType(_PERSONALIZED);
    public static final ScenarioTriggerType SENSOR = new ScenarioTriggerType(_SENSOR);
    public static final ScenarioTriggerType KEYPAD = new ScenarioTriggerType(_KEYPAD);
    public static final ScenarioTriggerType DOOR_LOCK_OPENED = new ScenarioTriggerType(_DOOR_LOCK_OPENED);
    public static final ScenarioTriggerType DOOR_LOCK_CLOSED = new ScenarioTriggerType(_DOOR_LOCK_CLOSED);
    public static final ScenarioTriggerType LOCATION_ENTER = new ScenarioTriggerType(_LOCATION_ENTER);
    public static final ScenarioTriggerType LOCATION_EXIT = new ScenarioTriggerType(_LOCATION_EXIT);
    public static final ScenarioTriggerType NFC = new ScenarioTriggerType(_NFC);
    public static final ScenarioTriggerType MANUAL = new ScenarioTriggerType(_MANUAL);
    public java.lang.String getValue() { return _value_;}
    public static ScenarioTriggerType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScenarioTriggerType enumeration = (ScenarioTriggerType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScenarioTriggerType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScenarioTriggerType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioTriggerType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
