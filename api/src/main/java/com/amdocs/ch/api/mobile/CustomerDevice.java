/**
 * CustomerDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CustomerDevice  extends com.amdocs.ch.api.mobile.HomeDevice  implements java.io.Serializable {
    private boolean active;

    private int batteryLevel;

    private com.amdocs.ch.api.mobile.BatteryStatus batteryStatus;

    private boolean builtInCamera;

    private boolean builtInSiren;

    private boolean defaultCamera;

    private int graceTimeInSeconds;

    private java.lang.String introspection;

    private int level;

    private com.amdocs.ch.api.mobile.Id masterId;

    private boolean newlyAdded;

    private java.lang.String protocol;

    private boolean recordVideoOnAlert;

    private java.lang.String room;

    private com.amdocs.ch.api.mobile.SensorTriggerMode sensorTriggerModeWhenSystemArmed;

    private com.amdocs.ch.api.mobile.SensorTriggerMode sensorTriggerModeWhenSystemCustomized;

    private com.amdocs.ch.api.mobile.SensorTriggerMode sensorTriggerModeWhenSystemDisarmed;

    private boolean slaveModeAvailable;

    public CustomerDevice() {
    }

    public CustomerDevice(
           com.amdocs.ch.api.mobile.DeviceAttribute[] attributes,
           com.amdocs.ch.api.mobile.HomeDevice[] children,
           com.amdocs.ch.api.mobile.Id deviceId,
           com.amdocs.ch.api.mobile.DoorLockSettings doorLockSettings,
           com.amdocs.ch.api.mobile.Id gatewayId,
           boolean general,
           java.lang.String[] deviceProductGroups,
           com.amdocs.ch.api.mobile.ManufacturerProduct manufacturerProduct,
           boolean markedForDelete,
           java.lang.String name,
           com.amdocs.ch.api.mobile.Id parentId,
           com.amdocs.ch.api.mobile.BasePartition[] partitions,
           com.amdocs.ch.api.mobile.Id productId,
           java.lang.String productTypeDisplayName,
           java.lang.String serial,
           com.amdocs.ch.api.mobile.DeviceStatus status,
           float targetTemperature,
           java.lang.String type,
           com.amdocs.ch.api.mobile.WifiSettings wifiSettings,
           boolean active,
           int batteryLevel,
           com.amdocs.ch.api.mobile.BatteryStatus batteryStatus,
           boolean builtInCamera,
           boolean builtInSiren,
           boolean defaultCamera,
           int graceTimeInSeconds,
           java.lang.String introspection,
           int level,
           com.amdocs.ch.api.mobile.Id masterId,
           boolean newlyAdded,
           java.lang.String protocol,
           boolean recordVideoOnAlert,
           java.lang.String room,
           com.amdocs.ch.api.mobile.SensorTriggerMode sensorTriggerModeWhenSystemArmed,
           com.amdocs.ch.api.mobile.SensorTriggerMode sensorTriggerModeWhenSystemCustomized,
           com.amdocs.ch.api.mobile.SensorTriggerMode sensorTriggerModeWhenSystemDisarmed,
           boolean slaveModeAvailable) {
        super(
            attributes,
            children,
            deviceId,
            doorLockSettings,
            gatewayId,
            general,
            deviceProductGroups,
            manufacturerProduct,
            markedForDelete,
            name,
            parentId,
            partitions,
            productId,
            productTypeDisplayName,
            serial,
            status,
            targetTemperature,
            type,
            wifiSettings);
        this.active = active;
        this.batteryLevel = batteryLevel;
        this.batteryStatus = batteryStatus;
        this.builtInCamera = builtInCamera;
        this.builtInSiren = builtInSiren;
        this.defaultCamera = defaultCamera;
        this.graceTimeInSeconds = graceTimeInSeconds;
        this.introspection = introspection;
        this.level = level;
        this.masterId = masterId;
        this.newlyAdded = newlyAdded;
        this.protocol = protocol;
        this.recordVideoOnAlert = recordVideoOnAlert;
        this.room = room;
        this.sensorTriggerModeWhenSystemArmed = sensorTriggerModeWhenSystemArmed;
        this.sensorTriggerModeWhenSystemCustomized = sensorTriggerModeWhenSystemCustomized;
        this.sensorTriggerModeWhenSystemDisarmed = sensorTriggerModeWhenSystemDisarmed;
        this.slaveModeAvailable = slaveModeAvailable;
    }


    /**
     * Gets the active value for this CustomerDevice.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this CustomerDevice.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the batteryLevel value for this CustomerDevice.
     * 
     * @return batteryLevel
     */
    public int getBatteryLevel() {
        return batteryLevel;
    }


    /**
     * Sets the batteryLevel value for this CustomerDevice.
     * 
     * @param batteryLevel
     */
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }


    /**
     * Gets the batteryStatus value for this CustomerDevice.
     * 
     * @return batteryStatus
     */
    public com.amdocs.ch.api.mobile.BatteryStatus getBatteryStatus() {
        return batteryStatus;
    }


    /**
     * Sets the batteryStatus value for this CustomerDevice.
     * 
     * @param batteryStatus
     */
    public void setBatteryStatus(com.amdocs.ch.api.mobile.BatteryStatus batteryStatus) {
        this.batteryStatus = batteryStatus;
    }


    /**
     * Gets the builtInCamera value for this CustomerDevice.
     * 
     * @return builtInCamera
     */
    public boolean isBuiltInCamera() {
        return builtInCamera;
    }


    /**
     * Sets the builtInCamera value for this CustomerDevice.
     * 
     * @param builtInCamera
     */
    public void setBuiltInCamera(boolean builtInCamera) {
        this.builtInCamera = builtInCamera;
    }


    /**
     * Gets the builtInSiren value for this CustomerDevice.
     * 
     * @return builtInSiren
     */
    public boolean isBuiltInSiren() {
        return builtInSiren;
    }


    /**
     * Sets the builtInSiren value for this CustomerDevice.
     * 
     * @param builtInSiren
     */
    public void setBuiltInSiren(boolean builtInSiren) {
        this.builtInSiren = builtInSiren;
    }


    /**
     * Gets the defaultCamera value for this CustomerDevice.
     * 
     * @return defaultCamera
     */
    public boolean isDefaultCamera() {
        return defaultCamera;
    }


    /**
     * Sets the defaultCamera value for this CustomerDevice.
     * 
     * @param defaultCamera
     */
    public void setDefaultCamera(boolean defaultCamera) {
        this.defaultCamera = defaultCamera;
    }


    /**
     * Gets the graceTimeInSeconds value for this CustomerDevice.
     * 
     * @return graceTimeInSeconds
     */
    public int getGraceTimeInSeconds() {
        return graceTimeInSeconds;
    }


    /**
     * Sets the graceTimeInSeconds value for this CustomerDevice.
     * 
     * @param graceTimeInSeconds
     */
    public void setGraceTimeInSeconds(int graceTimeInSeconds) {
        this.graceTimeInSeconds = graceTimeInSeconds;
    }


    /**
     * Gets the introspection value for this CustomerDevice.
     * 
     * @return introspection
     */
    public java.lang.String getIntrospection() {
        return introspection;
    }


    /**
     * Sets the introspection value for this CustomerDevice.
     * 
     * @param introspection
     */
    public void setIntrospection(java.lang.String introspection) {
        this.introspection = introspection;
    }


    /**
     * Gets the level value for this CustomerDevice.
     * 
     * @return level
     */
    public int getLevel() {
        return level;
    }


    /**
     * Sets the level value for this CustomerDevice.
     * 
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }


    /**
     * Gets the masterId value for this CustomerDevice.
     * 
     * @return masterId
     */
    public com.amdocs.ch.api.mobile.Id getMasterId() {
        return masterId;
    }


    /**
     * Sets the masterId value for this CustomerDevice.
     * 
     * @param masterId
     */
    public void setMasterId(com.amdocs.ch.api.mobile.Id masterId) {
        this.masterId = masterId;
    }


    /**
     * Gets the newlyAdded value for this CustomerDevice.
     * 
     * @return newlyAdded
     */
    public boolean isNewlyAdded() {
        return newlyAdded;
    }


    /**
     * Sets the newlyAdded value for this CustomerDevice.
     * 
     * @param newlyAdded
     */
    public void setNewlyAdded(boolean newlyAdded) {
        this.newlyAdded = newlyAdded;
    }


    /**
     * Gets the protocol value for this CustomerDevice.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this CustomerDevice.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the recordVideoOnAlert value for this CustomerDevice.
     * 
     * @return recordVideoOnAlert
     */
    public boolean isRecordVideoOnAlert() {
        return recordVideoOnAlert;
    }


    /**
     * Sets the recordVideoOnAlert value for this CustomerDevice.
     * 
     * @param recordVideoOnAlert
     */
    public void setRecordVideoOnAlert(boolean recordVideoOnAlert) {
        this.recordVideoOnAlert = recordVideoOnAlert;
    }


    /**
     * Gets the room value for this CustomerDevice.
     * 
     * @return room
     */
    public java.lang.String getRoom() {
        return room;
    }


    /**
     * Sets the room value for this CustomerDevice.
     * 
     * @param room
     */
    public void setRoom(java.lang.String room) {
        this.room = room;
    }


    /**
     * Gets the sensorTriggerModeWhenSystemArmed value for this CustomerDevice.
     * 
     * @return sensorTriggerModeWhenSystemArmed
     */
    public com.amdocs.ch.api.mobile.SensorTriggerMode getSensorTriggerModeWhenSystemArmed() {
        return sensorTriggerModeWhenSystemArmed;
    }


    /**
     * Sets the sensorTriggerModeWhenSystemArmed value for this CustomerDevice.
     * 
     * @param sensorTriggerModeWhenSystemArmed
     */
    public void setSensorTriggerModeWhenSystemArmed(com.amdocs.ch.api.mobile.SensorTriggerMode sensorTriggerModeWhenSystemArmed) {
        this.sensorTriggerModeWhenSystemArmed = sensorTriggerModeWhenSystemArmed;
    }


    /**
     * Gets the sensorTriggerModeWhenSystemCustomized value for this CustomerDevice.
     * 
     * @return sensorTriggerModeWhenSystemCustomized
     */
    public com.amdocs.ch.api.mobile.SensorTriggerMode getSensorTriggerModeWhenSystemCustomized() {
        return sensorTriggerModeWhenSystemCustomized;
    }


    /**
     * Sets the sensorTriggerModeWhenSystemCustomized value for this CustomerDevice.
     * 
     * @param sensorTriggerModeWhenSystemCustomized
     */
    public void setSensorTriggerModeWhenSystemCustomized(com.amdocs.ch.api.mobile.SensorTriggerMode sensorTriggerModeWhenSystemCustomized) {
        this.sensorTriggerModeWhenSystemCustomized = sensorTriggerModeWhenSystemCustomized;
    }


    /**
     * Gets the sensorTriggerModeWhenSystemDisarmed value for this CustomerDevice.
     * 
     * @return sensorTriggerModeWhenSystemDisarmed
     */
    public com.amdocs.ch.api.mobile.SensorTriggerMode getSensorTriggerModeWhenSystemDisarmed() {
        return sensorTriggerModeWhenSystemDisarmed;
    }


    /**
     * Sets the sensorTriggerModeWhenSystemDisarmed value for this CustomerDevice.
     * 
     * @param sensorTriggerModeWhenSystemDisarmed
     */
    public void setSensorTriggerModeWhenSystemDisarmed(com.amdocs.ch.api.mobile.SensorTriggerMode sensorTriggerModeWhenSystemDisarmed) {
        this.sensorTriggerModeWhenSystemDisarmed = sensorTriggerModeWhenSystemDisarmed;
    }


    /**
     * Gets the slaveModeAvailable value for this CustomerDevice.
     * 
     * @return slaveModeAvailable
     */
    public boolean isSlaveModeAvailable() {
        return slaveModeAvailable;
    }


    /**
     * Sets the slaveModeAvailable value for this CustomerDevice.
     * 
     * @param slaveModeAvailable
     */
    public void setSlaveModeAvailable(boolean slaveModeAvailable) {
        this.slaveModeAvailable = slaveModeAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerDevice)) return false;
        CustomerDevice other = (CustomerDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            this.batteryLevel == other.getBatteryLevel() &&
            ((this.batteryStatus==null && other.getBatteryStatus()==null) || 
             (this.batteryStatus!=null &&
              this.batteryStatus.equals(other.getBatteryStatus()))) &&
            this.builtInCamera == other.isBuiltInCamera() &&
            this.builtInSiren == other.isBuiltInSiren() &&
            this.defaultCamera == other.isDefaultCamera() &&
            this.graceTimeInSeconds == other.getGraceTimeInSeconds() &&
            ((this.introspection==null && other.getIntrospection()==null) || 
             (this.introspection!=null &&
              this.introspection.equals(other.getIntrospection()))) &&
            this.level == other.getLevel() &&
            ((this.masterId==null && other.getMasterId()==null) || 
             (this.masterId!=null &&
              this.masterId.equals(other.getMasterId()))) &&
            this.newlyAdded == other.isNewlyAdded() &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            this.recordVideoOnAlert == other.isRecordVideoOnAlert() &&
            ((this.room==null && other.getRoom()==null) || 
             (this.room!=null &&
              this.room.equals(other.getRoom()))) &&
            ((this.sensorTriggerModeWhenSystemArmed==null && other.getSensorTriggerModeWhenSystemArmed()==null) || 
             (this.sensorTriggerModeWhenSystemArmed!=null &&
              this.sensorTriggerModeWhenSystemArmed.equals(other.getSensorTriggerModeWhenSystemArmed()))) &&
            ((this.sensorTriggerModeWhenSystemCustomized==null && other.getSensorTriggerModeWhenSystemCustomized()==null) || 
             (this.sensorTriggerModeWhenSystemCustomized!=null &&
              this.sensorTriggerModeWhenSystemCustomized.equals(other.getSensorTriggerModeWhenSystemCustomized()))) &&
            ((this.sensorTriggerModeWhenSystemDisarmed==null && other.getSensorTriggerModeWhenSystemDisarmed()==null) || 
             (this.sensorTriggerModeWhenSystemDisarmed!=null &&
              this.sensorTriggerModeWhenSystemDisarmed.equals(other.getSensorTriggerModeWhenSystemDisarmed()))) &&
            this.slaveModeAvailable == other.isSlaveModeAvailable();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getBatteryLevel();
        if (getBatteryStatus() != null) {
            _hashCode += getBatteryStatus().hashCode();
        }
        _hashCode += (isBuiltInCamera() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBuiltInSiren() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDefaultCamera() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getGraceTimeInSeconds();
        if (getIntrospection() != null) {
            _hashCode += getIntrospection().hashCode();
        }
        _hashCode += getLevel();
        if (getMasterId() != null) {
            _hashCode += getMasterId().hashCode();
        }
        _hashCode += (isNewlyAdded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        _hashCode += (isRecordVideoOnAlert() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRoom() != null) {
            _hashCode += getRoom().hashCode();
        }
        if (getSensorTriggerModeWhenSystemArmed() != null) {
            _hashCode += getSensorTriggerModeWhenSystemArmed().hashCode();
        }
        if (getSensorTriggerModeWhenSystemCustomized() != null) {
            _hashCode += getSensorTriggerModeWhenSystemCustomized().hashCode();
        }
        if (getSensorTriggerModeWhenSystemDisarmed() != null) {
            _hashCode += getSensorTriggerModeWhenSystemDisarmed().hashCode();
        }
        _hashCode += (isSlaveModeAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batteryLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batteryLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batteryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batteryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "batteryStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInCamera");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtInCamera"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInSiren");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtInSiren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCamera");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultCamera"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graceTimeInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "graceTimeInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("introspection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "introspection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newlyAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newlyAdded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordVideoOnAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordVideoOnAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("room");
        elemField.setXmlName(new javax.xml.namespace.QName("", "room"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensorTriggerModeWhenSystemArmed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sensorTriggerModeWhenSystemArmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sensorTriggerMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensorTriggerModeWhenSystemCustomized");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sensorTriggerModeWhenSystemCustomized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sensorTriggerMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensorTriggerModeWhenSystemDisarmed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sensorTriggerModeWhenSystemDisarmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sensorTriggerMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slaveModeAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slaveModeAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
