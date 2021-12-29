package com.tuya.lighting.open.api.service.project;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.SimpleResult;
import com.tuya.lighting.open.api.domain.project.*;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProjectApiTest {

    private ProjectApi projectApi;

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
        projectApi = new ProjectApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {
        ProjectCreateRequest request = new ProjectCreateRequest();
        request.setName("UnitTest");
        request.setLeaderMobile("19954210000");
        request.setLeaderName("no one");
        request.setAddress("hangzhou");
        request.setDetail("detail");
        request.setLongitude(1.01);
        request.setLatitude(2.01);
        BaseResponse<ProjectCreateResult> response = projectApi.create(request);
    }

    @Test
    public void update() {
        ProjectUpdateRequest request = new ProjectUpdateRequest();
        request.setProjectId("14565450026152*****");
        request.setName("UnitTestUpdate111");
        request.setLeaderMobile("19954210000");
        request.setLeaderName("no one");
        request.setAddress("hangzhou");
        request.setDetail("detail");
        request.setLongitude(1.01);
        request.setLatitude(2.01);
        BaseResponse<ProjectUpdateResult> response = projectApi.update(request);
    }

    @Test
    public void remove() {
        BaseResponse<SimpleResult> response = projectApi.remove("14565212127284*****");
    }

    @Test
    public void getByProjectId() {
        BaseResponse<ProjectQueryResult> response = projectApi.getByProjectId("13985430391394*****");
    }

    @Test
    public void page() {
        BaseResponse<PageResult<ProjectListItem>> response = projectApi.page(1, 10, null);
    }
}