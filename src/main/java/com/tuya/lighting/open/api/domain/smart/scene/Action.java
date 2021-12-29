package com.tuya.lighting.open.api.domain.smart.scene;

import com.alibaba.fastjson.JSONObject;

/**
 * Action
 *
 * @author lighting
 */
public class Action {

    /**
     * id
     */
    private String id;

    /**
     * entity id
     */
    private String entityId;

    /**
     * entity name
     */
    private String entityName;

    /**
     * executor property
     */
    private JSONObject executorProperty;

    /**
     * action executor
     */
    private String actionExecutor;

    /**
     * action display
     */
    private String actionDisplay;

    /**
     * extra property
     */
    private JSONObject extraProperty;

    /**
     * action display new
     */
    private JSONObject actionDisplayNew;

    /**
     * executor type
     */
    private Integer executorType;

    /**
     * icon url
     */
    private String iconUrl;

    /**
     * product id
     */
    private String productId;

    /**
     * order number
     */
    private Integer orderNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public JSONObject getExecutorProperty() {
        return executorProperty;
    }

    public void setExecutorProperty(JSONObject executorProperty) {
        this.executorProperty = executorProperty;
    }

    public String getActionExecutor() {
        return actionExecutor;
    }

    public void setActionExecutor(String actionExecutor) {
        this.actionExecutor = actionExecutor;
    }

    public String getActionDisplay() {
        return actionDisplay;
    }

    public void setActionDisplay(String actionDisplay) {
        this.actionDisplay = actionDisplay;
    }

    public JSONObject getExtraProperty() {
        return extraProperty;
    }

    public void setExtraProperty(JSONObject extraProperty) {
        this.extraProperty = extraProperty;
    }

    public JSONObject getActionDisplayNew() {
        return actionDisplayNew;
    }

    public void setActionDisplayNew(JSONObject actionDisplayNew) {
        this.actionDisplayNew = actionDisplayNew;
    }

    public Integer getExecutorType() {
        return executorType;
    }

    public void setExecutorType(Integer executorType) {
        this.executorType = executorType;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}
