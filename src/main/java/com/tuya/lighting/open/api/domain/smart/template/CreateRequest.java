package com.tuya.lighting.open.api.domain.smart.template;

import java.util.List;
import java.util.Map;

public class CreateRequest {

    private String templateName;
    private String templateLabel;
    private String remark;
    private List<DeviceRule> deviceRules;
    private List<GroupRule> groupRules;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateLabel() {
        return templateLabel;
    }

    public void setTemplateLabel(String templateLabel) {
        this.templateLabel = templateLabel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<DeviceRule> getDeviceRules() {
        return deviceRules;
    }

    public void setDeviceRules(List<DeviceRule> deviceRules) {
        this.deviceRules = deviceRules;
    }

    public List<GroupRule> getGroupRules() {
        return groupRules;
    }

    public void setGroupRules(List<GroupRule> groupRules) {
        this.groupRules = groupRules;
    }

    public static class DeviceRule {
        private String name;
        private String pid;
        private String thirdCategory;
        private String topCategory;
        private String secondCategory;
        private String devicePurpose;
        private Map<String, String> dps;
        private Boolean anyMatch;
        private Integer nextActionDelayTime;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getThirdCategory() {
            return thirdCategory;
        }

        public void setThirdCategory(String thirdCategory) {
            this.thirdCategory = thirdCategory;
        }

        public String getTopCategory() {
            return topCategory;
        }

        public void setTopCategory(String topCategory) {
            this.topCategory = topCategory;
        }

        public String getSecondCategory() {
            return secondCategory;
        }

        public void setSecondCategory(String secondCategory) {
            this.secondCategory = secondCategory;
        }

        public String getDevicePurpose() {
            return devicePurpose;
        }

        public void setDevicePurpose(String devicePurpose) {
            this.devicePurpose = devicePurpose;
        }

        public Map<String, String> getDps() {
            return dps;
        }

        public void setDps(Map<String, String> dps) {
            this.dps = dps;
        }

        public Boolean getAnyMatch() {
            return anyMatch;
        }

        public void setAnyMatch(Boolean anyMatch) {
            this.anyMatch = anyMatch;
        }

        public Integer getNextActionDelayTime() {
            return nextActionDelayTime;
        }

        public void setNextActionDelayTime(Integer nextActionDelayTime) {
            this.nextActionDelayTime = nextActionDelayTime;
        }
    }

    public static class GroupRule {
        private String name;
        private String pid;
        private String thirdCategory;
        private Map<String, String> dps;
        private Integer nextActionDelayTime;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getThirdCategory() {
            return thirdCategory;
        }

        public void setThirdCategory(String thirdCategory) {
            this.thirdCategory = thirdCategory;
        }

        public Map<String, String> getDps() {
            return dps;
        }

        public void setDps(Map<String, String> dps) {
            this.dps = dps;
        }

        public Integer getNextActionDelayTime() {
            return nextActionDelayTime;
        }

        public void setNextActionDelayTime(Integer nextActionDelayTime) {
            this.nextActionDelayTime = nextActionDelayTime;
        }
    }
}
