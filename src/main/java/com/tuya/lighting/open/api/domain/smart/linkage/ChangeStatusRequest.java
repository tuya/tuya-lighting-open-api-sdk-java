package com.tuya.lighting.open.api.domain.smart.linkage;

/**
 * Request for changing status
 *
 * @author lighting
 */
public class ChangeStatusRequest {

    /**
     * rule id
     */
    private String ruleId;

    /**
     * enabled or not
     */
    private Boolean enabled;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
