package com.tuya.lighting.open.api.domain.room;

/**
 * Request of creating a room
 *
 * @author lighting
 */
public class RoomCreateRequest {

    /**
     * project id
     */
    private String projectId;

    /**
     * room's name
     */
    private String name;

    /**
     * id of parent room, being 0 if there is no parent room
     */
    private String parentId;

    /**
     * room type, 1-building, 2-floor, 4-room
     */
    private Integer roomType;

    /**
     * room's address
     */
    private String address;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
