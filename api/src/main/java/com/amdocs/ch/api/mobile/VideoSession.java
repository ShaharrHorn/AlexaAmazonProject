/**
 * VideoSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class VideoSession  implements java.io.Serializable {
    private int audioPort;

    private java.lang.String fileName;

    private java.util.Calendar nextAction;

    private java.lang.String streamFlsUrl;

    private java.lang.String streamHlsUrl;

    private java.lang.String streamId;

    private java.lang.String streamRtspUrl;

    private java.lang.String streamUrl;

    private java.lang.String token;

    private int videoPort;

    private java.lang.String videoServerIp;

    public VideoSession() {
    }

    public VideoSession(
           int audioPort,
           java.lang.String fileName,
           java.util.Calendar nextAction,
           java.lang.String streamFlsUrl,
           java.lang.String streamHlsUrl,
           java.lang.String streamId,
           java.lang.String streamRtspUrl,
           java.lang.String streamUrl,
           java.lang.String token,
           int videoPort,
           java.lang.String videoServerIp) {
           this.audioPort = audioPort;
           this.fileName = fileName;
           this.nextAction = nextAction;
           this.streamFlsUrl = streamFlsUrl;
           this.streamHlsUrl = streamHlsUrl;
           this.streamId = streamId;
           this.streamRtspUrl = streamRtspUrl;
           this.streamUrl = streamUrl;
           this.token = token;
           this.videoPort = videoPort;
           this.videoServerIp = videoServerIp;
    }


    /**
     * Gets the audioPort value for this VideoSession.
     * 
     * @return audioPort
     */
    public int getAudioPort() {
        return audioPort;
    }


    /**
     * Sets the audioPort value for this VideoSession.
     * 
     * @param audioPort
     */
    public void setAudioPort(int audioPort) {
        this.audioPort = audioPort;
    }


    /**
     * Gets the fileName value for this VideoSession.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this VideoSession.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the nextAction value for this VideoSession.
     * 
     * @return nextAction
     */
    public java.util.Calendar getNextAction() {
        return nextAction;
    }


    /**
     * Sets the nextAction value for this VideoSession.
     * 
     * @param nextAction
     */
    public void setNextAction(java.util.Calendar nextAction) {
        this.nextAction = nextAction;
    }


    /**
     * Gets the streamFlsUrl value for this VideoSession.
     * 
     * @return streamFlsUrl
     */
    public java.lang.String getStreamFlsUrl() {
        return streamFlsUrl;
    }


    /**
     * Sets the streamFlsUrl value for this VideoSession.
     * 
     * @param streamFlsUrl
     */
    public void setStreamFlsUrl(java.lang.String streamFlsUrl) {
        this.streamFlsUrl = streamFlsUrl;
    }


    /**
     * Gets the streamHlsUrl value for this VideoSession.
     * 
     * @return streamHlsUrl
     */
    public java.lang.String getStreamHlsUrl() {
        return streamHlsUrl;
    }


    /**
     * Sets the streamHlsUrl value for this VideoSession.
     * 
     * @param streamHlsUrl
     */
    public void setStreamHlsUrl(java.lang.String streamHlsUrl) {
        this.streamHlsUrl = streamHlsUrl;
    }


    /**
     * Gets the streamId value for this VideoSession.
     * 
     * @return streamId
     */
    public java.lang.String getStreamId() {
        return streamId;
    }


    /**
     * Sets the streamId value for this VideoSession.
     * 
     * @param streamId
     */
    public void setStreamId(java.lang.String streamId) {
        this.streamId = streamId;
    }


    /**
     * Gets the streamRtspUrl value for this VideoSession.
     * 
     * @return streamRtspUrl
     */
    public java.lang.String getStreamRtspUrl() {
        return streamRtspUrl;
    }


    /**
     * Sets the streamRtspUrl value for this VideoSession.
     * 
     * @param streamRtspUrl
     */
    public void setStreamRtspUrl(java.lang.String streamRtspUrl) {
        this.streamRtspUrl = streamRtspUrl;
    }


    /**
     * Gets the streamUrl value for this VideoSession.
     * 
     * @return streamUrl
     */
    public java.lang.String getStreamUrl() {
        return streamUrl;
    }


    /**
     * Sets the streamUrl value for this VideoSession.
     * 
     * @param streamUrl
     */
    public void setStreamUrl(java.lang.String streamUrl) {
        this.streamUrl = streamUrl;
    }


    /**
     * Gets the token value for this VideoSession.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this VideoSession.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the videoPort value for this VideoSession.
     * 
     * @return videoPort
     */
    public int getVideoPort() {
        return videoPort;
    }


    /**
     * Sets the videoPort value for this VideoSession.
     * 
     * @param videoPort
     */
    public void setVideoPort(int videoPort) {
        this.videoPort = videoPort;
    }


    /**
     * Gets the videoServerIp value for this VideoSession.
     * 
     * @return videoServerIp
     */
    public java.lang.String getVideoServerIp() {
        return videoServerIp;
    }


    /**
     * Sets the videoServerIp value for this VideoSession.
     * 
     * @param videoServerIp
     */
    public void setVideoServerIp(java.lang.String videoServerIp) {
        this.videoServerIp = videoServerIp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoSession)) return false;
        VideoSession other = (VideoSession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.audioPort == other.getAudioPort() &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.nextAction==null && other.getNextAction()==null) || 
             (this.nextAction!=null &&
              this.nextAction.equals(other.getNextAction()))) &&
            ((this.streamFlsUrl==null && other.getStreamFlsUrl()==null) || 
             (this.streamFlsUrl!=null &&
              this.streamFlsUrl.equals(other.getStreamFlsUrl()))) &&
            ((this.streamHlsUrl==null && other.getStreamHlsUrl()==null) || 
             (this.streamHlsUrl!=null &&
              this.streamHlsUrl.equals(other.getStreamHlsUrl()))) &&
            ((this.streamId==null && other.getStreamId()==null) || 
             (this.streamId!=null &&
              this.streamId.equals(other.getStreamId()))) &&
            ((this.streamRtspUrl==null && other.getStreamRtspUrl()==null) || 
             (this.streamRtspUrl!=null &&
              this.streamRtspUrl.equals(other.getStreamRtspUrl()))) &&
            ((this.streamUrl==null && other.getStreamUrl()==null) || 
             (this.streamUrl!=null &&
              this.streamUrl.equals(other.getStreamUrl()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            this.videoPort == other.getVideoPort() &&
            ((this.videoServerIp==null && other.getVideoServerIp()==null) || 
             (this.videoServerIp!=null &&
              this.videoServerIp.equals(other.getVideoServerIp())));
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
        _hashCode += getAudioPort();
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getNextAction() != null) {
            _hashCode += getNextAction().hashCode();
        }
        if (getStreamFlsUrl() != null) {
            _hashCode += getStreamFlsUrl().hashCode();
        }
        if (getStreamHlsUrl() != null) {
            _hashCode += getStreamHlsUrl().hashCode();
        }
        if (getStreamId() != null) {
            _hashCode += getStreamId().hashCode();
        }
        if (getStreamRtspUrl() != null) {
            _hashCode += getStreamRtspUrl().hashCode();
        }
        if (getStreamUrl() != null) {
            _hashCode += getStreamUrl().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        _hashCode += getVideoPort();
        if (getVideoServerIp() != null) {
            _hashCode += getVideoServerIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "videoSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "audioPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("nextAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamFlsUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streamFlsUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamHlsUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streamHlsUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streamId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamRtspUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streamRtspUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streamUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoServerIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoServerIp"));
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
