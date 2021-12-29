package com.tuya.lighting.open.api.service.energy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.tuya.lighting.open.api.config.OpenApiUrlConstants;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.energy.EnergyQueryRequest;
import com.tuya.lighting.open.api.domain.energy.EnergyQueryResult;
import com.tuya.lighting.open.api.utils.HttpClientUtils;

/**
 * EnergyStatisticsApi
 *
 * @author lighting
 */
public class EnergyStatisticsApi {

    /**
     * Querying energy statistics.
     *
     * @param request request
     * @return result
     */
    public BaseResponse<EnergyQueryResult> query(EnergyQueryRequest request) {
        String json = HttpClientUtils.doGetWithBody(OpenApiUrlConstants.QUERY_ENERGY_QUERY_URL_SUFFIX, JSONObject.toJSONString(request));
        BaseResponse<EnergyQueryResult> res = JSON.parseObject(json, new TypeReference<BaseResponse<EnergyQueryResult>>() {
        });
        return res;
    }
}
