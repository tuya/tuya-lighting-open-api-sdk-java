package com.tuya.lighting.open.api.domain.device;

import java.util.List;

/**
 * Request for device assignment
 *
 * @author lighting
 */
public class DeviceAssignRequest {

    /**
     * project id
     */
    private String projectId;

    /**
     * room id
     */
    private String roomId;

    /**
     * deviceIds
     */
    private List<String> deviceIds;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }
}
