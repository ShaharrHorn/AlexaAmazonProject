/**
 * BasePartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class BasePartition  implements java.io.Serializable {
    private java.lang.String displayName;

    private com.amdocs.ch.api.mobile.Id partitionId;

    private java.lang.String partitionName;

    public BasePartition() {
    }

    public BasePartition(
           java.lang.String displayName,
           com.amdocs.ch.api.mobile.Id partitionId,
           java.lang.String partitionName) {
           this.displayName = displayName;
           this.partitionId = partitionId;
           this.partitionName = partitionName;
    }


    /**
     * Gets the displayName value for this BasePartition.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this BasePartition.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the partitionId value for this BasePartition.
     * 
     * @return partitionId
     */
    public com.amdocs.ch.api.mobile.Id getPartitionId() {
        return partitionId;
    }


    /**
     * Sets the partitionId value for this BasePartition.
     * 
     * @param partitionId
     */
    public void setPartitionId(com.amdocs.ch.api.mobile.Id partitionId) {
        this.partitionId = partitionId;
    }


    /**
     * Gets the partitionName value for this BasePartition.
     * 
     * @return partitionName
     */
    public java.lang.String getPartitionName() {
        return partitionName;
    }


    /**
     * Sets the partitionName value for this BasePartition.
     * 
     * @param partitionName
     */
    public void setPartitionName(java.lang.String partitionName) {
        this.partitionName = partitionName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BasePartition)) return false;
        BasePartition other = (BasePartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.partitionId==null && other.getPartitionId()==null) || 
             (this.partitionId!=null &&
              this.partitionId.equals(other.getPartitionId()))) &&
            ((this.partitionName==null && other.getPartitionName()==null) || 
             (this.partitionName!=null &&
              this.partitionName.equals(other.getPartitionName())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getPartitionId() != null) {
            _hashCode += getPartitionId().hashCode();
        }
        if (getPartitionName() != null) {
            _hashCode += getPartitionName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BasePartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "basePartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionName"));
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
