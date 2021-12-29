package com.tuya.lighting.open.api.domain.account;

import java.util.List;

/**
 * Request for adding permission
 *
 * @author lighting
 */
public class AddPermissionRequest {

    /**
     * project id
     */
    private String projectId;

    /**
     * tuyaUid
     */
    private String tuyaUid;

    /**
     * room id list
     */
    private List<String> roomIdList;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTuyaUid() {
        return tuyaUid;
    }

    public void setTuyaUid(String tuyaUid) {
        this.tuyaUid = tuyaUid;
    }

    public List<String> getRoomIdList() {
        return roomIdList;
    }

    public void setRoomIdList(List<String> roomIdList) {
        this.roomIdList = roomIdList;
    }
}
