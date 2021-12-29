package com.tuya.lighting.open.api.domain.device;

/**
 * Result of device control
 *
 * @author lighting
 */
public class DeviceControlResult {

    /**
     * string of success or not
     */
    private String message;

    /**
     * action
     */
    private String action;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
