package com.tuya.lighting.open.api.domain.smart.template;

import java.util.List;

public class TemplateCheckRequest {

    private String templateId;
    private List<String> roomIds;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public List<String> getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(List<String> roomIds) {
        this.roomIds = roomIds;
    }
}
