package com.tuya.lighting.open.api.service.room;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.SimpleResult;
import com.tuya.lighting.open.api.domain.room.*;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

/**
 * RoomApi
 *
 * @author lighting
 */
public class RoomApi {

    /**
     * Creating a room.
     *
     * @param request request
     * @return response of creating a room
     */
    public BaseResponse<RoomCreateResult> create(RoomCreateRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.CREATE_A_ROOM, JSONObject.toJSONString(request));
        return JSON.parseObject(json, new TypeReference<BaseResponse<RoomCreateResult>>() {
        });
    }

    /**
     * Updating a room.
     *
     * @param request request
     * @return response of updating a room.
     */
    public BaseResponse<RoomUpdateResult> update(RoomUpdateRequest request) {
        String json = HttpClientUtils.doPut(OpenApiUrlConstants.UPDATE_A_ROOM, JSON.toJSONString(request));
        return JSON.parseObject(json, new TypeReference<BaseResponse<RoomUpdateResult>>() {
        });

    }

    /**
     * Removing a room by id.
     *
     * @param roomId room id
     * @return response of removing a room
     */
    public BaseResponse<SimpleResult> remove(String roomId) {
        String json = HttpClientUtils.doDelete(String.format(OpenApiUrlConstants.REMOVE_A_ROOM, roomId));
        return JSON.parseObject(json, new TypeReference<BaseResponse<SimpleResult>>() {
        });
    }

    /**
     * Querying room tree of a project.
     *
     * @param projectId project id
     * @return response of querying room tree of a project
     */
    public BaseResponse<RoomTreeResult> queryTree(String projectId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.QUERY_ROOM_TREE, projectId), null);
        return JSON.parseObject(json, new TypeReference<BaseResponse<RoomTreeResult>>() {
        });
    }
}
