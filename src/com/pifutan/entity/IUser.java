package com.pifutan.entity;
/**
 * ����IUser�ӿ�Ȼ��User��Admin��ʵ��IUser�ӿڣ�
 * ����User��Admin����xml������bean��������@Component(��beanid��)��
 * ʹ�õ�ʱ������IUser user���ƥ��User������IUser admin���ƥ��Admin��
 * ����Ҳ���beanid�ҽӿ�ֻ��һ��ʵ��ʱ��ƥ�䣬����ж��ʵ����ᱨ����ƥ�䡣
 * �����ʹ�ù������Զ�ɨ��������������ͱ�������Ӧ���ɣ���Сд�����𣩡�
 * ��ȻIUser��Ҫ��@Autowired�Զ�װ�䣬
 * ʹ��@Autowired��Ҫ��applicationContext.xml�����<context:annotation-config />

 * @author ZhangYuliang
 *
 */
public interface IUser {
	void showName();
}
