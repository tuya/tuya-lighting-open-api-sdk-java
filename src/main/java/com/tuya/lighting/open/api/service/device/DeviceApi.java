package com.tuya.lighting.open.api.service.device;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.device.*;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

/**
 * DeviceApi
 *
 * @author lighting
 */
public class DeviceApi {

    /**
     * Querying for device list.
     *
     * @param request request
     * @return device list
     */
    public BaseResponse<PageResult<DeviceDetailResult>> listDevices(DeviceListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LIST_DEVICES_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<DeviceDetailResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<DeviceDetailResult>>>() {
        });
        return res;
    }

    /**
     * Getting device detail.
     *
     * @param deviceSaasId unique id of device in SaaS
     * @return device detail
     */
    public BaseResponse<DeviceInfoResult> getDetail(String deviceSaasId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GET_DEVICE_DETAIL_URL_SUFFIX, deviceSaasId), null);
        BaseResponse<DeviceInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<DeviceInfoResult>>() {
        });
        return res;
    }

    /**
     * Querying for device list those are unassigned.
     *
     * @param request request
     * @return device list
     */
    public BaseResponse<PageResult<DeviceDetailResult>> listUnassignedDevices(UnassignedDeviceListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LIST_UNASSIGNED_DEVICES_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<DeviceDetailResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<DeviceDetailResult>>>() {
        });
        return res;
    }

    /**
     * Getting room state.
     *
     * @param roomId roomId
     * @return room state
     */
    public BaseResponse<RoomStateResult> getRoomState(String roomId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GET_ROOM_STATE_URL_SUFFIX, roomId), null);
        BaseResponse<RoomStateResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<RoomStateResult>>() {
        });
        return res;
    }

    /**
     * Single control device.
     *
     * @param deviceId deviceId
     * @param request  request
     * @return result of control
     */
    public BaseResponse<DeviceControlResult> singleControl(String deviceId, DeviceSingleControlRequest request) {
        String json = HttpClientUtils.doPost(String.format(OpenApiUrlConstants.DEVICE_SINGLE_CONTROL_URL_SUFFIX, deviceId), JSONObject.toJSONString(request));
        BaseResponse<DeviceControlResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<DeviceControlResult>>() {
        });
        return res;
    }

    /**
     * Multi-control devices
     *
     * @param request request
     * @return result of control
     */
    public BaseResponse<DeviceControlResult> multiControl(DeviceMultiControlRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.DEVICE_MULTI_CONTROL_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<DeviceControlResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<DeviceControlResult>>() {
        });
        return res;
    }

    /**
     * Group-control devices
     *
     * @param request request
     * @return result of control
     */
    public BaseResponse<DeviceControlResult> groupControl(DeviceGroupControlRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.DEVICE_GROUP_CONTROL_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<DeviceControlResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<DeviceControlResult>>() {
        });
        return res;
    }

    /**
     * Deleting a device.
     *
     * @param request request
     * @return result of deleting a device
     */
    public BaseResponse<DeviceControlResult> deleteDevice(DeviceDeleteRequest request) {
        String json = HttpClientUtils.doPost(String.format(OpenApiUrlConstants.DEVICE_DELETE_URL_SUFFIX, request.getDeviceId()), JSONObject.toJSONString(request));
        BaseResponse<DeviceControlResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<DeviceControlResult>>() {
        });
        return res;
    }

    /**
     * Assigning devices from a room to another.
     *
     * @param request request
     * @return result of assignment
     */
    public BaseResponse<DeviceAssignResult> assignDevices(DeviceAssignRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.DEVICE_ASSIGN_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<DeviceAssignResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<DeviceAssignResult>>() {
        });
        return res;
    }

}

