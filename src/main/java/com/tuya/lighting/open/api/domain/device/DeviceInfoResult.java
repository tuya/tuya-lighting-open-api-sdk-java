package com.tuya.lighting.open.api.domain.device;

/**
 * Result of device info
 *
 * @author lighting
 */
public class DeviceInfoResult {

    /**
     * detail of device
     */
    private DeviceDetailResult device;

    public DeviceDetailResult getDevice() {
        return device;
    }

    public void setDevice(DeviceDetailResult device) {
        this.device = device;
    }
}
