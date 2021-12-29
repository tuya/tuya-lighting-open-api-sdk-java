package com.tuya.lighting.open.api.domain.project;

/**
 * Result of creating a project.
 *
 * @author lighting
 */
public class ProjectCreateResult {

    /**
     * project id
     */
    private String projectId;

    /**
     * owner id
     */
    private String ownerId;

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
}
