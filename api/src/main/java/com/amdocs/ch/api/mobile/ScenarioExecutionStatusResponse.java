/**
 * ScenarioExecutionStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ScenarioExecutionStatusResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail scenarioExecutionStatus;

    public ScenarioExecutionStatusResponse() {
    }

    public ScenarioExecutionStatusResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail scenarioExecutionStatus) {
        super(
            success,
            faultCode,
            faultDescription);
        this.scenarioExecutionStatus = scenarioExecutionStatus;
    }


    /**
     * Gets the scenarioExecutionStatus value for this ScenarioExecutionStatusResponse.
     * 
     * @return scenarioExecutionStatus
     */
    public com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail getScenarioExecutionStatus() {
        return scenarioExecutionStatus;
    }


    /**
     * Sets the scenarioExecutionStatus value for this ScenarioExecutionStatusResponse.
     * 
     * @param scenarioExecutionStatus
     */
    public void setScenarioExecutionStatus(com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail scenarioExecutionStatus) {
        this.scenarioExecutionStatus = scenarioExecutionStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScenarioExecutionStatusResponse)) return false;
        ScenarioExecutionStatusResponse other = (ScenarioExecutionStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scenarioExecutionStatus==null && other.getScenarioExecutionStatus()==null) || 
             (this.scenarioExecutionStatus!=null &&
              this.scenarioExecutionStatus.equals(other.getScenarioExecutionStatus())));
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
        if (getScenarioExecutionStatus() != null) {
            _hashCode += getScenarioExecutionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScenarioExecutionStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenarioExecutionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scenarioExecutionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatusDetail"));
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
