package com.tuya.lighting.open.api.domain.alarm;

/**
 * Item of alarm list
 *
 * @author lighting
 */
public class AlarmListItem {

    /**
     * id
     */
    private Long id;

    /**
     * custom event id
     */
    private String customEventId;

    /**
     * unique id
     */
    private String relationId;

    /**
     * category
     */
    private String category;

    /**
     * category code 1-custom alarm 2-lighting 3-electrician 4-safe guard
     */
    private String categoryCode;

    /**
     * project id
     */
    private String projectId;

    /**
     * room id
     */
    private String roomId;

    /**
     * room name
     */
    private String roomName;

    /**
     * device id
     */
    private String deviceId;

    /**
     * device name
     */
    private String deviceName;

    /**
     * device top category
     */
    private String deviceTopCategory;

    /**
     * alarm event
     */
    private String alarmEvent;

    /**
     * alarm time
     */
    private Long alarmTime;

    /**
     * alarm type 1-alarm 2-exception
     */
    private Integer alarmType;

    /**
     * alarm subtype, 0-custom event alarm/exception, 1-device offline
     */
    private Integer alarmSubType;

    /**
     * disalarm or not
     */
    private Boolean disalarm;

    /**
     * disalarm time
     */
    private Long disalarmTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomEventId() {
        return customEventId;
    }

    public void setCustomEventId(String customEventId) {
        this.customEventId = customEventId;
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

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

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceTopCategory() {
        return deviceTopCategory;
    }

    public void setDeviceTopCategory(String deviceTopCategory) {
        this.deviceTopCategory = deviceTopCategory;
    }

    public String getAlarmEvent() {
        return alarmEvent;
    }

    public void setAlarmEvent(String alarmEvent) {
        this.alarmEvent = alarmEvent;
    }

    public Long getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public Integer getAlarmSubType() {
        return alarmSubType;
    }

    public void setAlarmSubType(Integer alarmSubType) {
        this.alarmSubType = alarmSubType;
    }

    public Boolean getDisalarm() {
        return disalarm;
    }

    public void setDisalarm(Boolean disalarm) {
        this.disalarm = disalarm;
    }

    public Long getDisalarmTime() {
        return disalarmTime;
    }

    public void setDisalarmTime(Long disalarmTime) {
        this.disalarmTime = disalarmTime;
    }
}
