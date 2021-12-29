package com.tuya.lighting.open.api.domain.task;

import java.util.List;

/**
 * Item of record list
 */
public class RecordListItem {

    /**
     * record id
     */
    private String recordId;

    /**
     * task number
     */
    private String taskNum;

    /**
     * user account
     */
    private String userAccount;

    /**
     * country code
     */
    private String countryCode;

    /**
     * operator name
     */
    private String operatorName;

    /**
     * operator uid
     */
    private String operatorUid;

    /**
     * address
     */
    private String address;

    /**
     * start time
     */
    private Long startTime;

    /**
     * 施工结束时间
     */
    private Long endTime;

    /**
     * device count
     */
    private Integer deviceCount;

    /**
     * task status, 0-unassigned, 1-waiting，2-in construction, 3-finished, 4-delay
     */
    private Integer taskStatus;

    /**
     * authorization status, 0-not be authorized, 1-be authorized, 2-expired 3-cancel
     */
    private Integer authorizationStatus;

    /**
     * room name
     */
    private List<String> roomName;

    /**
     * count of finished devices
     */
    private String deviceCountFinish;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorUid() {
        return operatorUid;
    }

    public void setOperatorUid(String operatorUid) {
        this.operatorUid = operatorUid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
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

    public List<String> getRoomName() {
        return roomName;
    }

    public void setRoomName(List<String> roomName) {
        this.roomName = roomName;
    }

    public String getDeviceCountFinish() {
        return deviceCountFinish;
    }

    public void setDeviceCountFinish(String deviceCountFinish) {
        this.deviceCountFinish = deviceCountFinish;
    }
}
