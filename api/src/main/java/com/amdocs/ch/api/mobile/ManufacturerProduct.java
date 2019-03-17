/**
 * ManufacturerProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ManufacturerProduct  implements java.io.Serializable {
    private java.lang.String manufacturerName;

    private java.lang.String manufacturerProductModel;

    private java.lang.String manufacturerProductName;

    public ManufacturerProduct() {
    }

    public ManufacturerProduct(
           java.lang.String manufacturerName,
           java.lang.String manufacturerProductModel,
           java.lang.String manufacturerProductName) {
           this.manufacturerName = manufacturerName;
           this.manufacturerProductModel = manufacturerProductModel;
           this.manufacturerProductName = manufacturerProductName;
    }


    /**
     * Gets the manufacturerName value for this ManufacturerProduct.
     * 
     * @return manufacturerName
     */
    public java.lang.String getManufacturerName() {
        return manufacturerName;
    }


    /**
     * Sets the manufacturerName value for this ManufacturerProduct.
     * 
     * @param manufacturerName
     */
    public void setManufacturerName(java.lang.String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }


    /**
     * Gets the manufacturerProductModel value for this ManufacturerProduct.
     * 
     * @return manufacturerProductModel
     */
    public java.lang.String getManufacturerProductModel() {
        return manufacturerProductModel;
    }


    /**
     * Sets the manufacturerProductModel value for this ManufacturerProduct.
     * 
     * @param manufacturerProductModel
     */
    public void setManufacturerProductModel(java.lang.String manufacturerProductModel) {
        this.manufacturerProductModel = manufacturerProductModel;
    }


    /**
     * Gets the manufacturerProductName value for this ManufacturerProduct.
     * 
     * @return manufacturerProductName
     */
    public java.lang.String getManufacturerProductName() {
        return manufacturerProductName;
    }


    /**
     * Sets the manufacturerProductName value for this ManufacturerProduct.
     * 
     * @param manufacturerProductName
     */
    public void setManufacturerProductName(java.lang.String manufacturerProductName) {
        this.manufacturerProductName = manufacturerProductName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturerProduct)) return false;
        ManufacturerProduct other = (ManufacturerProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manufacturerName==null && other.getManufacturerName()==null) || 
             (this.manufacturerName!=null &&
              this.manufacturerName.equals(other.getManufacturerName()))) &&
            ((this.manufacturerProductModel==null && other.getManufacturerProductModel()==null) || 
             (this.manufacturerProductModel!=null &&
              this.manufacturerProductModel.equals(other.getManufacturerProductModel()))) &&
            ((this.manufacturerProductName==null && other.getManufacturerProductName()==null) || 
             (this.manufacturerProductName!=null &&
              this.manufacturerProductName.equals(other.getManufacturerProductName())));
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
        if (getManufacturerName() != null) {
            _hashCode += getManufacturerName().hashCode();
        }
        if (getManufacturerProductModel() != null) {
            _hashCode += getManufacturerProductModel().hashCode();
        }
        if (getManufacturerProductName() != null) {
            _hashCode += getManufacturerProductName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturerProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "manufacturerProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerProductModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturerProductModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerProductName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturerProductName"));
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
