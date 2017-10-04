package com.pifutan.iservice;

import java.util.List;

import com.pifutan.entity.User;
/**
 * 设计上的要求，如果只有单一实现，也可以考虑不要接口
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
	// 尽量不要此方法，less is more，确定需要才开放出来
	public List<User> getUserWhere(String where);

}
