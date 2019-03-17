/**
 * MultiValueMeasurementDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class MultiValueMeasurementDto  extends com.amdocs.ch.api.mobile.BaseMeasurementData  implements java.io.Serializable {
    private java.lang.String eventId;

    private boolean noteExist;

    private com.amdocs.ch.api.mobile.QuestionAnswerDetails[] questionsAnswers;

    private long userId;

    private com.amdocs.ch.api.mobile.MultiValueMeasurementDtoValuesEntry[] values;

    public MultiValueMeasurementDto() {
    }

    public MultiValueMeasurementDto(
           java.lang.String deviceSerial,
           java.util.Calendar eventDate,
           java.lang.String eventTimezone,
           long gatewayId,
           java.lang.String eventId,
           boolean noteExist,
           com.amdocs.ch.api.mobile.QuestionAnswerDetails[] questionsAnswers,
           long userId,
           com.amdocs.ch.api.mobile.MultiValueMeasurementDtoValuesEntry[] values) {
        super(
            deviceSerial,
            eventDate,
            eventTimezone,
            gatewayId);
        this.eventId = eventId;
        this.noteExist = noteExist;
        this.questionsAnswers = questionsAnswers;
        this.userId = userId;
        this.values = values;
    }


    /**
     * Gets the eventId value for this MultiValueMeasurementDto.
     * 
     * @return eventId
     */
    public java.lang.String getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this MultiValueMeasurementDto.
     * 
     * @param eventId
     */
    public void setEventId(java.lang.String eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the noteExist value for this MultiValueMeasurementDto.
     * 
     * @return noteExist
     */
    public boolean isNoteExist() {
        return noteExist;
    }


    /**
     * Sets the noteExist value for this MultiValueMeasurementDto.
     * 
     * @param noteExist
     */
    public void setNoteExist(boolean noteExist) {
        this.noteExist = noteExist;
    }


    /**
     * Gets the questionsAnswers value for this MultiValueMeasurementDto.
     * 
     * @return questionsAnswers
     */
    public com.amdocs.ch.api.mobile.QuestionAnswerDetails[] getQuestionsAnswers() {
        return questionsAnswers;
    }


    /**
     * Sets the questionsAnswers value for this MultiValueMeasurementDto.
     * 
     * @param questionsAnswers
     */
    public void setQuestionsAnswers(com.amdocs.ch.api.mobile.QuestionAnswerDetails[] questionsAnswers) {
        this.questionsAnswers = questionsAnswers;
    }

    public com.amdocs.ch.api.mobile.QuestionAnswerDetails getQuestionsAnswers(int i) {
        return this.questionsAnswers[i];
    }

    public void setQuestionsAnswers(int i, com.amdocs.ch.api.mobile.QuestionAnswerDetails _value) {
        this.questionsAnswers[i] = _value;
    }


    /**
     * Gets the userId value for this MultiValueMeasurementDto.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this MultiValueMeasurementDto.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the values value for this MultiValueMeasurementDto.
     * 
     * @return values
     */
    public com.amdocs.ch.api.mobile.MultiValueMeasurementDtoValuesEntry[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this MultiValueMeasurementDto.
     * 
     * @param values
     */
    public void setValues(com.amdocs.ch.api.mobile.MultiValueMeasurementDtoValuesEntry[] values) {
        this.values = values;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultiValueMeasurementDto)) return false;
        MultiValueMeasurementDto other = (MultiValueMeasurementDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            this.noteExist == other.isNoteExist() &&
            ((this.questionsAnswers==null && other.getQuestionsAnswers()==null) || 
             (this.questionsAnswers!=null &&
              java.util.Arrays.equals(this.questionsAnswers, other.getQuestionsAnswers()))) &&
            this.userId == other.getUserId() &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        _hashCode += (isNoteExist() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getQuestionsAnswers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestionsAnswers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestionsAnswers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getUserId()).hashCode();
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(MultiValueMeasurementDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "multiValueMeasurementDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteExist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noteExist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionsAnswers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "questionsAnswers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "questionAnswerDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", ">>multiValueMeasurementDto>values>entry"));
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
