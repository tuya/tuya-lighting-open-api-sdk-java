package com.tuya.lighting.open.api.domain.account;

import com.tuya.lighting.open.api.domain.PageQuery;

/**
 * Paging query request for account list
 *
 * @author lighting
 */
public class AccountListRequest extends PageQuery {

    /**
     * login name
     */
    private String loginName;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

}
