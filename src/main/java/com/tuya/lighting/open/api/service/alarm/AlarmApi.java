package com.tuya.lighting.open.api.service.alarm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.alarm.AlarmListItem;
import com.tuya.lighting.open.api.domain.alarm.AlarmListRequest;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

/**
 * AlarmApi
 *
 * @author lighting
 */
public class AlarmApi {

    /**
     * Listing alarms.
     *
     * @param request request
     * @return alarm list
     */
    public BaseResponse<PageResult<AlarmListItem>> list(AlarmListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LIST_ALARM_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<AlarmListItem>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<AlarmListItem>>>() {
        });
        return res;
    }

    /**
     * Clearing an alarm.
     *
     * @param projectId  projectId
     * @param relationId relationId
     * @return successful or not
     */
    public BaseResponse<Boolean> clearAlarm(String projectId, String relationId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.CLEAR_ALARM_URL_SUFFIX, projectId, relationId), null);
        BaseResponse<Boolean> res = JSON.parseObject(json, new TypeReference<BaseResponse<Boolean>>() {
        });
        return res;
    }
}
