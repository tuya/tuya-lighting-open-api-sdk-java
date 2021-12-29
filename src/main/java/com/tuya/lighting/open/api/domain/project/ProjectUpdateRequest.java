package com.tuya.lighting.open.api.domain.project;

/**
 * Request of updating a project.
 *
 * @author lighting
 */
public class ProjectUpdateRequest {

    /**
     * project id
     */
    private String projectId;

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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
}
