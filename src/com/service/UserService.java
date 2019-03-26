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
	
	/**
	 * �û���¼
	 * @param user
	 * @param session
	 * @return
	 */
	public boolean userLogin(User user,HttpSession session) {
		boolean isHaveUser = userDao.isHaveUser(user, session);
		return isHaveUser;
	}
}
