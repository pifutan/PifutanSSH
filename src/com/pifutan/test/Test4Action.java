package com.pifutan.test;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Action������ʽ2��
 * ʹ��ע��ķ�ʽ��������struts.xml�����á�
 * ��Ҫ����struts2-convention-plugin-2.5.13.jar�Լ�asm-5.2.jar��asm-commons-5.2.jar��asm-tree-5.2.jar����
 * java��̳�ActionSupport��Ȼ���ڷ���ǰ���ע����@Action(value="test41", results={@Result(name="success", location="/index.html")})���ɷ��ʣ�
 * ����ע�ⷽʽ�����÷�ʽֻ��ʹ������һ�֣�����ע������ȣ�
 * ���õ���ʾThe origin server did not find a current representation for the target resource or is not willing to disclose that one exists.
 * ע�⣺������ע��İ�֮��Ĭ�ϵ�execute������Ӧ��action name�ͻ���ʾû������result success�������������෽��action���������ġ�
 * @author ZhangYuliang
 *
 */
//@ResultPath("/WEB-INF/content")
public class Test4Action extends ActionSupport{
	private static final long serialVersionUID = 9069503370994447842L;
	@Override
	public String execute() throws Exception {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return SUCCESS;
	}
	@Action(value="test41", results={@Result(name="success", location="/index.html")})
	public String test41() {
		return SUCCESS;
	}
	public String test42(){
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return SUCCESS;
	}

}
