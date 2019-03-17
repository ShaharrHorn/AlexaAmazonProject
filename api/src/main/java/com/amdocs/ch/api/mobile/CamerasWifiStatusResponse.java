/**
 * CamerasWifiStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CamerasWifiStatusResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.WifiStatusDetails[] wifiStatusDetailsList;

    public CamerasWifiStatusResponse() {
    }

    public CamerasWifiStatusResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.WifiStatusDetails[] wifiStatusDetailsList) {
        super(
            success,
            faultCode,
            faultDescription);
        this.wifiStatusDetailsList = wifiStatusDetailsList;
    }


    /**
     * Gets the wifiStatusDetailsList value for this CamerasWifiStatusResponse.
     * 
     * @return wifiStatusDetailsList
     */
    public com.amdocs.ch.api.mobile.WifiStatusDetails[] getWifiStatusDetailsList() {
        return wifiStatusDetailsList;
    }


    /**
     * Sets the wifiStatusDetailsList value for this CamerasWifiStatusResponse.
     * 
     * @param wifiStatusDetailsList
     */
    public void setWifiStatusDetailsList(com.amdocs.ch.api.mobile.WifiStatusDetails[] wifiStatusDetailsList) {
        this.wifiStatusDetailsList = wifiStatusDetailsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CamerasWifiStatusResponse)) return false;
        CamerasWifiStatusResponse other = (CamerasWifiStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.wifiStatusDetailsList==null && other.getWifiStatusDetailsList()==null) || 
             (this.wifiStatusDetailsList!=null &&
              java.util.Arrays.equals(this.wifiStatusDetailsList, other.getWifiStatusDetailsList())));
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
        if (getWifiStatusDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWifiStatusDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWifiStatusDetailsList(), i);
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
        new org.apache.axis.description.TypeDesc(CamerasWifiStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "camerasWifiStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifiStatusDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wifiStatusDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiStatusDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "wifiStatusDetails"));
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
