package com.tuya.lighting.open.api.domain.task;

import com.tuya.lighting.open.api.domain.PageQuery;

import java.util.List;

/**
 * Request for record list
 *
 * @author lighting
 */
public class RecordListRequest extends PageQuery {

    /**
     * project id
     */
    private String projectId;

    /**
     * authorization status, 0-not be authorized, 1-be authorized, 2-expired 3-cancel
     */
    private List<String> authorizationStatus;

    /**
     * operator name
     */
    private String operatorName;

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

    public List<String> getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(List<String> authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
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
