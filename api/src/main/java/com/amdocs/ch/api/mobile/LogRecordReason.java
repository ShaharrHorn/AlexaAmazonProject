/**
 * LogRecordReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amdocs.ch.api.mobile;

public class LogRecordReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LogRecordReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SENSOR_DETECTION = "SENSOR_DETECTION";
    public static final java.lang.String _PROTECTION_ARMED = "PROTECTION_ARMED";
    public static final java.lang.String _PROTECTION_DISARMED = "PROTECTION_DISARMED";
    public static final java.lang.String _PROTECTION_SABOTAGED = "PROTECTION_SABOTAGED";
    public static final java.lang.String _PERSONALIZED_PROTECTION_ARMED = "PERSONALIZED_PROTECTION_ARMED";
    public static final java.lang.String _DEVICE_NOT_FOUND = "DEVICE_NOT_FOUND";
    public static final java.lang.String _DEVICE_IN_ORDER = "DEVICE_IN_ORDER";
    public static final java.lang.String _DEVICE_BATTERY_RUNNING_LOW = "DEVICE_BATTERY_RUNNING_LOW";
    public static final java.lang.String _DEVICE_BATTERY_NORMAL = "DEVICE_BATTERY_NORMAL";
    public static final java.lang.String _VIDEO_SESSION_STARTED_FROM_WEB_PORTAL = "VIDEO_SESSION_STARTED_FROM_WEB_PORTAL";
    public static final java.lang.String _VIDEO_SESSION_STARTED_FROM_SCENARIO = "VIDEO_SESSION_STARTED_FROM_SCENARIO";
    public static final java.lang.String _VIDEO_SESSION_STARTED_FROM_MOBILE = "VIDEO_SESSION_STARTED_FROM_MOBILE";
    public static final java.lang.String _VIDEO_SESSION_FAILED = "VIDEO_SESSION_FAILED";
    public static final java.lang.String _VIDEO_SESSION_SNAPSHOT_FAILED = "VIDEO_SESSION_SNAPSHOT_FAILED";
    public static final java.lang.String _SCENARIO_CHANGED_MODE = "SCENARIO_CHANGED_MODE";
    public static final java.lang.String _SCENARIO_TRIGGERED_BY_KEYBOARD_OR_TAG = "SCENARIO_TRIGGERED_BY_KEYBOARD_OR_TAG";
    public static final java.lang.String _GPRS_INTERNET_MODE = "GPRS_INTERNET_MODE";
    public static final java.lang.String _WIFI_INTERNET_MODE = "WIFI_INTERNET_MODE";
    public static final java.lang.String _ETHERNET_INTERNET_MODE = "ETHERNET_INTERNET_MODE";
    public static final java.lang.String _INTERNET_CONNECTION_LOST = "INTERNET_CONNECTION_LOST";
    public static final java.lang.String _INTERNET_CONNECTION_RESUMED_ETHERNET = "INTERNET_CONNECTION_RESUMED_ETHERNET";
    public static final java.lang.String _INTERNET_CONNECTION_RESUMED_WIFI = "INTERNET_CONNECTION_RESUMED_WIFI";
    public static final java.lang.String _INTERNET_CONNECTION_RESUMED_GPRS = "INTERNET_CONNECTION_RESUMED_GPRS";
    public static final java.lang.String _OPERATION_ON_BACKUP_BATTERY = "OPERATION_ON_BACKUP_BATTERY";
    public static final java.lang.String _OPERATION_ON_MAIN_POWER_SUPPLY = "OPERATION_ON_MAIN_POWER_SUPPLY";
    public static final java.lang.String _GATEWAY_BATTERY_RUNNING_LOW = "GATEWAY_BATTERY_RUNNING_LOW";
    public static final java.lang.String _GATEWAY_BATTERY_NORMAL = "GATEWAY_BATTERY_NORMAL";
    public static final java.lang.String _GATEWAY_TURNED_OFF = "GATEWAY_TURNED_OFF";
    public static final java.lang.String _GATEWAY_SOFTWARE_FAILURE = "GATEWAY_SOFTWARE_FAILURE";
    public static final java.lang.String _ALERT_MESSAGE_SENT_BY_SCENARIO = "ALERT_MESSAGE_SENT_BY_SCENARIO";
    public static final java.lang.String _SCENARIO_EXECUTED = "SCENARIO_EXECUTED";
    public static final java.lang.String _SUBSCRIPTION_SUSPENDED = "SUBSCRIPTION_SUSPENDED";
    public static final java.lang.String _SUBSCRIPTION_UNSUSPENDED = "SUBSCRIPTION_UNSUSPENDED";
    public static final java.lang.String _SUBSCRIBER_DELETED = "SUBSCRIBER_DELETED";
    public static final java.lang.String _SCENARIO_STARTED = "SCENARIO_STARTED";
    public static final java.lang.String _SCENARIO_CANCELED = "SCENARIO_CANCELED";
    public static final java.lang.String _SCENARIO_CANCEL_DONE = "SCENARIO_CANCEL_DONE";
    public static final java.lang.String _SCENARIO_ACTION_STATUS = "SCENARIO_ACTION_STATUS";
    public static final java.lang.String _RESET_INSTANT_ENERGY_POWER = "RESET_INSTANT_ENERGY_POWER";
    public static final java.lang.String _START_MAINTENANCE = "START_MAINTENANCE";
    public static final java.lang.String _END_MAINTENANCE = "END_MAINTENANCE";
    public static final java.lang.String _START_CONFIG_WIFI = "START_CONFIG_WIFI";
    public static final java.lang.String _CONFIG_CAMERA_WIFI = "CONFIG_CAMERA_WIFI";
    public static final java.lang.String _CONFIG_GATEWAY_WIFI = "CONFIG_GATEWAY_WIFI";
    public static final java.lang.String _END_CONFIG_WIFI = "END_CONFIG_WIFI";
    public static final java.lang.String _WPS_STARTED = "WPS_STARTED";
    public static final java.lang.String _EXTERNAL_REASON = "EXTERNAL_REASON";
    public static final java.lang.String _DELAYED_EVENT = "DELAYED_EVENT";
    public static final java.lang.String _CANCEL_DELAYED_EVENT = "CANCEL_DELAYED_EVENT";
    public static final java.lang.String _DOOR_SENSOR_DETECTION = "DOOR_SENSOR_DETECTION";
    public static final java.lang.String _FIRE_SENSOR_DETECTION = "FIRE_SENSOR_DETECTION";
    public static final java.lang.String _KEPAD_SENSOR_DETECTION = "KEPAD_SENSOR_DETECTION";
    public static final java.lang.String _MOTION_SENSOR_DETECTION = "MOTION_SENSOR_DETECTION";
    public static final java.lang.String _PANIC_BUTTON_DETECTION = "PANIC_BUTTON_DETECTION";
    public static final java.lang.String _WATER_SENSOR_DETECTION = "WATER_SENSOR_DETECTION";
    public static final java.lang.String _CAMERA_SENSOR_DETECTION = "CAMERA_SENSOR_DETECTION";
    public static final java.lang.String _SUBSCRIPTION_ACTIVATED = "SUBSCRIPTION_ACTIVATED";
    public static final java.lang.String _INSTALLER_LOGGED_IN = "INSTALLER_LOGGED_IN";
    public static final java.lang.String _INSTALLER_LOGGED_OUT = "INSTALLER_LOGGED_OUT";
    public static final java.lang.String _SMS_QUOTA_NOTIFICATION = "SMS_QUOTA_NOTIFICATION";
    public static final java.lang.String _SUBSCRIPTION_REPLACED = "SUBSCRIPTION_REPLACED";
    public static final java.lang.String _MPRM_RAISED_ALERT = "MPRM_RAISED_ALERT";
    public static final java.lang.String _MPRM_PULLED_ALERT = "MPRM_PULLED_ALERT";
    public static final java.lang.String _FIRMWARE_UPDATE_NEEDED = "FIRMWARE_UPDATE_NEEDED";
    public static final java.lang.String _FIRMWARE_UPDATE_START = "FIRMWARE_UPDATE_START";
    public static final java.lang.String _FIRMWARE_UPDATE_END = "FIRMWARE_UPDATE_END";
    public static final java.lang.String _DEVICE_ADDED = "DEVICE_ADDED";
    public static final java.lang.String _DEVICE_REMOVED = "DEVICE_REMOVED";
    public static final java.lang.String _START_ALERT = "START_ALERT";
    public static final java.lang.String _USER_ALERT_SEEN = "USER_ALERT_SEEN";
    public static final java.lang.String _USER_ALERT_MANAGING = "USER_ALERT_MANAGING";
    public static final java.lang.String _USER_ALERT_SIRENS_OFF = "USER_ALERT_SIRENS_OFF";
    public static final java.lang.String _USER_ALERT_STOP = "USER_ALERT_STOP";
    public static final java.lang.String _DISARM_REQUEST_FROM_MOBILE = "DISARM_REQUEST_FROM_MOBILE";
    public static final java.lang.String _DISARM_REQUEST_FROM_WEB = "DISARM_REQUEST_FROM_WEB";
    public static final java.lang.String _DISARM_REQUEST_FROM_IFTTT = "DISARM_REQUEST_FROM_IFTTT";
    public static final java.lang.String _DISARM_REQUEST_FROM_GOOGLE = "DISARM_REQUEST_FROM_GOOGLE";
    public static final java.lang.String _DISARM_REQUEST_FROM_ALEXA = "DISARM_REQUEST_FROM_ALEXA";
    public static final java.lang.String _ARM_REQUEST_FROM_MOBILE = "ARM_REQUEST_FROM_MOBILE";
    public static final java.lang.String _ARM_REQUEST_FROM_WEB = "ARM_REQUEST_FROM_WEB";
    public static final java.lang.String _ARM_REQUEST_FROM_IFTTT = "ARM_REQUEST_FROM_IFTTT";
    public static final java.lang.String _ARM_REQUEST_FROM_GOOGLE = "ARM_REQUEST_FROM_GOOGLE";
    public static final java.lang.String _ARM_REQUEST_FROM_ALEXA = "ARM_REQUEST_FROM_ALEXA";
    public static final java.lang.String _ARM_HOME_REQUEST_FROM_MOBILE = "ARM_HOME_REQUEST_FROM_MOBILE";
    public static final java.lang.String _ARM_HOME_REQUEST_FROM_WEB = "ARM_HOME_REQUEST_FROM_WEB";
    public static final java.lang.String _ARM_HOME_REQUEST_FROM_IFTTT = "ARM_HOME_REQUEST_FROM_IFTTT";
    public static final java.lang.String _ARM_HOME_REQUEST_FROM_GOOGLE = "ARM_HOME_REQUEST_FROM_GOOGLE";
    public static final java.lang.String _ARM_HOME_REQUEST_FROM_ALEXA = "ARM_HOME_REQUEST_FROM_ALEXA";
    public static final java.lang.String _VIDEO_RECORDING_STARTED_FROM_WEB = "VIDEO_RECORDING_STARTED_FROM_WEB";
    public static final java.lang.String _VIDEO_RECORDING_STARTED_FROM_MOBILE = "VIDEO_RECORDING_STARTED_FROM_MOBILE";
    public static final java.lang.String _VIDEO_RECORDING_FAILED = "VIDEO_RECORDING_FAILED";
    public static final java.lang.String _DEVICE_OPERATED_FROM_WEB = "DEVICE_OPERATED_FROM_WEB";
    public static final java.lang.String _DEVICE_OPERATED_FROM_MOBILE = "DEVICE_OPERATED_FROM_MOBILE";
    public static final java.lang.String _DEVICE_OPERATED_FROM_IFTTT = "DEVICE_OPERATED_FROM_IFTTT";
    public static final java.lang.String _DEVICE_OPERATED_FROM_GOOGLE = "DEVICE_OPERATED_FROM_GOOGLE";
    public static final java.lang.String _DEVICE_OPERATED_FROM_ALEXA = "DEVICE_OPERATED_FROM_ALEXA";
    public static final java.lang.String _VIDEO_RECORDING_STARTED_FROM_ALERT = "VIDEO_RECORDING_STARTED_FROM_ALERT";
    public static final java.lang.String _NEW_VIDEO_RECORDING_AVAILABLE = "NEW_VIDEO_RECORDING_AVAILABLE";
    public static final java.lang.String _DOOR_WINDOW_CONTACT_EVENT = "DOOR_WINDOW_CONTACT_EVENT";
    public static final LogRecordReason SENSOR_DETECTION = new LogRecordReason(_SENSOR_DETECTION);
    public static final LogRecordReason PROTECTION_ARMED = new LogRecordReason(_PROTECTION_ARMED);
    public static final LogRecordReason PROTECTION_DISARMED = new LogRecordReason(_PROTECTION_DISARMED);
    public static final LogRecordReason PROTECTION_SABOTAGED = new LogRecordReason(_PROTECTION_SABOTAGED);
    public static final LogRecordReason PERSONALIZED_PROTECTION_ARMED = new LogRecordReason(_PERSONALIZED_PROTECTION_ARMED);
    public static final LogRecordReason DEVICE_NOT_FOUND = new LogRecordReason(_DEVICE_NOT_FOUND);
    public static final LogRecordReason DEVICE_IN_ORDER = new LogRecordReason(_DEVICE_IN_ORDER);
    public static final LogRecordReason DEVICE_BATTERY_RUNNING_LOW = new LogRecordReason(_DEVICE_BATTERY_RUNNING_LOW);
    public static final LogRecordReason DEVICE_BATTERY_NORMAL = new LogRecordReason(_DEVICE_BATTERY_NORMAL);
    public static final LogRecordReason VIDEO_SESSION_STARTED_FROM_WEB_PORTAL = new LogRecordReason(_VIDEO_SESSION_STARTED_FROM_WEB_PORTAL);
    public static final LogRecordReason VIDEO_SESSION_STARTED_FROM_SCENARIO = new LogRecordReason(_VIDEO_SESSION_STARTED_FROM_SCENARIO);
    public static final LogRecordReason VIDEO_SESSION_STARTED_FROM_MOBILE = new LogRecordReason(_VIDEO_SESSION_STARTED_FROM_MOBILE);
    public static final LogRecordReason VIDEO_SESSION_FAILED = new LogRecordReason(_VIDEO_SESSION_FAILED);
    public static final LogRecordReason VIDEO_SESSION_SNAPSHOT_FAILED = new LogRecordReason(_VIDEO_SESSION_SNAPSHOT_FAILED);
    public static final LogRecordReason SCENARIO_CHANGED_MODE = new LogRecordReason(_SCENARIO_CHANGED_MODE);
    public static final LogRecordReason SCENARIO_TRIGGERED_BY_KEYBOARD_OR_TAG = new LogRecordReason(_SCENARIO_TRIGGERED_BY_KEYBOARD_OR_TAG);
    public static final LogRecordReason GPRS_INTERNET_MODE = new LogRecordReason(_GPRS_INTERNET_MODE);
    public static final LogRecordReason WIFI_INTERNET_MODE = new LogRecordReason(_WIFI_INTERNET_MODE);
    public static final LogRecordReason ETHERNET_INTERNET_MODE = new LogRecordReason(_ETHERNET_INTERNET_MODE);
    public static final LogRecordReason INTERNET_CONNECTION_LOST = new LogRecordReason(_INTERNET_CONNECTION_LOST);
    public static final LogRecordReason INTERNET_CONNECTION_RESUMED_ETHERNET = new LogRecordReason(_INTERNET_CONNECTION_RESUMED_ETHERNET);
    public static final LogRecordReason INTERNET_CONNECTION_RESUMED_WIFI = new LogRecordReason(_INTERNET_CONNECTION_RESUMED_WIFI);
    public static final LogRecordReason INTERNET_CONNECTION_RESUMED_GPRS = new LogRecordReason(_INTERNET_CONNECTION_RESUMED_GPRS);
    public static final LogRecordReason OPERATION_ON_BACKUP_BATTERY = new LogRecordReason(_OPERATION_ON_BACKUP_BATTERY);
    public static final LogRecordReason OPERATION_ON_MAIN_POWER_SUPPLY = new LogRecordReason(_OPERATION_ON_MAIN_POWER_SUPPLY);
    public static final LogRecordReason GATEWAY_BATTERY_RUNNING_LOW = new LogRecordReason(_GATEWAY_BATTERY_RUNNING_LOW);
    public static final LogRecordReason GATEWAY_BATTERY_NORMAL = new LogRecordReason(_GATEWAY_BATTERY_NORMAL);
    public static final LogRecordReason GATEWAY_TURNED_OFF = new LogRecordReason(_GATEWAY_TURNED_OFF);
    public static final LogRecordReason GATEWAY_SOFTWARE_FAILURE = new LogRecordReason(_GATEWAY_SOFTWARE_FAILURE);
    public static final LogRecordReason ALERT_MESSAGE_SENT_BY_SCENARIO = new LogRecordReason(_ALERT_MESSAGE_SENT_BY_SCENARIO);
    public static final LogRecordReason SCENARIO_EXECUTED = new LogRecordReason(_SCENARIO_EXECUTED);
    public static final LogRecordReason SUBSCRIPTION_SUSPENDED = new LogRecordReason(_SUBSCRIPTION_SUSPENDED);
    public static final LogRecordReason SUBSCRIPTION_UNSUSPENDED = new LogRecordReason(_SUBSCRIPTION_UNSUSPENDED);
    public static final LogRecordReason SUBSCRIBER_DELETED = new LogRecordReason(_SUBSCRIBER_DELETED);
    public static final LogRecordReason SCENARIO_STARTED = new LogRecordReason(_SCENARIO_STARTED);
    public static final LogRecordReason SCENARIO_CANCELED = new LogRecordReason(_SCENARIO_CANCELED);
    public static final LogRecordReason SCENARIO_CANCEL_DONE = new LogRecordReason(_SCENARIO_CANCEL_DONE);
    public static final LogRecordReason SCENARIO_ACTION_STATUS = new LogRecordReason(_SCENARIO_ACTION_STATUS);
    public static final LogRecordReason RESET_INSTANT_ENERGY_POWER = new LogRecordReason(_RESET_INSTANT_ENERGY_POWER);
    public static final LogRecordReason START_MAINTENANCE = new LogRecordReason(_START_MAINTENANCE);
    public static final LogRecordReason END_MAINTENANCE = new LogRecordReason(_END_MAINTENANCE);
    public static final LogRecordReason START_CONFIG_WIFI = new LogRecordReason(_START_CONFIG_WIFI);
    public static final LogRecordReason CONFIG_CAMERA_WIFI = new LogRecordReason(_CONFIG_CAMERA_WIFI);
    public static final LogRecordReason CONFIG_GATEWAY_WIFI = new LogRecordReason(_CONFIG_GATEWAY_WIFI);
    public static final LogRecordReason END_CONFIG_WIFI = new LogRecordReason(_END_CONFIG_WIFI);
    public static final LogRecordReason WPS_STARTED = new LogRecordReason(_WPS_STARTED);
    public static final LogRecordReason EXTERNAL_REASON = new LogRecordReason(_EXTERNAL_REASON);
    public static final LogRecordReason DELAYED_EVENT = new LogRecordReason(_DELAYED_EVENT);
    public static final LogRecordReason CANCEL_DELAYED_EVENT = new LogRecordReason(_CANCEL_DELAYED_EVENT);
    public static final LogRecordReason DOOR_SENSOR_DETECTION = new LogRecordReason(_DOOR_SENSOR_DETECTION);
    public static final LogRecordReason FIRE_SENSOR_DETECTION = new LogRecordReason(_FIRE_SENSOR_DETECTION);
    public static final LogRecordReason KEPAD_SENSOR_DETECTION = new LogRecordReason(_KEPAD_SENSOR_DETECTION);
    public static final LogRecordReason MOTION_SENSOR_DETECTION = new LogRecordReason(_MOTION_SENSOR_DETECTION);
    public static final LogRecordReason PANIC_BUTTON_DETECTION = new LogRecordReason(_PANIC_BUTTON_DETECTION);
    public static final LogRecordReason WATER_SENSOR_DETECTION = new LogRecordReason(_WATER_SENSOR_DETECTION);
    public static final LogRecordReason CAMERA_SENSOR_DETECTION = new LogRecordReason(_CAMERA_SENSOR_DETECTION);
    public static final LogRecordReason SUBSCRIPTION_ACTIVATED = new LogRecordReason(_SUBSCRIPTION_ACTIVATED);
    public static final LogRecordReason INSTALLER_LOGGED_IN = new LogRecordReason(_INSTALLER_LOGGED_IN);
    public static final LogRecordReason INSTALLER_LOGGED_OUT = new LogRecordReason(_INSTALLER_LOGGED_OUT);
    public static final LogRecordReason SMS_QUOTA_NOTIFICATION = new LogRecordReason(_SMS_QUOTA_NOTIFICATION);
    public static final LogRecordReason SUBSCRIPTION_REPLACED = new LogRecordReason(_SUBSCRIPTION_REPLACED);
    public static final LogRecordReason MPRM_RAISED_ALERT = new LogRecordReason(_MPRM_RAISED_ALERT);
    public static final LogRecordReason MPRM_PULLED_ALERT = new LogRecordReason(_MPRM_PULLED_ALERT);
    public static final LogRecordReason FIRMWARE_UPDATE_NEEDED = new LogRecordReason(_FIRMWARE_UPDATE_NEEDED);
    public static final LogRecordReason FIRMWARE_UPDATE_START = new LogRecordReason(_FIRMWARE_UPDATE_START);
    public static final LogRecordReason FIRMWARE_UPDATE_END = new LogRecordReason(_FIRMWARE_UPDATE_END);
    public static final LogRecordReason DEVICE_ADDED = new LogRecordReason(_DEVICE_ADDED);
    public static final LogRecordReason DEVICE_REMOVED = new LogRecordReason(_DEVICE_REMOVED);
    public static final LogRecordReason START_ALERT = new LogRecordReason(_START_ALERT);
    public static final LogRecordReason USER_ALERT_SEEN = new LogRecordReason(_USER_ALERT_SEEN);
    public static final LogRecordReason USER_ALERT_MANAGING = new LogRecordReason(_USER_ALERT_MANAGING);
    public static final LogRecordReason USER_ALERT_SIRENS_OFF = new LogRecordReason(_USER_ALERT_SIRENS_OFF);
    public static final LogRecordReason USER_ALERT_STOP = new LogRecordReason(_USER_ALERT_STOP);
    public static final LogRecordReason DISARM_REQUEST_FROM_MOBILE = new LogRecordReason(_DISARM_REQUEST_FROM_MOBILE);
    public static final LogRecordReason DISARM_REQUEST_FROM_WEB = new LogRecordReason(_DISARM_REQUEST_FROM_WEB);
    public static final LogRecordReason DISARM_REQUEST_FROM_IFTTT = new LogRecordReason(_DISARM_REQUEST_FROM_IFTTT);
    public static final LogRecordReason DISARM_REQUEST_FROM_GOOGLE = new LogRecordReason(_DISARM_REQUEST_FROM_GOOGLE);
    public static final LogRecordReason DISARM_REQUEST_FROM_ALEXA = new LogRecordReason(_DISARM_REQUEST_FROM_ALEXA);
    public static final LogRecordReason ARM_REQUEST_FROM_MOBILE = new LogRecordReason(_ARM_REQUEST_FROM_MOBILE);
    public static final LogRecordReason ARM_REQUEST_FROM_WEB = new LogRecordReason(_ARM_REQUEST_FROM_WEB);
    public static final LogRecordReason ARM_REQUEST_FROM_IFTTT = new LogRecordReason(_ARM_REQUEST_FROM_IFTTT);
    public static final LogRecordReason ARM_REQUEST_FROM_GOOGLE = new LogRecordReason(_ARM_REQUEST_FROM_GOOGLE);
    public static final LogRecordReason ARM_REQUEST_FROM_ALEXA = new LogRecordReason(_ARM_REQUEST_FROM_ALEXA);
    public static final LogRecordReason ARM_HOME_REQUEST_FROM_MOBILE = new LogRecordReason(_ARM_HOME_REQUEST_FROM_MOBILE);
    public static final LogRecordReason ARM_HOME_REQUEST_FROM_WEB = new LogRecordReason(_ARM_HOME_REQUEST_FROM_WEB);
    public static final LogRecordReason ARM_HOME_REQUEST_FROM_IFTTT = new LogRecordReason(_ARM_HOME_REQUEST_FROM_IFTTT);
    public static final LogRecordReason ARM_HOME_REQUEST_FROM_GOOGLE = new LogRecordReason(_ARM_HOME_REQUEST_FROM_GOOGLE);
    public static final LogRecordReason ARM_HOME_REQUEST_FROM_ALEXA = new LogRecordReason(_ARM_HOME_REQUEST_FROM_ALEXA);
    public static final LogRecordReason VIDEO_RECORDING_STARTED_FROM_WEB = new LogRecordReason(_VIDEO_RECORDING_STARTED_FROM_WEB);
    public static final LogRecordReason VIDEO_RECORDING_STARTED_FROM_MOBILE = new LogRecordReason(_VIDEO_RECORDING_STARTED_FROM_MOBILE);
    public static final LogRecordReason VIDEO_RECORDING_FAILED = new LogRecordReason(_VIDEO_RECORDING_FAILED);
    public static final LogRecordReason DEVICE_OPERATED_FROM_WEB = new LogRecordReason(_DEVICE_OPERATED_FROM_WEB);
    public static final LogRecordReason DEVICE_OPERATED_FROM_MOBILE = new LogRecordReason(_DEVICE_OPERATED_FROM_MOBILE);
    public static final LogRecordReason DEVICE_OPERATED_FROM_IFTTT = new LogRecordReason(_DEVICE_OPERATED_FROM_IFTTT);
    public static final LogRecordReason DEVICE_OPERATED_FROM_GOOGLE = new LogRecordReason(_DEVICE_OPERATED_FROM_GOOGLE);
    public static final LogRecordReason DEVICE_OPERATED_FROM_ALEXA = new LogRecordReason(_DEVICE_OPERATED_FROM_ALEXA);
    public static final LogRecordReason VIDEO_RECORDING_STARTED_FROM_ALERT = new LogRecordReason(_VIDEO_RECORDING_STARTED_FROM_ALERT);
    public static final LogRecordReason NEW_VIDEO_RECORDING_AVAILABLE = new LogRecordReason(_NEW_VIDEO_RECORDING_AVAILABLE);
    public static final LogRecordReason DOOR_WINDOW_CONTACT_EVENT = new LogRecordReason(_DOOR_WINDOW_CONTACT_EVENT);
    public java.lang.String getValue() { return _value_;}
    public static LogRecordReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LogRecordReason enumeration = (LogRecordReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LogRecordReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogRecordReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mobile.api.ch.amdocs.com/", "logRecordReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
