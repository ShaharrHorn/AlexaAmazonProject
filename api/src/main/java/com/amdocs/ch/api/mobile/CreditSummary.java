/**
 * CreditSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CreditSummary  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.BillableActionCreditConsumption[] billableActionBreakdown;

    private int consumedCredits;

    private boolean currentBillPeriod;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private int unusedCredits;

    public CreditSummary() {
    }

    public CreditSummary(
           com.amdocs.ch.api.mobile.BillableActionCreditConsumption[] billableActionBreakdown,
           int consumedCredits,
           boolean currentBillPeriod,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           int unusedCredits) {
           this.billableActionBreakdown = billableActionBreakdown;
           this.consumedCredits = consumedCredits;
           this.currentBillPeriod = currentBillPeriod;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.unusedCredits = unusedCredits;
    }


    /**
     * Gets the billableActionBreakdown value for this CreditSummary.
     * 
     * @return billableActionBreakdown
     */
    public com.amdocs.ch.api.mobile.BillableActionCreditConsumption[] getBillableActionBreakdown() {
        return billableActionBreakdown;
    }


    /**
     * Sets the billableActionBreakdown value for this CreditSummary.
     * 
     * @param billableActionBreakdown
     */
    public void setBillableActionBreakdown(com.amdocs.ch.api.mobile.BillableActionCreditConsumption[] billableActionBreakdown) {
        this.billableActionBreakdown = billableActionBreakdown;
    }

    public com.amdocs.ch.api.mobile.BillableActionCreditConsumption getBillableActionBreakdown(int i) {
        return this.billableActionBreakdown[i];
    }

    public void setBillableActionBreakdown(int i, com.amdocs.ch.api.mobile.BillableActionCreditConsumption _value) {
        this.billableActionBreakdown[i] = _value;
    }


    /**
     * Gets the consumedCredits value for this CreditSummary.
     * 
     * @return consumedCredits
     */
    public int getConsumedCredits() {
        return consumedCredits;
    }


    /**
     * Sets the consumedCredits value for this CreditSummary.
     * 
     * @param consumedCredits
     */
    public void setConsumedCredits(int consumedCredits) {
        this.consumedCredits = consumedCredits;
    }


    /**
     * Gets the currentBillPeriod value for this CreditSummary.
     * 
     * @return currentBillPeriod
     */
    public boolean isCurrentBillPeriod() {
        return currentBillPeriod;
    }


    /**
     * Sets the currentBillPeriod value for this CreditSummary.
     * 
     * @param currentBillPeriod
     */
    public void setCurrentBillPeriod(boolean currentBillPeriod) {
        this.currentBillPeriod = currentBillPeriod;
    }


    /**
     * Gets the fromDate value for this CreditSummary.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this CreditSummary.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this CreditSummary.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this CreditSummary.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the unusedCredits value for this CreditSummary.
     * 
     * @return unusedCredits
     */
    public int getUnusedCredits() {
        return unusedCredits;
    }


    /**
     * Sets the unusedCredits value for this CreditSummary.
     * 
     * @param unusedCredits
     */
    public void setUnusedCredits(int unusedCredits) {
        this.unusedCredits = unusedCredits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditSummary)) return false;
        CreditSummary other = (CreditSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billableActionBreakdown==null && other.getBillableActionBreakdown()==null) || 
             (this.billableActionBreakdown!=null &&
              java.util.Arrays.equals(this.billableActionBreakdown, other.getBillableActionBreakdown()))) &&
            this.consumedCredits == other.getConsumedCredits() &&
            this.currentBillPeriod == other.isCurrentBillPeriod() &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            this.unusedCredits == other.getUnusedCredits();
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
        if (getBillableActionBreakdown() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillableActionBreakdown());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillableActionBreakdown(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getConsumedCredits();
        _hashCode += (isCurrentBillPeriod() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        _hashCode += getUnusedCredits();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "creditSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billableActionBreakdown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billableActionBreakdown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "billableActionCreditConsumption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumedCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consumedCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBillPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentBillPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unusedCredits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unusedCredits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
