package com.pifutan.test;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Action创建方式2：
 * 使用注解的方式，不用再struts.xml中配置。
 * 需要导入struts2-convention-plugin-2.5.13.jar以及asm-5.2.jar、asm-commons-5.2.jar、asm-tree-5.2.jar包，
 * java类继承ActionSupport，然后在方法前添加注解如@Action(value="test41", results={@Result(name="success", location="/index.html")})即可访问，
 * 但是注解方式和配置方式只能使用其中一种，而且注解的优先，
 * 配置的显示The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.
 * 注意：导入了注解的包之后，默认的execute方法对应的action name就会显示没有设置result success，但是类中其余方法action还是正常的。
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
