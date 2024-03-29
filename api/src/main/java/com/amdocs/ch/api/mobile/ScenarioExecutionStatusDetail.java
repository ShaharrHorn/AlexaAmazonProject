/**
 * ScenarioExecutionStatusDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ScenarioExecutionStatusDetail  implements java.io.Serializable {
    private long scenarioId;

    private com.amdocs.ch.api.mobile.ScenarioExecutionStatus status;

    public ScenarioExecutionStatusDetail() {
    }

    public ScenarioExecutionStatusDetail(
           long scenarioId,
           com.amdocs.ch.api.mobile.ScenarioExecutionStatus status) {
           this.scenarioId = scenarioId;
           this.status = status;
    }


    /**
     * Gets the scenarioId value for this ScenarioExecutionStatusDetail.
     * 
     * @return scenarioId
     */
    public long getScenarioId() {
        return scenarioId;
    }


    /**
     * Sets the scenarioId value for this ScenarioExecutionStatusDetail.
     * 
     * @param scenarioId
     */
    public void setScenarioId(long scenarioId) {
        this.scenarioId = scenarioId;
    }


    /**
     * Gets the status value for this ScenarioExecutionStatusDetail.
     * 
     * @return status
     */
    public com.amdocs.ch.api.mobile.ScenarioExecutionStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ScenarioExecutionStatusDetail.
     * 
     * @param status
     */
    public void setStatus(com.amdocs.ch.api.mobile.ScenarioExecutionStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScenarioExecutionStatusDetail)) return false;
        ScenarioExecutionStatusDetail other = (ScenarioExecutionStatusDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.scenarioId == other.getScenarioId() &&
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
        _hashCode += new Long(getScenarioId()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScenarioExecutionStatusDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatusDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenarioId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scenarioId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatus"));
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
