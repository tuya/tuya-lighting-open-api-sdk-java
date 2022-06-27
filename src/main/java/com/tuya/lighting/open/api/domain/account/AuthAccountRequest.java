package com.tuya.lighting.open.api.domain.account;

/**
 * Request for account authorization
 *
 * @author lighting
 */
public class AuthAccountRequest {

    /**
     * username
     */
    private String username;

    /**
     * nickname
     */
    private String nickname;

    /**
     * country code
     */
    private String countryCode;

    /**
     * password, md5(your password), lowercase, 32 digits
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
