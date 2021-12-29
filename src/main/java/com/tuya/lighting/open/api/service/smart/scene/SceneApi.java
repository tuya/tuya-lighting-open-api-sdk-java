package com.tuya.lighting.open.api.service.smart.scene;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.smart.scene.*;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

import java.util.List;

/**
 * SceneApi
 *
 * @author lighting
 */
public class SceneApi {

    /**
     * Querying scene list.
     *
     * @param request request
     * @return scene list
     */
    public BaseResponse<List<SceneInfoResult>> listScene(SceneListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.SCENE_LIST_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<List<SceneInfoResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<List<SceneInfoResult>>>() {
        });
        return res;
    }

    /**
     * Getting scene detail.
     *
     * @param ruleId ruleId
     * @return scene info
     */
    public BaseResponse<SceneInfoResult> getById(String ruleId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GET_SCENE_BY_ID_URL_SUFFIX, ruleId), null);
        BaseResponse<SceneInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<SceneInfoResult>>() {
        });
        return res;
    }

    /**
     * Creating a scene.
     *
     * @param request request
     * @return scene info
     */
    public BaseResponse<SceneSaveResult> create(SceneSaveRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.CREATE_SCENE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<SceneSaveResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<SceneSaveResult>>() {
        });
        return res;
    }

    /**
     * Updating a scene.
     *
     * @param request request
     * @return scene info
     */
    public BaseResponse<SceneSaveResult> update(SceneSaveRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.UPDATE_SCENE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<SceneSaveResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<SceneSaveResult>>() {
        });
        return res;
    }

    /**
     * Getting action property.
     *
     * @param request request
     * @return action property list
     */
    public BaseResponse<List<ActionPropertyResult>> getActionProperty(ActionPropertyRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.GET_ACTION_PROPERTIES_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<List<ActionPropertyResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<List<ActionPropertyResult>>>() {
        });
        return res;
    }

    /**
     * Triggering a scene.
     *
     * @param request request
     * @return result
     */
    public BaseResponse<Object> trigger(SceneTriggerRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.TRIGGER_SCENE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<Object> res = JSON.parseObject(json, new TypeReference<BaseResponse<Object>>() {
        });
        return res;
    }
}
