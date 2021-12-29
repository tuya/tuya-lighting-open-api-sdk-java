package com.tuya.lighting.open.api.domain.account;

/**
 * Request for ticket
 *
 * @author lighting
 */
public class TicketRequest {

    /**
     * username
     */
    private String username;

    /**
     * country code
     */
    private String countryCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
