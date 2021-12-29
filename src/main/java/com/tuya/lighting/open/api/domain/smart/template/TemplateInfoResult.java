package com.tuya.lighting.open.api.domain.smart.template;

import java.util.List;

public class TemplateInfoResult {

    private String templateId;
    private String templateName;
    private String templateLabel;
    private Integer templateType;
    private String category;
    private String preConditionExpr;
    private String extendInfo;
    private Integer userNum;
    private Integer matchType;
    private Integer ranking;
    private String remark;
    private List<TemplateConfig> configs;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPreConditionExpr() {
        return preConditionExpr;
    }

    public void setPreConditionExpr(String preConditionExpr) {
        this.preConditionExpr = preConditionExpr;
    }

    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public Integer getMatchType() {
        return matchType;
    }

    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<TemplateConfig> getConfigs() {
        return configs;
    }

    public void setConfigs(List<TemplateConfig> configs) {
        this.configs = configs;
    }

    public static class TemplateConfig {
        private String selector;
        private Integer selectorType;
        private String strategyExpr;
        private Integer strategyType;

        public String getSelector() {
            return selector;
        }

        public void setSelector(String selector) {
            this.selector = selector;
        }

        public Integer getSelectorType() {
            return selectorType;
        }

        public void setSelectorType(Integer selectorType) {
            this.selectorType = selectorType;
        }

        public String getStrategyExpr() {
            return strategyExpr;
        }

        public void setStrategyExpr(String strategyExpr) {
            this.strategyExpr = strategyExpr;
        }

        public Integer getStrategyType() {
            return strategyType;
        }

        public void setStrategyType(Integer strategyType) {
            this.strategyType = strategyType;
        }
    }
}
