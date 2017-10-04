package com.pifutan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.pifutan.entity.User;

/**
 * 推荐使用HibernateTemplate方式 必要时才使用SessionFactory来做
 * 
 * @author ZhangYuliang
 *
 */
@Scope("prototype")
public class UserDao extends HibernateDaoSupport {

	public boolean addUser(User user) {
		getHibernateTemplate().save(user);
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {
		return (List<User>) getHibernateTemplate().find("from User");
	}

	@SuppressWarnings("rawtypes")
	public User getUserById(String id) {
		List list = getHibernateTemplate().find("from User where id=" + id);
		return list.size() <=0 ? null : (User) list.get(0);
	}

	/**
	 * SessionFactory方式
	 * 
	 * @param name
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<User> getUserByName(String name) {
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from User where name=:name");
		query.setParameter("name", name);
		transaction.commit();
		return (List<User>) query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserByDesc(String desc) {
		return (List<User>) getHibernateTemplate().find("from User where desc=" + desc);
	}

	@SuppressWarnings("unchecked")
	public List<User> getUserWhere(String where) {
		return (List<User>) getHibernateTemplate().find("from User where" + where);
	}

}
