package com.tuya.lighting.open.api.config;

import java.util.HashSet;
import java.util.Set;

/**
 * URLs Of Open API
 *
 * @author lighting
 */
public class OpenApiUrlConstants {

    /**
     * TokenApi
     */
    public static final String GET_ACCESS_TOKEN = "/v1.0/token";
    public static final String REFRESH_ACCESS_TOKEN = "/v1.0/token/%s";

    /**
     * AccountApi
     */
    public static final String AUTH_ACCOUNT_URL_SUFFIX = "/v1.0/industry/auth/admin";
    public static final String GET_TICKET_TOKEN_URL_SUFFIX = "/v1.0/industry/auth/ticket";
    public static final String ADD_PERMISSION_TO_ACCOUNT_URL_SUFFIX = "/v1.0/illumination/account/permission/add";
    public static final String LIST_ACCOUNT_URL_SUFFIX = "/v1.0/illumination/account/list";

    /**
     * ProjectApi
     */
    public static final String CREATE_A_PROJECT = "/v1.0/illumination/construction/project";
    public static final String UPDATE_A_PROJECT = "/v1.0/illumination/construction/project";
    public static final String REMOVE_A_PROJECT = "/v1.0/illumination/construction/project/%s";
    public static final String GET_A_PROJECT = "/v1.0/illumination/construction/project/%s";
    public static final String PAGING_QUERY_PROJECTS = "/v1.0/illumination/construction/projects";

    /**
     * RoomApi
     */
    public static final String CREATE_A_ROOM = "/v1.0/illumination/construction/room";
    public static final String UPDATE_A_ROOM = "/v1.0/illumination/construction/room";
    public static final String REMOVE_A_ROOM = "/v1.0/illumination/construction/room/%s";
    public static final String QUERY_ROOM_TREE = "/v2.0/illumination/construction/rooms/project/%s";

    /**
     * DeviceApi
     */
    public static final String LIST_DEVICES_URL_SUFFIX = "/v1.0/illumination/devices";
    public static final String GET_DEVICE_DETAIL_URL_SUFFIX = "/v1.0/illumination/devices/%s/detail";
    public static final String LIST_UNASSIGNED_DEVICES_URL_SUFFIX = "/v1.0/illumination/devices/unassignedRoom";
    public static final String GET_ROOM_STATE_URL_SUFFIX = "/v1.0/illumination/devices/roomstate/%s";
    public static final String DEVICE_SINGLE_CONTROL_URL_SUFFIX = "/v1.0/illumination/devices/%s/dps";
    public static final String DEVICE_MULTI_CONTROL_URL_SUFFIX = "/v1.0/illumination/devices/dps/multidev";
    public static final String DEVICE_GROUP_CONTROL_URL_SUFFIX = "/v1.0/illumination/devices/dps/group";
    public static final String DEVICE_DELETE_URL_SUFFIX = "/v1.0/illumination/devices/%s/resetGateway";
    public static final String DEVICE_ASSIGN_URL_SUFFIX = "/v1.0/illumination/device/relations/save";

    /**
     * AlarmApi
     */
    public static final String LIST_ALARM_URL_SUFFIX = "/v1.0/illumination/sysalarm/alarms";
    public static final String CLEAR_ALARM_URL_SUFFIX = "/v1.0/illumination/sysalarm/disalarm/%s/%s";

    /**
     * EnergyApi
     */
    public static final String QUERY_ENERGY_QUERY_URL_SUFFIX = "/v1.0/illumination/space/energy/query";

    /**
     * ConstructionTaskApi
     */
    public static final String CREATE_AUTHORIZATION_RECORD_URL_SUFFIX = "/v2.0/illumination/construction/record";
    public static final String LIST_ROOM_RECORD_URL_SUFFIX = "/v2.0/illumination/construction/task/rooms";
    public static final String LIST_RECORD_URL_SUFFIX = "/v2.0/illumination/construction/task/records";
    public static final String GET_RECORD_DETAIL_URL_SUFFIX = "/v2.0/illumination/construction/task/record/%s";
    public static final String CANCEL_AUTHORIZATION_RECORD_URL_SUFFIX = "/v2.0/illumination/construction/task/cancelAuthorization/%s";

