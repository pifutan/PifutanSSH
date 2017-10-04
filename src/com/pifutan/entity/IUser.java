package com.pifutan.entity;
/**
 * 声明IUser接口然后User和Admin都实现IUser接口，
 * 并且User和Admin都在xml中配置bean或者在类@Component(“beanid”)，
 * 使用的时候声明IUser user则会匹配User，声明IUser admin则会匹配Admin，
 * 如果找不到beanid且接口只有一个实现时能匹配，如果有多个实现则会报错多个匹配。
 * 如果是使用过滤器自动扫描组件，则类名和变量名对应即可（大小写无区别）。
 * 当然IUser需要加@Autowired自动装配，
 * 使用@Autowired需要在applicationContext.xml中添加<context:annotation-config />

 * @author ZhangYuliang
 *
 */
public interface IUser {
	void showName();
}
