package com.tuya.lighting.open.api.domain.smart.template;

public class TemplateGenerateRequest {

    private String roomId;
    private String id;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
