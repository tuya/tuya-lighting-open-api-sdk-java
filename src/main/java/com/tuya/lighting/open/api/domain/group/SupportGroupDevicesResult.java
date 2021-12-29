package com.tuya.lighting.open.api.domain.group;

import java.util.List;

/**
 * Result of support group devices
 *
 * @author lighting
 */
public class SupportGroupDevicesResult {

    /**
     * unique ids of device in SaaS
     */
    private List<String> deviceSaasIds;

    public List<String> getDeviceSaasIds() {
        return deviceSaasIds;
    }

    public void setDeviceSaasIds(List<String> deviceSaasIds) {
        this.deviceSaasIds = deviceSaasIds;
    }
}
