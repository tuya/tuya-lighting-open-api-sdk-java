package com.tuya.lighting.open.api.service.room;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.SimpleResult;
import com.tuya.lighting.open.api.domain.room.*;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RoomApiTest {

    private RoomApi roomApi;

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
        roomApi = new RoomApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {
        RoomCreateRequest request = new RoomCreateRequest();
        request.setProjectId("14565450026152*****");
        request.setName("roomName");
        request.setParentId("0");
        request.setRoomType(1);
        request.setAddress("address");
        BaseResponse<RoomCreateResult> response = roomApi.create(request);
    }

    @Test
    public void update() {
        RoomUpdateRequest request = new RoomUpdateRequest();
        request.setRoomId("14565484638933*****");
        request.setName("roomNameUpdated");
        request.setAddress("addressUpdated");
        BaseResponse<RoomUpdateResult> response = roomApi.update(request);
    }

    @Test
    public void remove() {
        BaseResponse<SimpleResult> response = roomApi.remove("14467325224184*****");
    }

    @Test
    public void queryTree() {
        BaseResponse<RoomTreeResult> response = roomApi.queryTree("14565450026152*****");
    }
}