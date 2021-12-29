package com.tuya.lighting.open.api.service.group;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.device.DeviceDetailResult;
import com.tuya.lighting.open.api.domain.group.*;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GroupApiTest {

    private GroupApi groupApi;

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
        groupApi = new GroupApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void listSupportGroupDevices() {
        SupportGroupDevicesRequest request = new SupportGroupDevicesRequest();
        request.setRoomId("13985430413037*****");
        BaseResponse<SupportGroupDevicesResult> response = groupApi.listSupportGroupDevices(request);
    }

    @Test
    public void createGroup() {
        GroupCreateRequest request = new GroupCreateRequest();
        request.setRoomId("13985430413037*****");
        request.setName("create group");
        request.setDeviceSaasIds(Arrays.asList("sa303690910114*****"));
        BaseResponse<GroupOperateResult> response = groupApi.createGroup(request);
    }

    @Test
    public void listGroupUpdateDevices() {
        BaseResponse<List<GroupUpdateDevicesResult>> response = groupApi.listGroupUpdateDevices("14484846670565*****");
    }

    @Test
    public void updateGroup() {
        GroupUpdateRequest request = new GroupUpdateRequest();
        request.setRoomId("13985430413037*****");
        request.setGroupPackageId("14484846670565*****");
        request.setName("new name");
        BaseResponse<GroupOperateResult> response = groupApi.updateGroup(request);
    }

    @Test
    public void deleteGroup() {
    }

    @Test
    public void listGroupOfRoom() {
        GroupListRequest request = new GroupListRequest();
        request.setRoomId("13985430413037*****");
        request.setPage(1);
        request.setPageSize(10);
        BaseResponse<PageResult<GroupInfoResult>> response = groupApi.listGroupOfRoom(request);
    }

    @Test
    public void listGroupOfProject() {
        GroupListRequest request = new GroupListRequest();
        request.setProjectId("13985430391394*****");
        request.setPage(1);
        request.setPageSize(10);
        BaseResponse<PageResult<GroupInfoResult>> response = groupApi.listGroupOfProject(request);
    }

    @Test
    public void getById() {
        BaseResponse<GroupInfoResult> response = groupApi.getById("14484846670565*****");
    }

    @Test
    public void listDevicesOfGroup() {
        GroupDeviceListRequest request = new GroupDeviceListRequest();
        request.setGroupPackageId("14605103642685*****");
        request.setPage(1);
        request.setPageSize(100);
        BaseResponse<PageResult<DeviceDetailResult>> response = groupApi.listDevicesOfGroup(request);
    }

    @Test
    public void controlGroup() {
        GroupControlRequest request = new GroupControlRequest();
        request.setGroupPackageId("14484846670565*****");
        request.setDpCode("switch_led");
        request.setDpValue("true");
        BaseResponse<Boolean> response = groupApi.controlGroup(request);
    }
}