package com.service;

import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.entity.User;

public class UserService {
	UserDao userDao = new UserDao();

	/**
	 * �û�ע��
	 * @param user
	 * @param session
	 */
	public void userRegister(User user,HttpSession session) {
		userDao.insertUser(user);
		session.setAttribute("user", user);
	}
}
