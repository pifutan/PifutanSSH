package com.pifutan.test;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
/**
 * get方法的参数都会被返回，没有则返回null
 * @author ZhangYuliang
 *
 */
@ParentPackage("json-default")
public class TestJsonAction extends ActionSupport{
	private static final long serialVersionUID = 6419022471976485692L;
	
	private String testString;
	private String name;
	
//	@Action(value="testJson", results= {@Result(type="json", params= {"key1","testString","name","name"})})
	@Action(value="testJson", results= {@Result(type="json")})
	public String testJson() {
		// 服务器端支持跨域
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		testString = methodName;
		System.out.println(this.getClass() + "." + methodName);
		return SUCCESS;
	}
	@Action(value="testAddUser", results= {@Result(type="json")})
	public String testAddUser() {
		// 服务器端支持跨域
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		testString = methodName;
		System.out.println(this.getClass() + "." + methodName);
		return SUCCESS;
	}
	@Action(value="testSSH", results= {@Result(type="json")})
	public String testSSH() {
		// 服务器端支持跨域
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		testString = methodName;
		System.out.println(this.getClass() + "." + methodName);
		return SUCCESS;
	}
	public String getTestString() {
		return testString;
	}
	public String getName() {
		return name;
	}
	public String getNoValue() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
