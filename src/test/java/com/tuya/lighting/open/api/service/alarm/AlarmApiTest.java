package com.tuya.lighting.open.api.service.alarm;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.alarm.AlarmListItem;
import com.tuya.lighting.open.api.domain.alarm.AlarmListRequest;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class AlarmApiTest {

    private AlarmApi alarmApi;

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
        alarmApi = new AlarmApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void list() {
        AlarmListRequest request = new AlarmListRequest();
        request.setProjectId("13985430391394*****");
        request.setAlarmType(1);
        request.setRoomIds(Arrays.asList("13985430413037*****", "13985430438077*****"));
        BaseResponse<PageResult<AlarmListItem>> response = alarmApi.list(request);
    }

    @Test
    public void clearAlarm() {
        BaseResponse<Boolean> response = alarmApi.clearAlarm("13985430391394*****", "1");
    }
}