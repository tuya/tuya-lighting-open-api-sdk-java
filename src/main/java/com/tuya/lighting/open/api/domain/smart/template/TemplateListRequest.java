package com.tuya.lighting.open.api.domain.smart.template;

import com.tuya.lighting.open.api.domain.PageQuery;

public class TemplateListRequest extends PageQuery {

    private String templateName;

    private Integer templateType;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

}
