/**
 * UserPermissionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class UserPermissionsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.CustomerPermissions[] permissionsList;

    public UserPermissionsResponse() {
    }

    public UserPermissionsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.CustomerPermissions[] permissionsList) {
        super(
            success,
            faultCode,
            faultDescription);
        this.permissionsList = permissionsList;
    }


    /**
     * Gets the permissionsList value for this UserPermissionsResponse.
     * 
     * @return permissionsList
     */
    public com.amdocs.ch.api.mobile.CustomerPermissions[] getPermissionsList() {
        return permissionsList;
    }


    /**
     * Sets the permissionsList value for this UserPermissionsResponse.
     * 
     * @param permissionsList
     */
    public void setPermissionsList(com.amdocs.ch.api.mobile.CustomerPermissions[] permissionsList) {
        this.permissionsList = permissionsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPermissionsResponse)) return false;
        UserPermissionsResponse other = (UserPermissionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.permissionsList==null && other.getPermissionsList()==null) || 
             (this.permissionsList!=null &&
              java.util.Arrays.equals(this.permissionsList, other.getPermissionsList())));
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
        if (getPermissionsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissionsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissionsList(), i);
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
        new org.apache.axis.description.TypeDesc(UserPermissionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "userPermissionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerPermissions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "permission"));
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
