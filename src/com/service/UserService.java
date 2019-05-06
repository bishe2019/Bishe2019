package com.service;

import java.util.List;

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
	
	/**
	 * ��ȡ�û��б�
	 * @return
	 */
	public List<User> getUserList(){
		return userDao.getUserList();
	}
	
	/**
	 * ɾ���û�
	 * @param userId
	 */
	public void deleteUser(Integer userId) {
		userDao.deleteUser(userId);
	}
	
	/**
	 * �����û���
	 * @param userId
	 * @param usrename
	 */
	public void changeUsername(Integer userId,String username) {
		userDao.changeUsername(userId, username);
	}
}
