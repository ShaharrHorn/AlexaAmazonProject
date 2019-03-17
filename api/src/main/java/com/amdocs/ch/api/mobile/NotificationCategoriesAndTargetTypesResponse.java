/**
 * NotificationCategoriesAndTargetTypesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class NotificationCategoriesAndTargetTypesResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.NotificationCategoryTargets[] categoriesToTargets;

    public NotificationCategoriesAndTargetTypesResponse() {
    }

    public NotificationCategoriesAndTargetTypesResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.NotificationCategoryTargets[] categoriesToTargets) {
        super(
            success,
            faultCode,
            faultDescription);
        this.categoriesToTargets = categoriesToTargets;
    }


    /**
     * Gets the categoriesToTargets value for this NotificationCategoriesAndTargetTypesResponse.
     * 
     * @return categoriesToTargets
     */
    public com.amdocs.ch.api.mobile.NotificationCategoryTargets[] getCategoriesToTargets() {
        return categoriesToTargets;
    }


    /**
     * Sets the categoriesToTargets value for this NotificationCategoriesAndTargetTypesResponse.
     * 
     * @param categoriesToTargets
     */
    public void setCategoriesToTargets(com.amdocs.ch.api.mobile.NotificationCategoryTargets[] categoriesToTargets) {
        this.categoriesToTargets = categoriesToTargets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationCategoriesAndTargetTypesResponse)) return false;
        NotificationCategoriesAndTargetTypesResponse other = (NotificationCategoriesAndTargetTypesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.categoriesToTargets==null && other.getCategoriesToTargets()==null) || 
             (this.categoriesToTargets!=null &&
              java.util.Arrays.equals(this.categoriesToTargets, other.getCategoriesToTargets())));
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
        if (getCategoriesToTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoriesToTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoriesToTargets(), i);
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
        new org.apache.axis.description.TypeDesc(NotificationCategoriesAndTargetTypesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategoriesAndTargetTypesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriesToTargets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoriesToTargets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "notificationCategoryTargets"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "categoryToTargets"));
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
