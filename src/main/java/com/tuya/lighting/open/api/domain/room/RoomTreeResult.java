package com.tuya.lighting.open.api.domain.room;

import java.util.List;

/**
 * Result of querying a room tree.
 *
 * @author lighting
 */
public class RoomTreeResult {

    /**
     * total of room device count.
     */
    private Integer totalRoomDeviceCount;

    /**
     * room list
     */
    private List<RoomTreeItem> list;

    public Integer getTotalRoomDeviceCount() {
        return totalRoomDeviceCount;
    }

    public void setTotalRoomDeviceCount(Integer totalRoomDeviceCount) {
        this.totalRoomDeviceCount = totalRoomDeviceCount;
    }

    public List<RoomTreeItem> getList() {
        return list;
    }

    public void setList(List<RoomTreeItem> list) {
        this.list = list;
    }
}
