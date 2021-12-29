package com.tuya.lighting.open.api.service.token;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TokenApiTest {

    private TokenApi tokenApi;

    @Before
    public void setUp() throws Exception {
        TuyaOpenApiConfiguration tuyaOpenApiConfiguration = new TuyaOpenApiConfiguration();
        tuyaOpenApiConfiguration.setUrl("https://openapi.tuyacn.com");
        tuyaOpenApiConfiguration.setClientId("*****gswael9wqs*****");
        tuyaOpenApiConfiguration.setClientSecret("*****09f429248caab6017554f9*****");
        HttpClientUtils.setTuyaOpenApiConfiguration(tuyaOpenApiConfiguration);
        tokenApi = new TokenApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAccessToken() {
        BaseResponse<TokenResult> accessToken = tokenApi.getAccessToken(1);
    }

    @Test
    public void refreshAccessToken() {
        BaseResponse<TokenResult> response = tokenApi.refreshAccessToken("b3a64f6eb762970a7966f29efc3*****");
    }

}