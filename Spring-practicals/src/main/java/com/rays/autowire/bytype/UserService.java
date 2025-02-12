package com.rays.autowire.bytype;

import com.rays.autowire.byconstructor.UserDao;

public class UserService {

	private UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public void testAdd() {
		userDao.add();
	}

}
