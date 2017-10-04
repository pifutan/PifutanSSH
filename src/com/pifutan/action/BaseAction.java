package com.pifutan.action;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;

@ParentPackage("struts-default")
@Results({
	@Result(name = "success", location = "index.html"),
	@Result(name = "error", location = "index.html")
	})  
@Scope("prototype")
public class BaseAction {
	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	static final long serialVersionUID = 1L;
	String errorCode = "200";
	String errorMessage = "OK";

}
