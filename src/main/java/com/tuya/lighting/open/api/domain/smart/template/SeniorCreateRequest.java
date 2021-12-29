package com.tuya.lighting.open.api.domain.smart.template;

import java.util.List;

public class SeniorCreateRequest {

    private String templateName;
    private String templateLabel;
    private Integer templateType;
    private String remark;
    private String validityPeriod;
    private Integer matchType;
    private List<CreateRequest.DeviceRule> deviceRules;
    private List<CreateRequest.GroupRule> groupRules;
    private List<SceneRule> sceneRules;
    private List<LinkageRule> linkageRules;
    private List<DeviceConditionRule> deviceConditionRules;
    private TimeRule timeRule;
    private EnvRule envRule;

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

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public Integer getMatchType() {
        return matchType;
    }

    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    public List<CreateRequest.DeviceRule> getDeviceRules() {
        return deviceRules;
    }

    public void setDeviceRules(List<CreateRequest.DeviceRule> deviceRules) {
        this.deviceRules = deviceRules;
    }

    public List<CreateRequest.GroupRule> getGroupRules() {
        return groupRules;
    }

    public void setGroupRules(List<CreateRequest.GroupRule> groupRules) {
        this.groupRules = groupRules;
    }

    public List<SceneRule> getSceneRules() {
        return sceneRules;
    }

    public void setSceneRules(List<SceneRule> sceneRules) {
        this.sceneRules = sceneRules;
    }

    public List<LinkageRule> getLinkageRules() {
        return linkageRules;
    }

    public void setLinkageRules(List<LinkageRule> linkageRules) {
        this.linkageRules = linkageRules;
    }

    public List<DeviceConditionRule> getDeviceConditionRules() {
        return deviceConditionRules;
    }

    public void setDeviceConditionRules(List<DeviceConditionRule> deviceConditionRules) {
        this.deviceConditionRules = deviceConditionRules;
    }

    public TimeRule getTimeRule() {
        return timeRule;
    }

    public void setTimeRule(TimeRule timeRule) {
        this.timeRule = timeRule;
    }

    public EnvRule getEnvRule() {
        return envRule;
    }

    public void setEnvRule(EnvRule envRule) {
        this.envRule = envRule;
    }

    public static class SceneRule {
        private String templateId;
        private String name;
        private Integer nextActionDelayTime;

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getNextActionDelayTime() {
            return nextActionDelayTime;
        }

        public void setNextActionDelayTime(Integer nextActionDelayTime) {
            this.nextActionDelayTime = nextActionDelayTime;
        }
    }

    public static class LinkageRule {
        private String templateId;
        private String name;
        private Integer executeType;

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getExecuteType() {
            return executeType;
        }

        public void setExecuteType(Integer executeType) {
            this.executeType = executeType;
        }
    }

    public static class DeviceConditionRule {
        private String name;
        private String pid;
        private String thirdCategory;
        private List<Expr> exprs;

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

        public List<Expr> getExprs() {
            return exprs;
        }

        public void setExprs(List<Expr> exprs) {
            this.exprs = exprs;
        }

        public static class Expr {
            private String dpId;
            private String operator;
            private String dpValue;

            public String getDpId() {
                return dpId;
            }

            public void setDpId(String dpId) {
                this.dpId = dpId;
            }

            public String getOperator() {
                return operator;
            }

            public void setOperator(String operator) {
                this.operator = operator;
            }

            public String getDpValue() {
                return dpValue;
            }

            public void setDpValue(String dpValue) {
                this.dpValue = dpValue;
            }
        }
    }

    public static class TimeRule {
        private String loops;
        private String timezoneId;
        private String time;
        private String date;

        public String getLoops() {
            return loops;
        }

        public void setLoops(String loops) {
            this.loops = loops;
        }

        public String getTimezoneId() {
            return timezoneId;
        }

        public void setTimezoneId(String timezoneId) {
            this.timezoneId = timezoneId;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public static class EnvRule {
        private String sunsetrise;
        private String cityId;

        public String getSunsetrise() {
            return sunsetrise;
        }

        public void setSunsetrise(String sunsetrise) {
            this.sunsetrise = sunsetrise;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }
    }
}
