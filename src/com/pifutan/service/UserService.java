package com.pifutan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.pifutan.dao.UserDao;
import com.pifutan.entity.User;
import com.pifutan.iservice.IUserService;
@Scope("prototype")
public class UserService implements IUserService{
	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public boolean deleteUser(User user) {
		return false;
	}

	@Override
	public User getUserById(String id) {
		return userDao.getUserById(id);
	}
	@Override
	public List<User> getUserByName(String name) {
		return userDao.getUserByName(name);
	}
	@Override
	public List<User> getUserByDesc(String desc) {
		return userDao.getUserByDesc(desc);
	}
	@Override
	public List<User> getUserWhere(String where) {
		return userDao.getUserWhere(where);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUser();
	}

	public UserDao getUserDAO() {
		return userDao;
	}

	public void setUserDAO(UserDao userDao) {
		this.userDao = userDao;
	}


}
