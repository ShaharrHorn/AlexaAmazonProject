/**
 * ScenarioActionAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ScenarioActionAlert  implements java.io.Serializable {
    private java.lang.String alertContent;

    private java.lang.String alertSubject;

    private java.lang.String alertTarget;

    private com.amdocs.ch.api.mobile.EventNotificationTargetType alertTargetType;

    private long scenarioAlertId;

    private long userId;

    private long userSiteId;

    public ScenarioActionAlert() {
    }

    public ScenarioActionAlert(
           java.lang.String alertContent,
           java.lang.String alertSubject,
           java.lang.String alertTarget,
           com.amdocs.ch.api.mobile.EventNotificationTargetType alertTargetType,
           long scenarioAlertId,
           long userId,
           long userSiteId) {
           this.alertContent = alertContent;
           this.alertSubject = alertSubject;
           this.alertTarget = alertTarget;
           this.alertTargetType = alertTargetType;
           this.scenarioAlertId = scenarioAlertId;
           this.userId = userId;
           this.userSiteId = userSiteId;
    }


    /**
     * Gets the alertContent value for this ScenarioActionAlert.
     * 
     * @return alertContent
     */
    public java.lang.String getAlertContent() {
        return alertContent;
    }


    /**
     * Sets the alertContent value for this ScenarioActionAlert.
     * 
     * @param alertContent
     */
    public void setAlertContent(java.lang.String alertContent) {
        this.alertContent = alertContent;
    }


    /**
     * Gets the alertSubject value for this ScenarioActionAlert.
     * 
     * @return alertSubject
     */
    public java.lang.String getAlertSubject() {
        return alertSubject;
    }


    /**
     * Sets the alertSubject value for this ScenarioActionAlert.
     * 
     * @param alertSubject
     */
    public void setAlertSubject(java.lang.String alertSubject) {
        this.alertSubject = alertSubject;
    }


    /**
     * Gets the alertTarget value for this ScenarioActionAlert.
     * 
     * @return alertTarget
     */
    public java.lang.String getAlertTarget() {
        return alertTarget;
    }


    /**
     * Sets the alertTarget value for this ScenarioActionAlert.
     * 
     * @param alertTarget
     */
    public void setAlertTarget(java.lang.String alertTarget) {
        this.alertTarget = alertTarget;
    }


    /**
     * Gets the alertTargetType value for this ScenarioActionAlert.
     * 
     * @return alertTargetType
     */
    public com.amdocs.ch.api.mobile.EventNotificationTargetType getAlertTargetType() {
        return alertTargetType;
    }


    /**
     * Sets the alertTargetType value for this ScenarioActionAlert.
     * 
     * @param alertTargetType
     */
    public void setAlertTargetType(com.amdocs.ch.api.mobile.EventNotificationTargetType alertTargetType) {
        this.alertTargetType = alertTargetType;
    }


    /**
     * Gets the scenarioAlertId value for this ScenarioActionAlert.
     * 
     * @return scenarioAlertId
     */
    public long getScenarioAlertId() {
        return scenarioAlertId;
    }


    /**
     * Sets the scenarioAlertId value for this ScenarioActionAlert.
     * 
     * @param scenarioAlertId
     */
    public void setScenarioAlertId(long scenarioAlertId) {
        this.scenarioAlertId = scenarioAlertId;
    }


    /**
     * Gets the userId value for this ScenarioActionAlert.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ScenarioActionAlert.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userSiteId value for this ScenarioActionAlert.
     * 
     * @return userSiteId
     */
    public long getUserSiteId() {
        return userSiteId;
    }


    /**
     * Sets the userSiteId value for this ScenarioActionAlert.
     * 
     * @param userSiteId
     */
    public void setUserSiteId(long userSiteId) {
        this.userSiteId = userSiteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScenarioActionAlert)) return false;
        ScenarioActionAlert other = (ScenarioActionAlert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alertContent==null && other.getAlertContent()==null) || 
             (this.alertContent!=null &&
              this.alertContent.equals(other.getAlertContent()))) &&
            ((this.alertSubject==null && other.getAlertSubject()==null) || 
             (this.alertSubject!=null &&
              this.alertSubject.equals(other.getAlertSubject()))) &&
            ((this.alertTarget==null && other.getAlertTarget()==null) || 
             (this.alertTarget!=null &&
              this.alertTarget.equals(other.getAlertTarget()))) &&
            ((this.alertTargetType==null && other.getAlertTargetType()==null) || 
             (this.alertTargetType!=null &&
              this.alertTargetType.equals(other.getAlertTargetType()))) &&
            this.scenarioAlertId == other.getScenarioAlertId() &&
            this.userId == other.getUserId() &&
            this.userSiteId == other.getUserSiteId();
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
        if (getAlertContent() != null) {
            _hashCode += getAlertContent().hashCode();
        }
        if (getAlertSubject() != null) {
            _hashCode += getAlertSubject().hashCode();
        }
        if (getAlertTarget() != null) {
            _hashCode += getAlertTarget().hashCode();
        }
        if (getAlertTargetType() != null) {
            _hashCode += getAlertTargetType().hashCode();
        }
        _hashCode += new Long(getScenarioAlertId()).hashCode();
        _hashCode += new Long(getUserId()).hashCode();
        _hashCode += new Long(getUserSiteId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScenarioActionAlert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioActionAlert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertTargetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertTargetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenarioAlertId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scenarioAlertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
