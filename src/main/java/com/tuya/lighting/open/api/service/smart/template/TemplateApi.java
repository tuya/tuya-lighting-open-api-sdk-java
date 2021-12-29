package com.tuya.lighting.open.api.service.smart.template;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.smart.template.*;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

import java.util.List;

/**
 * TemplateApi
 *
 * @author lighting
 */
public class TemplateApi {

    /**
     * Getting support selector
     *
     * @param request request
     * @return support selector
     */
    public BaseResponse<SupportSelectorResult> getSupportSelector(SupportSelectorRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.SUPPORT_SELECTOR_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<SupportSelectorResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<SupportSelectorResult>>() {
        });
        return res;
    }

    /**
     * Querying template list.
     *
     * @param request request
     * @return template list
     */
    public BaseResponse<PageResult<TemplateInfoResult>> listTemplates(TemplateListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.TEMPLATE_LIST_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<TemplateInfoResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<TemplateInfoResult>>>() {
        });
        return res;
    }

    /**
     * Getting template detail.
     *
     * @param templateId templateId
     * @return template info
     */
    public BaseResponse<TemplateInfoResult> getById(String templateId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GET_TEMPLATE_BY_ID_URL_SUFFIX, templateId), null);
        BaseResponse<TemplateInfoResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<TemplateInfoResult>>() {
        });
        return res;
    }

    /**
     * Creating a template in a simple way.
     *
     * @param request request
     * @return templateId
     */
    public BaseResponse<String> simpleCreate(SimpleCreateRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.SIMPLE_CREATE_TEMPLATE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<String> res = JSON.parseObject(json, new TypeReference<BaseResponse<String>>() {
        });
        return res;
    }

    /**
     * Creating a template in a normal way.
     *
     * @param request request
     * @return templateId
     */
    public BaseResponse<String> create(CreateRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.CREATE_TEMPLATE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<String> res = JSON.parseObject(json, new TypeReference<BaseResponse<String>>() {
        });
        return res;
    }

    /**
     * Creating a template in a senior way.
     *
     * @param request
     * @return
     */
    public BaseResponse<String> seniorCreate(SeniorCreateRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.SENIOR_CREATE_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<String> res = JSON.parseObject(json, new TypeReference<BaseResponse<String>>() {
        });
        return res;
    }

    /**
     * Deleting a template.
     *
     * @param templateId templateId
     * @return result
     */
    public BaseResponse<Boolean> deleteById(String templateId) {
        String json = HttpClientUtils.doPost(String.format(OpenApiUrlConstants.DELETE_BY_ID_URL_SUFFIX, templateId), "");
        BaseResponse<Boolean> res = JSON.parseObject(json, new TypeReference<BaseResponse<Boolean>>() {
        });
        return res;
    }

    /**
     * Generating smart-rule by a template.
     *
     * @param request request
     * @return ruleId
     */
    public BaseResponse<String> generate(TemplateGenerateRequest request) {
        String json = HttpClientUtils.doPost(String.format(OpenApiUrlConstants.GENERATE_FROM_TEMPLATE_URL_SUFFIX, request.getId()), JSONObject.toJSONString(request));
        BaseResponse<String> res = JSON.parseObject(json, new TypeReference<BaseResponse<String>>() {
        });
        return res;
    }

    /**
     * Checking a template available for rooms or not.
     *
     * @param request request
     * @return result
     */
    public BaseResponse<List<TemplateCheckResult>> checkTemplate(TemplateCheckRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.TEMPLATE_CHECK_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<List<TemplateCheckResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<List<TemplateCheckResult>>>() {
        });
        return res;
    }
}
