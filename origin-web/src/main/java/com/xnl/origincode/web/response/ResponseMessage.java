package com.xnl.origincode.web.response;

import java.io.Serializable;

/**
 * @description: web统一响应消息体
 * @author: xiaonailiang
 * @create: 2023/04/17 15:06
 */
public class ResponseMessage implements Serializable {

    private static final long serialVersionUID = -7479838941015050423L;

    private String responseCode;

    private String message;

    private Object data;

    public ResponseMessage(String responseCode, String message, Object data) {
        this.responseCode = responseCode;
        this.message = message;
        this.data = data;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
