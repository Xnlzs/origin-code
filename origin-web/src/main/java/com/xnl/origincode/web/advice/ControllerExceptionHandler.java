package com.xnl.origincode.web.advice;

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
@Order(100)
public class ControllerExceptionHandler {

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseBody
	public ResponseMessage illegalArgumentException(IllegalArgumentException ex) {
		ex.printStackTrace();
		return new ResponseMessage("501", "非法参数", 0);
	}


	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ResponseMessage runtimeExceptionHandler(RuntimeException ex) {
		ex.printStackTrace();
		return new ResponseMessage("503", "运行时异常", 0);
	}


	/**
	 * 其他错误
	 */
	@ExceptionHandler({Exception.class})
	@ResponseBody
	public ResponseMessage exception(Exception ex) {
		ex.printStackTrace();
		return new ResponseMessage("504", "未知异常", 0);
	}
}
