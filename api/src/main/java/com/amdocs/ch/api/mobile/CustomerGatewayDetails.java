/**
 * CustomerGatewayDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class CustomerGatewayDetails  extends com.amdocs.ch.api.mobile.AbstractGatewayDetails  implements java.io.Serializable {
    private java.util.Calendar activationDate;

    private com.amdocs.ch.api.mobile.GatewayAudioFile activeWarningMessageFile;

    private com.amdocs.ch.api.mobile.GatewayArmingMode armingMode;

    private com.amdocs.ch.api.mobile.GatewayAudioFile[] audioFiles;

    private int batteryLevel;

    private com.amdocs.ch.api.mobile.GatewayConnectionType connectionType;

    private com.amdocs.ch.api.mobile.Id customerId;

    private boolean dualWifiEnabled;

    private java.util.Calendar firmwareUpdateDate;

    private com.amdocs.ch.api.mobile.Id gatewayId;

    private int gsmLevel;

    private java.lang.String ip;

    private java.lang.String mainUsername;

    private com.amdocs.ch.api.mobile.GatewayMuteMode muteMode;

    private com.amdocs.ch.api.mobile.GatewayPairingMode pairingMode;

    private com.amdocs.ch.api.mobile.ArmingPartition[] partitions;

    private com.amdocs.ch.api.mobile.WifiSettings secondaryWifiSettings;

    private java.lang.String timeZone;

    private java.lang.String userName;

    private java.lang.String vendor;

    private boolean videoEnabled;

    private com.amdocs.ch.api.mobile.SensorTriggerMode warningMessageTriggerModeWhenSystemArmed;

    private com.amdocs.ch.api.mobile.SensorTriggerMode warningMessageTriggerModeWhenSystemCustomized;

    private int wifiLevel;

    private com.amdocs.ch.api.mobile.WifiSettings wifiSettings;

    public CustomerGatewayDetails() {
    }

    public CustomerGatewayDetails(
           java.lang.String firmwareVersion,
           java.lang.String imei,
           java.lang.String manufacturerName,
           java.lang.String model,
           java.lang.String packageNumber,
           java.lang.String serial,
           java.lang.String status,
           java.util.Calendar activationDate,
           com.amdocs.ch.api.mobile.GatewayAudioFile activeWarningMessageFile,
           com.amdocs.ch.api.mobile.GatewayArmingMode armingMode,
           com.amdocs.ch.api.mobile.GatewayAudioFile[] audioFiles,
           int batteryLevel,
           com.amdocs.ch.api.mobile.GatewayConnectionType connectionType,
           com.amdocs.ch.api.mobile.Id customerId,
           boolean dualWifiEnabled,
           java.util.Calendar firmwareUpdateDate,
           com.amdocs.ch.api.mobile.Id gatewayId,
           int gsmLevel,
           java.lang.String ip,
           java.lang.String mainUsername,
           com.amdocs.ch.api.mobile.GatewayMuteMode muteMode,
           com.amdocs.ch.api.mobile.GatewayPairingMode pairingMode,
           com.amdocs.ch.api.mobile.ArmingPartition[] partitions,
           com.amdocs.ch.api.mobile.WifiSettings secondaryWifiSettings,
           java.lang.String timeZone,
           java.lang.String userName,
           java.lang.String vendor,
           boolean videoEnabled,
           com.amdocs.ch.api.mobile.SensorTriggerMode warningMessageTriggerModeWhenSystemArmed,
           com.amdocs.ch.api.mobile.SensorTriggerMode warningMessageTriggerModeWhenSystemCustomized,
           int wifiLevel,
           com.amdocs.ch.api.mobile.WifiSettings wifiSettings) {
        super(
            firmwareVersion,
            imei,
            manufacturerName,
            model,
            packageNumber,
            serial,
            status);
        this.activationDate = activationDate;
        this.activeWarningMessageFile = activeWarningMessageFile;
        this.armingMode = armingMode;
        this.audioFiles = audioFiles;
        this.batteryLevel = batteryLevel;
        this.connectionType = connectionType;
        this.customerId = customerId;
        this.dualWifiEnabled = dualWifiEnabled;
        this.firmwareUpdateDate = firmwareUpdateDate;
        this.gatewayId = gatewayId;
        this.gsmLevel = gsmLevel;
        this.ip = ip;
        this.mainUsername = mainUsername;
        this.muteMode = muteMode;
        this.pairingMode = pairingMode;
        this.partitions = partitions;
        this.secondaryWifiSettings = secondaryWifiSettings;
        this.timeZone = timeZone;
        this.userName = userName;
        this.vendor = vendor;
        this.videoEnabled = videoEnabled;
        this.warningMessageTriggerModeWhenSystemArmed = warningMessageTriggerModeWhenSystemArmed;
        this.warningMessageTriggerModeWhenSystemCustomized = warningMessageTriggerModeWhenSystemCustomized;
        this.wifiLevel = wifiLevel;
        this.wifiSettings = wifiSettings;
    }


    /**
     * Gets the activationDate value for this CustomerGatewayDetails.
     * 
     * @return activationDate
     */
    public java.util.Calendar getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this CustomerGatewayDetails.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.util.Calendar activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the activeWarningMessageFile value for this CustomerGatewayDetails.
     * 
     * @return activeWarningMessageFile
     */
    public com.amdocs.ch.api.mobile.GatewayAudioFile getActiveWarningMessageFile() {
        return activeWarningMessageFile;
    }


    /**
     * Sets the activeWarningMessageFile value for this CustomerGatewayDetails.
     * 
     * @param activeWarningMessageFile
     */
    public void setActiveWarningMessageFile(com.amdocs.ch.api.mobile.GatewayAudioFile activeWarningMessageFile) {
        this.activeWarningMessageFile = activeWarningMessageFile;
    }


    /**
     * Gets the armingMode value for this CustomerGatewayDetails.
     * 
     * @return armingMode
     */
    public com.amdocs.ch.api.mobile.GatewayArmingMode getArmingMode() {
        return armingMode;
    }


    /**
     * Sets the armingMode value for this CustomerGatewayDetails.
     * 
     * @param armingMode
     */
    public void setArmingMode(com.amdocs.ch.api.mobile.GatewayArmingMode armingMode) {
        this.armingMode = armingMode;
    }


    /**
     * Gets the audioFiles value for this CustomerGatewayDetails.
     * 
     * @return audioFiles
     */
    public com.amdocs.ch.api.mobile.GatewayAudioFile[] getAudioFiles() {
        return audioFiles;
    }


    /**
     * Sets the audioFiles value for this CustomerGatewayDetails.
     * 
     * @param audioFiles
     */
    public void setAudioFiles(com.amdocs.ch.api.mobile.GatewayAudioFile[] audioFiles) {
        this.audioFiles = audioFiles;
    }

    public com.amdocs.ch.api.mobile.GatewayAudioFile getAudioFiles(int i) {
        return this.audioFiles[i];
    }

    public void setAudioFiles(int i, com.amdocs.ch.api.mobile.GatewayAudioFile _value) {
        this.audioFiles[i] = _value;
    }


    /**
     * Gets the batteryLevel value for this CustomerGatewayDetails.
     * 
     * @return batteryLevel
     */
    public int getBatteryLevel() {
        return batteryLevel;
    }


    /**
     * Sets the batteryLevel value for this CustomerGatewayDetails.
     * 
     * @param batteryLevel
     */
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }


    /**
     * Gets the connectionType value for this CustomerGatewayDetails.
     * 
     * @return connectionType
     */
    public com.amdocs.ch.api.mobile.GatewayConnectionType getConnectionType() {
        return connectionType;
    }


    /**
     * Sets the connectionType value for this CustomerGatewayDetails.
     * 
     * @param connectionType
     */
    public void setConnectionType(com.amdocs.ch.api.mobile.GatewayConnectionType connectionType) {
        this.connectionType = connectionType;
    }


    /**
     * Gets the customerId value for this CustomerGatewayDetails.
     * 
     * @return customerId
     */
    public com.amdocs.ch.api.mobile.Id getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this CustomerGatewayDetails.
     * 
     * @param customerId
     */
    public void setCustomerId(com.amdocs.ch.api.mobile.Id customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the dualWifiEnabled value for this CustomerGatewayDetails.
     * 
     * @return dualWifiEnabled
     */
    public boolean isDualWifiEnabled() {
        return dualWifiEnabled;
    }


    /**
     * Sets the dualWifiEnabled value for this CustomerGatewayDetails.
     * 
     * @param dualWifiEnabled
     */
    public void setDualWifiEnabled(boolean dualWifiEnabled) {
        this.dualWifiEnabled = dualWifiEnabled;
    }


    /**
     * Gets the firmwareUpdateDate value for this CustomerGatewayDetails.
     * 
     * @return firmwareUpdateDate
     */
    public java.util.Calendar getFirmwareUpdateDate() {
        return firmwareUpdateDate;
    }


    /**
     * Sets the firmwareUpdateDate value for this CustomerGatewayDetails.
     * 
     * @param firmwareUpdateDate
     */
    public void setFirmwareUpdateDate(java.util.Calendar firmwareUpdateDate) {
        this.firmwareUpdateDate = firmwareUpdateDate;
    }


    /**
     * Gets the gatewayId value for this CustomerGatewayDetails.
     * 
     * @return gatewayId
     */
    public com.amdocs.ch.api.mobile.Id getGatewayId() {
        return gatewayId;
    }


    /**
     * Sets the gatewayId value for this CustomerGatewayDetails.
     * 
     * @param gatewayId
     */
    public void setGatewayId(com.amdocs.ch.api.mobile.Id gatewayId) {
        this.gatewayId = gatewayId;
    }


    /**
     * Gets the gsmLevel value for this CustomerGatewayDetails.
     * 
     * @return gsmLevel
     */
    public int getGsmLevel() {
        return gsmLevel;
    }


    /**
     * Sets the gsmLevel value for this CustomerGatewayDetails.
     * 
     * @param gsmLevel
     */
    public void setGsmLevel(int gsmLevel) {
        this.gsmLevel = gsmLevel;
    }


    /**
     * Gets the ip value for this CustomerGatewayDetails.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this CustomerGatewayDetails.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the mainUsername value for this CustomerGatewayDetails.
     * 
     * @return mainUsername
     */
    public java.lang.String getMainUsername() {
        return mainUsername;
    }


    /**
     * Sets the mainUsername value for this CustomerGatewayDetails.
     * 
     * @param mainUsername
     */
    public void setMainUsername(java.lang.String mainUsername) {
        this.mainUsername = mainUsername;
    }


    /**
     * Gets the muteMode value for this CustomerGatewayDetails.
     * 
     * @return muteMode
     */
    public com.amdocs.ch.api.mobile.GatewayMuteMode getMuteMode() {
        return muteMode;
    }


    /**
     * Sets the muteMode value for this CustomerGatewayDetails.
     * 
     * @param muteMode
     */
    public void setMuteMode(com.amdocs.ch.api.mobile.GatewayMuteMode muteMode) {
        this.muteMode = muteMode;
    }


    /**
     * Gets the pairingMode value for this CustomerGatewayDetails.
     * 
     * @return pairingMode
     */
    public com.amdocs.ch.api.mobile.GatewayPairingMode getPairingMode() {
        return pairingMode;
    }


    /**
     * Sets the pairingMode value for this CustomerGatewayDetails.
     * 
     * @param pairingMode
     */
    public void setPairingMode(com.amdocs.ch.api.mobile.GatewayPairingMode pairingMode) {
        this.pairingMode = pairingMode;
    }


    /**
     * Gets the partitions value for this CustomerGatewayDetails.
     * 
     * @return partitions
     */
    public com.amdocs.ch.api.mobile.ArmingPartition[] getPartitions() {
        return partitions;
    }


    /**
     * Sets the partitions value for this CustomerGatewayDetails.
     * 
     * @param partitions
     */
    public void setPartitions(com.amdocs.ch.api.mobile.ArmingPartition[] partitions) {
        this.partitions = partitions;
    }


    /**
     * Gets the secondaryWifiSettings value for this CustomerGatewayDetails.
     * 
     * @return secondaryWifiSettings
     */
    public com.amdocs.ch.api.mobile.WifiSettings getSecondaryWifiSettings() {
        return secondaryWifiSettings;
    }


    /**
     * Sets the secondaryWifiSettings value for this CustomerGatewayDetails.
     * 
     * @param secondaryWifiSettings
     */
    public void setSecondaryWifiSettings(com.amdocs.ch.api.mobile.WifiSettings secondaryWifiSettings) {
        this.secondaryWifiSettings = secondaryWifiSettings;
    }


    /**
     * Gets the timeZone value for this CustomerGatewayDetails.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this CustomerGatewayDetails.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the userName value for this CustomerGatewayDetails.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this CustomerGatewayDetails.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the vendor value for this CustomerGatewayDetails.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this CustomerGatewayDetails.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the videoEnabled value for this CustomerGatewayDetails.
     * 
     * @return videoEnabled
     */
    public boolean isVideoEnabled() {
        return videoEnabled;
    }


    /**
     * Sets the videoEnabled value for this CustomerGatewayDetails.
     * 
     * @param videoEnabled
     */
    public void setVideoEnabled(boolean videoEnabled) {
        this.videoEnabled = videoEnabled;
    }


    /**
     * Gets the warningMessageTriggerModeWhenSystemArmed value for this CustomerGatewayDetails.
     * 
     * @return warningMessageTriggerModeWhenSystemArmed
     */
    public com.amdocs.ch.api.mobile.SensorTriggerMode getWarningMessageTriggerModeWhenSystemArmed() {
        return warningMessageTriggerModeWhenSystemArmed;
    }


    /**
     * Sets the warningMessageTriggerModeWhenSystemArmed value for this CustomerGatewayDetails.
     * 
     * @param warningMessageTriggerModeWhenSystemArmed
     */
    public void setWarningMessageTriggerModeWhenSystemArmed(com.amdocs.ch.api.mobile.SensorTriggerMode warningMessageTriggerModeWhenSystemArmed) {
        this.warningMessageTriggerModeWhenSystemArmed = warningMessageTriggerModeWhenSystemArmed;
    }


    /**
     * Gets the warningMessageTriggerModeWhenSystemCustomized value for this CustomerGatewayDetails.
     * 
     * @return warningMessageTriggerModeWhenSystemCustomized
     */
    public com.amdocs.ch.api.mobile.SensorTriggerMode getWarningMessageTriggerModeWhenSystemCustomized() {
        return warningMessageTriggerModeWhenSystemCustomized;
    }


    /**
     * Sets the warningMessageTriggerModeWhenSystemCustomized value for this CustomerGatewayDetails.
     * 
     * @param warningMessageTriggerModeWhenSystemCustomized
     */
    public void setWarningMessageTriggerModeWhenSystemCustomized(com.amdocs.ch.api.mobile.SensorTriggerMode warningMessageTriggerModeWhenSystemCustomized) {
        this.warningMessageTriggerModeWhenSystemCustomized = warningMessageTriggerModeWhenSystemCustomized;
    }


    /**
     * Gets the wifiLevel value for this CustomerGatewayDetails.
     * 
     * @return wifiLevel
     */
    public int getWifiLevel() {
        return wifiLevel;
    }


    /**
     * Sets the wifiLevel value for this CustomerGatewayDetails.
     * 
     * @param wifiLevel
     */
    public void setWifiLevel(int wifiLevel) {
        this.wifiLevel = wifiLevel;
    }


    /**
     * Gets the wifiSettings value for this CustomerGatewayDetails.
     * 
     * @return wifiSettings
     */
    public com.amdocs.ch.api.mobile.WifiSettings getWifiSettings() {
        return wifiSettings;
    }


    /**
     * Sets the wifiSettings value for this CustomerGatewayDetails.
     * 
     * @param wifiSettings
     */
    public void setWifiSettings(com.amdocs.ch.api.mobile.WifiSettings wifiSettings) {
        this.wifiSettings = wifiSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerGatewayDetails)) return false;
        CustomerGatewayDetails other = (CustomerGatewayDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.activeWarningMessageFile==null && other.getActiveWarningMessageFile()==null) || 
             (this.activeWarningMessageFile!=null &&
              this.activeWarningMessageFile.equals(other.getActiveWarningMessageFile()))) &&
            ((this.armingMode==null && other.getArmingMode()==null) || 
             (this.armingMode!=null &&
              this.armingMode.equals(other.getArmingMode()))) &&
            ((this.audioFiles==null && other.getAudioFiles()==null) || 
             (this.audioFiles!=null &&
              java.util.Arrays.equals(this.audioFiles, other.getAudioFiles()))) &&
            this.batteryLevel == other.getBatteryLevel() &&
            ((this.connectionType==null && other.getConnectionType()==null) || 
             (this.connectionType!=null &&
              this.connectionType.equals(other.getConnectionType()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            this.dualWifiEnabled == other.isDualWifiEnabled() &&
            ((this.firmwareUpdateDate==null && other.getFirmwareUpdateDate()==null) || 
             (this.firmwareUpdateDate!=null &&
              this.firmwareUpdateDate.equals(other.getFirmwareUpdateDate()))) &&
            ((this.gatewayId==null && other.getGatewayId()==null) || 
             (this.gatewayId!=null &&
              this.gatewayId.equals(other.getGatewayId()))) &&
            this.gsmLevel == other.getGsmLevel() &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.mainUsername==null && other.getMainUsername()==null) || 
             (this.mainUsername!=null &&
              this.mainUsername.equals(other.getMainUsername()))) &&
            ((this.muteMode==null && other.getMuteMode()==null) || 
             (this.muteMode!=null &&
              this.muteMode.equals(other.getMuteMode()))) &&
            ((this.pairingMode==null && other.getPairingMode()==null) || 
             (this.pairingMode!=null &&
              this.pairingMode.equals(other.getPairingMode()))) &&
            ((this.partitions==null && other.getPartitions()==null) || 
             (this.partitions!=null &&
              java.util.Arrays.equals(this.partitions, other.getPartitions()))) &&
            ((this.secondaryWifiSettings==null && other.getSecondaryWifiSettings()==null) || 
             (this.secondaryWifiSettings!=null &&
              this.secondaryWifiSettings.equals(other.getSecondaryWifiSettings()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            this.videoEnabled == other.isVideoEnabled() &&
            ((this.warningMessageTriggerModeWhenSystemArmed==null && other.getWarningMessageTriggerModeWhenSystemArmed()==null) || 
             (this.warningMessageTriggerModeWhenSystemArmed!=null &&
              this.warningMessageTriggerModeWhenSystemArmed.equals(other.getWarningMessageTriggerModeWhenSystemArmed()))) &&
            ((this.warningMessageTriggerModeWhenSystemCustomized==null && other.getWarningMessageTriggerModeWhenSystemCustomized()==null) || 
             (this.warningMessageTriggerModeWhenSystemCustomized!=null &&
              this.warningMessageTriggerModeWhenSystemCustomized.equals(other.getWarningMessageTriggerModeWhenSystemCustomized()))) &&
            this.wifiLevel == other.getWifiLevel() &&
            ((this.wifiSettings==null && other.getWifiSettings()==null) || 
             (this.wifiSettings!=null &&
              this.wifiSettings.equals(other.getWifiSettings())));
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
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getActiveWarningMessageFile() != null) {
            _hashCode += getActiveWarningMessageFile().hashCode();
        }
        if (getArmingMode() != null) {
            _hashCode += getArmingMode().hashCode();
        }
        if (getAudioFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudioFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudioFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getBatteryLevel();
        if (getConnectionType() != null) {
            _hashCode += getConnectionType().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        _hashCode += (isDualWifiEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFirmwareUpdateDate() != null) {
            _hashCode += getFirmwareUpdateDate().hashCode();
        }
        if (getGatewayId() != null) {
            _hashCode += getGatewayId().hashCode();
        }
        _hashCode += getGsmLevel();
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getMainUsername() != null) {
            _hashCode += getMainUsername().hashCode();
        }
        if (getMuteMode() != null) {
            _hashCode += getMuteMode().hashCode();
        }
        if (getPairingMode() != null) {
            _hashCode += getPairingMode().hashCode();
        }
        if (getPartitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecondaryWifiSettings() != null) {
            _hashCode += getSecondaryWifiSettings().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        _hashCode += (isVideoEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWarningMessageTriggerModeWhenSystemArmed() != null) {
            _hashCode += getWarningMessageTriggerModeWhenSystemArmed().hashCode();
        }
        if (getWarningMessageTriggerModeWhenSystemCustomized() != null) {
            _hashCode += getWarningMessageTriggerModeWhenSystemCustomized().hashCode();
        }
        _hashCode += getWifiLevel();
        if (getWifiSettings() != null) {
            _hashCode += getWifiSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerGatewayDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "customerGatewayDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeWarningMessageFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeWarningMessageFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayAudioFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "armingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayArmingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "audioFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayAudioFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batteryLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batteryLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayConnectionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dualWifiEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dualWifiEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmwareUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "id"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gsmLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gsmLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("muteMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "muteMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayMuteMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pairingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pairingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "gatewayPairingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "armingPartition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "partition"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryWifiSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondaryWifiSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "videoEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningMessageTriggerModeWhenSystemArmed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warningMessageTriggerModeWhenSystemArmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sensorTriggerMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningMessageTriggerModeWhenSystemCustomized");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warningMessageTriggerModeWhenSystemCustomized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "sensorTriggerMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifiLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wifiLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifiSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wifiSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "wifiSettings"));
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
