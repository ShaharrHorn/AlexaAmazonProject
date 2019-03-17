/**
 * ProductGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ProductGroup implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProductGroup(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NULL = "NULL";
    public static final java.lang.String _Accessories = "Accessories";
    public static final java.lang.String _Box = "Box";
    public static final java.lang.String _SecurityDevices = "SecurityDevices";
    public static final java.lang.String _Sensors = "Sensors";
    public static final java.lang.String _Protection = "Protection";
    public static final java.lang.String _Security = "Security";
    public static final java.lang.String _ProtectionSensors = "ProtectionSensors";
    public static final java.lang.String _OtherSensors = "OtherSensors";
    public static final java.lang.String _ScenarioActivated = "ScenarioActivated";
    public static final java.lang.String _ScenarioTrigger = "ScenarioTrigger";
    public static final java.lang.String _HomeAutomation = "HomeAutomation";
    public static final java.lang.String _Thermostats = "Thermostats";
    public static final java.lang.String _Energy = "Energy";
    public static final java.lang.String _Health = "Health";
    public static final java.lang.String _MotionDetectors = "MotionDetectors";
    public static final java.lang.String _DoorSensors = "DoorSensors";
    public static final java.lang.String _SafetySensors = "SafetySensors";
    public static final java.lang.String _WarningSignals = "WarningSignals";
    public static final java.lang.String _Cameras = "Cameras";
    public static final java.lang.String _RemotesAndTags = "RemotesAndTags";
    public static final java.lang.String _Plugs = "Plugs";
    public static final java.lang.String _Keypads = "Keypads";
    public static final java.lang.String _Sirens = "Sirens";
    public static final java.lang.String _Dimmers = "Dimmers";
    public static final java.lang.String _DoorLocks = "DoorLocks";
    public static final java.lang.String _EnergyHomeMeter = "EnergyHomeMeter";
    public static final java.lang.String _BloodPressure = "BloodPressure";
    public static final java.lang.String _OxiMeter = "OxiMeter";
    public static final java.lang.String _WeightScale = "WeightScale";
    public static final java.lang.String _ECG = "ECG";
    public static final java.lang.String _Spirometer = "Spirometer";
    public static final java.lang.String _GlucoseMonitor = "GlucoseMonitor";
    public static final java.lang.String _RemoteControllers = "RemoteControllers";
    public static final java.lang.String _SecurityPanel = "SecurityPanel";
    public static final java.lang.String _Video = "Video";
    public static final java.lang.String _AncillaryDevices = "AncillaryDevices";
    public static final ProductGroup NULL = new ProductGroup(_NULL);
    public static final ProductGroup Accessories = new ProductGroup(_Accessories);
    public static final ProductGroup Box = new ProductGroup(_Box);
    public static final ProductGroup SecurityDevices = new ProductGroup(_SecurityDevices);
    public static final ProductGroup Sensors = new ProductGroup(_Sensors);
    public static final ProductGroup Protection = new ProductGroup(_Protection);
    public static final ProductGroup Security = new ProductGroup(_Security);
    public static final ProductGroup ProtectionSensors = new ProductGroup(_ProtectionSensors);
    public static final ProductGroup OtherSensors = new ProductGroup(_OtherSensors);
    public static final ProductGroup ScenarioActivated = new ProductGroup(_ScenarioActivated);
    public static final ProductGroup ScenarioTrigger = new ProductGroup(_ScenarioTrigger);
    public static final ProductGroup HomeAutomation = new ProductGroup(_HomeAutomation);
    public static final ProductGroup Thermostats = new ProductGroup(_Thermostats);
    public static final ProductGroup Energy = new ProductGroup(_Energy);
    public static final ProductGroup Health = new ProductGroup(_Health);
    public static final ProductGroup MotionDetectors = new ProductGroup(_MotionDetectors);
    public static final ProductGroup DoorSensors = new ProductGroup(_DoorSensors);
    public static final ProductGroup SafetySensors = new ProductGroup(_SafetySensors);
    public static final ProductGroup WarningSignals = new ProductGroup(_WarningSignals);
    public static final ProductGroup Cameras = new ProductGroup(_Cameras);
    public static final ProductGroup RemotesAndTags = new ProductGroup(_RemotesAndTags);
    public static final ProductGroup Plugs = new ProductGroup(_Plugs);
    public static final ProductGroup Keypads = new ProductGroup(_Keypads);
    public static final ProductGroup Sirens = new ProductGroup(_Sirens);
    public static final ProductGroup Dimmers = new ProductGroup(_Dimmers);
    public static final ProductGroup DoorLocks = new ProductGroup(_DoorLocks);
    public static final ProductGroup EnergyHomeMeter = new ProductGroup(_EnergyHomeMeter);
    public static final ProductGroup BloodPressure = new ProductGroup(_BloodPressure);
    public static final ProductGroup OxiMeter = new ProductGroup(_OxiMeter);
    public static final ProductGroup WeightScale = new ProductGroup(_WeightScale);
    public static final ProductGroup ECG = new ProductGroup(_ECG);
    public static final ProductGroup Spirometer = new ProductGroup(_Spirometer);
    public static final ProductGroup GlucoseMonitor = new ProductGroup(_GlucoseMonitor);
    public static final ProductGroup RemoteControllers = new ProductGroup(_RemoteControllers);
    public static final ProductGroup SecurityPanel = new ProductGroup(_SecurityPanel);
    public static final ProductGroup Video = new ProductGroup(_Video);
    public static final ProductGroup AncillaryDevices = new ProductGroup(_AncillaryDevices);
    public java.lang.String getValue() { return _value_;}
    public static ProductGroup fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProductGroup enumeration = (ProductGroup)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProductGroup fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProductGroup.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productGroup"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
