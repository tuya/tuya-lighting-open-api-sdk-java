package com.tuya.lighting.open.api.domain.device;

import com.tuya.lighting.open.api.domain.PageQuery;

import java.util.List;

/**
 * Request for unassigned device list
 *
 * @author lighting
 */
public class UnassignedDeviceListRequest extends PageQuery {

    /**
     * project id
     */
    private String projectId;

    /**
     * device status
     */
    private List<String> deviceStatus;

    /**
     * device types
     */
    private List<Integer> deviceTypes;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(List<String> deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public List<Integer> getDeviceTypes() {
        return deviceTypes;
    }

    public void setDeviceTypes(List<Integer> deviceTypes) {
        this.deviceTypes = deviceTypes;
    }
}
