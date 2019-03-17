/**
 * ProductMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ProductMetadata  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.ProductCharacteristic[] characteristics;

    private java.lang.String[] childProducts;

    private com.amdocs.ch.api.mobile.ProductGroup[] productGroups;

    private boolean hasPairingFunctionality;

    private boolean hasUnpairingFunctionality;

    private com.amdocs.ch.api.mobile.PairingFunctionalityType pairingFunctionalityType;

    private long pairingTimeout;

    private com.amdocs.ch.api.mobile.ProtocolName[] protocols;

    private com.amdocs.ch.api.mobile.ProductStatus status;

    private java.lang.String type;

    private long unpairingTimeout;

    public ProductMetadata() {
    }

    public ProductMetadata(
           com.amdocs.ch.api.mobile.ProductCharacteristic[] characteristics,
           java.lang.String[] childProducts,
           com.amdocs.ch.api.mobile.ProductGroup[] productGroups,
           boolean hasPairingFunctionality,
           boolean hasUnpairingFunctionality,
           com.amdocs.ch.api.mobile.PairingFunctionalityType pairingFunctionalityType,
           long pairingTimeout,
           com.amdocs.ch.api.mobile.ProtocolName[] protocols,
           com.amdocs.ch.api.mobile.ProductStatus status,
           java.lang.String type,
           long unpairingTimeout) {
           this.characteristics = characteristics;
           this.childProducts = childProducts;
           this.productGroups = productGroups;
           this.hasPairingFunctionality = hasPairingFunctionality;
           this.hasUnpairingFunctionality = hasUnpairingFunctionality;
           this.pairingFunctionalityType = pairingFunctionalityType;
           this.pairingTimeout = pairingTimeout;
           this.protocols = protocols;
           this.status = status;
           this.type = type;
           this.unpairingTimeout = unpairingTimeout;
    }


    /**
     * Gets the characteristics value for this ProductMetadata.
     * 
     * @return characteristics
     */
    public com.amdocs.ch.api.mobile.ProductCharacteristic[] getCharacteristics() {
        return characteristics;
    }


    /**
     * Sets the characteristics value for this ProductMetadata.
     * 
     * @param characteristics
     */
    public void setCharacteristics(com.amdocs.ch.api.mobile.ProductCharacteristic[] characteristics) {
        this.characteristics = characteristics;
    }


    /**
     * Gets the childProducts value for this ProductMetadata.
     * 
     * @return childProducts
     */
    public java.lang.String[] getChildProducts() {
        return childProducts;
    }


    /**
     * Sets the childProducts value for this ProductMetadata.
     * 
     * @param childProducts
     */
    public void setChildProducts(java.lang.String[] childProducts) {
        this.childProducts = childProducts;
    }


    /**
     * Gets the productGroups value for this ProductMetadata.
     * 
     * @return productGroups
     */
    public com.amdocs.ch.api.mobile.ProductGroup[] getProductGroups() {
        return productGroups;
    }


    /**
     * Sets the productGroups value for this ProductMetadata.
     * 
     * @param productGroups
     */
    public void setProductGroups(com.amdocs.ch.api.mobile.ProductGroup[] productGroups) {
        this.productGroups = productGroups;
    }


    /**
     * Gets the hasPairingFunctionality value for this ProductMetadata.
     * 
     * @return hasPairingFunctionality
     */
    public boolean isHasPairingFunctionality() {
        return hasPairingFunctionality;
    }


    /**
     * Sets the hasPairingFunctionality value for this ProductMetadata.
     * 
     * @param hasPairingFunctionality
     */
    public void setHasPairingFunctionality(boolean hasPairingFunctionality) {
        this.hasPairingFunctionality = hasPairingFunctionality;
    }


    /**
     * Gets the hasUnpairingFunctionality value for this ProductMetadata.
     * 
     * @return hasUnpairingFunctionality
     */
    public boolean isHasUnpairingFunctionality() {
        return hasUnpairingFunctionality;
    }


    /**
     * Sets the hasUnpairingFunctionality value for this ProductMetadata.
     * 
     * @param hasUnpairingFunctionality
     */
    public void setHasUnpairingFunctionality(boolean hasUnpairingFunctionality) {
        this.hasUnpairingFunctionality = hasUnpairingFunctionality;
    }


    /**
     * Gets the pairingFunctionalityType value for this ProductMetadata.
     * 
     * @return pairingFunctionalityType
     */
    public com.amdocs.ch.api.mobile.PairingFunctionalityType getPairingFunctionalityType() {
        return pairingFunctionalityType;
    }


    /**
     * Sets the pairingFunctionalityType value for this ProductMetadata.
     * 
     * @param pairingFunctionalityType
     */
    public void setPairingFunctionalityType(com.amdocs.ch.api.mobile.PairingFunctionalityType pairingFunctionalityType) {
        this.pairingFunctionalityType = pairingFunctionalityType;
    }


    /**
     * Gets the pairingTimeout value for this ProductMetadata.
     * 
     * @return pairingTimeout
     */
    public long getPairingTimeout() {
        return pairingTimeout;
    }


    /**
     * Sets the pairingTimeout value for this ProductMetadata.
     * 
     * @param pairingTimeout
     */
    public void setPairingTimeout(long pairingTimeout) {
        this.pairingTimeout = pairingTimeout;
    }


    /**
     * Gets the protocols value for this ProductMetadata.
     * 
     * @return protocols
     */
    public com.amdocs.ch.api.mobile.ProtocolName[] getProtocols() {
        return protocols;
    }


    /**
     * Sets the protocols value for this ProductMetadata.
     * 
     * @param protocols
     */
    public void setProtocols(com.amdocs.ch.api.mobile.ProtocolName[] protocols) {
        this.protocols = protocols;
    }


    /**
     * Gets the status value for this ProductMetadata.
     * 
     * @return status
     */
    public com.amdocs.ch.api.mobile.ProductStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProductMetadata.
     * 
     * @param status
     */
    public void setStatus(com.amdocs.ch.api.mobile.ProductStatus status) {
        this.status = status;
    }


    /**
     * Gets the type value for this ProductMetadata.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ProductMetadata.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the unpairingTimeout value for this ProductMetadata.
     * 
     * @return unpairingTimeout
     */
    public long getUnpairingTimeout() {
        return unpairingTimeout;
    }


    /**
     * Sets the unpairingTimeout value for this ProductMetadata.
     * 
     * @param unpairingTimeout
     */
    public void setUnpairingTimeout(long unpairingTimeout) {
        this.unpairingTimeout = unpairingTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductMetadata)) return false;
        ProductMetadata other = (ProductMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.characteristics==null && other.getCharacteristics()==null) || 
             (this.characteristics!=null &&
              java.util.Arrays.equals(this.characteristics, other.getCharacteristics()))) &&
            ((this.childProducts==null && other.getChildProducts()==null) || 
             (this.childProducts!=null &&
              java.util.Arrays.equals(this.childProducts, other.getChildProducts()))) &&
            ((this.productGroups==null && other.getProductGroups()==null) || 
             (this.productGroups!=null &&
              java.util.Arrays.equals(this.productGroups, other.getProductGroups()))) &&
            this.hasPairingFunctionality == other.isHasPairingFunctionality() &&
            this.hasUnpairingFunctionality == other.isHasUnpairingFunctionality() &&
            ((this.pairingFunctionalityType==null && other.getPairingFunctionalityType()==null) || 
             (this.pairingFunctionalityType!=null &&
              this.pairingFunctionalityType.equals(other.getPairingFunctionalityType()))) &&
            this.pairingTimeout == other.getPairingTimeout() &&
            ((this.protocols==null && other.getProtocols()==null) || 
             (this.protocols!=null &&
              java.util.Arrays.equals(this.protocols, other.getProtocols()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.unpairingTimeout == other.getUnpairingTimeout();
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
        if (getCharacteristics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCharacteristics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCharacteristics(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChildProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isHasPairingFunctionality() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasUnpairingFunctionality() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPairingFunctionalityType() != null) {
            _hashCode += getPairingFunctionalityType().hashCode();
        }
        _hashCode += new Long(getPairingTimeout()).hashCode();
        if (getProtocols() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtocols());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtocols(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Long(getUnpairingTimeout()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("characteristics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "characteristics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productCharacteristic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "characteristic"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "name"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "group"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPairingFunctionality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasPairingFunctionality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasUnpairingFunctionality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasUnpairingFunctionality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pairingFunctionalityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pairingFunctionalityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "pairingFunctionalityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pairingTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pairingTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocols");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocols"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "protocolName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "protocolName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productStatus"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("unpairingTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpairingTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
