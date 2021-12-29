package com.tuya.lighting.open.api.domain.task;

import java.util.List;

/**
 * Request of creating a record
 *
 * @author lighting
 */
public class RecordCreateRequest {

    /**
     * request type
     */
    private Integer requestType;

    /**
     * record id
     */
    private String recordId;

    /**
     * project id
     */
    private String projectId;

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
     * device types, 0: smart bump, 1：gateway, 3：switch, 4：sensor
     */
    private List<Integer> deviceTypes;

    /**
     * start time
     */
    private Long startTime;

    /**
     * end time
     */
    private Long endTime;

    /**
     * remark
     */
    private String remark;

    /**
     * room ids
     */
    private List<String> roomIds;

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public List<Integer> getDeviceTypes() {
        return deviceTypes;
    }

    public void setDeviceTypes(List<Integer> deviceTypes) {
        this.deviceTypes = deviceTypes;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<String> getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(List<String> roomIds) {
        this.roomIds = roomIds;
    }
}
