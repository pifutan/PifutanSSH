package com.pifutan.test;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Action������ʽ3��
 * java��̳���ActionSupport��Ȼ����дexecute��Ȼ����struts.xml�����ã��ͷ�ʽ2ûɶ����Ҳ��ָ��method��
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
