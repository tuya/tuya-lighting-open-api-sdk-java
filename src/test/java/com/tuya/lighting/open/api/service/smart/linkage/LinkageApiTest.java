package com.tuya.lighting.open.api.service.smart.linkage;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.smart.linkage.*;
import com.tuya.lighting.open.api.domain.smart.scene.Action;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class LinkageApiTest {

    private LinkageApi linkageApi;

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
        linkageApi = new LinkageApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void listLinkages() {
        LinkageListRequest request = new LinkageListRequest();
        request.setProjectId("13985430391394*****");
        BaseResponse<List<LinkageInfoResult>> response = linkageApi.listLinkages(request);
    }

    @Test
    public void getLinkageById() {
        BaseResponse<LinkageInfoResult> response = linkageApi.getLinkageById("duC6Lt8fpaX*****");
    }

    @Test
    public void createLinkage() {
        LinkageSaveRequest request = new LinkageSaveRequest();
        request.setName("linkage name");
        request.setProjectId("13985430391394*****");
        Action action = new Action();
        action.setEntityId("vdevo1625652189*****");
        action.setEntityName("name");
        JSONObject executorProperty = new JSONObject();
        executorProperty.put("1", true);
        action.setExecutorProperty(executorProperty);
        action.setExecutorType(1);
        request.setActions(Collections.singletonList(action));
        Condition condition = new Condition();
        condition.setEntityId("7934095901412*****");
        condition.setEntitySubIds("sunsetrise");
        condition.setEntityType(3);
        JSONArray exprArray = new JSONArray();
        JSONArray expr = new JSONArray();
        expr.add("$sunsetrise");
        expr.add("==");
        expr.add("sunrise");
        exprArray.add(expr);
        condition.setExpr(exprArray);
        JSONObject extraInfo = new JSONObject();
        extraInfo.put("cityName", "杭州");
        condition.setExtraInfo(extraInfo);
        request.setConditions(Collections.singletonList(condition));
        BaseResponse<LinkageInfoResult> response = linkageApi.createLinkage(request);
    }

    @Test
    public void updateLinkage() {
        LinkageSaveRequest request = new LinkageSaveRequest();
        request.setRuleId("jzpldM1RaAL*****");
        request.setName("linkage name updated");
        request.setProjectId("13985430391394*****");
        Action action = new Action();
        action.setEntityId("vdevo1625652189*****");
        action.setEntityName("name");
        JSONObject executorProperty = new JSONObject();
        executorProperty.put("1", true);
        action.setExecutorProperty(executorProperty);
        action.setExecutorType(1);
        request.setActions(Collections.singletonList(action));
        Condition condition = new Condition();
        condition.setEntityId("7934095901412*****");
        condition.setEntitySubIds("sunsetrise");
        condition.setEntityType(3);
        JSONArray exprArray = new JSONArray();
        JSONArray expr = new JSONArray();
        expr.add("$sunsetrise");
        expr.add("==");
        expr.add("sunrise");
        exprArray.add(expr);
        condition.setExpr(exprArray);
        JSONObject extraInfo = new JSONObject();
        extraInfo.put("cityName", "Hangzhou");
        condition.setExtraInfo(extraInfo);
        request.setConditions(Collections.singletonList(condition));
        BaseResponse<LinkageInfoResult> response = linkageApi.updateLinkage(request);
    }

    @Test
    public void listSchedules() {
        LinkageListRequest request = new LinkageListRequest();
        request.setProjectId("13985430391394*****");
        BaseResponse<List<LinkageInfoResult>> response = linkageApi.listSchedules(request);
    }

    @Test
    public void getScheduleById() {
        BaseResponse<LinkageInfoResult> response = linkageApi.getScheduleById("gEVWHfAO1sh*****");
    }

    @Test
    public void createSchedule() {
        LinkageSaveRequest request = new LinkageSaveRequest();
        request.setName("schedule name");
        request.setProjectId("13985430391394*****");
        Action action = new Action();
        action.setEntityId("vdevo1625652189*****");
        action.setEntityName("name");
        JSONObject executorProperty = new JSONObject();
        executorProperty.put("1", true);
        action.setExecutorProperty(executorProperty);
        action.setExecutorType(1);
        request.setActions(Collections.singletonList(action));
        Condition condition = new Condition();
        condition.setEntityId("timer");
        condition.setEntitySubIds("timer");
        condition.setEntityType(6);
        JSONArray exprArray = new JSONArray();
        JSONObject expr = new JSONObject();
        expr.put("loops", "1111011");
        expr.put("time", "12:00");
        expr.put("timeZoneId", "Asia/Shanghai");
        exprArray.add(expr);
        condition.setExpr(exprArray);
        JSONObject extraInfo = new JSONObject();
        condition.setExtraInfo(extraInfo);
        request.setConditions(Collections.singletonList(condition));
        BaseResponse<LinkageInfoResult> response = linkageApi.createSchedule(request);
    }

    @Test
    public void updateSchedule() {
        LinkageSaveRequest request = new LinkageSaveRequest();
        request.setRuleId("PeiP0znHdo3*****");
        request.setName("schedule name updated");
        request.setProjectId("13985430391394*****");
        Action action = new Action();
        action.setEntityId("vdevo1625652189*****");
        action.setEntityName("name");
        JSONObject executorProperty = new JSONObject();
        executorProperty.put("1", true);
        action.setExecutorProperty(executorProperty);
        action.setExecutorType(1);
        request.setActions(Collections.singletonList(action));
        Condition condition = new Condition();
        condition.setEntityId("timer");
        condition.setEntitySubIds("timer");
        condition.setEntityType(6);
        JSONArray exprArray = new JSONArray();
        JSONObject expr = new JSONObject();
        expr.put("loops", "1111011");
        expr.put("time", "12:00");
        expr.put("timeZoneId", "Asia/Shanghai");
        exprArray.add(expr);
        condition.setExpr(exprArray);
        JSONObject extraInfo = new JSONObject();
        condition.setExtraInfo(extraInfo);
        request.setConditions(Collections.singletonList(condition));
        BaseResponse<LinkageInfoResult> response = linkageApi.updateSchedule(request);
    }

    @Test
    public void changeStatus() {
        ChangeStatusRequest request = new ChangeStatusRequest();
        request.setRuleId("vclS1IGKcSo*****");
        request.setEnabled(false);
        BaseResponse<Object> response = linkageApi.changeStatus(request);
    }

    @Test
    public void deleteLinkage() {
        LinkageDeleteRequest request = new LinkageDeleteRequest();
        request.setRuleId("vclS1IGKcSo*****");
        BaseResponse<Object> response = linkageApi.deleteLinkage(request);
    }
}