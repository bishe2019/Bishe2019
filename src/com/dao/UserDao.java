package com.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.entity.User;
import com.mysql.jdbc.PreparedStatement;
import com.util.JDBCUtil;
import com.util.StringUtils;

public class UserDao {

	/**
	 * �����û�
	 * @param user
	 */
	public void insertUser(User user) {
		String insertUser = "insert into user (user_name,password,email) values (?,?,?)";
		//�û���
		String userName = user.getUserName();
		//����
		String password = user.getPassword();
		//Ϊ�������
		try {
			password = StringUtils.encrypt(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����
		String email = user.getEmail();
		//����
		Object[] params = new Object[] {userName,password,email};
		//ִ��sql
		JDBCUtil.ExcuteNoQuery(insertUser, params);
	}
}
