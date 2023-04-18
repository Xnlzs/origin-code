package com.xnl.origincode.api.exception;

/**
 * @description: 业务异常
 * @author: xiaonailiang
 * @create: 2023/04/17 10:44
 */
public class ServiceException extends IllegalArgumentException{

    private static final long serialVersionUID = 1014434764019343892L;

    private String msg;

    public ServiceException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
