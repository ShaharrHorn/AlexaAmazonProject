/**
 * ViewOnDemandMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ViewOnDemandMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ViewOnDemandMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DISABLED = "DISABLED";
    public static final java.lang.String _VIEW_IN_DISARM = "VIEW_IN_DISARM";
    public static final java.lang.String _VIEW_IN_HOME = "VIEW_IN_HOME";
    public static final java.lang.String _VIEW_IN_DISARM_HOME = "VIEW_IN_DISARM_HOME";
    public static final java.lang.String _VIEW_IN_AWAY = "VIEW_IN_AWAY";
    public static final java.lang.String _VIEW_IN_DISARM_AWAY = "VIEW_IN_DISARM_AWAY";
    public static final java.lang.String _VIEW_IN_HOME_AWAY = "VIEW_IN_HOME_AWAY";
    public static final java.lang.String _VIEW_IN_ALL_MODES = "VIEW_IN_ALL_MODES";
    public static final ViewOnDemandMode DISABLED = new ViewOnDemandMode(_DISABLED);
    public static final ViewOnDemandMode VIEW_IN_DISARM = new ViewOnDemandMode(_VIEW_IN_DISARM);
    public static final ViewOnDemandMode VIEW_IN_HOME = new ViewOnDemandMode(_VIEW_IN_HOME);
    public static final ViewOnDemandMode VIEW_IN_DISARM_HOME = new ViewOnDemandMode(_VIEW_IN_DISARM_HOME);
    public static final ViewOnDemandMode VIEW_IN_AWAY = new ViewOnDemandMode(_VIEW_IN_AWAY);
    public static final ViewOnDemandMode VIEW_IN_DISARM_AWAY = new ViewOnDemandMode(_VIEW_IN_DISARM_AWAY);
    public static final ViewOnDemandMode VIEW_IN_HOME_AWAY = new ViewOnDemandMode(_VIEW_IN_HOME_AWAY);
    public static final ViewOnDemandMode VIEW_IN_ALL_MODES = new ViewOnDemandMode(_VIEW_IN_ALL_MODES);
    public java.lang.String getValue() { return _value_;}
    public static ViewOnDemandMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ViewOnDemandMode enumeration = (ViewOnDemandMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ViewOnDemandMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ViewOnDemandMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "viewOnDemandMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
