package com.tuya.lighting.open.api.service.account;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.account.*;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

/**
 * AccountApi
 *
 * @author lighting
 */
public class AccountApi {

    /**
     * Authing an account.
     *
     * @param request request
     * @return result of authing an account
     */
    public BaseResponse<String> authAccount(AuthAccountRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.AUTH_ACCOUNT_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<String> res = JSON.parseObject(json, new TypeReference<BaseResponse<String>>() {
        });
        return res;
    }

    /**
     * Getting a ticket for a user.
     *
     * @param request request
     * @return ticket
     */
    public BaseResponse<String> getTicket(TicketRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.GET_TICKET_TOKEN_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<String> res = JSON.parseObject(json, new TypeReference<BaseResponse<String>>() {
        });
        return res;
    }

    /**
     * Adding permission to a user.
     *
     * @param request request
     * @return successful or not
     */
    public BaseResponse<Boolean> addPermission(AddPermissionRequest request) {
        String json = HttpClientUtils.doPost(OpenApiUrlConstants.ADD_PERMISSION_TO_ACCOUNT_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<Boolean> res = JSON.parseObject(json, new TypeReference<BaseResponse<Boolean>>() {
        });
        return res;
    }

    /**
     * Querying for account list.
     *
     * @param request request
     * @return account list
     */
    public BaseResponse<PageResult<AccountListResult>> listAccounts(AccountListRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.LIST_ACCOUNT_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<PageResult<AccountListResult>> res = JSON.parseObject(json, new TypeReference<BaseResponse<PageResult<AccountListResult>>>() {
        });
        return res;
    }
}
