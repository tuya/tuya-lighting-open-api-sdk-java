package com.tuya.lighting.open.api.domain.device;

import com.tuya.lighting.open.api.domain.PageQuery;

import java.util.List;

/**
 * Request for device list
 *
 * @author lighting
 */
public class DeviceListRequest extends PageQuery {

    /**
     * project id
     */
    private String projectId;

    /**
     * room id
     */
    private String roomId;

    /**
     * room type
     */
    private Integer roomType;

    /**
     * device status
     */
    private List<String> deviceStatus;

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

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public List<String> getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(List<String> deviceStatus) {
        this.deviceStatus = deviceStatus;
    }
}
