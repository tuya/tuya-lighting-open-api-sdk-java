package com.tuya.lighting.open.api.domain.smart.linkage;

/**
 * Request for deleting linkage
 *
 * @author lighting
 */
public class LinkageDeleteRequest {

    /**
     * rule id
     */
    String ruleId;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }
}
