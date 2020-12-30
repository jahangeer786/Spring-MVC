package com.spring.mvc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.model.User;

@Service
public class UserServices {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		return userDao.saveUser(user);
	}

}
