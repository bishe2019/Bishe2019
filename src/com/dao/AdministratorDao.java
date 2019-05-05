package com.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

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
	
	/**
	 * 管理员登录
	 * @param administrator
	 * @param session
	 */
	public void administratorLogin(Administrator administrator,HttpSession session) {
		String login = "select * from administrator where administrator_email = ? and administrator_password = ?";
		
		String email = administrator.getAdministratorEmail();
		String password = administrator.getAdministratorPassword();
		// 为密码加密
		try {
			password = StringUtils.encrypt(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Map<String,Object>> userList = JDBCUtil.executeQuery(login, email,password);
		if (userList.size() == 1) {
			Map<String,Object> userMap = userList.get(0);
			if (userMap.get("administrator_name") != null) {
				administrator.setAdministratorName(userMap.get("administrator_name").toString());
			}
			if (userMap.get("administrator_id") != null) {
				administrator.setAdministratorId((int) userMap.get("administrator_id"));
			}
			session.setAttribute("administrator", administrator);
		}
	}
}
