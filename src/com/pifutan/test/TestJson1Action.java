package com.pifutan.test;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Action返回json方式1：
 * 配置struts.xml方式：需要导入struts2-json-plugin-2.5.13.jar包，
 * 当然具体版本可有不同只要兼容就好，在struts.xml中配置action需要在extends="json-default"的package下，
 * 默认会返回所有get方法的属性，不论有没有这个属性。
 * @author ZhangYuliang
 *
 */
public class TestJson1Action extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String testJson;
	
	@Override
	public String execute() throws Exception {
		String nethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		testJson = nethodName;
		System.out.println(this.getClass() + "." + nethodName);
		return SUCCESS;
	}
	public String testJson11() {
		String nethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		testJson = nethodName;
		System.out.println(this.getClass() + "." + nethodName);
		return SUCCESS;
	}
	public String getTestJson() {
		return testJson;
	}

}
