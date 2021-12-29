package com.tuya.lighting.open.api.domain.group;

import java.util.List;
import java.util.Map;

/**
 * Result of group info
 *
 * @author lighting
 */
public class GroupInfoResult {

    /**
     * group package id
     */
    private String groupPackageId;

    /**
     * room id
     */
    private String roomId;

    /**
     * top category of product
     */
    private String topCategory;

    /**
     * name
     */
    private String name;

    /**
     * group config
     */
    private String groupConfig;

    /**
     * type
     */
    private Integer type;

    /**
     * device number
     */
    private Integer deviceNum;

    /**
     * dps
     */
    private Map<String, Object> dps;

    /**
     * joined groups
     */
    private List<TinyGroup> joinedGroups;

    public String getGroupPackageId() {
        return groupPackageId;
    }

    public void setGroupPackageId(String groupPackageId) {
        this.groupPackageId = groupPackageId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getTopCategory() {
        return topCategory;
    }

    public void setTopCategory(String topCategory) {
        this.topCategory = topCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupConfig() {
        return groupConfig;
    }

    public void setGroupConfig(String groupConfig) {
        this.groupConfig = groupConfig;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }

    public Map<String, Object> getDps() {
        return dps;
    }

    public void setDps(Map<String, Object> dps) {
        this.dps = dps;
    }

    public List<TinyGroup> getJoinedGroups() {
        return joinedGroups;
    }

    public void setJoinedGroups(List<TinyGroup> joinedGroups) {
        this.joinedGroups = joinedGroups;
    }
}
