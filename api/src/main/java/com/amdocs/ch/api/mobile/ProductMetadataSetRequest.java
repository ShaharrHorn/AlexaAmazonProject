/**
 * ProductMetadataSetRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ProductMetadataSetRequest  implements java.io.Serializable {
    private long gatewayId;

    private java.lang.String[] productTypes;

    public ProductMetadataSetRequest() {
    }

    public ProductMetadataSetRequest(
           long gatewayId,
           java.lang.String[] productTypes) {
           this.gatewayId = gatewayId;
           this.productTypes = productTypes;
    }


    /**
     * Gets the gatewayId value for this ProductMetadataSetRequest.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this ProductMetadataSetRequest.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the productTypes value for this ProductMetadataSetRequest.
     * 
     * @return productTypes
     */
    public java.lang.String[] getProductTypes() {
        return productTypes;
    }


    /**
     * Sets the productTypes value for this ProductMetadataSetRequest.
     * 
     * @param productTypes
     */
    public void setProductTypes(java.lang.String[] productTypes) {
        this.productTypes = productTypes;
    }

    public java.lang.String getProductTypes(int i) {
        return this.productTypes[i];
    }

    public void setProductTypes(int i, java.lang.String _value) {
        this.productTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductMetadataSetRequest)) return false;
        ProductMetadataSetRequest other = (ProductMetadataSetRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gatewayId == other.getGatewayId() &&
            ((this.productTypes==null && other.getProductTypes()==null) || 
             (this.productTypes!=null &&
              java.util.Arrays.equals(this.productTypes, other.getProductTypes())));
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
        _hashCode += new Long(getGatewayId()).hashCode();
        if (getProductTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductMetadataSetRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadataSetRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
