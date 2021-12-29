package com.tuya.lighting.open.api.domain.smart.scene;

/**
 * Request for action property
 *
 * @author lighting
 */
public class ActionPropertyRequest {

    /**
     * device type
     */
    private String deviceType;

    /**
     * room id
     */
    private String roomId;

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}
