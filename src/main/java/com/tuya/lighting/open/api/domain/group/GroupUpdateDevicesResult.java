package com.tuya.lighting.open.api.domain.group;

/**
 * Result of group updated devices
 *
 * @author lighting
 */
public class GroupUpdateDevicesResult {

    /**
     * unique id of device in SaaS
     */
    private String deviceSaasId;

    /**
     * device id
     */
    private String deviceId;

    /**
     * group join status
     */
    private Integer groupJoinStatus;

    /**
     * device purpose code
     */
    private String devicePurposeCode;

    public String getDeviceSaasId() {
        return deviceSaasId;
    }

    public void setDeviceSaasId(String deviceSaasId) {
        this.deviceSaasId = deviceSaasId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getGroupJoinStatus() {
        return groupJoinStatus;
    }

    public void setGroupJoinStatus(Integer groupJoinStatus) {
        this.groupJoinStatus = groupJoinStatus;
    }

    public String getDevicePurposeCode() {
        return devicePurposeCode;
    }

    public void setDevicePurposeCode(String devicePurposeCode) {
        this.devicePurposeCode = devicePurposeCode;
    }
}
