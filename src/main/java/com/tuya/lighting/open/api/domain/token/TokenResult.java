package com.tuya.lighting.open.api.domain.token;

/**
 * Access token result
 *
 * @author lighting
 */
public class TokenResult {

    /**
     * access token
     */
    private String accessToken;

    /**
     * expire time between 1 and 7200
     */
    private int expireTime;

    /**
     * refresh token
     */
    private String refreshToken;

    /**
     * uid
     */
    private String uid;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
