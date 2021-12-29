package com.tuya.lighting.open.api.domain.task;

import com.tuya.lighting.open.api.domain.PageQuery;

import java.util.List;

/**
 * Request for room record list
 */
public class RoomRecordListRequest extends PageQuery {

    /**
     * project id
     */
    private String projectId;

    /**
     * 授权状态，0：未授权、1：已授权、2：已过期
     */
    private List<String> authorizationStatus;

    /**
     * 筛选条件中的房间名称
     */
    private String roomName;

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

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
