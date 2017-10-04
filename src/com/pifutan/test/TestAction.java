package com.pifutan.test;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	private static final long serialVersionUID = -8418279152988734915L;

	@Action(value="test", results= {@Result(name="success",location="/index.html")})
	public String test() {
		return SUCCESS;
	}
	

}
