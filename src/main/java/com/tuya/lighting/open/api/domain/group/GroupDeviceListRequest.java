package com.tuya.lighting.open.api.domain.group;

import com.tuya.lighting.open.api.domain.PageQuery;

/**
 * Request for group device list
 *
 * @author lighting
 */
public class GroupDeviceListRequest extends PageQuery {

    /**
     * group package id
     */
    private String groupPackageId;

    public String getGroupPackageId() {
        return groupPackageId;
    }

    public void setGroupPackageId(String groupPackageId) {
        this.groupPackageId = groupPackageId;
    }
}
