package com.tuya.lighting.open.api.domain.group;

/**
 * Request for group control
 *
 * @author lighting
 */
public class GroupControlRequest {

    /**
     * group package id
     */
    private String groupPackageId;

    /**
     * dp code
     */
    private String dpCode;

    /**
     * dp value
     */
    private String dpValue;

    public String getGroupPackageId() {
        return groupPackageId;
    }

    public void setGroupPackageId(String groupPackageId) {
        this.groupPackageId = groupPackageId;
    }

    public String getDpCode() {
        return dpCode;
    }

    public void setDpCode(String dpCode) {
        this.dpCode = dpCode;
    }

    public String getDpValue() {
        return dpValue;
    }

    public void setDpValue(String dpValue) {
        this.dpValue = dpValue;
    }
}
