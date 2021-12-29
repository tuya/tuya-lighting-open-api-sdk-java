package com.tuya.lighting.open.api.domain.smart.scene;

import java.util.List;

/**
 * Result of saving scene
 *
 * @author lighting
 */
public class SceneSaveResult {

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
     * room id
     */
    private String roomId;

    /**
     * type
     */
    private Integer type;

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

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}
