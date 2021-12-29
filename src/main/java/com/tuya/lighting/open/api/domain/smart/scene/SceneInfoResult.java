package com.tuya.lighting.open.api.domain.smart.scene;

import java.util.List;

/**
 * Result of scene info
 *
 * @author lighting
 */
public class SceneInfoResult {

    /**
     * rule id
     */
    private String ruleId;

    /**
     * name
     */
    private String name;

    /**
     * project id
     */
    private String projectId;

    /**
     * background
     */
    private String background;

    /**
     * display icon
     */
    private String displayIcon;

    /**
     * display color
     */
    private String displayColor;

    /**
     * extend info
     */
    private String extendInfo;

    /**
     * type
     */
    private Integer type;

    /**
     * room id
     */
    private String roomId;

    /**
     * device ids
     */
    private List<String> deviceIds;

    /**
     * actions
     */
    private List<Action> actions;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public void setDisplayIcon(String displayIcon) {
        this.displayIcon = displayIcon;
    }

    public String getDisplayColor() {
        return displayColor;
    }

    public void setDisplayColor(String displayColor) {
        this.displayColor = displayColor;
    }

    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}
