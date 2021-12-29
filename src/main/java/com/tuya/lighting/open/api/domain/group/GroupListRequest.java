package com.tuya.lighting.open.api.domain.group;

import com.tuya.lighting.open.api.domain.PageQuery;

/**
 * Request for group list
 *
 * @author lighting
 */
public class GroupListRequest extends PageQuery {

    /**
     * room id
     */
    private String roomId;

    /**
     * project id
     */
    private String projectId;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
