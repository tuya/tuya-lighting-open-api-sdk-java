package com.tuya.lighting.open.api.domain.smart.linkage;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Condition
 *
 * @author lighting
 */
public class Condition {

    /**
     * id
     */
    private String id;

    /**
     * entity type
     */
    private Integer entityType;

    /**
     * entity id
     */
    private String entityId;

    /**
     * entity sub ids
     */
    private String entitySubIds;

    /**
     * entity name
     */
    private String entityName;

    /**
     * expr
     */
    private JSONArray expr;

    /**
     * expr display
     */
    private String exprDisplay;

    /**
     * order number
     */
    private Integer orderNum;

    /**
     * extra info
     */
    private JSONObject extraInfo;

    /**
     * icon url
     */
    private String iconUrl;

    /**
     * extra
     */
    private String extra;

    /**
     * product id
     */
    private String productId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getEntityType() {
        return entityType;
    }

    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntitySubIds() {
        return entitySubIds;
    }

    public void setEntitySubIds(String entitySubIds) {
        this.entitySubIds = entitySubIds;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public JSONArray getExpr() {
        return expr;
    }

    public void setExpr(JSONArray expr) {
        this.expr = expr;
    }

    public String getExprDisplay() {
        return exprDisplay;
    }

    public void setExprDisplay(String exprDisplay) {
        this.exprDisplay = exprDisplay;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public JSONObject getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(JSONObject extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
