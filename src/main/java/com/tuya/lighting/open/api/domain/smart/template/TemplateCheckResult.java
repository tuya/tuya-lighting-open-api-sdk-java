package com.tuya.lighting.open.api.domain.smart.template;

public class TemplateCheckResult {
    private Integer matchType;
    private String roomId;

    public Integer getMatchType() {
        return matchType;
    }

    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}
