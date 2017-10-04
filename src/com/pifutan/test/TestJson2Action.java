package com.pifutan.test;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Action返回json方式2：
 * 注解方式：同样需要导入struts2-json-plugin-2.5.13.jar包，
 * 类前需要添加注解@ParentPackage("json-default")，
 * 方法前添加注解如：@Action(value="actionName",results= {@Result(type="json",params= {"key1","value1","key2","value2"})})，
 * 其中value为类中get方法后的value返回值，如果没有，则不返回该key和value。
 * @author ZhangYuliang
 *
 */
@ParentPackage("json-default")
public class TestJson2Action extends ActionSupport{
	private static final long serialVersionUID = 1644729331402577129L;

	private String testJson;
	public String getTestJson() {
		return testJson;
	}
	private String value2;
	public String getValue2() {
		return value2;
	}
	@Action(value="testJson21",results= {@Result(type="json",params= {"testJson","testJson","key2","value2"})})
	public String testJson21(){
		String nethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		testJson = nethodName;
		value2 = "value2String";
		System.out.println(this.getClass() + "." + nethodName);
		return SUCCESS;
	}
	
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	@Action(value="testJson22",results= {@Result(type="json",params= {"testJson","testJson","key2","value2"})})
	public String testJson22(){
		String nethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		testJson = nethodName;
		value2 = name;
		System.out.println(this.getClass() + "." + nethodName);
		return SUCCESS;
	}
	

}
