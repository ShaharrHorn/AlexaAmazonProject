/**
 * Scenario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class Scenario  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.ScenarioAction[] actions;

    private java.lang.String backgroundPictureName;

    private com.amdocs.ch.api.mobile.ScenarioExecutionStatus currentExecutionStatus;

    private java.util.Calendar finalExecutionDate;

    private com.amdocs.ch.api.mobile.ScenarioExecutionStatus finalExecutionStatus;

    private long gatewayId;

    private java.lang.String name;

    private long scenarioId;

    private long siteId;

    private com.amdocs.ch.api.mobile.ScenarioStatus status;

    private com.amdocs.ch.api.mobile.ScenarioTriggerEvent triggerEvent;

    private com.amdocs.ch.api.mobile.ScenarioType type;

    private com.amdocs.ch.api.mobile.ScenarioValidityPeriod validityPeriod;

    public Scenario() {
    }

    public Scenario(
           com.amdocs.ch.api.mobile.ScenarioAction[] actions,
           java.lang.String backgroundPictureName,
           com.amdocs.ch.api.mobile.ScenarioExecutionStatus currentExecutionStatus,
           java.util.Calendar finalExecutionDate,
           com.amdocs.ch.api.mobile.ScenarioExecutionStatus finalExecutionStatus,
           long gatewayId,
           java.lang.String name,
           long scenarioId,
           long siteId,
           com.amdocs.ch.api.mobile.ScenarioStatus status,
           com.amdocs.ch.api.mobile.ScenarioTriggerEvent triggerEvent,
           com.amdocs.ch.api.mobile.ScenarioType type,
           com.amdocs.ch.api.mobile.ScenarioValidityPeriod validityPeriod) {
           this.actions = actions;
           this.backgroundPictureName = backgroundPictureName;
           this.currentExecutionStatus = currentExecutionStatus;
           this.finalExecutionDate = finalExecutionDate;
           this.finalExecutionStatus = finalExecutionStatus;
           this.gatewayId = gatewayId;
           this.name = name;
           this.scenarioId = scenarioId;
           this.siteId = siteId;
           this.status = status;
           this.triggerEvent = triggerEvent;
           this.type = type;
           this.validityPeriod = validityPeriod;
    }


    /**
     * Gets the actions value for this Scenario.
     * 
     * @return actions
     */
    public com.amdocs.ch.api.mobile.ScenarioAction[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this Scenario.
     * 
     * @param actions
     */
    public void setActions(com.amdocs.ch.api.mobile.ScenarioAction[] actions) {
        this.actions = actions;
    }


    /**
     * Gets the backgroundPictureName value for this Scenario.
     * 
     * @return backgroundPictureName
     */
    public java.lang.String getBackgroundPictureName() {
        return backgroundPictureName;
    }


    /**
     * Sets the backgroundPictureName value for this Scenario.
     * 
     * @param backgroundPictureName
     */
    public void setBackgroundPictureName(java.lang.String backgroundPictureName) {
        this.backgroundPictureName = backgroundPictureName;
    }


    /**
     * Gets the currentExecutionStatus value for this Scenario.
     * 
     * @return currentExecutionStatus
     */
    public com.amdocs.ch.api.mobile.ScenarioExecutionStatus getCurrentExecutionStatus() {
        return currentExecutionStatus;
    }


    /**
     * Sets the currentExecutionStatus value for this Scenario.
     * 
     * @param currentExecutionStatus
     */
    public void setCurrentExecutionStatus(com.amdocs.ch.api.mobile.ScenarioExecutionStatus currentExecutionStatus) {
        this.currentExecutionStatus = currentExecutionStatus;
    }


    /**
     * Gets the finalExecutionDate value for this Scenario.
     * 
     * @return finalExecutionDate
     */
    public java.util.Calendar getFinalExecutionDate() {
        return finalExecutionDate;
    }


    /**
     * Sets the finalExecutionDate value for this Scenario.
     * 
     * @param finalExecutionDate
     */
    public void setFinalExecutionDate(java.util.Calendar finalExecutionDate) {
        this.finalExecutionDate = finalExecutionDate;
    }


    /**
     * Gets the finalExecutionStatus value for this Scenario.
     * 
     * @return finalExecutionStatus
     */
    public com.amdocs.ch.api.mobile.ScenarioExecutionStatus getFinalExecutionStatus() {
        return finalExecutionStatus;
    }


    /**
     * Sets the finalExecutionStatus value for this Scenario.
     * 
     * @param finalExecutionStatus
     */
    public void setFinalExecutionStatus(com.amdocs.ch.api.mobile.ScenarioExecutionStatus finalExecutionStatus) {
        this.finalExecutionStatus = finalExecutionStatus;
    }


    /**
     * Gets the gatewayId value for this Scenario.
     * 
     * @return gatewayId
     */
    public long getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this Scenario.
     * 
     * @param gatewayId
     */
    public void setGatewayId(long gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the name value for this Scenario.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Scenario.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the scenarioId value for this Scenario.
     * 
     * @return scenarioId
     */
    public long getScenarioId() {
        return scenarioId;
    }


    /**
     * Sets the scenarioId value for this Scenario.
     * 
     * @param scenarioId
     */
    public void setScenarioId(long scenarioId) {
        this.scenarioId = scenarioId;
    }


    /**
     * Gets the siteId value for this Scenario.
     * 
     * @return siteId
     */
    public long getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this Scenario.
     * 
     * @param siteId
     */
    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the status value for this Scenario.
     * 
     * @return status
     */
    public com.amdocs.ch.api.mobile.ScenarioStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Scenario.
     * 
     * @param status
     */
    public void setStatus(com.amdocs.ch.api.mobile.ScenarioStatus status) {
        this.status = status;
    }


    /**
     * Gets the triggerEvent value for this Scenario.
     * 
     * @return triggerEvent
     */
    public com.amdocs.ch.api.mobile.ScenarioTriggerEvent getTriggerEvent() {
        return triggerEvent;
    }


    /**
     * Sets the triggerEvent value for this Scenario.
     * 
     * @param triggerEvent
     */
    public void setTriggerEvent(com.amdocs.ch.api.mobile.ScenarioTriggerEvent triggerEvent) {
        this.triggerEvent = triggerEvent;
    }


    /**
     * Gets the type value for this Scenario.
     * 
     * @return type
     */
    public com.amdocs.ch.api.mobile.ScenarioType getType() {
        return type;
    }


    /**
     * Sets the type value for this Scenario.
     * 
     * @param type
     */
    public void setType(com.amdocs.ch.api.mobile.ScenarioType type) {
        this.type = type;
    }


    /**
     * Gets the validityPeriod value for this Scenario.
     * 
     * @return validityPeriod
     */
    public com.amdocs.ch.api.mobile.ScenarioValidityPeriod getValidityPeriod() {
        return validityPeriod;
    }


    /**
     * Sets the validityPeriod value for this Scenario.
     * 
     * @param validityPeriod
     */
    public void setValidityPeriod(com.amdocs.ch.api.mobile.ScenarioValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Scenario)) return false;
        Scenario other = (Scenario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.backgroundPictureName==null && other.getBackgroundPictureName()==null) || 
             (this.backgroundPictureName!=null &&
              this.backgroundPictureName.equals(other.getBackgroundPictureName()))) &&
            ((this.currentExecutionStatus==null && other.getCurrentExecutionStatus()==null) || 
             (this.currentExecutionStatus!=null &&
              this.currentExecutionStatus.equals(other.getCurrentExecutionStatus()))) &&
            ((this.finalExecutionDate==null && other.getFinalExecutionDate()==null) || 
             (this.finalExecutionDate!=null &&
              this.finalExecutionDate.equals(other.getFinalExecutionDate()))) &&
            ((this.finalExecutionStatus==null && other.getFinalExecutionStatus()==null) || 
             (this.finalExecutionStatus!=null &&
              this.finalExecutionStatus.equals(other.getFinalExecutionStatus()))) &&
            this.gatewayId == other.getGatewayId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.scenarioId == other.getScenarioId() &&
            this.siteId == other.getSiteId() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.triggerEvent==null && other.getTriggerEvent()==null) || 
             (this.triggerEvent!=null &&
              this.triggerEvent.equals(other.getTriggerEvent()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.validityPeriod==null && other.getValidityPeriod()==null) || 
             (this.validityPeriod!=null &&
              this.validityPeriod.equals(other.getValidityPeriod())));
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
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBackgroundPictureName() != null) {
            _hashCode += getBackgroundPictureName().hashCode();
        }
        if (getCurrentExecutionStatus() != null) {
            _hashCode += getCurrentExecutionStatus().hashCode();
        }
        if (getFinalExecutionDate() != null) {
            _hashCode += getFinalExecutionDate().hashCode();
        }
        if (getFinalExecutionStatus() != null) {
            _hashCode += getFinalExecutionStatus().hashCode();
        }
        _hashCode += new Long(getGatewayId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Long(getScenarioId()).hashCode();
        _hashCode += new Long(getSiteId()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTriggerEvent() != null) {
            _hashCode += getTriggerEvent().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValidityPeriod() != null) {
            _hashCode += getValidityPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Scenario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "action"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundPictureName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backgroundPictureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentExecutionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentExecutionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalExecutionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalExecutionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalExecutionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalExecutionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioExecutionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenarioId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scenarioId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioTriggerEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "scenarioValidityPeriod"));
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
