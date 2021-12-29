package com.tuya.lighting.open.api.domain.smart.scene;

/**
 * Request for trigger scene
 *
 * @author lighting
 */
public class SceneTriggerRequest {

    /**
     * rule id
     */
    private String ruleId;

    /**
     * project id
     */
    private String projectId;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
