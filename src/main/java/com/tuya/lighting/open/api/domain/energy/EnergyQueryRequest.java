package com.tuya.lighting.open.api.domain.energy;

/**
 * Request for energy query
 *
 * @author lighting
 */
public class EnergyQueryRequest {

    /**
     * project id
     */
    private String projectId;

    /**
     * room id
     */
    private String roomId;

    /**
     * target type
     */
    private Integer targetType;

    /**
     * start time
     */
    private Long startTime;

    /**
     * end time
     */
    private Long endTime;

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

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
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
}
