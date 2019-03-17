/**
 * ScenarioBaseDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ScenarioBaseDetails  implements java.io.Serializable {
    private java.lang.String backgroundPictureName;

    private com.amdocs.ch.api.mobile.Id gatewayId;

    private com.amdocs.ch.api.mobile.Id id;

    private java.lang.String name;

    private com.amdocs.ch.api.mobile.ScenarioStatus status;

    public ScenarioBaseDetails() {
    }

    public ScenarioBaseDetails(
           java.lang.String backgroundPictureName,
           com.amdocs.ch.api.mobile.Id gatewayId,
           com.amdocs.ch.api.mobile.Id id,
           java.lang.String name,
           com.amdocs.ch.api.mobile.ScenarioStatus status) {
           this.backgroundPictureName = backgroundPictureName;
           this.gatewayId = gatewayId;
           this.id = id;
           this.name = name;
           this.status = status;
    }


    /**
     * Gets the backgroundPictureName value for this ScenarioBaseDetails.
     * 
     * @return backgroundPictureName
     */
    public java.lang.String getBackgroundPictureName() {
        return backgroundPictureName;
    }


    /**
     * Sets the backgroundPictureName value for this ScenarioBaseDetails.
     * 
     * @param backgroundPictureName
     */
    public void setBackgroundPictureName(java.lang.String backgroundPictureName) {
        this.backgroundPictureName = backgroundPictureName;
    }


    /**
     * Gets the gatewayId value for this ScenarioBaseDetails.
     * 
     * @return gatewayId
     */
    public com.amdocs.ch.api.mobile.Id getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this ScenarioBaseDetails.
     * 
     * @param gatewayId
     */
    public void setGatewayId(com.amdocs.ch.api.mobile.Id gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the id value for this ScenarioBaseDetails.
     * 
     * @return id
     */
    public com.amdocs.ch.api.mobile.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this ScenarioBaseDetails.
     * 
     * @param id
     */
    public void setId(com.amdocs.ch.api.mobile.Id id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ScenarioBaseDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ScenarioBaseDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this ScenarioBaseDetails.
     * 
     * @return status
     */
    public com.amdocs.ch.api.mobile.ScenarioStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ScenarioBaseDetails.
     * 
     * @param status
     */
    public void setStatus(com.amdocs.ch.api.mobile.ScenarioStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScenarioBaseDetails)) return false;
        ScenarioBaseDetails other = (ScenarioBaseDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.backgroundPictureName==null && other.getBackgroundPictureName()==null) || 
             (this.backgroundPictureName!=null &&
              this.backgroundPictureName.equals(other.getBackgroundPictureName()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
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
        if (getBackgroundPictureName() != null) {
            _hashCode += getBackgroundPictureName().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScenarioBaseDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioBaseDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundPictureName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backgroundPictureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioStatus"));
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
