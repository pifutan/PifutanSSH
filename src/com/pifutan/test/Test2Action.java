package com.pifutan.test;

import com.opensymphony.xwork2.Action;
/**
 * Action������ʽ2��
 * java��ʵ��Action�ӿڣ�������дexecute��Ȼ����struts.xml�����ã���ʵ�ͷ�ʽ1ûɶ����ֻ���ܹ�ֱ�ӷ���SUCCESS�������Լ�д��success���˶��ѣ���ָ��method��
 * @author ZhangYuliang
 *
 */
public class Test2Action implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return SUCCESS;
	}
	public String test21() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return SUCCESS;
	}

}
