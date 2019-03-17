/**
 * SecurityDevicesHavingAdvancedSettingsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SecurityDevicesHavingAdvancedSettingsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.Id[] securityDeviceIdList;

    public SecurityDevicesHavingAdvancedSettingsResponse() {
    }

    public SecurityDevicesHavingAdvancedSettingsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.Id[] securityDeviceIdList) {
        super(
            success,
            faultCode,
            faultDescription);
        this.securityDeviceIdList = securityDeviceIdList;
    }


    /**
     * Gets the securityDeviceIdList value for this SecurityDevicesHavingAdvancedSettingsResponse.
     * 
     * @return securityDeviceIdList
     */
    public com.amdocs.ch.api.mobile.Id[] getSecurityDeviceIdList() {
        return securityDeviceIdList;
    }


    /**
     * Sets the securityDeviceIdList value for this SecurityDevicesHavingAdvancedSettingsResponse.
     * 
     * @param securityDeviceIdList
     */
    public void setSecurityDeviceIdList(com.amdocs.ch.api.mobile.Id[] securityDeviceIdList) {
        this.securityDeviceIdList = securityDeviceIdList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityDevicesHavingAdvancedSettingsResponse)) return false;
        SecurityDevicesHavingAdvancedSettingsResponse other = (SecurityDevicesHavingAdvancedSettingsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.securityDeviceIdList==null && other.getSecurityDeviceIdList()==null) || 
             (this.securityDeviceIdList!=null &&
              java.util.Arrays.equals(this.securityDeviceIdList, other.getSecurityDeviceIdList())));
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
        if (getSecurityDeviceIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecurityDeviceIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecurityDeviceIdList(), i);
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
        new org.apache.axis.description.TypeDesc(SecurityDevicesHavingAdvancedSettingsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityDevicesHavingAdvancedSettingsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityDeviceIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityDeviceIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "securityDeviceId"));
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
