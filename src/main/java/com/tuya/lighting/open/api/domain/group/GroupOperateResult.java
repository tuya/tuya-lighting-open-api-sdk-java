package com.tuya.lighting.open.api.domain.group;

import java.util.List;

/**
 * Result of group operation
 *
 * @author lighting
 */
public class GroupOperateResult {

    /**
     * group package id
     */
    private String groupPackageId;

    /**
     * task id
     */
    private String taskId;

    /**
     * expired seconds
     */
    private String expiredSeconds;

    /**
     * group ids
     */
    private List<Long> groupIds;

    public String getGroupPackageId() {
        return groupPackageId;
    }

    public void setGroupPackageId(String groupPackageId) {
        this.groupPackageId = groupPackageId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getExpiredSeconds() {
        return expiredSeconds;
    }

    public void setExpiredSeconds(String expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
    }

    public List<Long> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<Long> groupIds) {
        this.groupIds = groupIds;
    }
}
