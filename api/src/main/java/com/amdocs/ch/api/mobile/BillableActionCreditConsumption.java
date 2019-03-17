/**
 * BillableActionCreditConsumption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class BillableActionCreditConsumption  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.BillableActionType actionType;

    private int consumedCredits;

    private com.amdocs.ch.api.mobile.BillableActionCreditConsumptionCreaditPerDateEntry[] creaditPerDate;

    public BillableActionCreditConsumption() {
    }

    public BillableActionCreditConsumption(
           com.amdocs.ch.api.mobile.BillableActionType actionType,
           int consumedCredits,
           com.amdocs.ch.api.mobile.BillableActionCreditConsumptionCreaditPerDateEntry[] creaditPerDate) {
           this.actionType = actionType;
           this.consumedCredits = consumedCredits;
           this.creaditPerDate = creaditPerDate;
    }


    /**
     * Gets the actionType value for this BillableActionCreditConsumption.
     * 
     * @return actionType
     */
    public com.amdocs.ch.api.mobile.BillableActionType getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this BillableActionCreditConsumption.
     * 
     * @param actionType
     */
    public void setActionType(com.amdocs.ch.api.mobile.BillableActionType actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the consumedCredits value for this BillableActionCreditConsumption.
     * 
     * @return consumedCredits
     */
    public int getConsumedCredits() {
        return consumedCredits;
    }


    /**
     * Sets the consumedCredits value for this BillableActionCreditConsumption.
     * 
     * @param consumedCredits
     */
    public void setConsumedCredits(int consumedCredits) {
        this.consumedCredits = consumedCredits;
    }


    /**
     * Gets the creaditPerDate value for this BillableActionCreditConsumption.
     * 
     * @return creaditPerDate
     */
    public com.amdocs.ch.api.mobile.BillableActionCreditConsumptionCreaditPerDateEntry[] getCreaditPerDate() {
        return creaditPerDate;
    }


    /**
     * Sets the creaditPerDate value for this BillableActionCreditConsumption.
     * 
     * @param creaditPerDate
     */
    public void setCreaditPerDate(com.amdocs.ch.api.mobile.BillableActionCreditConsumptionCreaditPerDateEntry[] creaditPerDate) {
        this.creaditPerDate = creaditPerDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillableActionCreditConsumption)) return false;
        BillableActionCreditConsumption other = (BillableActionCreditConsumption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            this.consumedCredits == other.getConsumedCredits() &&
            ((this.creaditPerDate==null && other.getCreaditPerDate()==null) || 
             (this.creaditPerDate!=null &&
              java.util.Arrays.equals(this.creaditPerDate, other.getCreaditPerDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        _hashCode += getConsumedCredits();
        if (getCreaditPerDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreaditPerDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreaditPerDate(), i);
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
        new org.apache.axis.description.TypeDesc(BillableActionCreditConsumption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "billableActionCreditConsumption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "billableActionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumedCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consumedCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creaditPerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creaditPerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>billableActionCreditConsumption>creaditPerDate>entry"));
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
