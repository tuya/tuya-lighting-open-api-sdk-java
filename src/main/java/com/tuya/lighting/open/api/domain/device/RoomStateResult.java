package com.tuya.lighting.open.api.domain.device;

import java.util.List;
import java.util.Map;

/**
 * Result of room status
 *
 * @author lighting
 */
public class RoomStateResult {

    /**
     * properties
     */
    private List<Property> properties;

    /**
     * count
     */
    private Count count;

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public Count getCount() {
        return count;
    }

    public void setCount(Count count) {
        this.count = count;
    }

    /**
     * count
     */
    public static class Count {

        /**
         * count of all devices
         */
        private Long total;

        /**
         * count of online devices
         */
        private Long online;

        /**
         * count of offline device
         */
        private Long offline;

        /**
         * count of devices with replacing alarm
         */
        private Long expiring;

        /**
         * count of devices with dp alarm
         */
        private Long exception;

        public Long getTotal() {
            return total;
        }

        public void setTotal(Long total) {
            this.total = total;
        }

        public Long getOnline() {
            return online;
        }

        public void setOnline(Long online) {
            this.online = online;
        }

        public Long getOffline() {
            return offline;
        }

        public void setOffline(Long offline) {
            this.offline = offline;
        }

        public Long getExpiring() {
            return expiring;
        }

        public void setExpiring(Long expiring) {
            this.expiring = expiring;
        }

        public Long getException() {
            return exception;
        }

        public void setException(Long exception) {
            this.exception = exception;
        }
    }

    /**
     * property
     */
    public static class Property {

        /**
         * dp code
         */
        private String dpCode;

        /**
         * dp name
         */
        private String dpName;

        /**
         * current dp value
         */
        private String dpValueStd;

        /**
         * property describing range
         */
        private Map<String, Object> property;

        /**
         * property detail
         */
        private Map<String, Object> propertyDetail;

        /**
         * mode, ro, rw
         */
        private String mode;

        /**
         * dp from
         */
        private String dpFrom;

        public String getDpCode() {
            return dpCode;
        }

        public void setDpCode(String dpCode) {
            this.dpCode = dpCode;
        }

        public String getDpName() {
            return dpName;
        }

        public void setDpName(String dpName) {
            this.dpName = dpName;
        }

        public String getDpValueStd() {
            return dpValueStd;
        }

        public void setDpValueStd(String dpValueStd) {
            this.dpValueStd = dpValueStd;
        }

        public Map<String, Object> getProperty() {
            return property;
        }

        public void setProperty(Map<String, Object> property) {
            this.property = property;
        }

        public Map<String, Object> getPropertyDetail() {
            return propertyDetail;
        }

        public void setPropertyDetail(Map<String, Object> propertyDetail) {
            this.propertyDetail = propertyDetail;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public String getDpFrom() {
            return dpFrom;
        }

        public void setDpFrom(String dpFrom) {
            this.dpFrom = dpFrom;
        }
    }
}
