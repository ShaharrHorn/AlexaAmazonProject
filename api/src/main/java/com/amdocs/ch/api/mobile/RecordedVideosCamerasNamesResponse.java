/**
 * RecordedVideosCamerasNamesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class RecordedVideosCamerasNamesResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private java.lang.String[] deviceNames;

    public RecordedVideosCamerasNamesResponse() {
    }

    public RecordedVideosCamerasNamesResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           java.lang.String[] deviceNames) {
        super(
            success,
            faultCode,
            faultDescription);
        this.deviceNames = deviceNames;
    }


    /**
     * Gets the deviceNames value for this RecordedVideosCamerasNamesResponse.
     * 
     * @return deviceNames
     */
    public java.lang.String[] getDeviceNames() {
        return deviceNames;
    }


    /**
     * Sets the deviceNames value for this RecordedVideosCamerasNamesResponse.
     * 
     * @param deviceNames
     */
    public void setDeviceNames(java.lang.String[] deviceNames) {
        this.deviceNames = deviceNames;
    }

    public java.lang.String getDeviceNames(int i) {
        return this.deviceNames[i];
    }

    public void setDeviceNames(int i, java.lang.String _value) {
        this.deviceNames[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordedVideosCamerasNamesResponse)) return false;
        RecordedVideosCamerasNamesResponse other = (RecordedVideosCamerasNamesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceNames==null && other.getDeviceNames()==null) || 
             (this.deviceNames!=null &&
              java.util.Arrays.equals(this.deviceNames, other.getDeviceNames())));
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
        if (getDeviceNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceNames(), i);
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
        new org.apache.axis.description.TypeDesc(RecordedVideosCamerasNamesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "recordedVideosCamerasNamesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceNames"));
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
