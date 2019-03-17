/**
 * AvailableCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class AvailableCode  implements java.io.Serializable {
    private java.lang.String id;

    private com.amdocs.ch.api.mobile.BasePartition[] partitions;

    private java.lang.String subscriberGatewayId;

    private java.lang.String userCodeId;

    public AvailableCode() {
    }

    public AvailableCode(
           java.lang.String id,
           com.amdocs.ch.api.mobile.BasePartition[] partitions,
           java.lang.String subscriberGatewayId,
           java.lang.String userCodeId) {
           this.id = id;
           this.partitions = partitions;
           this.subscriberGatewayId = subscriberGatewayId;
           this.userCodeId = userCodeId;
    }


    /**
     * Gets the id value for this AvailableCode.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this AvailableCode.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the partitions value for this AvailableCode.
     * 
     * @return partitions
     */
    public com.amdocs.ch.api.mobile.BasePartition[] getPartitions() {
        return partitions;
    }


    /**
     * Sets the partitions value for this AvailableCode.
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
     * Gets the subscriberGatewayId value for this AvailableCode.
     * 
     * @return subscriberGatewayId
     */
    public java.lang.String getSubscriberGatewayId() {
        return subscriberGatewayId;
    }


    /**
     * Sets the subscriberGatewayId value for this AvailableCode.
     * 
     * @param subscriberGatewayId
     */
    public void setSubscriberGatewayId(java.lang.String subscriberGatewayId) {
        this.subscriberGatewayId = subscriberGatewayId;
    }


    /**
     * Gets the userCodeId value for this AvailableCode.
     * 
     * @return userCodeId
     */
    public java.lang.String getUserCodeId() {
        return userCodeId;
    }


    /**
     * Sets the userCodeId value for this AvailableCode.
     * 
     * @param userCodeId
     */
    public void setUserCodeId(java.lang.String userCodeId) {
        this.userCodeId = userCodeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailableCode)) return false;
        AvailableCode other = (AvailableCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.partitions==null && other.getPartitions()==null) || 
             (this.partitions!=null &&
              java.util.Arrays.equals(this.partitions, other.getPartitions()))) &&
            ((this.subscriberGatewayId==null && other.getSubscriberGatewayId()==null) || 
             (this.subscriberGatewayId!=null &&
              this.subscriberGatewayId.equals(other.getSubscriberGatewayId()))) &&
            ((this.userCodeId==null && other.getUserCodeId()==null) || 
             (this.userCodeId!=null &&
              this.userCodeId.equals(other.getUserCodeId())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
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
        if (getSubscriberGatewayId() != null) {
            _hashCode += getSubscriberGatewayId().hashCode();
        }
        if (getUserCodeId() != null) {
            _hashCode += getUserCodeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailableCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "availableCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("subscriberGatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberGatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCodeId"));
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
