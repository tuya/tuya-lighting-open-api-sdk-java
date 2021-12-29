package com.tuya.lighting.open.api.service.task;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.SimpleResult;
import com.tuya.lighting.open.api.domain.task.*;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ConstructionTaskApiTest {

    private ConstructionTaskApi constructionTaskApi;

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
        constructionTaskApi = new ConstructionTaskApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createAuthorizationRecord() {
        RecordCreateRequest request = new RecordCreateRequest();
        request.setRequestType(1);
        request.setProjectId("13985430391394*****");
        request.setRoomIds(Arrays.asList("13985430427549*****", "13985430438077*****"));
        request.setUserAccount("mm@qq.com");
        request.setCountryCode("86");
        request.setOperatorName("yuena");
        request.setDeviceTypes(Arrays.asList(0, 1));
        request.setStartTime(1633944744000L);
        request.setEndTime(1634020734770L);
        BaseResponse<RecordCreateResult> response = constructionTaskApi.createAuthorizationRecord(request);
    }

    @Test
    public void listRoomRecord() {
        RoomRecordListRequest request = new RoomRecordListRequest();
        request.setProjectId("13985430391394*****");
        request.setRoomName("1");
        request.setPage(1);
        request.setPageSize(10);
        BaseResponse<PageResult<RoomRecordListItem>> response = constructionTaskApi.listRoomRecord(request);
    }

    @Test
    public void listRecord() {
        RecordListRequest request = new RecordListRequest();
        request.setProjectId("13985430391394*****");
        request.setAuthorizationStatus(Arrays.asList("0"));
        request.setPage(1);
        request.setPageSize(10);
        BaseResponse<PageResult<RecordListItem>> response = constructionTaskApi.listRecord(request);
    }

    @Test
    public void getRecordDetail() {
        BaseResponse<RecordDetailResult> response = constructionTaskApi.getRecordDetail("14477722115774*****");
    }

    @Test
    public void cancelAuthorizationRecord() {
        BaseResponse<SimpleResult> response = constructionTaskApi.cancelAuthorizationRecord("14477722115774*****");
    }
}