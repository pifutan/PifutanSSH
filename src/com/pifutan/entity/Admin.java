package com.pifutan.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  µÃÂ¿‡
 * @author ZhangYuliang
 *
 */
@Entity
@Table(name="admin")
public class Admin implements IUser {
//	CREATE TABLE `admin` (
//			  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
//			  `name` varchar(32) NOT NULL DEFAULT '',
//			  `password` varchar(32) NOT NULL DEFAULT '',
//			  `description` varchar(128) NOT NULL DEFAULT '',
//			  `createDate` datetime,
//			  PRIMARY KEY (`id`)
//			) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
	@Id
	private String id;
	private String name;
	private String password;
	private String description;
	private Date createDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public void showName() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName() + ": " + name);
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
