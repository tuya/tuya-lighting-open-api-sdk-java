package com.tuya.lighting.open.api.domain.room;

/**
 * Result of creating a room
 *
 * @author lighting
 */
public class RoomCreateResult {

    /**
     * room id
     */
    private String roomId;

    /**
     * current brightness
     */
    private Integer currentBrightness;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getCurrentBrightness() {
        return currentBrightness;
    }

    public void setCurrentBrightness(Integer currentBrightness) {
        this.currentBrightness = currentBrightness;
    }
}
