/**
 * AllScenariosExecutionStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class AllScenariosExecutionStatusResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail[] allScenariosStatus;

    public AllScenariosExecutionStatusResponse() {
    }

    public AllScenariosExecutionStatusResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail[] allScenariosStatus) {
        super(
            success,
            faultCode,
            faultDescription);
        this.allScenariosStatus = allScenariosStatus;
    }


    /**
     * Gets the allScenariosStatus value for this AllScenariosExecutionStatusResponse.
     * 
     * @return allScenariosStatus
     */
    public com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail[] getAllScenariosStatus() {
        return allScenariosStatus;
    }


    /**
     * Sets the allScenariosStatus value for this AllScenariosExecutionStatusResponse.
     * 
     * @param allScenariosStatus
     */
    public void setAllScenariosStatus(com.amdocs.ch.api.mobile.ScenarioExecutionStatusDetail[] allScenariosStatus) {
        this.allScenariosStatus = allScenariosStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllScenariosExecutionStatusResponse)) return false;
        AllScenariosExecutionStatusResponse other = (AllScenariosExecutionStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allScenariosStatus==null && other.getAllScenariosStatus()==null) || 
             (this.allScenariosStatus!=null &&
              java.util.Arrays.equals(this.allScenariosStatus, other.getAllScenariosStatus())));
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
        if (getAllScenariosStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllScenariosStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllScenariosStatus(), i);
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
        new org.apache.axis.description.TypeDesc(AllScenariosExecutionStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allScenariosExecutionStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allScenariosStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allScenariosStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatusDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "scenarioStatus"));
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
