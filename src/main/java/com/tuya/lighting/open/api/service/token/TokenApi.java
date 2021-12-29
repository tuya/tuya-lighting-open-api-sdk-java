package com.tuya.lighting.open.api.service.token;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * TokenApi
 *
 * @author lighting
 */
public class TokenApi {

    /**
     * Get access token
     *
     * @param grantType grantType
     * @return response of access token
     */
    public BaseResponse<TokenResult> getAccessToken(int grantType) {
        final int size = 16;
        Map<String, String> params = new HashMap<>(size);
        params.put("grantType", String.valueOf(grantType));
        String json = HttpClientUtils.doGetWithToken(OpenApiUrlConstants.GET_ACCESS_TOKEN, params, false);
        return JSON.parseObject(json, new TypeReference<BaseResponse<TokenResult>>() {
        });
    }

    /**
     * Refresh access token
     *
     * @param refreshToken refreshToken
     * @return response of access token
     */
    public BaseResponse<TokenResult> refreshAccessToken(String refreshToken) {
        String json = HttpClientUtils.doGetWithToken(String.format(OpenApiUrlConstants.REFRESH_ACCESS_TOKEN, refreshToken), null, false);
        return JSON.parseObject(json, new TypeReference<BaseResponse<TokenResult>>() {
        });
    }
}
