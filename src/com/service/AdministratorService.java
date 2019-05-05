package com.service;

import javax.servlet.http.HttpSession;

import com.dao.AdministratorDao;
import com.entity.Administrator;

public class AdministratorService {
	AdministratorDao administratorDao = new AdministratorDao();
	
	/**
	 * 管理员注册
	 * @param administrator
	 */
	public void insertAdministrator(Administrator administrator) {
		administratorDao.insertAdministrator(administrator);
	}
	
	/**
	 * 管理员登录
	 */
	public void administratorLogin(Administrator administrator,HttpSession session) {
		administratorDao.administratorLogin(administrator, session);
	}
	

}
