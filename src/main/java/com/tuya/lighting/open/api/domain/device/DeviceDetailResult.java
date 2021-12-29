package com.tuya.lighting.open.api.domain.device;

import java.util.List;

/**
 * Result of device detail
 */
public class DeviceDetailResult {

    /**
     * unique id of device in SaaS
     */
    private String deviceSaasId;

    /**
     * device id
     */
    private String deviceId;

    /**
     * device name
     */
    private String deviceName;

    /**
     * device type, see DeviceTypeEnum
     */
    private String deviceType;

    /**
     * device type value, see DeviceTypeEnum
     */
    private Integer deviceTypeValue;

    /**
     * top category of product
     */
    private String topCategory;

    /**
     * device power
     */
    private Double devicePower;

    /**
     * device status, NORMAL/OFFLINE/EXPIRING/EXCEPTION
     */
    private String deviceStatus;

    /**
     * install time
     */
    private Long installTime;

    /**
     * active time
     */
    private Long activeTime;

    /**
     * product id
     */
    private String productId;

    /**
     * room id
     */
    private String roomId;

    /**
     * room name
     */
    private String roomName;

    /**
     * point id of device
     */
    private String pointId;

    /**
     * owner id
     */
    private String ownerId;

    /**
     * product property
     */
    private List<ProductProperty> properties;

    /**
     * join status of master group, 0-not join，1-already join，2-non-lighting device not join
     */
    private Integer masterGroupJoinStatus;

    /**
     * threshold of the room that device belongs to
     */
    private Integer currentBrightness;

    /**
     * support join group or not
     */
    private Boolean supportGroup;

    /**
     * switch status
     */
    private Boolean switchStatus;

    /**
     * switch dp code
     */
    private String switchDpCode;

    /**
     * colour value
     */
    private String colourValue;

    /**
     * bright value in percentage
     */
    private String brightPercentValue;

    /**
     * icon url
     */
    private String iconUrl;

    /**
     * type of device at the point
     */
    private Integer pointDeviceType;

    /**
     * count of switch
     */
    private Integer switchCount;

    /**
     * dp from
     */
    private String dpFrom;

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

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getDeviceTypeValue() {
        return deviceTypeValue;
    }

    public void setDeviceTypeValue(Integer deviceTypeValue) {
        this.deviceTypeValue = deviceTypeValue;
    }

    public String getTopCategory() {
        return topCategory;
    }

    public void setTopCategory(String topCategory) {
        this.topCategory = topCategory;
    }

    public Double getDevicePower() {
        return devicePower;
    }

    public void setDevicePower(Double devicePower) {
        this.devicePower = devicePower;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public Long getInstallTime() {
        return installTime;
    }

    public void setInstallTime(Long installTime) {
        this.installTime = installTime;
    }

    public Long getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Long activeTime) {
        this.activeTime = activeTime;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public List<ProductProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ProductProperty> properties) {
        this.properties = properties;
    }

    public Integer getMasterGroupJoinStatus() {
        return masterGroupJoinStatus;
    }

    public void setMasterGroupJoinStatus(Integer masterGroupJoinStatus) {
        this.masterGroupJoinStatus = masterGroupJoinStatus;
    }

    public Integer getCurrentBrightness() {
        return currentBrightness;
    }

    public void setCurrentBrightness(Integer currentBrightness) {
        this.currentBrightness = currentBrightness;
    }

    public Boolean getSupportGroup() {
        return supportGroup;
    }

    public void setSupportGroup(Boolean supportGroup) {
        this.supportGroup = supportGroup;
    }

    public Boolean getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(Boolean switchStatus) {
        this.switchStatus = switchStatus;
    }

    public String getSwitchDpCode() {
        return switchDpCode;
    }

    public void setSwitchDpCode(String switchDpCode) {
        this.switchDpCode = switchDpCode;
    }

    public String getColourValue() {
        return colourValue;
    }

    public void setColourValue(String colourValue) {
        this.colourValue = colourValue;
    }

    public String getBrightPercentValue() {
        return brightPercentValue;
    }

    public void setBrightPercentValue(String brightPercentValue) {
        this.brightPercentValue = brightPercentValue;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Integer getPointDeviceType() {
        return pointDeviceType;
    }

    public void setPointDeviceType(Integer pointDeviceType) {
        this.pointDeviceType = pointDeviceType;
    }

    public Integer getSwitchCount() {
        return switchCount;
    }

    public void setSwitchCount(Integer switchCount) {
        this.switchCount = switchCount;
    }

    public String getDpFrom() {
        return dpFrom;
    }

    public void setDpFrom(String dpFrom) {
        this.dpFrom = dpFrom;
    }
}
