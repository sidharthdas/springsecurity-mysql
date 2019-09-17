package com.springsecuritymysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecuritymysql.dao.UserDao;

@RestController
public class HomeController {
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/")
	public String home(){
		//userDao.insert();
		return "<h1>Welcome</h1>";
	}
	
	@GetMapping("/admin")
	public String admin(){
		return "<h1>Welcome Admin</h1>";
	}
	
	@GetMapping("/user")
	public String user(){
		return "<h1>Welcome User</h1>";
	}

}
