/**
 * ArmingPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class ArmingPartition  extends com.amdocs.ch.api.mobile.BasePartition  implements java.io.Serializable {
    private com.amdocs.ch.api.mobile.GatewayArmingMode armingMode;

    private java.lang.String backgroundPictureName;

    private boolean instant;

    private boolean latchkey;

    private boolean needEngReset;

    private boolean ready;

    private java.util.Calendar timestamp;

    public ArmingPartition() {
    }

    public ArmingPartition(
           java.lang.String displayName,
           com.amdocs.ch.api.mobile.Id partitionId,
           java.lang.String partitionName,
           com.amdocs.ch.api.mobile.GatewayArmingMode armingMode,
           java.lang.String backgroundPictureName,
           boolean instant,
           boolean latchkey,
           boolean needEngReset,
           boolean ready,
           java.util.Calendar timestamp) {
        super(
            displayName,
            partitionId,
            partitionName);
        this.armingMode = armingMode;
        this.backgroundPictureName = backgroundPictureName;
        this.instant = instant;
        this.latchkey = latchkey;
        this.needEngReset = needEngReset;
        this.ready = ready;
        this.timestamp = timestamp;
    }


    /**
     * Gets the armingMode value for this ArmingPartition.
     * 
     * @return armingMode
     */
    public com.amdocs.ch.api.mobile.GatewayArmingMode getArmingMode() {
        return armingMode;
    }


    /**
     * Sets the armingMode value for this ArmingPartition.
     * 
     * @param armingMode
     */
    public void setArmingMode(com.amdocs.ch.api.mobile.GatewayArmingMode armingMode) {
        this.armingMode = armingMode;
    }


    /**
     * Gets the backgroundPictureName value for this ArmingPartition.
     * 
     * @return backgroundPictureName
     */
    public java.lang.String getBackgroundPictureName() {
        return backgroundPictureName;
    }


    /**
     * Sets the backgroundPictureName value for this ArmingPartition.
     * 
     * @param backgroundPictureName
     */
    public void setBackgroundPictureName(java.lang.String backgroundPictureName) {
        this.backgroundPictureName = backgroundPictureName;
    }


    /**
     * Gets the instant value for this ArmingPartition.
     * 
     * @return instant
     */
    public boolean isInstant() {
        return instant;
    }


    /**
     * Sets the instant value for this ArmingPartition.
     * 
     * @param instant
     */
    public void setInstant(boolean instant) {
        this.instant = instant;
    }


    /**
     * Gets the latchkey value for this ArmingPartition.
     * 
     * @return latchkey
     */
    public boolean isLatchkey() {
        return latchkey;
    }


    /**
     * Sets the latchkey value for this ArmingPartition.
     * 
     * @param latchkey
     */
    public void setLatchkey(boolean latchkey) {
        this.latchkey = latchkey;
    }


    /**
     * Gets the needEngReset value for this ArmingPartition.
     * 
     * @return needEngReset
     */
    public boolean isNeedEngReset() {
        return needEngReset;
    }


    /**
     * Sets the needEngReset value for this ArmingPartition.
     * 
     * @param needEngReset
     */
    public void setNeedEngReset(boolean needEngReset) {
        this.needEngReset = needEngReset;
    }


    /**
     * Gets the ready value for this ArmingPartition.
     * 
     * @return ready
     */
    public boolean isReady() {
        return ready;
    }


    /**
     * Sets the ready value for this ArmingPartition.
     * 
     * @param ready
     */
    public void setReady(boolean ready) {
        this.ready = ready;
    }


    /**
     * Gets the timestamp value for this ArmingPartition.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this ArmingPartition.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArmingPartition)) return false;
        ArmingPartition other = (ArmingPartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.armingMode==null && other.getArmingMode()==null) || 
             (this.armingMode!=null &&
              this.armingMode.equals(other.getArmingMode()))) &&
            ((this.backgroundPictureName==null && other.getBackgroundPictureName()==null) || 
             (this.backgroundPictureName!=null &&
              this.backgroundPictureName.equals(other.getBackgroundPictureName()))) &&
            this.instant == other.isInstant() &&
            this.latchkey == other.isLatchkey() &&
            this.needEngReset == other.isNeedEngReset() &&
            this.ready == other.isReady() &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp())));
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
        if (getArmingMode() != null) {
            _hashCode += getArmingMode().hashCode();
        }
        if (getBackgroundPictureName() != null) {
            _hashCode += getBackgroundPictureName().hashCode();
        }
        _hashCode += (isInstant() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLatchkey() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNeedEngReset() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReady() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArmingPartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "armingPartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "armingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayArmingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundPictureName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backgroundPictureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latchkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latchkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needEngReset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needEngReset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ready");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ready"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
