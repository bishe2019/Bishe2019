package com.dao;

import com.entity.Administrator;
import com.entity.User;
import com.util.JDBCUtil;
import com.util.StringUtils;

public class AdministratorDao {

	/**
	 * 管理员注册
	 * 
	 * @param user
	 */
	public void insertAdministrator(Administrator administrator) {
		String insertUser = "insert into administrator (administrator_email,administrator_name,administrator_password) values (?,?,?)";
		// 用户名
		String administratorName = administrator.getAdministratorName();
		// 密码
		String password = administrator.getAdministratorPassword();
		// 为密码加密
		try {
			password = StringUtils.encrypt(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 邮箱
		String email = administrator.getAdministratorEmail();
		// 参数
		Object[] params = new Object[] { administratorName, password, email };
		// 执行sql
		JDBCUtil.ExcuteNoQuery(insertUser, params);
	}
}
