package com.tuya.lighting.open.api.service.smart.template;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.smart.template.*;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TemplateApiTest {

    private TemplateApi templateApi;

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
        templateApi = new TemplateApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSupportSelector() {
        SupportSelectorRequest request = new SupportSelectorRequest();
        BaseResponse<SupportSelectorResult> response = templateApi.getSupportSelector(request);
    }

    @Test
    public void listTemplates() {
        TemplateListRequest request = new TemplateListRequest();
        request.setTemplateType(1);
        BaseResponse<PageResult<TemplateInfoResult>> response = templateApi.listTemplates(request);
    }

    @Test
    public void getById() {
        BaseResponse<TemplateInfoResult> response = templateApi.getById("14377493524361*****");
    }

    @Test
    public void simpleCreate() {
        SimpleCreateRequest request = new SimpleCreateRequest();
        request.setTemplateName("testTemplate");
        request.setRemark("remark");
        SimpleCreateRequest.Rule rule = new SimpleCreateRequest.Rule();
        rule.setName("ruleName");
        rule.setPid("al0*****");
        Map<String, String> dps = new HashMap<>();
        dps.put("switch_led", "true");
        dps.put("bright_value", "400");
        rule.setDps(dps);
        request.setRule(rule);
        BaseResponse<String> response = templateApi.simpleCreate(request);
    }

    @Test
    public void create() {
        CreateRequest request = new CreateRequest();
        request.setTemplateName("templateNormal");
        request.setTemplateLabel("templateLabel");
        request.setRemark("remark");
        CreateRequest.DeviceRule deviceRule = new CreateRequest.DeviceRule();
        deviceRule.setName("ruleName");
        deviceRule.setPid("al0g7kvm");
        deviceRule.setAnyMatch(true);
        Map<String, String> dps = new HashMap<>();
        dps.put("switch_led", "true");
        dps.put("bright_value", "400");
        deviceRule.setDps(dps);
        request.setDeviceRules(Collections.singletonList(deviceRule));
        CreateRequest.GroupRule groupRule = new CreateRequest.GroupRule();
        groupRule.setName("Group1");
        groupRule.setNextActionDelayTime(100);
        Map<String, String> groupDps = new HashMap<>();
        groupDps.put("switch_led", "true");
        groupRule.setDps(groupDps);
        request.setGroupRules(Collections.singletonList(groupRule));
        BaseResponse<String> response = templateApi.create(request);
    }

    @Test
    public void seniorCreate() {
        SeniorCreateRequest request = new SeniorCreateRequest();
        request.setTemplateName("templateSenior");
        request.setTemplateType(3);
        request.setValidityPeriod("1111111");
        request.setMatchType(1);
        request.setRemark("remark");
        request.setTemplateLabel("templateLabel");
        CreateRequest.DeviceRule deviceRule = new CreateRequest.DeviceRule();
        deviceRule.setName("ruleName");
        deviceRule.setPid("sos*****");
        Map<String, String> dps = new HashMap<>();
        dps.put("switch_led", "true");
        deviceRule.setDps(dps);
        request.setDeviceRules(Collections.singletonList(deviceRule));
        CreateRequest.GroupRule groupRule = new CreateRequest.GroupRule();
        groupRule.setName("Group1");
        groupRule.setNextActionDelayTime(100);
        request.setGroupRules(Collections.singletonList(groupRule));
        SeniorCreateRequest.SceneRule sceneRule = new SeniorCreateRequest.SceneRule();
        sceneRule.setTemplateId("");
        request.setSceneRules(Collections.singletonList(sceneRule));
        SeniorCreateRequest.DeviceConditionRule deviceConditionRule = new SeniorCreateRequest.DeviceConditionRule();
        deviceConditionRule.setName("deviceConditionRule");
        deviceConditionRule.setPid("aap*****");
        SeniorCreateRequest.DeviceConditionRule.Expr expr = new SeniorCreateRequest.DeviceConditionRule.Expr();
        expr.setDpId("1");
        expr.setOperator("==");
        expr.setDpValue("true");
        deviceConditionRule.setExprs(Collections.singletonList(expr));
        request.setDeviceConditionRules(Collections.singletonList(deviceConditionRule));
        BaseResponse<String> response = templateApi.seniorCreate(request);
    }

    @Test
    public void deleteById() {
        BaseResponse<Boolean> response = templateApi.deleteById("14377493524361*****");
    }

    @Test
    public void generate() {
        TemplateGenerateRequest request = new TemplateGenerateRequest();
        request.setId("14478557700739*****");
        request.setRoomId("13985430427549*****");
        BaseResponse<String> response = templateApi.generate(request);
    }

    @Test
    public void checkTemplate() {
        TemplateCheckRequest request = new TemplateCheckRequest();
        request.setTemplateId("14478471477467*****");
        request.setRoomIds(Arrays.asList("13985430427549*****"));
        BaseResponse<List<TemplateCheckResult>> response = templateApi.checkTemplate(request);
    }
}