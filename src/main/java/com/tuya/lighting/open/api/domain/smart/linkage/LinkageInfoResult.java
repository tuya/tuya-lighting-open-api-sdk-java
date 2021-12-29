package com.tuya.lighting.open.api.domain.smart.linkage;

import com.tuya.lighting.open.api.domain.smart.scene.Action;

import java.util.List;

/**
 * Result of linakge info
 *
 * @author lighting
 */
public class LinkageInfoResult {

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
     * display color
     */
    private String displayColor;

    /**
     * extend info
     */
    private String extendInfo;

    /**
     * enabled
     */
    private Boolean enabled;

    /**
     * match type
     */
    private Integer matchType;

    /**
     * actions
     */
    private List<Action> actions;

    /**
     * preconditions
     */
    private List<Precondition> preconditions;

    /**
     * conditions
     */
    private List<Condition> conditions;

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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getMatchType() {
        return matchType;
    }

    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Precondition> getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(List<Precondition> preconditions) {
        this.preconditions = preconditions;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }
}
