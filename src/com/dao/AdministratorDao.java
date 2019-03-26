package com.dao;

import javax.servlet.http.HttpSession;

import com.entity.Administrator;
import com.entity.User;
import com.util.JDBCUtil;
import com.util.StringUtils;

public class AdministratorDao {

	/**
	 * ����Աע��
	 * 
	 * @param user
	 */
	public void insertAdministrator(Administrator administrator) {
		String insertUser = "insert into administrator (administrator_email,administrator_name,administrator_password) values (?,?,?)";
		// �û���
		String administratorName = administrator.getAdministratorName();
		// ����
		String password = administrator.getAdministratorPassword();
		// Ϊ�������
		try {
			password = StringUtils.encrypt(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ����
		String email = administrator.getAdministratorEmail();
		// ����
		Object[] params = new Object[] { administratorName, password, email };
		// ִ��sql
		JDBCUtil.ExcuteNoQuery(insertUser, params);
	}
	
	/**
	 * ����Ա��¼
	 * @param administrator
	 * @param session
	 */
	public void administratorLogin(Administrator administrator,HttpSession session) {
		String login = "select * from administrator where administrator_email = ? and administrator_password = ?";
	}
}
