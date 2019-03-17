/**
 * DevicePowerSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class DevicePowerSummary  implements java.io.Serializable {
    private boolean clamp;

    private java.lang.String deviceName;

    private java.lang.String deviceSerial;

    private com.amdocs.ch.api.mobile.PowerTuple instantPower;

    private com.amdocs.ch.api.mobile.PowerTuple maxMonthPower;

    private com.amdocs.ch.api.mobile.PowerTuple maxPrevDayPower;

    private com.amdocs.ch.api.mobile.PowerTuple maxPrevMonthPower;

    private com.amdocs.ch.api.mobile.PowerTuple maxPrevYearPower;

    private com.amdocs.ch.api.mobile.PowerTuple maxTodayPower;

    private com.amdocs.ch.api.mobile.PowerTuple maxYearPower;

    private com.amdocs.ch.api.mobile.PowerTuple minMonthPower;

    private com.amdocs.ch.api.mobile.PowerTuple minTodayPower;

    private com.amdocs.ch.api.mobile.PowerTuple minYearPower;

    public DevicePowerSummary() {
    }

    public DevicePowerSummary(
           boolean clamp,
           java.lang.String deviceName,
           java.lang.String deviceSerial,
           com.amdocs.ch.api.mobile.PowerTuple instantPower,
           com.amdocs.ch.api.mobile.PowerTuple maxMonthPower,
           com.amdocs.ch.api.mobile.PowerTuple maxPrevDayPower,
           com.amdocs.ch.api.mobile.PowerTuple maxPrevMonthPower,
           com.amdocs.ch.api.mobile.PowerTuple maxPrevYearPower,
           com.amdocs.ch.api.mobile.PowerTuple maxTodayPower,
           com.amdocs.ch.api.mobile.PowerTuple maxYearPower,
           com.amdocs.ch.api.mobile.PowerTuple minMonthPower,
           com.amdocs.ch.api.mobile.PowerTuple minTodayPower,
           com.amdocs.ch.api.mobile.PowerTuple minYearPower) {
           this.clamp = clamp;
           this.deviceName = deviceName;
           this.deviceSerial = deviceSerial;
           this.instantPower = instantPower;
           this.maxMonthPower = maxMonthPower;
           this.maxPrevDayPower = maxPrevDayPower;
           this.maxPrevMonthPower = maxPrevMonthPower;
           this.maxPrevYearPower = maxPrevYearPower;
           this.maxTodayPower = maxTodayPower;
           this.maxYearPower = maxYearPower;
           this.minMonthPower = minMonthPower;
           this.minTodayPower = minTodayPower;
           this.minYearPower = minYearPower;
    }


    /**
     * Gets the clamp value for this DevicePowerSummary.
     * 
     * @return clamp
     */
    public boolean isClamp() {
        return clamp;
    }


    /**
     * Sets the clamp value for this DevicePowerSummary.
     * 
     * @param clamp
     */
    public void setClamp(boolean clamp) {
        this.clamp = clamp;
    }


    /**
     * Gets the deviceName value for this DevicePowerSummary.
     * 
     * @return deviceName
     */
    public java.lang.String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this DevicePowerSummary.
     * 
     * @param deviceName
     */
    public void setDeviceName(java.lang.String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceSerial value for this DevicePowerSummary.
     * 
     * @return deviceSerial
     */
    public java.lang.String getDeviceSerial() {
        return deviceSerial;
    }


    /**
     * Sets the deviceSerial value for this DevicePowerSummary.
     * 
     * @param deviceSerial
     */
    public void setDeviceSerial(java.lang.String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }


    /**
     * Gets the instantPower value for this DevicePowerSummary.
     * 
     * @return instantPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getInstantPower() {
        return instantPower;
    }


    /**
     * Sets the instantPower value for this DevicePowerSummary.
     * 
     * @param instantPower
     */
    public void setInstantPower(com.amdocs.ch.api.mobile.PowerTuple instantPower) {
        this.instantPower = instantPower;
    }


    /**
     * Gets the maxMonthPower value for this DevicePowerSummary.
     * 
     * @return maxMonthPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getMaxMonthPower() {
        return maxMonthPower;
    }


    /**
     * Sets the maxMonthPower value for this DevicePowerSummary.
     * 
     * @param maxMonthPower
     */
    public void setMaxMonthPower(com.amdocs.ch.api.mobile.PowerTuple maxMonthPower) {
        this.maxMonthPower = maxMonthPower;
    }


    /**
     * Gets the maxPrevDayPower value for this DevicePowerSummary.
     * 
     * @return maxPrevDayPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getMaxPrevDayPower() {
        return maxPrevDayPower;
    }


    /**
     * Sets the maxPrevDayPower value for this DevicePowerSummary.
     * 
     * @param maxPrevDayPower
     */
    public void setMaxPrevDayPower(com.amdocs.ch.api.mobile.PowerTuple maxPrevDayPower) {
        this.maxPrevDayPower = maxPrevDayPower;
    }


    /**
     * Gets the maxPrevMonthPower value for this DevicePowerSummary.
     * 
     * @return maxPrevMonthPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getMaxPrevMonthPower() {
        return maxPrevMonthPower;
    }


    /**
     * Sets the maxPrevMonthPower value for this DevicePowerSummary.
     * 
     * @param maxPrevMonthPower
     */
    public void setMaxPrevMonthPower(com.amdocs.ch.api.mobile.PowerTuple maxPrevMonthPower) {
        this.maxPrevMonthPower = maxPrevMonthPower;
    }


    /**
     * Gets the maxPrevYearPower value for this DevicePowerSummary.
     * 
     * @return maxPrevYearPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getMaxPrevYearPower() {
        return maxPrevYearPower;
    }


    /**
     * Sets the maxPrevYearPower value for this DevicePowerSummary.
     * 
     * @param maxPrevYearPower
     */
    public void setMaxPrevYearPower(com.amdocs.ch.api.mobile.PowerTuple maxPrevYearPower) {
        this.maxPrevYearPower = maxPrevYearPower;
    }


    /**
     * Gets the maxTodayPower value for this DevicePowerSummary.
     * 
     * @return maxTodayPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getMaxTodayPower() {
        return maxTodayPower;
    }


    /**
     * Sets the maxTodayPower value for this DevicePowerSummary.
     * 
     * @param maxTodayPower
     */
    public void setMaxTodayPower(com.amdocs.ch.api.mobile.PowerTuple maxTodayPower) {
        this.maxTodayPower = maxTodayPower;
    }


    /**
     * Gets the maxYearPower value for this DevicePowerSummary.
     * 
     * @return maxYearPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getMaxYearPower() {
        return maxYearPower;
    }


    /**
     * Sets the maxYearPower value for this DevicePowerSummary.
     * 
     * @param maxYearPower
     */
    public void setMaxYearPower(com.amdocs.ch.api.mobile.PowerTuple maxYearPower) {
        this.maxYearPower = maxYearPower;
    }


    /**
     * Gets the minMonthPower value for this DevicePowerSummary.
     * 
     * @return minMonthPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getMinMonthPower() {
        return minMonthPower;
    }


    /**
     * Sets the minMonthPower value for this DevicePowerSummary.
     * 
     * @param minMonthPower
     */
    public void setMinMonthPower(com.amdocs.ch.api.mobile.PowerTuple minMonthPower) {
        this.minMonthPower = minMonthPower;
    }


    /**
     * Gets the minTodayPower value for this DevicePowerSummary.
     * 
     * @return minTodayPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getMinTodayPower() {
        return minTodayPower;
    }


    /**
     * Sets the minTodayPower value for this DevicePowerSummary.
     * 
     * @param minTodayPower
     */
    public void setMinTodayPower(com.amdocs.ch.api.mobile.PowerTuple minTodayPower) {
        this.minTodayPower = minTodayPower;
    }


    /**
     * Gets the minYearPower value for this DevicePowerSummary.
     * 
     * @return minYearPower
     */
    public com.amdocs.ch.api.mobile.PowerTuple getMinYearPower() {
        return minYearPower;
    }


    /**
     * Sets the minYearPower value for this DevicePowerSummary.
     * 
     * @param minYearPower
     */
    public void setMinYearPower(com.amdocs.ch.api.mobile.PowerTuple minYearPower) {
        this.minYearPower = minYearPower;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DevicePowerSummary)) return false;
        DevicePowerSummary other = (DevicePowerSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clamp == other.isClamp() &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.deviceSerial==null && other.getDeviceSerial()==null) || 
             (this.deviceSerial!=null &&
              this.deviceSerial.equals(other.getDeviceSerial()))) &&
            ((this.instantPower==null && other.getInstantPower()==null) || 
             (this.instantPower!=null &&
              this.instantPower.equals(other.getInstantPower()))) &&
            ((this.maxMonthPower==null && other.getMaxMonthPower()==null) || 
             (this.maxMonthPower!=null &&
              this.maxMonthPower.equals(other.getMaxMonthPower()))) &&
            ((this.maxPrevDayPower==null && other.getMaxPrevDayPower()==null) || 
             (this.maxPrevDayPower!=null &&
              this.maxPrevDayPower.equals(other.getMaxPrevDayPower()))) &&
            ((this.maxPrevMonthPower==null && other.getMaxPrevMonthPower()==null) || 
             (this.maxPrevMonthPower!=null &&
              this.maxPrevMonthPower.equals(other.getMaxPrevMonthPower()))) &&
            ((this.maxPrevYearPower==null && other.getMaxPrevYearPower()==null) || 
             (this.maxPrevYearPower!=null &&
              this.maxPrevYearPower.equals(other.getMaxPrevYearPower()))) &&
            ((this.maxTodayPower==null && other.getMaxTodayPower()==null) || 
             (this.maxTodayPower!=null &&
              this.maxTodayPower.equals(other.getMaxTodayPower()))) &&
            ((this.maxYearPower==null && other.getMaxYearPower()==null) || 
             (this.maxYearPower!=null &&
              this.maxYearPower.equals(other.getMaxYearPower()))) &&
            ((this.minMonthPower==null && other.getMinMonthPower()==null) || 
             (this.minMonthPower!=null &&
              this.minMonthPower.equals(other.getMinMonthPower()))) &&
            ((this.minTodayPower==null && other.getMinTodayPower()==null) || 
             (this.minTodayPower!=null &&
              this.minTodayPower.equals(other.getMinTodayPower()))) &&
            ((this.minYearPower==null && other.getMinYearPower()==null) || 
             (this.minYearPower!=null &&
              this.minYearPower.equals(other.getMinYearPower())));
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
        _hashCode += (isClamp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getDeviceSerial() != null) {
            _hashCode += getDeviceSerial().hashCode();
        }
        if (getInstantPower() != null) {
            _hashCode += getInstantPower().hashCode();
        }
        if (getMaxMonthPower() != null) {
            _hashCode += getMaxMonthPower().hashCode();
        }
        if (getMaxPrevDayPower() != null) {
            _hashCode += getMaxPrevDayPower().hashCode();
        }
        if (getMaxPrevMonthPower() != null) {
            _hashCode += getMaxPrevMonthPower().hashCode();
        }
        if (getMaxPrevYearPower() != null) {
            _hashCode += getMaxPrevYearPower().hashCode();
        }
        if (getMaxTodayPower() != null) {
            _hashCode += getMaxTodayPower().hashCode();
        }
        if (getMaxYearPower() != null) {
            _hashCode += getMaxYearPower().hashCode();
        }
        if (getMinMonthPower() != null) {
            _hashCode += getMinMonthPower().hashCode();
        }
        if (getMinTodayPower() != null) {
            _hashCode += getMinTodayPower().hashCode();
        }
        if (getMinYearPower() != null) {
            _hashCode += getMinYearPower().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DevicePowerSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "devicePowerSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("deviceSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instantPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instantPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMonthPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxMonthPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPrevDayPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPrevDayPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPrevMonthPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPrevMonthPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPrevYearPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPrevYearPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTodayPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTodayPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxYearPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxYearPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMonthPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minMonthPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minTodayPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minTodayPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minYearPower");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minYearPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "powerTuple"));
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
