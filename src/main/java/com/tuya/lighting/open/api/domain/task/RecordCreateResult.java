package com.tuya.lighting.open.api.domain.task;

/**
 * Result of creating a record
 *
 * @author lighting
 */
public class RecordCreateResult {

    /**
     * record id
     */
    private String recordId;

    /**
     * success or not
     */
    private Boolean success;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
