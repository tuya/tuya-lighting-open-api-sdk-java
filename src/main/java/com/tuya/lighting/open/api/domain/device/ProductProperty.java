package com.tuya.lighting.open.api.domain.device;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Product property
 *
 * @author lighting
 */
public class ProductProperty {

    /**
     * dp ID
     */
    private Integer dpId;

    /**
     * dp code
     */
    private String dpCode;

    /**
     * dp name
     */
    private String dpName;

    /**
     * current dp value
     */
    private String dpValueStd;

    /**
     * property
     */
    private Property property;

    /**
     * property detail
     */
    private JSONObject propertyDetail;

    /**
     * mode
     */
    private String mode;

    /**
     * dp from
     */
    private String dpFrom;

    public Integer getDpId() {
        return dpId;
    }

    public void setDpId(Integer dpId) {
        this.dpId = dpId;
    }

    public String getDpCode() {
        return dpCode;
    }

    public void setDpCode(String dpCode) {
        this.dpCode = dpCode;
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName;
    }

    public String getDpValueStd() {
        return dpValueStd;
    }

    public void setDpValueStd(String dpValueStd) {
        this.dpValueStd = dpValueStd;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public JSONObject getPropertyDetail() {
        return propertyDetail;
    }

    public void setPropertyDetail(JSONObject propertyDetail) {
        this.propertyDetail = propertyDetail;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDpFrom() {
        return dpFrom;
    }

    public void setDpFrom(String dpFrom) {
        this.dpFrom = dpFrom;
    }

    public static class Property {
        private List<String> range;

        public List<String> getRange() {
            return range;
        }

        public void setRange(List<String> range) {
            this.range = range;
        }
    }
}
