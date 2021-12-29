package com.tuya.lighting.open.api.domain.alarm;

import java.util.List;

/**
 * Request for alarm list
 *
 * @author lighting
 */
public class AlarmListRequest {

    /**
     * project id
     */
    private String projectId;

    /**
     * alarm type
     */
    private Integer alarmType;

    /**
     * roomIds
     */
    private List<String> roomIds;

    /**
     * categories
     */
    private List<Integer> categories;

    private Long start;

    private Long end;

    private String keyword;

    private Integer disalarm;

    private Integer page;

    private Integer pageSize;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public List<String> getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(List<String> roomIds) {
        this.roomIds = roomIds;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getDisalarm() {
        return disalarm;
    }

    public void setDisalarm(Integer disalarm) {
        this.disalarm = disalarm;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
