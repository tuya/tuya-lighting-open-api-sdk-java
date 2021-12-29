package com.tuya.lighting.open.api.domain.room;

/**
 * Request of updating a room.
 *
 * @author lighting
 */
public class RoomUpdateRequest {

    /**
     * room id
     */
    private String roomId;

    /**
     * room' name
     */
    private String name;

    /**
     * room's address
     */
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
