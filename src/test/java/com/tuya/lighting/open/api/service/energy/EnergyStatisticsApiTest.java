package com.tuya.lighting.open.api.service.energy;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.energy.EnergyQueryRequest;
import com.tuya.lighting.open.api.domain.energy.EnergyQueryResult;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EnergyStatisticsApiTest {

    private EnergyStatisticsApi energyStatisticsApi;

    private TokenApi tokenApi;

    @Before
    public void setUp() throws Exception {
        TuyaOpenApiConfiguration tuyaOpenApiConfiguration = new TuyaOpenApiConfiguration();
        tuyaOpenApiConfiguration.setUrl("https://openapi.tuyacn.com");
        tuyaOpenApiConfiguration.setClientId("*****gswael9wqs*****");
        tuyaOpenApiConfiguration.setClientSecret("*****09f429248caab6017554f9*****");
        HttpClientUtils.setTuyaOpenApiConfiguration(tuyaOpenApiConfiguration);
        tokenApi = new TokenApi();
        BaseResponse<TokenResult> accessToken = tokenApi.getAccessToken(1);
        HttpClientUtils.setTokenResult(accessToken.getResult());
        energyStatisticsApi = new EnergyStatisticsApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void query() {
        EnergyQueryRequest request = new EnergyQueryRequest();
        request.setProjectId("13985430391394*****");
        request.setRoomId("13985430413037*****");
        request.setTargetType(1);
        request.setStartTime(1631775929000L);
        request.setEndTime(1631775929000L);
        BaseResponse<EnergyQueryResult> response = energyStatisticsApi.query(request);
    }
}