package com.tuya.lighting.open.api.config;

/**
 * Tuya Open Api Configuration
 *
 * @author lighting
 */
public class TuyaOpenApiConfiguration {

    /**
     * URL
     */
    private String url;

    /**
     * client id
     */
    private String clientId;

    /**
     * client secret
     */
    private String clientSecret;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
