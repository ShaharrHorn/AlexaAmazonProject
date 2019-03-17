/**
 * SecurityPanelUserCodesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class SecurityPanelUserCodesResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.SecurityPanelUserCode[] securityPanelUserCodesList;

    public SecurityPanelUserCodesResponse() {
    }

    public SecurityPanelUserCodesResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.SecurityPanelUserCode[] securityPanelUserCodesList) {
        super(
            success,
            faultCode,
            faultDescription);
        this.securityPanelUserCodesList = securityPanelUserCodesList;
    }


    /**
     * Gets the securityPanelUserCodesList value for this SecurityPanelUserCodesResponse.
     * 
     * @return securityPanelUserCodesList
     */
    public com.amdocs.ch.api.mobile.SecurityPanelUserCode[] getSecurityPanelUserCodesList() {
        return securityPanelUserCodesList;
    }


    /**
     * Sets the securityPanelUserCodesList value for this SecurityPanelUserCodesResponse.
     * 
     * @param securityPanelUserCodesList
     */
    public void setSecurityPanelUserCodesList(com.amdocs.ch.api.mobile.SecurityPanelUserCode[] securityPanelUserCodesList) {
        this.securityPanelUserCodesList = securityPanelUserCodesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecurityPanelUserCodesResponse)) return false;
        SecurityPanelUserCodesResponse other = (SecurityPanelUserCodesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.securityPanelUserCodesList==null && other.getSecurityPanelUserCodesList()==null) || 
             (this.securityPanelUserCodesList!=null &&
              java.util.Arrays.equals(this.securityPanelUserCodesList, other.getSecurityPanelUserCodesList())));
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
        if (getSecurityPanelUserCodesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecurityPanelUserCodesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecurityPanelUserCodesList(), i);
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
        new org.apache.axis.description.TypeDesc(SecurityPanelUserCodesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCodesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityPanelUserCodesList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityPanelUserCodesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "securityPanelUserCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "securityPanelUserCodes"));
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
