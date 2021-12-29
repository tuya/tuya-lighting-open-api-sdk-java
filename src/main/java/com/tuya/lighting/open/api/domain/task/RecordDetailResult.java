package com.tuya.lighting.open.api.domain.task;

import java.util.List;

/**
 * Result of record detail
 *
 * @author lighting
 */
public class RecordDetailResult {

    /**
     * project id
     */
    private String projectId;

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
     * address
     */
    private String address;

    /**
     * start time
     */
    private Long startTime;

    /**
     * end time
     */
    private Long endTime;

    /**
     * count of finished devices
     */
    private Integer deviceCountFinish;

    /**
     * count of all devices
     */
    private Integer deviceCountTotal;

    /**
     * count of finished rooms
     */
    private Integer roomCountFinish;

    /**
     * count of all rooms
     */
    private Integer roomCountTotal;

    /**
     * task status, 1-waiting, 2-in construction, 3-finished，4-delay
     */
    private Integer taskStatus;

    /**
     * authorization status, 0-not be authorized, 1-be authorized, 2-expired 3-cancel
     */
    private Integer authorizationStatus;

    /**
     * remark
     */
    private String remark;

    /**
     * rooms
     */
    private List<RecordDetailRoom> rooms;

    /**
     * device types
     */
    private RecordDetailDeviceType[] deviceTypes;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

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

    public Integer getDeviceCountFinish() {
        return deviceCountFinish;
    }

    public void setDeviceCountFinish(Integer deviceCountFinish) {
        this.deviceCountFinish = deviceCountFinish;
    }

    public Integer getDeviceCountTotal() {
        return deviceCountTotal;
    }

    public void setDeviceCountTotal(Integer deviceCountTotal) {
        this.deviceCountTotal = deviceCountTotal;
    }

    public Integer getRoomCountFinish() {
        return roomCountFinish;
    }

    public void setRoomCountFinish(Integer roomCountFinish) {
        this.roomCountFinish = roomCountFinish;
    }

    public Integer getRoomCountTotal() {
        return roomCountTotal;
    }

    public void setRoomCountTotal(Integer roomCountTotal) {
        this.roomCountTotal = roomCountTotal;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<RecordDetailRoom> getRooms() {
        return rooms;
    }

    public void setRooms(List<RecordDetailRoom> rooms) {
        this.rooms = rooms;
    }

    public RecordDetailDeviceType[] getDeviceTypes() {
        return deviceTypes;
    }

    public void setDeviceTypes(RecordDetailDeviceType[] deviceTypes) {
        this.deviceTypes = deviceTypes;
    }

    /**
     * Room
     */
    public static class RecordDetailRoom {

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
        private String roomType;

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

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
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

    /**
     * DeviceType
     */
    public static class RecordDetailDeviceType {

        /**
         * ID
         */
        private Integer id;

        /**
         * name
         */
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
