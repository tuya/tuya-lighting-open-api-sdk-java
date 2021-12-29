package com.tuya.lighting.open.api.domain.smart.linkage;

import com.tuya.lighting.open.api.domain.smart.scene.Action;

import java.util.List;

/**
 * Request saving linkage
 *
 * @author lighting
 */
public class LinkageSaveRequest {

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
     * enabled
     */
    private Boolean enabled;

    /**
     * match type
     */
    private Integer matchType;

    /**
     * new local scene
     */
    private Boolean newLocalScene;

    /**
     * actions
     */
    private List<Action> actions;

    /**
     * conditions
     */
    private List<Condition> conditions;

    /**
     * preconditions
     */
    private List<Precondition> preconditions;

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

    public Boolean getNewLocalScene() {
        return newLocalScene;
    }

    public void setNewLocalScene(Boolean newLocalScene) {
        this.newLocalScene = newLocalScene;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public List<Precondition> getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(List<Precondition> preconditions) {
        this.preconditions = preconditions;
    }
}
