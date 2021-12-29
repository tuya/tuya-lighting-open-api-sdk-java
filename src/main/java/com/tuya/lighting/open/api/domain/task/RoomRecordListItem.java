package com.tuya.lighting.open.api.domain.task;

/**
 * Item of room record list
 *
 * @author lighting
 */
public class RoomRecordListItem {

    /**
     * room id
     */
    private String roomId;

    /**
     * room name
     */
    private String roomName;

    /**
     * room type
     */
    private Integer roomType;

    /**
     * count of online devices
     */
    private Integer deviceCountOnline;

    /**
     * task status, 0-unassigned, 1-waiting，2-in construction, 3-finished, 4-delay
     */
    private Integer taskStatus;

    /**
     * authorization status, 0-not be authorized, 1-be authorized, 2-expired 3-cancel
     */
    private Integer authorizationStatus;

    /**
     * record id
     */
    private String recordId;

    /**
     * task id
     */
    private String taskId;

    /**
     * count of devices waiting for construction
     */
    private Integer deviceCountConstruction;

    /**
     * count of finished devices
     */
    private Integer deviceCountFinish;

    /**
     * room extend id
     */
    private Long roomExtendId;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Integer getDeviceCountOnline() {
        return deviceCountOnline;
    }

    public void setDeviceCountOnline(Integer deviceCountOnline) {
        this.deviceCountOnline = deviceCountOnline;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(Integer authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Integer getDeviceCountConstruction() {
        return deviceCountConstruction;
    }

    public void setDeviceCountConstruction(Integer deviceCountConstruction) {
        this.deviceCountConstruction = deviceCountConstruction;
    }

    public Integer getDeviceCountFinish() {
        return deviceCountFinish;
    }

    public void setDeviceCountFinish(Integer deviceCountFinish) {
        this.deviceCountFinish = deviceCountFinish;
    }

    public Long getRoomExtendId() {
        return roomExtendId;
    }

    public void setRoomExtendId(Long roomExtendId) {
        this.roomExtendId = roomExtendId;
    }
}
