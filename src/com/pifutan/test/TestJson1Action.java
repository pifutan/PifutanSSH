package com.pifutan.test;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Action����json��ʽ1��
 * ����struts.xml��ʽ����Ҫ����struts2-json-plugin-2.5.13.jar����
 * ��Ȼ����汾���в�ֻͬҪ���ݾͺã���struts.xml������action��Ҫ��extends="json-default"��package�£�
 * Ĭ�ϻ᷵������get���������ԣ�������û��������ԡ�
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
