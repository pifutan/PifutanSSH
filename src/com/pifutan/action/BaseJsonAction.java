package com.pifutan.action;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 本程序尽可能地用注解的方式，而少用配置
 * 
 * 请求和返回都为json
 * 
 * @注意：
 * get开头方法的参数都会被返回，没有则返回null
 * set方法则匹配参数，匹配不到则为null
 * 注解@Autowired的Service不需要getter和setter
 * 
 * @Result中params有：
 * excludeProperties, 不包含指定类容的集合
 * includeProperties, 包含指定类容的集合
 * excludeNullProperties, 是否转换输出null值
 * root, 只返回指定的对象
 * wrapPrefix, 在json结果前添加符号
 * wrapSuffix, 在json结果后添加符号 
 * ignoreHierarchy, 是否忽略继承关系
 * enableGZIP, 是否支持gzip压缩输出
 * noCache, 是否缓存
 * statusCode, 设置响应代码号
 * errorCode, 错误代码
 * callbackParameter, json跨域访问回调设置jsonp
 * contentType, 输出类型
 * encoding, 编码
 * 
 * @Scope作用域：
 * 单例singleton - 每个Spring IoC 容器返回同一个bean实例
 * 原型prototype - 当每次请求时返回一个新的bean实例
 * 请求request - 返回每个HTTP请求的一个Bean实例
 * 会话session - 返回每个HTTP会话的一个bean实例
 * 全局会话global session - 返回全局HTTP会话的一个bean实例


 * @author ZhangYuliang
 *
 */
@ParentPackage("json-default") // 返回格式是json，需要在@Result中再在做注解
@InterceptorRef("json") // 请求格式为json
// 返回格式是json，设置null属性不返回，设置部分属性不返回（ActionSupport中的一些属性），设置返回父类的属性
@Result(type = "json", params = { 
		"excludeNullProperties", "true", 
		"excludeProperties",
		"actionErrors,actionMessages,fieldErrors,text,*Dao,*Service", 
		"ignoreHierarchy", "false" })
@Scope("prototype")
public class BaseJsonAction extends ActionSupport {
	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	static final long serialVersionUID = 1L;
	String errorCode = "200";
	String errorMessage = "OK";

}
