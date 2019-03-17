/**
 * SecurityPanelUserCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SecurityPanelUserCode  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.Id id;

    private com.amdocs.ch.api.mobile.BasePartition[] partitions;

    private int partitionsBitmask;

    private java.lang.Boolean status;

    private com.amdocs.ch.api.mobile.Id subscriberGatewayId;

    private java.lang.String userCode;

    private java.lang.Integer userCodeId;

    public SecurityPanelUserCode() {
    }

    public SecurityPanelUserCode(
           com.amdocs.ch.api.mobile.Id id,
           com.amdocs.ch.api.mobile.BasePartition[] partitions,
           int partitionsBitmask,
           java.lang.Boolean status,
           com.amdocs.ch.api.mobile.Id subscriberGatewayId,
           java.lang.String userCode,
           java.lang.Integer userCodeId) {
           this.id = id;
           this.partitions = partitions;
           this.partitionsBitmask = partitionsBitmask;
           this.status = status;
           this.subscriberGatewayId = subscriberGatewayId;
           this.userCode = userCode;
           this.userCodeId = userCodeId;
    }


    /**
     * Gets the id value for this SecurityPanelUserCode.
     * 
     * @return id
     */
    public com.amdocs.ch.api.mobile.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this SecurityPanelUserCode.
     * 
     * @param id
     */
    public void setId(com.amdocs.ch.api.mobile.Id id) {
        this.id = id;
    }


    /**
     * Gets the partitions value for this SecurityPanelUserCode.
     * 
     * @return partitions
     */
    public com.amdocs.ch.api.mobile.BasePartition[] getPartitions() {
        return partitions;
    }


    /**
     * Sets the partitions value for this SecurityPanelUserCode.
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
     * Gets the partitionsBitmask value for this SecurityPanelUserCode.
     * 
     * @return partitionsBitmask
     */
    public int getPartitionsBitmask() {
        return partitionsBitmask;
    }


    /**
     * Sets the partitionsBitmask value for this SecurityPanelUserCode.
     * 
     * @param partitionsBitmask
     */
    public void setPartitionsBitmask(int partitionsBitmask) {
        this.partitionsBitmask = partitionsBitmask;
    }


    /**
     * Gets the status value for this SecurityPanelUserCode.
     * 
     * @return status
     */
    public java.lang.Boolean getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SecurityPanelUserCode.
     * 
     * @param status
     */
    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }


    /**
     * Gets the subscriberGatewayId value for this SecurityPanelUserCode.
     * 
     * @return subscriberGatewayId
     */
    public com.amdocs.ch.api.mobile.Id getSubscriberGatewayId() {
        return subscriberGatewayId;
    }


    /**
     * Sets the subscriberGatewayId value for this SecurityPanelUserCode.
     * 
     * @param subscriberGatewayId
     */
    public void setSubscriberGatewayId(com.amdocs.ch.api.mobile.Id subscriberGatewayId) {
        this.subscriberGatewayId = subscriberGatewayId;
    }


    /**
     * Gets the userCode value for this SecurityPanelUserCode.
     * 
     * @return userCode
     */
    public java.lang.String getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this SecurityPanelUserCode.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.String userCode) {
        this.userCode = userCode;
    }


    /**
     * Gets the userCodeId value for this SecurityPanelUserCode.
     * 
     * @return userCodeId
     */
    public java.lang.Integer getUserCodeId() {
        return userCodeId;
    }


    /**
     * Sets the userCodeId value for this SecurityPanelUserCode.
     * 
     * @param userCodeId
     */
    public void setUserCodeId(java.lang.Integer userCodeId) {
        this.userCodeId = userCodeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityPanelUserCode)) return false;
        SecurityPanelUserCode other = (SecurityPanelUserCode) obj;
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
            this.partitionsBitmask == other.getPartitionsBitmask() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subscriberGatewayId==null && other.getSubscriberGatewayId()==null) || 
             (this.subscriberGatewayId!=null &&
              this.subscriberGatewayId.equals(other.getSubscriberGatewayId()))) &&
            ((this.userCode==null && other.getUserCode()==null) || 
             (this.userCode!=null &&
              this.userCode.equals(other.getUserCode()))) &&
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
        _hashCode += getPartitionsBitmask();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubscriberGatewayId() != null) {
            _hashCode += getSubscriberGatewayId().hashCode();
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        if (getUserCodeId() != null) {
            _hashCode += getUserCodeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecurityPanelUserCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField.setFieldName("partitionsBitmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionsBitmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberGatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberGatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
