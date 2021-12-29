package com.tuya.lighting.open.api.domain.smart.linkage;

import com.alibaba.fastjson.JSONObject;

/**
 * Precondition
 */
public class Precondition {

    /**
     * id
     */
    private String id;

    /**
     * condition type
     */
    private String condType;

    /**
     * expr
     */
    private JSONObject expr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCondType() {
        return condType;
    }

    public void setCondType(String condType) {
        this.condType = condType;
    }

    public JSONObject getExpr() {
        return expr;
    }

    public void setExpr(JSONObject expr) {
        this.expr = expr;
    }
}
