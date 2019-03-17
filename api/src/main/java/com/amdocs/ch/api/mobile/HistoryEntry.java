/**
 * HistoryEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class HistoryEntry  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.LogCategory category;

    private java.lang.Long configId;

    private java.lang.String deviceName;

    private java.lang.String deviceType;

    private java.util.Calendar entryDate;

    private java.lang.String entryDateString;

    private long entryDateTimestamp;

    private java.lang.String entryReason;

    private java.lang.Long externalReasonId;

    private com.amdocs.ch.api.mobile.LoggedAlert[] historyAlerts;

    private java.lang.String message;

    private java.lang.String partitionName;

    private com.amdocs.ch.api.mobile.LogRecordReason reason;

    private com.amdocs.ch.api.mobile.LogRecordType recordType;

    private java.lang.String scenarioName;

    private com.amdocs.ch.api.mobile.EventNotificationTargetType[] targetTypes;

    private java.lang.String userCode;

    private java.lang.String username;

    public HistoryEntry() {
    }

    public HistoryEntry(
           com.amdocs.ch.api.mobile.LogCategory category,
           java.lang.Long configId,
           java.lang.String deviceName,
           java.lang.String deviceType,
           java.util.Calendar entryDate,
           java.lang.String entryDateString,
           long entryDateTimestamp,
           java.lang.String entryReason,
           java.lang.Long externalReasonId,
           com.amdocs.ch.api.mobile.LoggedAlert[] historyAlerts,
           java.lang.String message,
           java.lang.String partitionName,
           com.amdocs.ch.api.mobile.LogRecordReason reason,
           com.amdocs.ch.api.mobile.LogRecordType recordType,
           java.lang.String scenarioName,
           com.amdocs.ch.api.mobile.EventNotificationTargetType[] targetTypes,
           java.lang.String userCode,
           java.lang.String username) {
           this.category = category;
           this.configId = configId;
           this.deviceName = deviceName;
           this.deviceType = deviceType;
           this.entryDate = entryDate;
           this.entryDateString = entryDateString;
           this.entryDateTimestamp = entryDateTimestamp;
           this.entryReason = entryReason;
           this.externalReasonId = externalReasonId;
           this.historyAlerts = historyAlerts;
           this.message = message;
           this.partitionName = partitionName;
           this.reason = reason;
           this.recordType = recordType;
           this.scenarioName = scenarioName;
           this.targetTypes = targetTypes;
           this.userCode = userCode;
           this.username = username;
    }


    /**
     * Gets the category value for this HistoryEntry.
     * 
     * @return category
     */
    public com.amdocs.ch.api.mobile.LogCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this HistoryEntry.
     * 
     * @param category
     */
    public void setCategory(com.amdocs.ch.api.mobile.LogCategory category) {
        this.category = category;
    }


    /**
     * Gets the configId value for this HistoryEntry.
     * 
     * @return configId
     */
    public java.lang.Long getConfigId() {
        return configId;
    }


    /**
     * Sets the configId value for this HistoryEntry.
     * 
     * @param configId
     */
    public void setConfigId(java.lang.Long configId) {
        this.configId = configId;
    }


    /**
     * Gets the deviceName value for this HistoryEntry.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this HistoryEntry.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceType value for this HistoryEntry.
     * 
     * @return deviceType
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this HistoryEntry.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the entryDate value for this HistoryEntry.
     * 
     * @return entryDate
     */
    public java.util.Calendar getEntryDate() {
        return entryDate;
    }


    /**
     * Sets the entryDate value for this HistoryEntry.
     * 
     * @param entryDate
     */
    public void setEntryDate(java.util.Calendar entryDate) {
        this.entryDate = entryDate;
    }


    /**
     * Gets the entryDateString value for this HistoryEntry.
     * 
     * @return entryDateString
     */
    public java.lang.String getEntryDateString() {
        return entryDateString;
    }


    /**
     * Sets the entryDateString value for this HistoryEntry.
     * 
     * @param entryDateString
     */
    public void setEntryDateString(java.lang.String entryDateString) {
        this.entryDateString = entryDateString;
    }


    /**
     * Gets the entryDateTimestamp value for this HistoryEntry.
     * 
     * @return entryDateTimestamp
     */
    public long getEntryDateTimestamp() {
        return entryDateTimestamp;
    }


    /**
     * Sets the entryDateTimestamp value for this HistoryEntry.
     * 
     * @param entryDateTimestamp
     */
    public void setEntryDateTimestamp(long entryDateTimestamp) {
        this.entryDateTimestamp = entryDateTimestamp;
    }


    /**
     * Gets the entryReason value for this HistoryEntry.
     * 
     * @return entryReason
     */
    public java.lang.String getEntryReason() {
        return entryReason;
    }


    /**
     * Sets the entryReason value for this HistoryEntry.
     * 
     * @param entryReason
     */
    public void setEntryReason(java.lang.String entryReason) {
        this.entryReason = entryReason;
    }


    /**
     * Gets the externalReasonId value for this HistoryEntry.
     * 
     * @return externalReasonId
     */
    public java.lang.Long getExternalReasonId() {
        return externalReasonId;
    }


    /**
     * Sets the externalReasonId value for this HistoryEntry.
     * 
     * @param externalReasonId
     */
    public void setExternalReasonId(java.lang.Long externalReasonId) {
        this.externalReasonId = externalReasonId;
    }


    /**
     * Gets the historyAlerts value for this HistoryEntry.
     * 
     * @return historyAlerts
     */
    public com.amdocs.ch.api.mobile.LoggedAlert[] getHistoryAlerts() {
        return historyAlerts;
    }


    /**
     * Sets the historyAlerts value for this HistoryEntry.
     * 
     * @param historyAlerts
     */
    public void setHistoryAlerts(com.amdocs.ch.api.mobile.LoggedAlert[] historyAlerts) {
        this.historyAlerts = historyAlerts;
    }

    public com.amdocs.ch.api.mobile.LoggedAlert getHistoryAlerts(int i) {
        return this.historyAlerts[i];
    }

    public void setHistoryAlerts(int i, com.amdocs.ch.api.mobile.LoggedAlert _value) {
        this.historyAlerts[i] = _value;
    }


    /**
     * Gets the message value for this HistoryEntry.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this HistoryEntry.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the partitionName value for this HistoryEntry.
     * 
     * @return partitionName
     */
    public java.lang.String getPartitionName() {
        return partitionName;
    }


    /**
     * Sets the partitionName value for this HistoryEntry.
     * 
     * @param partitionName
     */
    public void setPartitionName(java.lang.String partitionName) {
        this.partitionName = partitionName;
    }


    /**
     * Gets the reason value for this HistoryEntry.
     * 
     * @return reason
     */
    public com.amdocs.ch.api.mobile.LogRecordReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this HistoryEntry.
     * 
     * @param reason
     */
    public void setReason(com.amdocs.ch.api.mobile.LogRecordReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the recordType value for this HistoryEntry.
     * 
     * @return recordType
     */
    public com.amdocs.ch.api.mobile.LogRecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this HistoryEntry.
     * 
     * @param recordType
     */
    public void setRecordType(com.amdocs.ch.api.mobile.LogRecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the scenarioName value for this HistoryEntry.
     * 
     * @return scenarioName
     */
    public java.lang.String getScenarioName() {
        return scenarioName;
    }


    /**
     * Sets the scenarioName value for this HistoryEntry.
     * 
     * @param scenarioName
     */
    public void setScenarioName(java.lang.String scenarioName) {
        this.scenarioName = scenarioName;
    }


    /**
     * Gets the targetTypes value for this HistoryEntry.
     * 
     * @return targetTypes
     */
    public com.amdocs.ch.api.mobile.EventNotificationTargetType[] getTargetTypes() {
        return targetTypes;
    }


    /**
     * Sets the targetTypes value for this HistoryEntry.
     * 
     * @param targetTypes
     */
    public void setTargetTypes(com.amdocs.ch.api.mobile.EventNotificationTargetType[] targetTypes) {
        this.targetTypes = targetTypes;
    }

    public com.amdocs.ch.api.mobile.EventNotificationTargetType getTargetTypes(int i) {
        return this.targetTypes[i];
    }

    public void setTargetTypes(int i, com.amdocs.ch.api.mobile.EventNotificationTargetType _value) {
        this.targetTypes[i] = _value;
    }


    /**
     * Gets the userCode value for this HistoryEntry.
     * 
     * @return userCode
     */
    public java.lang.String getUserCode() {
        return userCode;
    }


    /**
     * Sets the userCode value for this HistoryEntry.
     * 
     * @param userCode
     */
    public void setUserCode(java.lang.String userCode) {
        this.userCode = userCode;
    }


    /**
     * Gets the username value for this HistoryEntry.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this HistoryEntry.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoryEntry)) return false;
        HistoryEntry other = (HistoryEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.configId==null && other.getConfigId()==null) || 
             (this.configId!=null &&
              this.configId.equals(other.getConfigId()))) &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.entryDate==null && other.getEntryDate()==null) || 
             (this.entryDate!=null &&
              this.entryDate.equals(other.getEntryDate()))) &&
            ((this.entryDateString==null && other.getEntryDateString()==null) || 
             (this.entryDateString!=null &&
              this.entryDateString.equals(other.getEntryDateString()))) &&
            this.entryDateTimestamp == other.getEntryDateTimestamp() &&
            ((this.entryReason==null && other.getEntryReason()==null) || 
             (this.entryReason!=null &&
              this.entryReason.equals(other.getEntryReason()))) &&
            ((this.externalReasonId==null && other.getExternalReasonId()==null) || 
             (this.externalReasonId!=null &&
              this.externalReasonId.equals(other.getExternalReasonId()))) &&
            ((this.historyAlerts==null && other.getHistoryAlerts()==null) || 
             (this.historyAlerts!=null &&
              java.util.Arrays.equals(this.historyAlerts, other.getHistoryAlerts()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.partitionName==null && other.getPartitionName()==null) || 
             (this.partitionName!=null &&
              this.partitionName.equals(other.getPartitionName()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.scenarioName==null && other.getScenarioName()==null) || 
             (this.scenarioName!=null &&
              this.scenarioName.equals(other.getScenarioName()))) &&
            ((this.targetTypes==null && other.getTargetTypes()==null) || 
             (this.targetTypes!=null &&
              java.util.Arrays.equals(this.targetTypes, other.getTargetTypes()))) &&
            ((this.userCode==null && other.getUserCode()==null) || 
             (this.userCode!=null &&
              this.userCode.equals(other.getUserCode()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getConfigId() != null) {
            _hashCode += getConfigId().hashCode();
        }
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getEntryDate() != null) {
            _hashCode += getEntryDate().hashCode();
        }
        if (getEntryDateString() != null) {
            _hashCode += getEntryDateString().hashCode();
        }
        _hashCode += new Long(getEntryDateTimestamp()).hashCode();
        if (getEntryReason() != null) {
            _hashCode += getEntryReason().hashCode();
        }
        if (getExternalReasonId() != null) {
            _hashCode += getExternalReasonId().hashCode();
        }
        if (getHistoryAlerts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoryAlerts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoryAlerts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPartitionName() != null) {
            _hashCode += getPartitionName().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getScenarioName() != null) {
            _hashCode += getScenarioName().hashCode();
        }
        if (getTargetTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserCode() != null) {
            _hashCode += getUserCode().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HistoryEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "historyEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryDateString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entryDateString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryDateTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entryDateTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entryReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyAlerts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historyAlerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "loggedAlert"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logRecordReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logRecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scenarioName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scenarioName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "eventNotificationTargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
