package com.tuya.lighting.open.api.domain.group;

import java.util.List;

/**
 * Request for group updating
 *
 * @author lighting
 */
public class GroupUpdateRequest {

    /**
     * room id
     */
    private String roomId;

    /**
     * group pacakge id
     */
    private String groupPackageId;

    /**
     * name
     */
    private String name;

    /**
     * unique ids of device in SaaS
     */
    private List<String> deviceSaasIds;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getGroupPackageId() {
        return groupPackageId;
    }

    public void setGroupPackageId(String groupPackageId) {
        this.groupPackageId = groupPackageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDeviceSaasIds() {
        return deviceSaasIds;
    }

    public void setDeviceSaasIds(List<String> deviceSaasIds) {
        this.deviceSaasIds = deviceSaasIds;
    }
}
