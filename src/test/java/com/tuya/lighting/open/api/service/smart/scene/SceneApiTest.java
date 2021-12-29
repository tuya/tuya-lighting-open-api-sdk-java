package com.tuya.lighting.open.api.service.smart.scene;

import com.alibaba.fastjson.JSONObject;
import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.smart.scene.*;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SceneApiTest {

    private SceneApi sceneApi;

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
        sceneApi = new SceneApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void listScene() {
        SceneListRequest request = new SceneListRequest();
        request.setProjectId("13985430391394*****");
        request.setRoomIds(Arrays.asList("13985430427549*****"));
        BaseResponse<List<SceneInfoResult>> response = sceneApi.listScene(request);
    }

    @Test
    public void getById() {
        BaseResponse<SceneInfoResult> response = sceneApi.getById("QqQ9CVvYADl*****");
    }

    @Test
    public void create() {
        SceneSaveRequest request = new SceneSaveRequest();
        request.setName("scene name");
        request.setProjectId("13985430391394*****");
        request.setRoomId("13985430413037*****");
        Action action = new Action();
        action.setEntityId("vdevo1625652189*****");
        action.setEntityName("name");
        JSONObject executorProperty = new JSONObject();
        executorProperty.put("1", true);
        action.setExecutorProperty(executorProperty);
        action.setActionExecutor("1");
        request.setActions(Collections.singletonList(action));
        BaseResponse<SceneSaveResult> response = sceneApi.create(request);
    }

    @Test
    public void update() {
        SceneSaveRequest request = new SceneSaveRequest();
        request.setRuleId("qKEA6KAf2xY*****");
        request.setName("scene name updated");
        request.setProjectId("13985430391394*****");
        request.setRoomId("13985430413037*****");
        Action action = new Action();
        action.setEntityId("vdevo1625652189*****");
        action.setEntityName("name");
        JSONObject executorProperty = new JSONObject();
        executorProperty.put("1", true);
        action.setExecutorProperty(executorProperty);
        action.setActionExecutor("1");
        request.setActions(Collections.singletonList(action));
        BaseResponse<SceneSaveResult> response = sceneApi.update(request);
    }

    @Test
    public void getActionProperty() {
        ActionPropertyRequest request = new ActionPropertyRequest();
        request.setRoomId("13985430413037*****");
        request.setDeviceType("qt");
        BaseResponse<List<ActionPropertyResult>> response = sceneApi.getActionProperty(request);
    }

    @Test
    public void trigger() {
        SceneTriggerRequest request = new SceneTriggerRequest();
        request.setProjectId("13985430391394*****");
        request.setRuleId("qKEA6KAf2xY*****");
        BaseResponse<Object> response = sceneApi.trigger(request);
    }
}