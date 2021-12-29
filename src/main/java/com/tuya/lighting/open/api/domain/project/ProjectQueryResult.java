package com.tuya.lighting.open.api.domain.project;

/**
 * Result of querying a project.
 *
 * @author lighting
 */
public class ProjectQueryResult {

    /**
     * project id
     */
    private String projectId;

    /**
     * owner id
     */
    private String ownerId;

    /**
     * project's name
     */
    private String name;

    /**
     * leader's phone number
     */
    private String leaderMobile;

    /**
     * leader's name
     */
    private String leaderName;

    /**
     * project's address
     */
    private String address;

    /**
     * project's address detail
     */
    private String detail;

    /**
     * project's longitude
     */
    private Double longitude;

    /**
     * project's latitude
     */
    private Double latitude;

    /**
     * time zone id
     */
    private String timeZoneId;

    /**
     * time zone
     */
    private String timeZone;

    /**
     * zone id
     */
    private String zoneId;

    /**
     * source of project
     */
    private Integer source;

    /**
     * location id
     */
    private Long locationId;

    /**
     * timestamp of being created
     */
    private Long gmtCreate;

    /**
     * control mode
     */
    private Integer controlMode;

    /**
     * successful or not
     */
    private Boolean success;

    /**
     * namespace
     */
    private String namespace;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeaderMobile() {
        return leaderMobile;
    }

    public void setLeaderMobile(String leaderMobile) {
        this.leaderMobile = leaderMobile;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Integer getControlMode() {
        return controlMode;
    }

    public void setControlMode(Integer controlMode) {
        this.controlMode = controlMode;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
