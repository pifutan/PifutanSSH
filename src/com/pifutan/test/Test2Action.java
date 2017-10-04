package com.pifutan.test;

import com.opensymphony.xwork2.Action;
/**
 * Action创建方式2：
 * java类实现Action接口，并且重写execute，然后在struts.xml中配置，其实和方式1没啥区别，只能能够直接返回SUCCESS而不用自己写“success”了而已，可指定method。
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
