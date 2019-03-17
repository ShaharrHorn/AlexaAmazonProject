/**
 * MeasurementUnitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MeasurementUnitType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MeasurementUnitType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _KWH = "KWH";
    public static final java.lang.String _USD = "USD";
    public static final java.lang.String _EUR = "EUR";
    public static final java.lang.String _CARBON_FOOTPRINT = "CARBON_FOOTPRINT";
    public static final java.lang.String _MGDL = "MGDL";
    public static final java.lang.String _MMOLL = "MMOLL";
    public static final java.lang.String _KG = "KG";
    public static final java.lang.String _POUND = "POUND";
    public static final java.lang.String _FAHRENHEIT = "FAHRENHEIT";
    public static final java.lang.String _CELSIUS = "CELSIUS";
    public static final MeasurementUnitType KWH = new MeasurementUnitType(_KWH);
    public static final MeasurementUnitType USD = new MeasurementUnitType(_USD);
    public static final MeasurementUnitType EUR = new MeasurementUnitType(_EUR);
    public static final MeasurementUnitType CARBON_FOOTPRINT = new MeasurementUnitType(_CARBON_FOOTPRINT);
    public static final MeasurementUnitType MGDL = new MeasurementUnitType(_MGDL);
    public static final MeasurementUnitType MMOLL = new MeasurementUnitType(_MMOLL);
    public static final MeasurementUnitType KG = new MeasurementUnitType(_KG);
    public static final MeasurementUnitType POUND = new MeasurementUnitType(_POUND);
    public static final MeasurementUnitType FAHRENHEIT = new MeasurementUnitType(_FAHRENHEIT);
    public static final MeasurementUnitType CELSIUS = new MeasurementUnitType(_CELSIUS);
    public java.lang.String getValue() { return _value_;}
    public static MeasurementUnitType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MeasurementUnitType enumeration = (MeasurementUnitType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MeasurementUnitType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MeasurementUnitType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "measurementUnitType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
