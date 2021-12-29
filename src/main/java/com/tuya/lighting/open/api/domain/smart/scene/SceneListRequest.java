package com.tuya.lighting.open.api.domain.smart.scene;

import java.util.List;

/**
 * Request for scene list
 *
 * @author lighting
 */
public class SceneListRequest {

    /**
     * project id
     */
    private String projectId;

    /**
     * room ids
     */
    private List<String> roomIds;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(List<String> roomIds) {
        this.roomIds = roomIds;
    }
}
