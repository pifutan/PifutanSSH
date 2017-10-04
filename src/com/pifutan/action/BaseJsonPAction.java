package com.pifutan.action;

import org.apache.struts2.convention.annotation.Result;
/**
 * 前端自行实现跨域，服务器端需要返回一个callbackParameter且为前端设置的jsonpCallback的值
 * @author ZhangYuliang
 *
 */
@Result(type = "json", params = { 
		"excludeNullProperties", "true", 
		"excludeProperties",
		"actionErrors,actionMessages,fieldErrors,text", 
		"ignoreHierarchy", "false", 
		"callbackParameter", "callback" })
public class BaseJsonPAction {
	static final long serialVersionUID = 1L;
	String errorCode = "200";
	String errorMessage = "OK";
	String callback;

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

}
