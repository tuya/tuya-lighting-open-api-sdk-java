package com.tuya.lighting.open.api.domain.device;

/**
 * Result of device assignment
 *
 * @author lighting
 */
public class DeviceAssignResult {

    /**
     * expired seconds
     */
    private Integer expiredSeconds;

    /**
     * task id
     */
    private String taskId;

    public Integer getExpiredSeconds() {
        return expiredSeconds;
    }

    public void setExpiredSeconds(Integer expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
