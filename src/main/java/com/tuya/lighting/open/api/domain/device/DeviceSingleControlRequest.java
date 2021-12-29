package com.tuya.lighting.open.api.domain.device;

/**
 * Request for device single control
 */
public class DeviceSingleControlRequest {

    /**
     * project id
     */
    private String projectId;

    /**
     * device id
     */
    private String deviceId;

    /**
     * dp code
     */
    private String dpCode;

    /**
     * dp value
     */
    private String dpValue;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDpCode() {
        return dpCode;
    }

    public void setDpCode(String dpCode) {
        this.dpCode = dpCode;
    }

    public String getDpValue() {
        return dpValue;
    }

    public void setDpValue(String dpValue) {
        this.dpValue = dpValue;
    }
}
