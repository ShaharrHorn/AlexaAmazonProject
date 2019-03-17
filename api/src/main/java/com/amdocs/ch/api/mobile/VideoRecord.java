/**
 * VideoRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VideoRecord  implements java.io.Serializable {
    private java.util.Calendar date;

    private long duration;

    private java.lang.Integer eventId;

    private java.lang.String fileName;

    private java.lang.String fileUri;

    private com.amdocs.ch.api.mobile.VideoRecordFilesStatusEntry[] filesStatus;

    private com.amdocs.ch.api.mobile.Id gatewayId;

    private com.amdocs.ch.api.mobile.Id id;

    private java.lang.String[] imageUris;

    private java.lang.String recordingName;

    private com.amdocs.ch.api.mobile.VideoRecordingType recordingType;

    private java.lang.String sensorName;

    private java.lang.String sensorType;

    private long size;

    private long sourceId;

    private com.amdocs.ch.api.mobile.VideoRecordingTriggerType triggerType;

    public VideoRecord() {
    }

    public VideoRecord(
           java.util.Calendar date,
           long duration,
           java.lang.Integer eventId,
           java.lang.String fileName,
           java.lang.String fileUri,
           com.amdocs.ch.api.mobile.VideoRecordFilesStatusEntry[] filesStatus,
           com.amdocs.ch.api.mobile.Id gatewayId,
           com.amdocs.ch.api.mobile.Id id,
           java.lang.String[] imageUris,
           java.lang.String recordingName,
           com.amdocs.ch.api.mobile.VideoRecordingType recordingType,
           java.lang.String sensorName,
           java.lang.String sensorType,
           long size,
           long sourceId,
           com.amdocs.ch.api.mobile.VideoRecordingTriggerType triggerType) {
           this.date = date;
           this.duration = duration;
           this.eventId = eventId;
           this.fileName = fileName;
           this.fileUri = fileUri;
           this.filesStatus = filesStatus;
           this.gatewayId = gatewayId;
           this.id = id;
           this.imageUris = imageUris;
           this.recordingName = recordingName;
           this.recordingType = recordingType;
           this.sensorName = sensorName;
           this.sensorType = sensorType;
           this.size = size;
           this.sourceId = sourceId;
           this.triggerType = triggerType;
    }


    /**
     * Gets the date value for this VideoRecord.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this VideoRecord.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the duration value for this VideoRecord.
     * 
     * @return duration
     */
    public long getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this VideoRecord.
     * 
     * @param duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }


    /**
     * Gets the eventId value for this VideoRecord.
     * 
     * @return eventId
     */
    public java.lang.Integer getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this VideoRecord.
     * 
     * @param eventId
     */
    public void setEventId(java.lang.Integer eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the fileName value for this VideoRecord.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this VideoRecord.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileUri value for this VideoRecord.
     * 
     * @return fileUri
     */
    public java.lang.String getFileUri() {
        return fileUri;
    }


    /**
     * Sets the fileUri value for this VideoRecord.
     * 
     * @param fileUri
     */
    public void setFileUri(java.lang.String fileUri) {
        this.fileUri = fileUri;
    }


    /**
     * Gets the filesStatus value for this VideoRecord.
     * 
     * @return filesStatus
     */
    public com.amdocs.ch.api.mobile.VideoRecordFilesStatusEntry[] getFilesStatus() {
        return filesStatus;
    }


    /**
     * Sets the filesStatus value for this VideoRecord.
     * 
     * @param filesStatus
     */
    public void setFilesStatus(com.amdocs.ch.api.mobile.VideoRecordFilesStatusEntry[] filesStatus) {
        this.filesStatus = filesStatus;
    }


    /**
     * Gets the gatewayId value for this VideoRecord.
     * 
     * @return gatewayId
     */
    public com.amdocs.ch.api.mobile.Id getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this VideoRecord.
     * 
     * @param gatewayId
     */
    public void setGatewayId(com.amdocs.ch.api.mobile.Id gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the id value for this VideoRecord.
     * 
     * @return id
     */
    public com.amdocs.ch.api.mobile.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this VideoRecord.
     * 
     * @param id
     */
    public void setId(com.amdocs.ch.api.mobile.Id id) {
        this.id = id;
    }


    /**
     * Gets the imageUris value for this VideoRecord.
     * 
     * @return imageUris
     */
    public java.lang.String[] getImageUris() {
        return imageUris;
    }


    /**
     * Sets the imageUris value for this VideoRecord.
     * 
     * @param imageUris
     */
    public void setImageUris(java.lang.String[] imageUris) {
        this.imageUris = imageUris;
    }

    public java.lang.String getImageUris(int i) {
        return this.imageUris[i];
    }

    public void setImageUris(int i, java.lang.String _value) {
        this.imageUris[i] = _value;
    }


    /**
     * Gets the recordingName value for this VideoRecord.
     * 
     * @return recordingName
     */
    public java.lang.String getRecordingName() {
        return recordingName;
    }


    /**
     * Sets the recordingName value for this VideoRecord.
     * 
     * @param recordingName
     */
    public void setRecordingName(java.lang.String recordingName) {
        this.recordingName = recordingName;
    }


    /**
     * Gets the recordingType value for this VideoRecord.
     * 
     * @return recordingType
     */
    public com.amdocs.ch.api.mobile.VideoRecordingType getRecordingType() {
        return recordingType;
    }


    /**
     * Sets the recordingType value for this VideoRecord.
     * 
     * @param recordingType
     */
    public void setRecordingType(com.amdocs.ch.api.mobile.VideoRecordingType recordingType) {
        this.recordingType = recordingType;
    }


    /**
     * Gets the sensorName value for this VideoRecord.
     * 
     * @return sensorName
     */
    public java.lang.String getSensorName() {
        return sensorName;
    }


    /**
     * Sets the sensorName value for this VideoRecord.
     * 
     * @param sensorName
     */
    public void setSensorName(java.lang.String sensorName) {
        this.sensorName = sensorName;
    }


    /**
     * Gets the sensorType value for this VideoRecord.
     * 
     * @return sensorType
     */
    public java.lang.String getSensorType() {
        return sensorType;
    }


    /**
     * Sets the sensorType value for this VideoRecord.
     * 
     * @param sensorType
     */
    public void setSensorType(java.lang.String sensorType) {
        this.sensorType = sensorType;
    }


    /**
     * Gets the size value for this VideoRecord.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this VideoRecord.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }


    /**
     * Gets the sourceId value for this VideoRecord.
     * 
     * @return sourceId
     */
    public long getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this VideoRecord.
     * 
     * @param sourceId
     */
    public void setSourceId(long sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the triggerType value for this VideoRecord.
     * 
     * @return triggerType
     */
    public com.amdocs.ch.api.mobile.VideoRecordingTriggerType getTriggerType() {
        return triggerType;
    }


    /**
     * Sets the triggerType value for this VideoRecord.
     * 
     * @param triggerType
     */
    public void setTriggerType(com.amdocs.ch.api.mobile.VideoRecordingTriggerType triggerType) {
        this.triggerType = triggerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoRecord)) return false;
        VideoRecord other = (VideoRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.duration == other.getDuration() &&
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileUri==null && other.getFileUri()==null) || 
             (this.fileUri!=null &&
              this.fileUri.equals(other.getFileUri()))) &&
            ((this.filesStatus==null && other.getFilesStatus()==null) || 
             (this.filesStatus!=null &&
              java.util.Arrays.equals(this.filesStatus, other.getFilesStatus()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.imageUris==null && other.getImageUris()==null) || 
             (this.imageUris!=null &&
              java.util.Arrays.equals(this.imageUris, other.getImageUris()))) &&
            ((this.recordingName==null && other.getRecordingName()==null) || 
             (this.recordingName!=null &&
              this.recordingName.equals(other.getRecordingName()))) &&
            ((this.recordingType==null && other.getRecordingType()==null) || 
             (this.recordingType!=null &&
              this.recordingType.equals(other.getRecordingType()))) &&
            ((this.sensorName==null && other.getSensorName()==null) || 
             (this.sensorName!=null &&
              this.sensorName.equals(other.getSensorName()))) &&
            ((this.sensorType==null && other.getSensorType()==null) || 
             (this.sensorType!=null &&
              this.sensorType.equals(other.getSensorType()))) &&
            this.size == other.getSize() &&
            this.sourceId == other.getSourceId() &&
            ((this.triggerType==null && other.getTriggerType()==null) || 
             (this.triggerType!=null &&
              this.triggerType.equals(other.getTriggerType())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += new Long(getDuration()).hashCode();
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileUri() != null) {
            _hashCode += getFileUri().hashCode();
        }
        if (getFilesStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilesStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilesStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getImageUris() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageUris());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageUris(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordingName() != null) {
            _hashCode += getRecordingName().hashCode();
        }
        if (getRecordingType() != null) {
            _hashCode += getRecordingType().hashCode();
        }
        if (getSensorName() != null) {
            _hashCode += getSensorName().hashCode();
        }
        if (getSensorType() != null) {
            _hashCode += getSensorType().hashCode();
        }
        _hashCode += new Long(getSize()).hashCode();
        _hashCode += new Long(getSourceId()).hashCode();
        if (getTriggerType() != null) {
            _hashCode += getTriggerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileUri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filesStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filesStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>videoRecord>filesStatus>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUris");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageUris"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sensorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensorType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sensorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoRecordingTriggerType"));
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
