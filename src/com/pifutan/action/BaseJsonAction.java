package com.pifutan.action;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;
/**
 * �����򾡿��ܵ���ע��ķ�ʽ������������
 * 
 * ����ͷ��ض�Ϊjson
 * 
 * @ע�⣺
 * get��ͷ�����Ĳ������ᱻ���أ�û���򷵻�null
 * set������ƥ�������ƥ�䲻����Ϊnull
 * ע��@Autowired��Service����Ҫgetter��setter
 * 
 * @Result��params�У�
 * excludeProperties, ������ָ�����ݵļ���
 * includeProperties, ����ָ�����ݵļ���
 * excludeNullProperties, �Ƿ�ת�����nullֵ
 * root, ֻ����ָ���Ķ���
 * wrapPrefix, ��json���ǰ��ӷ���
 * wrapSuffix, ��json�������ӷ��� 
 * ignoreHierarchy, �Ƿ���Լ̳й�ϵ
 * enableGZIP, �Ƿ�֧��gzipѹ�����
 * noCache, �Ƿ񻺴�
 * statusCode, ������Ӧ�����
 * errorCode, �������
 * callbackParameter, json������ʻص�����jsonp
 * contentType, �������
 * encoding, ����
 * 
 * @Scope������
 * ����singleton - ÿ��Spring IoC ��������ͬһ��beanʵ��
 * ԭ��prototype - ��ÿ������ʱ����һ���µ�beanʵ��
 * ����request - ����ÿ��HTTP�����һ��Beanʵ��
 * �Ựsession - ����ÿ��HTTP�Ự��һ��beanʵ��
 * ȫ�ֻỰglobal session - ����ȫ��HTTP�Ự��һ��beanʵ��


 * @author ZhangYuliang
 *
 */
@ParentPackage("json-default") // ���ظ�ʽ��json����Ҫ��@Result��������ע��
@InterceptorRef("json") // �����ʽΪjson
// ���ظ�ʽ��json������null���Բ����أ����ò������Բ����أ�ActionSupport�е�һЩ���ԣ������÷��ظ��������
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
