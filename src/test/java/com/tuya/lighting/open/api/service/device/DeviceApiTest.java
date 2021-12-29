package com.tuya.lighting.open.api.service.device;

import com.tuya.lighting.open.api.config.TuyaOpenApiConfiguration;
import com.tuya.lighting.open.api.domain.BaseResponse;
import com.tuya.lighting.open.api.domain.PageResult;
import com.tuya.lighting.open.api.domain.device.*;
import com.tuya.lighting.open.api.domain.token.TokenResult;
import com.tuya.lighting.open.api.service.token.TokenApi;
import com.tuya.lighting.open.api.utils.HttpClientUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class DeviceApiTest {

    private DeviceApi deviceApi;

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
        deviceApi = new DeviceApi();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void listDevices() {
        DeviceListRequest request = new DeviceListRequest();
        request.setRoomId("13985430413037*****");
        request.setRoomType(1);
        request.setPage(1);
        request.setPageSize(10);
        request.setDeviceStatus(Arrays.asList("EXPIRING", "OFFLINE", "ONLINE", "EXCEPTION"));
        BaseResponse<PageResult<DeviceDetailResult>> response = deviceApi.listDevices(request);
    }

    @Test
    public void getDetail() {
        BaseResponse<DeviceInfoResult> response = deviceApi.getDetail("sa309764719018*****");
    }

    @Test
    public void listUnassignedDevices() {
        UnassignedDeviceListRequest request = new UnassignedDeviceListRequest();
        request.setProjectId("13985430391394*****");
        request.setPage(1);
        request.setPageSize(10);
        request.setDeviceStatus(Arrays.asList("ONLINE"));
        request.setDeviceTypes(Arrays.asList(0, 1));
        BaseResponse<PageResult<DeviceDetailResult>> response = deviceApi.listUnassignedDevices(request);
    }

    @Test
    public void getRoomState() {
        BaseResponse<RoomStateResult> response = deviceApi.getRoomState("13985430451079*****");
    }

    @Test
    public void singleControl() {
        DeviceSingleControlRequest request = new DeviceSingleControlRequest();
        request.setProjectId("13985430391394*****");
        request.setDeviceId("vdevo1632901862*****");
        request.setDpCode("switch");
        request.setDpValue("false");
        BaseResponse<DeviceControlResult> response = deviceApi.singleControl("vdevo1632901862*****", request);
    }

    @Test
    public void multiControl() {
        DeviceMultiControlRequest request = new DeviceMultiControlRequest();
        request.setProjectId("13985430391394*****");
        request.setDeviceIds(Arrays.asList("vdevo1632901862*****"));
        request.setDpCode("switch");
        request.setDpValue("true");
        BaseResponse<DeviceControlResult> response = deviceApi.multiControl(request);
    }

    @Test
    public void groupControl() {
        DeviceGroupControlRequest request = new DeviceGroupControlRequest();
        request.setProjectId("13985430391394*****");
        request.setRoomId("13985430451079*****");
        request.setDpCode("switch");
        request.setDpValue("false");
        BaseResponse<DeviceControlResult> response = deviceApi.groupControl(request);
    }

    @Test
    public void deleteDevice() {
        DeviceDeleteRequest request = new DeviceDeleteRequest();
        request.setProjectId("13985430391394*****");
        request.setDeviceId("deviceId");
        BaseResponse<DeviceControlResult> response = deviceApi.deleteDevice(request);
    }

    @Test
    public void assignDevices() {
        DeviceAssignRequest request = new DeviceAssignRequest();
        request.setProjectId("13985430391394*****");
        request.setRoomId("13985430470457*****");
        request.setDeviceIds(Arrays.asList("vdevo1632901862*****"));
        BaseResponse<DeviceAssignResult> response = deviceApi.assignDevices(request);
    }
}