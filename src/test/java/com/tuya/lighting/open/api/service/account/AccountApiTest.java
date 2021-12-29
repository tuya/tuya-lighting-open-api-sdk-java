package com.tuya.lighting.open.api.service.account;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.account.*;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class AccountApiTest {

    private AccountApi accountApi;

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
        accountApi = new AccountApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void authAccount() {
        AuthAccountRequest request = new AuthAccountRequest();
        request.setUsername("yueliang");
        request.setNickname("yueliang nick");
        request.setCountryCode("86");
        BaseResponse<String> response = accountApi.authAccount(request);
    }

    @Test
    public void getTicket() {
        TicketRequest request = new TicketRequest();
        request.setUsername("shenpan");
        request.setCountryCode("86");
        BaseResponse<String> response = accountApi.getTicket(request);
    }

    @Test
    public void addPermission() {
        AddPermissionRequest request = new AddPermissionRequest();
        request.setProjectId("13985430391394*****");
        request.setTuyaUid("bay163419590465*****");
        request.setRoomIdList(Arrays.asList("13985430413037*****"));
        BaseResponse<Boolean> response = accountApi.addPermission(request);
    }

    @Test
    public void listAccounts() {
        AccountListRequest request = new AccountListRequest();
        BaseResponse<PageResult<AccountListResult>> response = accountApi.listAccounts(request);
    }
}