package com.tuya.lighting.open.api.service.smart.linkage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.smart.linkage.*;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

import java.util.List;

/**
 * LinkageApi
 *
 * @author lighting
 */
public class LinkageApi {

    /**
     * Querying linkage list.
     *
     * @param request request
     * @return linkage list
     */
    public BaseResponse<List<LinkageInfoResult>> listLinkages(LinkageListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LINKAGE_LIST_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<List<LinkageInfoResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<List<LinkageInfoResult>>>() {
        });
        return res;
    }

    /**
     * Getting linkage detail.
     *
     * @param ruleId ruleId
     * @return linkage info
     */
    public BaseResponse<LinkageInfoResult> getLinkageById(String ruleId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GET_LINKAGE_BY_ID_URL_SUFFIX, ruleId), null);
        BaseResponse<LinkageInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<LinkageInfoResult>>() {
        });
        return res;
    }

    /**
     * Creating a linkage
     *
     * @param request request
     * @return linkage info
     */
    public BaseResponse<LinkageInfoResult> createLinkage(LinkageSaveRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.CREATE_LINKAGE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<LinkageInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<LinkageInfoResult>>() {
        });
        return res;
    }

    /**
     * Updating a linkage.
     *
     * @param request request
     * @return linkage info
     */
    public BaseResponse<LinkageInfoResult> updateLinkage(LinkageSaveRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.UPDATE_LINKAGE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<LinkageInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<LinkageInfoResult>>() {
        });
        return res;
    }

    /**
     * Querying schedule list.
     *
     * @param request request
     * @return schedule list
     */
    public BaseResponse<List<LinkageInfoResult>> listSchedules(LinkageListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.SCHEDULE_LIST_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<List<LinkageInfoResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<List<LinkageInfoResult>>>() {
        });
        return res;
    }

    /**
     * Getting schedule detail.
     *
     * @param ruleId ruleId
     * @return schedule info
     */
    public BaseResponse<LinkageInfoResult> getScheduleById(String ruleId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GET_SCHEDULE_BY_ID_URL_SUFFIX, ruleId), null);
        BaseResponse<LinkageInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<LinkageInfoResult>>() {
        });
        return res;
    }

    /**
     * Creating a schedule.
     *
     * @param request request
     * @return schedule info
     */
    public BaseResponse<LinkageInfoResult> createSchedule(LinkageSaveRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.CREATE_SCHEDULE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<LinkageInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<LinkageInfoResult>>() {
        });
        return res;
    }

    /**
     * Updating a schedule.
     *
     * @param request request
     * @return schedule info
     */
    public BaseResponse<LinkageInfoResult> updateSchedule(LinkageSaveRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.UPDATE_SCHEDULE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<LinkageInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<LinkageInfoResult>>() {
        });
        return res;
    }

    /**
     * Changing status of a smart-rule(including linkage and schedule).
     *
     * @param request request
     * @return result
     */
    public BaseResponse<Object> changeStatus(ChangeStatusRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.SMART_CHANGE_STATUS_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<Object> res = JSON.parseObject(json, new TypeReference<BaseResponse<Object>>() {
        });
        return res;
    }

    /**
     * Deleting a smart rule.
     *
     * @param request request
     * @return result
     */
    public BaseResponse<Object> deleteLinkage(LinkageDeleteRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.SMART_REMOVE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<Object> res = JSON.parseObject(json, new TypeReference<BaseResponse<Object>>() {
        });
        return res;
    }
}
