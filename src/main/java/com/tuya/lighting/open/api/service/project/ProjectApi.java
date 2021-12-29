package com.tuya.lighting.open.api.service.project;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.SimpleResult;
import com.tuya.lighting.open.api.domain.project.*;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * ProjectApi
 *
 * @author lighting
 */
public class ProjectApi {

    /**
     * Creating a project.
     *
     * @param request request
     * @return response of creating a project
     */
    public BaseResponse<ProjectCreateResult> create(ProjectCreateRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.CREATE_A_PROJECT, JSONObject.toJSONString(request));
        return JSON.parseObject(json, new TypeReference<BaseResponse<ProjectCreateResult>>() {
        });
    }

    /**
     * Updating a project.
     *
     * @param request request
     * @return result of updating a project
     */
    public BaseResponse<ProjectUpdateResult> update(ProjectUpdateRequest request) {
        String json = HttpClientUtils.doPut(OpenApiUrlConstants.UPDATE_A_PROJECT, JSON.toJSONString(request));
        return JSON.parseObject(json, new TypeReference<BaseResponse<ProjectUpdateResult>>() {
        });
    }

    /**
     * Removing a Project by id.
     *
     * @param projectId project id
     * @return response of removing a project
     */
    public BaseResponse<SimpleResult> remove(String projectId) {
        String json = HttpClientUtils.doDelete(String.format(OpenApiUrlConstants.REMOVE_A_PROJECT, projectId));
        return JSON.parseObject(json, new TypeReference<BaseResponse<SimpleResult>>() {
        });
    }

    /**
     * Getting a project by id.
     *
     * @param projectId project id
     * @return response of getting a project
     */
    public BaseResponse<ProjectQueryResult> getByProjectId(String projectId) {
        String json = HttpClientUtils.doGet(String.format(OpenApiUrlConstants.GET_A_PROJECT, projectId), null);
        return JSON.parseObject(json, new TypeReference<BaseResponse<ProjectQueryResult>>() {
        });
    }

    /**
     * Paging querying projects.
     *
     * @param page     page
     * @param pageSize pageSize
     * @param keyword  keyword
     * @return response of paging querying projects
     */
    public BaseResponse<PageResult<ProjectListItem>> page(Integer page, Integer pageSize, String keyword) {
        Map<String, String> params = new HashMap<>();
        params.put("page", String.valueOf(page));
        params.put("pageSize", String.valueOf(pageSize));
        params.put("keyword", keyword);
        String json = HttpClientUtils.doGet(OpenApiUrlConstants.PAGING_QUERY_PROJECTS, params);
        return JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<ProjectListItem>>>() {
        });
    }
}
