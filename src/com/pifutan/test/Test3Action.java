package com.pifutan.test;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Action创建方式3：
 * java类继承自ActionSupport，然后重写execute，然后在struts.xml中配置，和方式2没啥区别，也可指定method。
 * @author ZhangYuliang
 *
 */
public class Test3Action extends ActionSupport{
	private static final long serialVersionUID = -5432405025371322644L;

	@Override
	public String execute() throws Exception {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return SUCCESS;
	}
	
	public String test31() {

		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return SUCCESS;
	}
	
	private String testJson; 
	public String testJson() {
		testJson = "testJson";
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return SUCCESS;
	}

	public String getTestJson() {
		return testJson;
	}


}
