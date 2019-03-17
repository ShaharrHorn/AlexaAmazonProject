/**
 * CameraAdvancedSettingsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CameraAdvancedSettingsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.CameraVideoQuality[] cameraVideoQualityDetailsList;

    public CameraAdvancedSettingsResponse() {
    }

    public CameraAdvancedSettingsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.CameraVideoQuality[] cameraVideoQualityDetailsList) {
        super(
            success,
            faultCode,
            faultDescription);
        this.cameraVideoQualityDetailsList = cameraVideoQualityDetailsList;
    }


    /**
     * Gets the cameraVideoQualityDetailsList value for this CameraAdvancedSettingsResponse.
     * 
     * @return cameraVideoQualityDetailsList
     */
    public com.amdocs.ch.api.mobile.CameraVideoQuality[] getCameraVideoQualityDetailsList() {
        return cameraVideoQualityDetailsList;
    }


    /**
     * Sets the cameraVideoQualityDetailsList value for this CameraAdvancedSettingsResponse.
     * 
     * @param cameraVideoQualityDetailsList
     */
    public void setCameraVideoQualityDetailsList(com.amdocs.ch.api.mobile.CameraVideoQuality[] cameraVideoQualityDetailsList) {
        this.cameraVideoQualityDetailsList = cameraVideoQualityDetailsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CameraAdvancedSettingsResponse)) return false;
        CameraAdvancedSettingsResponse other = (CameraAdvancedSettingsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cameraVideoQualityDetailsList==null && other.getCameraVideoQualityDetailsList()==null) || 
             (this.cameraVideoQualityDetailsList!=null &&
              java.util.Arrays.equals(this.cameraVideoQualityDetailsList, other.getCameraVideoQualityDetailsList())));
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
        if (getCameraVideoQualityDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCameraVideoQualityDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCameraVideoQualityDetailsList(), i);
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
        new org.apache.axis.description.TypeDesc(CameraAdvancedSettingsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraAdvancedSettingsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraVideoQualityDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cameraVideoQualityDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "cameraVideoQuality"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "cameraVideoQualityDetails"));
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
