package com.pifutan.test;

import org.apache.struts2.convention.annotation.Action;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
/**
 * ǰ������ʵ�ֿ��򣬷���������Ҫ����һ��callbackParameter��Ϊǰ�����õ�jsonpCallback��ֵ
 * @author ZhangYuliang
 *
 */
@ParentPackage("json-default")
public class TestJsonPAction extends ActionSupport{
	private static final long serialVersionUID = -1816842276856012802L;
	private String testString;
	private String name;
	private String callback;
//	private String _; // ǰ��jsonp�ᴫ������һ����������֪��Ϊʲô

	@Action(value="testJsonP", results= {@Result(type="json", params= {"callbackParameter","callback"})})
	public String testJsonP() {
		// ǰ������ʵ�ֿ���
		System.out.println("callback=" + callback);
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
	public void setName(String name) {
		this.name = name;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}

//	public void set_(String _) {
//		this._ = _;
//	}
}
