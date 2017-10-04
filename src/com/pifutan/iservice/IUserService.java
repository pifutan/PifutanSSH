package com.pifutan.iservice;

import java.util.List;

import com.pifutan.entity.User;
/**
 * ����ϵ�Ҫ�����ֻ�е�һʵ�֣�Ҳ���Կ��ǲ�Ҫ�ӿ�
 * @author ZhangYuliang
 *
 */
public interface IUserService {
	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public List<User> getAllUsers();
	public User getUserById(String id);
	public List<User> getUserByName(String name);
	public List<User> getUserByDesc(String desc);
	// ������Ҫ�˷�����less is more��ȷ����Ҫ�ſ��ų���
	public List<User> getUserWhere(String where);

}
