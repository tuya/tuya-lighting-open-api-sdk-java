package com.tuya.lighting.open.api.domain.smart.scene;

import com.alibaba.fastjson.JSONArray;

import java.util.List;

/**
 * Result of action property
 *
 * @author lighting
 */
public class ActionPropertyResult {

    /**
     * function name
     */
    private String functionName;

    /**
     * function type
     */
    private Integer functionType;

    /**
     * product id
     */
    private String productId;

    /**
     * data points
     */
    private List<DataPoint> dataPoints;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Integer getFunctionType() {
        return functionType;
    }

    public void setFunctionType(Integer functionType) {
        this.functionType = functionType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
    }

    /**
     * DataPoint
     */
    public static class DataPoint {

        /**
         * default value
         */
        private Object defaultValue;

        /**
         * dp code
         */
        private String dpCode;

        /**
         * dp id
         */
        private Integer dpId;

        /**
         * dp name
         */
        private String dpName;

        /**
         * dp properties
         */
        private String dpProperties;

        /**
         * editable
         */
        private Boolean editable;

        /**
         * value range json
         */
        private JSONArray valueRangeJson;

        public Object getDefaultValue() {
            return defaultValue;
        }

        public void setDefaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
        }

        public String getDpCode() {
            return dpCode;
        }

        public void setDpCode(String dpCode) {
            this.dpCode = dpCode;
        }

        public Integer getDpId() {
            return dpId;
        }

        public void setDpId(Integer dpId) {
            this.dpId = dpId;
        }

        public String getDpName() {
            return dpName;
        }

        public void setDpName(String dpName) {
            this.dpName = dpName;
        }

        public String getDpProperties() {
            return dpProperties;
        }

        public void setDpProperties(String dpProperties) {
            this.dpProperties = dpProperties;
        }

        public Boolean getEditable() {
            return editable;
        }

        public void setEditable(Boolean editable) {
            this.editable = editable;
        }

        public JSONArray getValueRangeJson() {
            return valueRangeJson;
        }

        public void setValueRangeJson(JSONArray valueRangeJson) {
            this.valueRangeJson = valueRangeJson;
        }
    }
}
