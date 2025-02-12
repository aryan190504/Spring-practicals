package com.rays.autowire.byname;

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
