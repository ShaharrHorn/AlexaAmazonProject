/**
 * ProductMetadataSetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ProductMetadataSetResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.ProductMetadata[] productMetadatas;

    public ProductMetadataSetResponse() {
    }

    public ProductMetadataSetResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.ProductMetadata[] productMetadatas) {
        super(
            success,
            faultCode,
            faultDescription);
        this.productMetadatas = productMetadatas;
    }


    /**
     * Gets the productMetadatas value for this ProductMetadataSetResponse.
     * 
     * @return productMetadatas
     */
    public com.amdocs.ch.api.mobile.ProductMetadata[] getProductMetadatas() {
        return productMetadatas;
    }


    /**
     * Sets the productMetadatas value for this ProductMetadataSetResponse.
     * 
     * @param productMetadatas
     */
    public void setProductMetadatas(com.amdocs.ch.api.mobile.ProductMetadata[] productMetadatas) {
        this.productMetadatas = productMetadatas;
    }

    public com.amdocs.ch.api.mobile.ProductMetadata getProductMetadatas(int i) {
        return this.productMetadatas[i];
    }

    public void setProductMetadatas(int i, com.amdocs.ch.api.mobile.ProductMetadata _value) {
        this.productMetadatas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductMetadataSetResponse)) return false;
        ProductMetadataSetResponse other = (ProductMetadataSetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productMetadatas==null && other.getProductMetadatas()==null) || 
             (this.productMetadatas!=null &&
              java.util.Arrays.equals(this.productMetadatas, other.getProductMetadatas())));
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
        if (getProductMetadatas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductMetadatas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductMetadatas(), i);
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
        new org.apache.axis.description.TypeDesc(ProductMetadataSetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadataSetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productMetadatas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productMetadatas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "productMetadata"));
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
