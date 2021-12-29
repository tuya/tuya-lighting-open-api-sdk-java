package com.tuya.lighting.open.api.domain.account;

/**
 * Account list result
 *
 * @author lighting
 */
public class AccountListResult {

    /**
     * uid
     */
    private String uid;

    /**
     * login name
     */
    private String loginName;

    /**
     * nick name
     */
    private String nickName;

    /**
     * role code
     */
    private String roleCode;

    /**
     * role name
     */
    private String roleName;

    /**
     * remark
     */
    private String remark;

    /**
     * create date
     */
    private String createDate;

    /**
     * admin id
     */
    private String adminId;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
}
