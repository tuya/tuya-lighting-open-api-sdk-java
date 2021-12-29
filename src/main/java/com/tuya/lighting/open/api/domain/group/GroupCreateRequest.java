package com.tuya.lighting.open.api.domain.group;

import java.util.List;

/**
 * Request for group creating
 *
 * @author lighting
 */
public class GroupCreateRequest {

    /**
     * room id
     */
    private String roomId;

    /**
     * name
     */
    private String name;

    /**
     * top category of product
     */
    private String topCategory;

    /**
     * unique id of device in SaaS
     */
    private List<String> deviceSaasIds;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopCategory() {
        return topCategory;
    }

    public void setTopCategory(String topCategory) {
        this.topCategory = topCategory;
    }

    public List<String> getDeviceSaasIds() {
        return deviceSaasIds;
    }

    public void setDeviceSaasIds(List<String> deviceSaasIds) {
        this.deviceSaasIds = deviceSaasIds;
    }
}
