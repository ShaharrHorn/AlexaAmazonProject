/**
 * UserPreferenceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UserPreferenceResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.UserPreferenceResponseUserPreferencesEntry[] userPreferences;

    public UserPreferenceResponse() {
    }

    public UserPreferenceResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.UserPreferenceResponseUserPreferencesEntry[] userPreferences) {
        super(
            success,
            faultCode,
            faultDescription);
        this.userPreferences = userPreferences;
    }


    /**
     * Gets the userPreferences value for this UserPreferenceResponse.
     * 
     * @return userPreferences
     */
    public com.amdocs.ch.api.mobile.UserPreferenceResponseUserPreferencesEntry[] getUserPreferences() {
        return userPreferences;
    }


    /**
     * Sets the userPreferences value for this UserPreferenceResponse.
     * 
     * @param userPreferences
     */
    public void setUserPreferences(com.amdocs.ch.api.mobile.UserPreferenceResponseUserPreferencesEntry[] userPreferences) {
        this.userPreferences = userPreferences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPreferenceResponse)) return false;
        UserPreferenceResponse other = (UserPreferenceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userPreferences==null && other.getUserPreferences()==null) || 
             (this.userPreferences!=null &&
              java.util.Arrays.equals(this.userPreferences, other.getUserPreferences())));
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
        if (getUserPreferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserPreferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserPreferences(), i);
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
        new org.apache.axis.description.TypeDesc(UserPreferenceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPreferenceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>userPreferenceResponse>userPreferences>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
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
