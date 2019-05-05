package com.service;

import javax.servlet.http.HttpSession;

import com.dao.AdministratorDao;
import com.entity.Administrator;

public class AdministratorService {
	AdministratorDao administratorDao = new AdministratorDao();
	
	/**
	 * ����Աע��
	 * @param administrator
	 */
	public void insertAdministrator(Administrator administrator) {
		administratorDao.insertAdministrator(administrator);
	}
	
	/**
	 * ����Ա��¼
	 */
	public void administratorLogin(Administrator administrator,HttpSession session) {
		administratorDao.administratorLogin(administrator, session);
	}
	

}
