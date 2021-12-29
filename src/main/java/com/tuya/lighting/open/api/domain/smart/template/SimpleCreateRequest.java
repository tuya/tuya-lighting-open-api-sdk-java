package com.tuya.lighting.open.api.domain.smart.template;

import java.util.Map;

public class SimpleCreateRequest {

    private String templateName;
    private String templateLabel;
    private String remark;
    private Rule rule;

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

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public static class Rule {
        private String name;
        private String pid;
        private String thirdCategory;
        private Map<String, String> dps;

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
    }
}
