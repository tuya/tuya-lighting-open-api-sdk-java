package com.tuya.lighting.open.api.domain.device;

/**
 * Result of device delete
 *
 * @author lighting
 */
public class DeviceDeleteRequest {

    /**
     * project id
     */
    private String projectId;

    /**
     * device id
     */
    private String deviceId;

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
}