    /**
     * Smart-TemplateApi
     */
    public static final String SUPPORT_SELECTOR_URL_SUFFIX = "/v1.0/iot-02/smart/support-selector";
    public static final String TEMPLATE_LIST_URL_SUFFIX = "/v1.0/iot-02/smart/template-list";
    public static final String GET_TEMPLATE_BY_ID_URL_SUFFIX = "/v1.0/iot-02/smart/template/%s";
    public static final String SIMPLE_CREATE_TEMPLATE_URL_SUFFIX = "/v1.0/iot-02/smart/template/simple-save";
    public static final String CREATE_TEMPLATE_URL_SUFFIX = "/v1.0/iot-02/smart/template/save";
    public static final String SENIOR_CREATE_URL_SUFFIX = "/v1.0/iot-02/smart/template/senior-save";
    public static final String DELETE_BY_ID_URL_SUFFIX = "/v1.0/iot-02/smart/template/remove/%s";
    public static final String GENERATE_FROM_TEMPLATE_URL_SUFFIX = "/v1.0/iot-02/smart/template/generate/%s";
    public static final String TEMPLATE_CHECK_URL_SUFFIX = "/v1.0/iot-02/smart/template/check";

    /**
     * Smart-SceneApi
     */
    public static final String SCENE_LIST_URL_SUFFIX = "/v1.0/illumination/smart/scene/list";
    public static final String GET_SCENE_BY_ID_URL_SUFFIX = "/v1.0/illumination/smart/scene/%s";
    public static final String CREATE_SCENE_URL_SUFFIX = "/v1.0/illumination/smart/scene/add";
    public static final String UPDATE_SCENE_URL_SUFFIX = "/v1.0/illumination/smart/scene/update";
    public static final String GET_ACTION_PROPERTIES_URL_SUFFIX = "/v1.0/illumination/smart/scene/action/property";
    public static final String TRIGGER_SCENE_URL_SUFFIX = "/v1.0/illumination/smart/trigger";

    /**
     * Smart-LinkageApi
     */
    public static final String LINKAGE_LIST_URL_SUFFIX = "/v1.0/illumination/smart/linkage/list";
    public static final String GET_LINKAGE_BY_ID_URL_SUFFIX = "/v1.0/illumination/smart/linkage/%s";
    public static final String CREATE_LINKAGE_URL_SUFFIX = "/v1.0/illumination/smart/linkage/add";
    public static final String UPDATE_LINKAGE_URL_SUFFIX = "/v1.0/illumination/smart/linkage/update";
    public static final String SCHEDULE_LIST_URL_SUFFIX = "/v1.0/illumination/smart/schedule/list";
    public static final String GET_SCHEDULE_BY_ID_URL_SUFFIX = "/v1.0/illumination/smart/schedule/%s";
    public static final String CREATE_SCHEDULE_URL_SUFFIX = "/v1.0/illumination/smart/schedule/add";
    public static final String UPDATE_SCHEDULE_URL_SUFFIX = "/v1.0/illumination/smart/schedule/update";
    public static final String SMART_CHANGE_STATUS_URL_SUFFIX = "/v1.0/illumination/smart/change-status";
    public static final String SMART_REMOVE_URL_SUFFIX = "/v1.0/illumination/smart/remove";

    /**
     * GroupApi
     */
    public static final String SUPPORT_GROUP_DEVICES_URL_SUFFIX = "/v1.0/illumination/group/package/create/devices";
    public static final String CREATE_GROUP_URL_SUFFIX = "/v1.0/illumination/group/package";
    public static final String GROUP_UPDATE_DEVICES_URL_SUFFIX = "/v1.0/illumination/group/package/%s/devices";
    public static final String UPDATE_GROUP_URL_SUFFIX = "/v1.0/illumination/group/package";
    public static final String DELETE_GROUP_URL_SUFFIX = "/v1.0/illumination/group/package/%s";
    public static final String LIST_GROUPS_OF_ROOM_URL_SUFFIX = "/v1.0/illumination/group/package";
    public static final String LIST_GROUPS_OF_PROJECT_URL_SUFFIX = "/v1.0/illumination/project/group/package";
    public static final String GET_GROUP_DETAIL_URL_SUFFIX = "/v1.0/illumination/group/package/%s";
    public static final String LIST_GROUP_DEVICES_URL_SUFFIX = "/v1.0/illumination/group/package/devices";
    public static final String GROUP_CONTROL_URL_SUFFIX = "/v1.0/illumination/group/package/control";




    public static final Set<String> NO_ACCESS_TOKEN_URL_SUFFIX_SET = new HashSet<>();

    static {
        NO_ACCESS_TOKEN_URL_SUFFIX_SET.add(GET_ACCESS_TOKEN);
        NO_ACCESS_TOKEN_URL_SUFFIX_SET.add(REFRESH_ACCESS_TOKEN);
    }
}
