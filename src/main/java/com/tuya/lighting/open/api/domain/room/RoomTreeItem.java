package com.tuya.lighting.open.api.domain.room;

import java.util.List;

/**
 * Item of room tree.
 *
 * @author lighting
 */
public class RoomTreeItem {

    /**
     * room id
     */
    private String roomId;

    /**
     * room's name
     */
    private String name;

    /**
     * room's address
     */
    private String address;

    /**
     * room type, 1-building, 2-floor, 4-room
     */
    private Integer roomType;

    /**
     * source of a room, 1-custom, 2-unassigned
     */
    private Integer roomSource;

    /**
     * child rooms
     */
    private List<RoomTreeItem> rooms;

    /**
     * current brightness
     */
    private Integer currentBrightness;

    /**
     * device count
     */
    private Integer deviceCount;

    /**
     * room device count, the sum of numbers of devices in the public area and child rooms
     */
    private Integer roomDeviceCount;

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

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Integer getRoomSource() {
        return roomSource;
    }

    public void setRoomSource(Integer roomSource) {
        this.roomSource = roomSource;
    }

    public List<RoomTreeItem> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomTreeItem> rooms) {
        this.rooms = rooms;
    }

    public Integer getCurrentBrightness() {
        return currentBrightness;
    }

    public void setCurrentBrightness(Integer currentBrightness) {
        this.currentBrightness = currentBrightness;
    }

    public Integer getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
    }

    public Integer getRoomDeviceCount() {
        return roomDeviceCount;
    }

    public void setRoomDeviceCount(Integer roomDeviceCount) {
        this.roomDeviceCount = roomDeviceCount;
    }
}
