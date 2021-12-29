package com.tuya.lighting.open.api.domain;

/**
 * Base response
 *
 * @param <T>
 * @author lighting
 */
public class BaseResponse<T> {

    /**
     * successful or not
     */
    private Boolean success;

    /**
     * timestamp
     */
    private Long t;

    /**
     * error code
     */
    private String code;

    /**
     * message
     */
    private String msg;

    /**
     * detail result
     */
    private T result;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getT() {
        return t;
    }

    public void setT(Long t) {
        this.t = t;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
