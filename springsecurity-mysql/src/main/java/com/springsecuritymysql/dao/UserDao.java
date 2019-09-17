package com.springsecuritymysql.dao;

import com.springsecuritymysql.model.User;

public interface UserDao {
	
	public void insert();
	public String password(String userName);
	public User findByUserName(String userName);

}
