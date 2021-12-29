package com.tuya.lighting.open.api.domain.device;

import java.util.List;

/**
 * Request for device multi control
 *
 * @author lighting
 */
public class DeviceMultiControlRequest {

    /**
     * project id
     */
    private String projectId;

    /**
     * device ids
     */
    private List<String> deviceIds;

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

    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
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
