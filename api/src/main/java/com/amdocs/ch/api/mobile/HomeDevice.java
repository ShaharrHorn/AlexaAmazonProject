/**
 * HomeDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class HomeDevice  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.DeviceAttribute[] attributes;

    private com.amdocs.ch.api.mobile.HomeDevice[] children;

    private com.amdocs.ch.api.mobile.Id deviceId;

    private com.amdocs.ch.api.mobile.DoorLockSettings doorLockSettings;

    private com.amdocs.ch.api.mobile.Id gatewayId;

    private boolean general;

    private java.lang.String[] deviceProductGroups;

    private com.amdocs.ch.api.mobile.ManufacturerProduct manufacturerProduct;

    private boolean markedForDelete;

    private java.lang.String name;

    private com.amdocs.ch.api.mobile.Id parentId;

    private com.amdocs.ch.api.mobile.BasePartition[] partitions;

    private com.amdocs.ch.api.mobile.Id productId;

    private java.lang.String productTypeDisplayName;

    private java.lang.String serial;

    private com.amdocs.ch.api.mobile.DeviceStatus status;

    private float targetTemperature;

    private java.lang.String type;

    private com.amdocs.ch.api.mobile.WifiSettings wifiSettings;

    public HomeDevice() {
    }

    public HomeDevice(
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
           com.amdocs.ch.api.mobile.WifiSettings wifiSettings) {
           this.attributes = attributes;
           this.children = children;
           this.deviceId = deviceId;
           this.doorLockSettings = doorLockSettings;
           this.gatewayId = gatewayId;
           this.general = general;
           this.deviceProductGroups = deviceProductGroups;
           this.manufacturerProduct = manufacturerProduct;
           this.markedForDelete = markedForDelete;
           this.name = name;
           this.parentId = parentId;
           this.partitions = partitions;
           this.productId = productId;
           this.productTypeDisplayName = productTypeDisplayName;
           this.serial = serial;
           this.status = status;
           this.targetTemperature = targetTemperature;
           this.type = type;
           this.wifiSettings = wifiSettings;
    }


    /**
     * Gets the attributes value for this HomeDevice.
     * 
     * @return attributes
     */
    public com.amdocs.ch.api.mobile.DeviceAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this HomeDevice.
     * 
     * @param attributes
     */
    public void setAttributes(com.amdocs.ch.api.mobile.DeviceAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the children value for this HomeDevice.
     * 
     * @return children
     */
    public com.amdocs.ch.api.mobile.HomeDevice[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this HomeDevice.
     * 
     * @param children
     */
    public void setChildren(com.amdocs.ch.api.mobile.HomeDevice[] children) {
        this.children = children;
    }

    public com.amdocs.ch.api.mobile.HomeDevice getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.amdocs.ch.api.mobile.HomeDevice _value) {
        this.children[i] = _value;
    }


    /**
     * Gets the deviceId value for this HomeDevice.
     * 
     * @return deviceId
     */
    public com.amdocs.ch.api.mobile.Id getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this HomeDevice.
     * 
     * @param deviceId
     */
    public void setDeviceId(com.amdocs.ch.api.mobile.Id deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the doorLockSettings value for this HomeDevice.
     * 
     * @return doorLockSettings
     */
    public com.amdocs.ch.api.mobile.DoorLockSettings getDoorLockSettings() {
        return doorLockSettings;
    }


    /**
     * Sets the doorLockSettings value for this HomeDevice.
     * 
     * @param doorLockSettings
     */
    public void setDoorLockSettings(com.amdocs.ch.api.mobile.DoorLockSettings doorLockSettings) {
        this.doorLockSettings = doorLockSettings;
    }


    /**
     * Gets the gatewayId value for this HomeDevice.
     * 
     * @return gatewayId
     */
    public com.amdocs.ch.api.mobile.Id getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this HomeDevice.
     * 
     * @param gatewayId
     */
    public void setGatewayId(com.amdocs.ch.api.mobile.Id gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the general value for this HomeDevice.
     * 
     * @return general
     */
    public boolean isGeneral() {
        return general;
    }


    /**
     * Sets the general value for this HomeDevice.
     * 
     * @param general
     */
    public void setGeneral(boolean general) {
        this.general = general;
    }


    /**
     * Gets the deviceProductGroups value for this HomeDevice.
     * 
     * @return deviceProductGroups
     */
    public java.lang.String[] getDeviceProductGroups() {
        return deviceProductGroups;
    }


    /**
     * Sets the deviceProductGroups value for this HomeDevice.
     * 
     * @param deviceProductGroups
     */
    public void setDeviceProductGroups(java.lang.String[] deviceProductGroups) {
        this.deviceProductGroups = deviceProductGroups;
    }


    /**
     * Gets the manufacturerProduct value for this HomeDevice.
     * 
     * @return manufacturerProduct
     */
    public com.amdocs.ch.api.mobile.ManufacturerProduct getManufacturerProduct() {
        return manufacturerProduct;
    }


    /**
     * Sets the manufacturerProduct value for this HomeDevice.
     * 
     * @param manufacturerProduct
     */
    public void setManufacturerProduct(com.amdocs.ch.api.mobile.ManufacturerProduct manufacturerProduct) {
        this.manufacturerProduct = manufacturerProduct;
    }


    /**
     * Gets the markedForDelete value for this HomeDevice.
     * 
     * @return markedForDelete
     */
    public boolean isMarkedForDelete() {
        return markedForDelete;
    }


    /**
     * Sets the markedForDelete value for this HomeDevice.
     * 
     * @param markedForDelete
     */
    public void setMarkedForDelete(boolean markedForDelete) {
        this.markedForDelete = markedForDelete;
    }


    /**
     * Gets the name value for this HomeDevice.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HomeDevice.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parentId value for this HomeDevice.
     * 
     * @return parentId
     */
    public com.amdocs.ch.api.mobile.Id getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this HomeDevice.
     * 
     * @param parentId
     */
    public void setParentId(com.amdocs.ch.api.mobile.Id parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the partitions value for this HomeDevice.
     * 
     * @return partitions
     */
    public com.amdocs.ch.api.mobile.BasePartition[] getPartitions() {
        return partitions;
    }


    /**
     * Sets the partitions value for this HomeDevice.
     * 
     * @param partitions
     */
    public void setPartitions(com.amdocs.ch.api.mobile.BasePartition[] partitions) {
        this.partitions = partitions;
    }

    public com.amdocs.ch.api.mobile.BasePartition getPartitions(int i) {
        return this.partitions[i];
    }

    public void setPartitions(int i, com.amdocs.ch.api.mobile.BasePartition _value) {
        this.partitions[i] = _value;
    }


    /**
     * Gets the productId value for this HomeDevice.
     * 
     * @return productId
     */
    public com.amdocs.ch.api.mobile.Id getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this HomeDevice.
     * 
     * @param productId
     */
    public void setProductId(com.amdocs.ch.api.mobile.Id productId) {
        this.productId = productId;
    }


    /**
     * Gets the productTypeDisplayName value for this HomeDevice.
     * 
     * @return productTypeDisplayName
     */
    public java.lang.String getProductTypeDisplayName() {
        return productTypeDisplayName;
    }


    /**
     * Sets the productTypeDisplayName value for this HomeDevice.
     * 
     * @param productTypeDisplayName
     */
    public void setProductTypeDisplayName(java.lang.String productTypeDisplayName) {
        this.productTypeDisplayName = productTypeDisplayName;
    }


    /**
     * Gets the serial value for this HomeDevice.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this HomeDevice.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the status value for this HomeDevice.
     * 
     * @return status
     */
    public com.amdocs.ch.api.mobile.DeviceStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this HomeDevice.
     * 
     * @param status
     */
    public void setStatus(com.amdocs.ch.api.mobile.DeviceStatus status) {
        this.status = status;
    }


    /**
     * Gets the targetTemperature value for this HomeDevice.
     * 
     * @return targetTemperature
     */
    public float getTargetTemperature() {
        return targetTemperature;
    }


    /**
     * Sets the targetTemperature value for this HomeDevice.
     * 
     * @param targetTemperature
     */
    public void setTargetTemperature(float targetTemperature) {
        this.targetTemperature = targetTemperature;
    }


    /**
     * Gets the type value for this HomeDevice.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this HomeDevice.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the wifiSettings value for this HomeDevice.
     * 
     * @return wifiSettings
     */
    public com.amdocs.ch.api.mobile.WifiSettings getWifiSettings() {
        return wifiSettings;
    }


    /**
     * Sets the wifiSettings value for this HomeDevice.
     * 
     * @param wifiSettings
     */
    public void setWifiSettings(com.amdocs.ch.api.mobile.WifiSettings wifiSettings) {
        this.wifiSettings = wifiSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HomeDevice)) return false;
        HomeDevice other = (HomeDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.doorLockSettings==null && other.getDoorLockSettings()==null) || 
             (this.doorLockSettings!=null &&
              this.doorLockSettings.equals(other.getDoorLockSettings()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            this.general == other.isGeneral() &&
            ((this.deviceProductGroups==null && other.getDeviceProductGroups()==null) || 
             (this.deviceProductGroups!=null &&
              java.util.Arrays.equals(this.deviceProductGroups, other.getDeviceProductGroups()))) &&
            ((this.manufacturerProduct==null && other.getManufacturerProduct()==null) || 
             (this.manufacturerProduct!=null &&
              this.manufacturerProduct.equals(other.getManufacturerProduct()))) &&
            this.markedForDelete == other.isMarkedForDelete() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.partitions==null && other.getPartitions()==null) || 
             (this.partitions!=null &&
              java.util.Arrays.equals(this.partitions, other.getPartitions()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.productTypeDisplayName==null && other.getProductTypeDisplayName()==null) || 
             (this.productTypeDisplayName!=null &&
              this.productTypeDisplayName.equals(other.getProductTypeDisplayName()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.targetTemperature == other.getTargetTemperature() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.wifiSettings==null && other.getWifiSettings()==null) || 
             (this.wifiSettings!=null &&
              this.wifiSettings.equals(other.getWifiSettings())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getDoorLockSettings() != null) {
            _hashCode += getDoorLockSettings().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        _hashCode += (isGeneral() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeviceProductGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceProductGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceProductGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerProduct() != null) {
            _hashCode += getManufacturerProduct().hashCode();
        }
        _hashCode += (isMarkedForDelete() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getPartitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getProductTypeDisplayName() != null) {
            _hashCode += getProductTypeDisplayName().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Float(getTargetTemperature()).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getWifiSettings() != null) {
            _hashCode += getWifiSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HomeDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "homeDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "homeDevice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doorLockSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doorLockSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "doorLockSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("general");
        elemField.setXmlName(new javax.xml.namespace.QName("", "general"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceProductGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceProductGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "productGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturerProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "manufacturerProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markedForDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markedForDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "basePartition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productTypeDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "deviceStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetTemperature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetTemperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifiSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wifiSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiSettings"));
        elemField.setMinOccurs(0);
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
