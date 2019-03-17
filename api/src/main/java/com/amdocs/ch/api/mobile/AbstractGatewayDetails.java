/**
 * AbstractGatewayDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public abstract class AbstractGatewayDetails  implements java.io.Serializable {
    private java.lang.String firmwareVersion;

    private java.lang.String imei;

    private java.lang.String manufacturerName;

    private java.lang.String model;

    private java.lang.String packageNumber;

    private java.lang.String serial;

    private java.lang.String status;

    public AbstractGatewayDetails() {
    }

    public AbstractGatewayDetails(
           java.lang.String firmwareVersion,
           java.lang.String imei,
           java.lang.String manufacturerName,
           java.lang.String model,
           java.lang.String packageNumber,
           java.lang.String serial,
           java.lang.String status) {
           this.firmwareVersion = firmwareVersion;
           this.imei = imei;
           this.manufacturerName = manufacturerName;
           this.model = model;
           this.packageNumber = packageNumber;
           this.serial = serial;
           this.status = status;
    }


    /**
     * Gets the firmwareVersion value for this AbstractGatewayDetails.
     * 
     * @return firmwareVersion
     */
    public java.lang.String getFirmwareVersion() {
        return firmwareVersion;
    }


    /**
     * Sets the firmwareVersion value for this AbstractGatewayDetails.
     * 
     * @param firmwareVersion
     */
    public void setFirmwareVersion(java.lang.String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }


    /**
     * Gets the imei value for this AbstractGatewayDetails.
     * 
     * @return imei
     */
    public java.lang.String getImei() {
        return imei;
    }


    /**
     * Sets the imei value for this AbstractGatewayDetails.
     * 
     * @param imei
     */
    public void setImei(java.lang.String imei) {
        this.imei = imei;
    }


    /**
     * Gets the manufacturerName value for this AbstractGatewayDetails.
     * 
     * @return manufacturerName
     */
    public java.lang.String getManufacturerName() {
        return manufacturerName;
    }


    /**
     * Sets the manufacturerName value for this AbstractGatewayDetails.
     * 
     * @param manufacturerName
     */
    public void setManufacturerName(java.lang.String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }


    /**
     * Gets the model value for this AbstractGatewayDetails.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this AbstractGatewayDetails.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the packageNumber value for this AbstractGatewayDetails.
     * 
     * @return packageNumber
     */
    public java.lang.String getPackageNumber() {
        return packageNumber;
    }


    /**
     * Sets the packageNumber value for this AbstractGatewayDetails.
     * 
     * @param packageNumber
     */
    public void setPackageNumber(java.lang.String packageNumber) {
        this.packageNumber = packageNumber;
    }


    /**
     * Gets the serial value for this AbstractGatewayDetails.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this AbstractGatewayDetails.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the status value for this AbstractGatewayDetails.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AbstractGatewayDetails.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractGatewayDetails)) return false;
        AbstractGatewayDetails other = (AbstractGatewayDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firmwareVersion==null && other.getFirmwareVersion()==null) || 
             (this.firmwareVersion!=null &&
              this.firmwareVersion.equals(other.getFirmwareVersion()))) &&
            ((this.imei==null && other.getImei()==null) || 
             (this.imei!=null &&
              this.imei.equals(other.getImei()))) &&
            ((this.manufacturerName==null && other.getManufacturerName()==null) || 
             (this.manufacturerName!=null &&
              this.manufacturerName.equals(other.getManufacturerName()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.packageNumber==null && other.getPackageNumber()==null) || 
             (this.packageNumber!=null &&
              this.packageNumber.equals(other.getPackageNumber()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getFirmwareVersion() != null) {
            _hashCode += getFirmwareVersion().hashCode();
        }
        if (getImei() != null) {
            _hashCode += getImei().hashCode();
        }
        if (getManufacturerName() != null) {
            _hashCode += getManufacturerName().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getPackageNumber() != null) {
            _hashCode += getPackageNumber().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AbstractGatewayDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "abstractGatewayDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imei");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imei"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packageNumber"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
