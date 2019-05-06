package com.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.entity.User;

public class UserService {
	UserDao userDao = new UserDao();

	/**
	 * 用户注册
	 * @param user
	 * @param session
	 */
	public void userRegister(User user,HttpSession session) {
		userDao.insertUser(user);
		session.setAttribute("user", user);
	}
	
	/**
	 * 用户登录
	 * @param user
	 * @param session
	 * @return
	 */
	public boolean userLogin(User user,HttpSession session) {
		boolean isHaveUser = userDao.isHaveUser(user, session);
		return isHaveUser;
	}
	
	/**
	 * 获取用户列表
	 * @return
	 */
	public List<User> getUserList(){
		return userDao.getUserList();
	}
	
	/**
	 * 删除用户
	 * @param userId
	 */
	public void deleteUser(Integer userId) {
		userDao.deleteUser(userId);
	}
	
	/**
	 * 更改用户名
	 * @param userId
	 * @param usrename
	 */
	public void changeUsername(Integer userId,String username) {
		userDao.changeUsername(userId, username);
	}
}
