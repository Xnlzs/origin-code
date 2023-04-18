package com.xnl.origincode.web.advice;

import com.xnl.origincode.service.exception.ServiceException;
import com.xnl.origincode.web.response.ResponseMessage;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 统一异常处理中心
 * @author: xiaonailiang
 * @date:  2023/4/17 3:10 下午
 */
@ControllerAdvice
@Order(-100)
public class BusinessExceptionHandler {

	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ResponseMessage serviceExceptionHandler(ServiceException ex) {
		ex.printStackTrace();
		return new ResponseMessage("502", ex.getMessage(), 0);
	}

}
