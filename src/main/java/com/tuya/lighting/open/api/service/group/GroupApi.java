package com.tuya.lighting.open.api.service.group;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.device.DeviceDetailResult;
import com.tuya.lighting.open.api.domain.group.*;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

import java.util.List;


/**
 * GroupApi
 *
 * @author lighting
 */
public class GroupApi {

    /**
     * Querying device list those support joining group package.
     *
     * @param request request
     * @return deviceSaasId list
     */
    public BaseResponse<SupportGroupDevicesResult> listSupportGroupDevices(SupportGroupDevicesRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.SUPPORT_GROUP_DEVICES_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<SupportGroupDevicesResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<SupportGroupDevicesResult>>() {
        });
        return res;
    }

    /**
     * Creating a group package.
     *
     * @param request request
     * @return result of operation
     */
    public BaseResponse<GroupOperateResult> createGroup(GroupCreateRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.CREATE_GROUP_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<GroupOperateResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<GroupOperateResult>>() {
        });
        return res;
    }

    /**
     * Querying device list those support updating in group way.
     *
     * @param groupPackageId groupPackageId
     * @return device list
     */
    public BaseResponse<List<GroupUpdateDevicesResult>> listGroupUpdateDevices(String groupPackageId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GROUP_UPDATE_DEVICES_URL_SUFFIX, groupPackageId), null);
        BaseResponse<List<GroupUpdateDevicesResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<List<GroupUpdateDevicesResult>>>() {
        });
        return res;
    }

    /**
     * Updating a group package.
     *
     * @param request request
     * @return result of operation
     */
    public BaseResponse<GroupOperateResult> updateGroup(GroupUpdateRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.UPDATE_GROUP_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<GroupOperateResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<GroupOperateResult>>() {
        });
        return res;
    }

    /**
     * Deleting a group package.
     *
     * @param groupPackageId groupPackageId
     * @return result of operation
     */
    public BaseResponse<GroupOperateResult> deleteGroup(String groupPackageId) {
        String json = HttpClientUtils.doDelete(String.format(OpenApiUrlConstants.DELETE_GROUP_URL_SUFFIX, groupPackageId));
        BaseResponse<GroupOperateResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<GroupOperateResult>>() {
        });
        return res;
    }

    /**
     * Querying group package list of a room.
     *
     * @param request request
     * @return group package list
     */
    public BaseResponse<PageResult<GroupInfoResult>> listGroupOfRoom(GroupListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LIST_GROUPS_OF_ROOM_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<GroupInfoResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<GroupInfoResult>>>() {
        });
        return res;
    }

    /**
     * Querying group package list of a project.
     *
     * @param request request
     * @return group package list
     */
    public BaseResponse<PageResult<GroupInfoResult>> listGroupOfProject(GroupListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LIST_GROUPS_OF_PROJECT_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<GroupInfoResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<GroupInfoResult>>>() {
        });
        return res;
    }

    /**
     * Getting group package info.
     *
     * @param groupPackageId groupPackageId
     * @return group package info
     */
    public BaseResponse<GroupInfoResult> getById(String groupPackageId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GET_GROUP_DETAIL_URL_SUFFIX, groupPackageId), null);
        BaseResponse<GroupInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<GroupInfoResult>>() {
        });
        return res;
    }

    /**
     * Listing devices of a group package.
     *
     * @param request request
     * @return device list
     */
    public BaseResponse<PageResult<DeviceDetailResult>> listDevicesOfGroup(GroupDeviceListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LIST_GROUP_DEVICES_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<DeviceDetailResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<DeviceDetailResult>>>() {
        });
        return res;
    }

    /**
     * Controlling a group package.
     *
     * @param request request
     * @return successful or not
     */
    public BaseResponse<Boolean> controlGroup(GroupControlRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.GROUP_CONTROL_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<Boolean> res = JSON.parseObject(json, new TypeReference<BaseResponse<Boolean>>() {
        });
        return res;
    }
}
