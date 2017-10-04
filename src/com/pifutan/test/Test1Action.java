package com.pifutan.test;
/**
 * Action创建方式1：
 * 声明execute方法，并在strutsz.xml中配置:
 * <action name="test1" class="com.pifutan.test.Test1Action">
 *      <result name="success">index.html</result>
 * </action>
 * execute为默认的method，当然method也可以指定到其他方法上，name是路径访问时的名字
 * @author pifutan
 *
 */
public class Test1Action {
	public String execute() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return "success";
	}
	public String test11() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return "success";
	}

}
