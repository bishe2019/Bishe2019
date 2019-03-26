package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.entity.Params;
import com.entity.User;
import com.mysql.jdbc.PreparedStatement;
import com.util.JDBCUtil;
import com.util.StringUtils;

public class UserDao {

	/**
	 * �����û�
	 * 
	 * @param user
	 */
	public void insertUser(User user) {
		String insertUser = "insert into user (user_name,password,email) values (?,?,?)";
		// �û���
		String userName = user.getUserName();
		// ����
		String password = user.getPassword();
		// Ϊ�������
		try {
			password = StringUtils.encrypt(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ����
		String email = user.getEmail();
		// ����
		Object[] params = new Object[] { userName, password, email };
		// ִ��sql
		JDBCUtil.ExcuteNoQuery(insertUser, params);
	}

	/**
	 * �û���¼
	 * @param params
	 * @return
	 */
	public boolean isHaveUser(Params params) {
		String getUser = "select * from user where email = '?' and password = '?'";
		Boolean isHave = false;
		String email = params.getEmail();
		String password = params.getPassword();
		// Ϊ�������
		try {
			password = StringUtils.encrypt(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Map<String,Object>> user = JDBCUtil.executeQuery(getUser, email,password);
		if (user.size() == 1) {
			isHave = true;
		}
		
		return isHave;
	}
	
	/**
	 * ��ע����
	 * @param TypeId
	 */
	public void subType(Integer TypeId) {
		
	}
}
