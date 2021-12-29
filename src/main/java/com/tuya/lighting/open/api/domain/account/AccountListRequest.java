package com.tuya.lighting.open.api.domain.account;

import com.tuya.lighting.open.api.domain.PageQuery;

/**
 * Paging query request for account list
 *
 * @author lighting
 */
public class AccountListRequest extends PageQuery {

    /**
     * uid
     */
    private String uid;

    /**
     * login name
     */
    private String loginName;

    /**
     * nickname
     */
    private String nickName;

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
}
