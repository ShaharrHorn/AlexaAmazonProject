/**
 * Site.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.publicapi.service;

public class Site  implements java.io.Serializable {
    private java.lang.String abbrLabel;

    private java.util.Calendar lastUpdateDate;

    private com.amdocs.ch.publicapi.service.Id siteId;

    private java.lang.String siteLabel;

    private java.lang.String siteReference;

    public Site() {
    }

    public Site(
           java.lang.String abbrLabel,
           java.util.Calendar lastUpdateDate,
           com.amdocs.ch.publicapi.service.Id siteId,
           java.lang.String siteLabel,
           java.lang.String siteReference) {
           this.abbrLabel = abbrLabel;
           this.lastUpdateDate = lastUpdateDate;
           this.siteId = siteId;
           this.siteLabel = siteLabel;
           this.siteReference = siteReference;
    }


    /**
     * Gets the abbrLabel value for this Site.
     * 
     * @return abbrLabel
     */
    public java.lang.String getAbbrLabel() {
        return abbrLabel;
    }


    /**
     * Sets the abbrLabel value for this Site.
     * 
     * @param abbrLabel
     */
    public void setAbbrLabel(java.lang.String abbrLabel) {
        this.abbrLabel = abbrLabel;
    }


    /**
     * Gets the lastUpdateDate value for this Site.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this Site.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the siteId value for this Site.
     * 
     * @return siteId
     */
    public com.amdocs.ch.publicapi.service.Id getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this Site.
     * 
     * @param siteId
     */
    public void setSiteId(com.amdocs.ch.publicapi.service.Id siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the siteLabel value for this Site.
     * 
     * @return siteLabel
     */
    public java.lang.String getSiteLabel() {
        return siteLabel;
    }


    /**
     * Sets the siteLabel value for this Site.
     * 
     * @param siteLabel
     */
    public void setSiteLabel(java.lang.String siteLabel) {
        this.siteLabel = siteLabel;
    }


    /**
     * Gets the siteReference value for this Site.
     * 
     * @return siteReference
     */
    public java.lang.String getSiteReference() {
        return siteReference;
    }


    /**
     * Sets the siteReference value for this Site.
     * 
     * @param siteReference
     */
    public void setSiteReference(java.lang.String siteReference) {
        this.siteReference = siteReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Site)) return false;
        Site other = (Site) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abbrLabel==null && other.getAbbrLabel()==null) || 
             (this.abbrLabel!=null &&
              this.abbrLabel.equals(other.getAbbrLabel()))) &&
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.siteLabel==null && other.getSiteLabel()==null) || 
             (this.siteLabel!=null &&
              this.siteLabel.equals(other.getSiteLabel()))) &&
            ((this.siteReference==null && other.getSiteReference()==null) || 
             (this.siteReference!=null &&
              this.siteReference.equals(other.getSiteReference())));
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
        if (getAbbrLabel() != null) {
            _hashCode += getAbbrLabel().hashCode();
        }
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getSiteLabel() != null) {
            _hashCode += getSiteLabel().hashCode();
        }
        if (getSiteReference() != null) {
            _hashCode += getSiteReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Site.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.publicapi.ch.amdocs.com/", "site"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbrLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abbrLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.publicapi.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteReference"));
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
