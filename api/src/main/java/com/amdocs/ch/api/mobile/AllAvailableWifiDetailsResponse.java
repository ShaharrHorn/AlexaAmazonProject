/**
 * AllAvailableWifiDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class AllAvailableWifiDetailsResponse  extends com.amdocs.ch.api.mobile.MobileHomeServiceResponse  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.WifiScanDetails[] wifiScanDetailsList;

    public AllAvailableWifiDetailsResponse() {
    }

    public AllAvailableWifiDetailsResponse(
           boolean success,
           java.lang.String faultCode,
           java.lang.String faultDescription,
           com.amdocs.ch.api.mobile.WifiScanDetails[] wifiScanDetailsList) {
        super(
            success,
            faultCode,
            faultDescription);
        this.wifiScanDetailsList = wifiScanDetailsList;
    }


    /**
     * Gets the wifiScanDetailsList value for this AllAvailableWifiDetailsResponse.
     * 
     * @return wifiScanDetailsList
     */
    public com.amdocs.ch.api.mobile.WifiScanDetails[] getWifiScanDetailsList() {
        return wifiScanDetailsList;
    }


    /**
     * Sets the wifiScanDetailsList value for this AllAvailableWifiDetailsResponse.
     * 
     * @param wifiScanDetailsList
     */
    public void setWifiScanDetailsList(com.amdocs.ch.api.mobile.WifiScanDetails[] wifiScanDetailsList) {
        this.wifiScanDetailsList = wifiScanDetailsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllAvailableWifiDetailsResponse)) return false;
        AllAvailableWifiDetailsResponse other = (AllAvailableWifiDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.wifiScanDetailsList==null && other.getWifiScanDetailsList()==null) || 
             (this.wifiScanDetailsList!=null &&
              java.util.Arrays.equals(this.wifiScanDetailsList, other.getWifiScanDetailsList())));
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
        if (getWifiScanDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWifiScanDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWifiScanDetailsList(), i);
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
        new org.apache.axis.description.TypeDesc(AllAvailableWifiDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "allAvailableWifiDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifiScanDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wifiScanDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiScanDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "wifiScanDetails"));
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
