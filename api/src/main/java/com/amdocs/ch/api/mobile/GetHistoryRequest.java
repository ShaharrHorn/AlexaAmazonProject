/**
 * GetHistoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class GetHistoryRequest  implements java.io.Serializable {
    private long gatewayId;

    private java.lang.String locale;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private com.amdocs.ch.api.mobile.LogCategory category;

    private com.amdocs.ch.api.mobile.EventNotificationTargetType notificationTarget;

    private com.amdocs.ch.api.mobile.PaginationInfo pagination;

    public GetHistoryRequest() {
    }

    public GetHistoryRequest(
           long gatewayId,
           java.lang.String locale,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           com.amdocs.ch.api.mobile.LogCategory category,
           com.amdocs.ch.api.mobile.EventNotificationTargetType notificationTarget,
           com.amdocs.ch.api.mobile.PaginationInfo pagination) {
           this.gatewayId = gatewayId;
           this.locale = locale;
           this.startDate = startDate;
           this.endDate = endDate;
           this.category = category;
           this.notificationTarget = notificationTarget;
           this.pagination = pagination;
    }


    /**
     * Gets the gatewayId value for this GetHistoryRequest.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this GetHistoryRequest.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the locale value for this GetHistoryRequest.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this GetHistoryRequest.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the startDate value for this GetHistoryRequest.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetHistoryRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this GetHistoryRequest.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GetHistoryRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the category value for this GetHistoryRequest.
     * 
     * @return category
     */
    public com.amdocs.ch.api.mobile.LogCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this GetHistoryRequest.
     * 
     * @param category
     */
    public void setCategory(com.amdocs.ch.api.mobile.LogCategory category) {
        this.category = category;
    }


    /**
     * Gets the notificationTarget value for this GetHistoryRequest.
     * 
     * @return notificationTarget
     */
    public com.amdocs.ch.api.mobile.EventNotificationTargetType getNotificationTarget() {
        return notificationTarget;
    }


    /**
     * Sets the notificationTarget value for this GetHistoryRequest.
     * 
     * @param notificationTarget
     */
    public void setNotificationTarget(com.amdocs.ch.api.mobile.EventNotificationTargetType notificationTarget) {
        this.notificationTarget = notificationTarget;
    }


    /**
     * Gets the pagination value for this GetHistoryRequest.
     * 
     * @return pagination
     */
    public com.amdocs.ch.api.mobile.PaginationInfo getPagination() {
        return pagination;
    }


    /**
     * Sets the pagination value for this GetHistoryRequest.
     * 
     * @param pagination
     */
    public void setPagination(com.amdocs.ch.api.mobile.PaginationInfo pagination) {
        this.pagination = pagination;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHistoryRequest)) return false;
        GetHistoryRequest other = (GetHistoryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gatewayId == other.getGatewayId() &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.notificationTarget==null && other.getNotificationTarget()==null) || 
             (this.notificationTarget!=null &&
              this.notificationTarget.equals(other.getNotificationTarget()))) &&
            ((this.pagination==null && other.getPagination()==null) || 
             (this.pagination!=null &&
              this.pagination.equals(other.getPagination())));
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
        _hashCode += new Long(getGatewayId()).hashCode();
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getNotificationTarget() != null) {
            _hashCode += getNotificationTarget().hashCode();
        }
        if (getPagination() != null) {
            _hashCode += getPagination().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHistoryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "getHistoryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pagination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "paginationInfo"));
        elemField.setMinOccurs(0);
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
