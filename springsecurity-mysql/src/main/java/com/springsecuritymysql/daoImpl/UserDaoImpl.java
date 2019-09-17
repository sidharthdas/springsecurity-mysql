package com.springsecuritymysql.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springsecuritymysql.dao.UserDao;
import com.springsecuritymysql.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void insert() {
		User user1 = new User();
		user1.setUserName("sid@gmail.com");
		user1.setPassword("sid");
		user1.setRoles("USER");
		user1.setActive("True");

		User user2 = new User();
		user2.setUserName("admin@gmail.com");
		user2.setPassword("admin");
		user2.setRoles("ADMIN");
		user2.setActive("True");

		getSession().save(user1);
		getSession().save(user2);

	}

	@Override
	public String password(String userName) {
		// TODO Auto-generated method stub
		System.out.println("sid");
		List<String> passwords = getSession().createQuery("SELCT password FROM User WHERE userName = :userName")
				.setParameter("userName", userName).list();
		System.out.println(passwords.size());
		return passwords.get(0);
	}

	@Override
	public User findByUserName(String userName) {
		List<User> users = getSession().createQuery("FROM User WHERE userName = :userName")
				.setParameter("userName", userName).list();
		return users.get(0);
	}

}
