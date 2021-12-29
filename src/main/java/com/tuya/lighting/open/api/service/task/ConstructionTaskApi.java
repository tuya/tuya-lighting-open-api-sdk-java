package com.tuya.lighting.open.api.service.task;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.SimpleResult;
import com.tuya.lighting.open.api.domain.task.*;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

/**
 * ConstructionTaskApi
 *
 * @author lighting
 */
public class ConstructionTaskApi {

    /**
     * Creating a record for authorization.
     *
     * @param request request
     * @return result
     */
    public BaseResponse<RecordCreateResult> createAuthorizationRecord(RecordCreateRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.CREATE_AUTHORIZATION_RECORD_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<RecordCreateResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<RecordCreateResult>>() {
        });
        return res;
    }

    /**
     * Querying record list.
     *
     * @param request request
     * @return result
     */
    public BaseResponse<PageResult<RoomRecordListItem>> listRoomRecord(RoomRecordListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LIST_ROOM_RECORD_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<RoomRecordListItem>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<RoomRecordListItem>>>() {
        });
        return res;
    }

    /**
     * Querying record list.
     *
     * @param request request
     * @return result
     */
    public BaseResponse<PageResult<RecordListItem>> listRecord(RecordListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LIST_RECORD_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<RecordListItem>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<RecordListItem>>>() {
        });
        return res;
    }

    /**
     * Getting record detail.
     *
     * @param recordId recordId
     * @return record detail
     */
    public BaseResponse<RecordDetailResult> getRecordDetail(String recordId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GET_RECORD_DETAIL_URL_SUFFIX, recordId), null);
        BaseResponse<RecordDetailResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<RecordDetailResult>>() {
        });
        return res;
    }

    /**
     * cancel a record.
     *
     * @param recordId recordId
     * @return result
     */
    public BaseResponse<SimpleResult> cancelAuthorizationRecord(String recordId) {
        String json = HttpClientUtils.doDelete(String.format(OpenApiUrlConstants.CANCEL_AUTHORIZATION_RECORD_URL_SUFFIX, recordId));
        BaseResponse<SimpleResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<SimpleResult>>() {
        });
        return res;
    }
}
