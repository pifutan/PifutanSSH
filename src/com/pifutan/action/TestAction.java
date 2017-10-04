package com.pifutan.action;

import java.util.Date;
import java.util.List;


import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import com.pifutan.entity.User;
import com.pifutan.iservice.IUserService;

public class TestAction extends BaseJsonAction{
	private static final long serialVersionUID = 6419022471976485692L;
	@Autowired
	private IUserService userService;
	
	private List<User> users;
	private User user;
	private String id;
	private String name;
	private String password;
	private String desc;
	
	
	@Action(value="test")
	public String test() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(this.getClass() + "." + methodName);
		return SUCCESS;
	}
	@Action(value="testAddUser")
	public String testAddUser() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		User user = new User();
		user.setCreateDate(new Date());
		user.setId("102");
		user.setName("pifutan");
		user.setPassword("pifutan");
		user.setDescription("pifutan");
		userService.addUser(user);
		return SUCCESS;
	}
	@Action(value="addUser")
	public String addUser() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		User user = new User();
		user.setCreateDate(new Date());
		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		user.setDescription(desc);
		userService.addUser(user);
		return SUCCESS;
	}
	@Action(value="allUsers")
	public String allUsers() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		users = userService.getAllUsers();
		return SUCCESS;
	}
	@Action(value="queryUserById")
	public String queryUserById() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		user = id == null ? null : userService.getUserById(id);
		return SUCCESS;
	}
	@Action(value="queryUserByName")
	public String queryUserByName() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		users = name == null ? null : userService.getUserByName(name);
		return SUCCESS;
	}
	public List<User> getUsers() {
		return users;
	}
	public User getUser() {
		return user;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
