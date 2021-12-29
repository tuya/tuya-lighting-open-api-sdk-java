package com.tuya.lighting.open.api.domain.group;

/**
 * Request for support group devices
 *
 * @author lighting
 */
public class SupportGroupDevicesRequest {

    /**
     * room id
     */
    private String roomId;

    /**
     * unique id of device in SaaS
     */
    private String deviceSaasId;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getDeviceSaasId() {
        return deviceSaasId;
    }

    public void setDeviceSaasId(String deviceSaasId) {
        this.deviceSaasId = deviceSaasId;
    }
}
