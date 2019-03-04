package com.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.entity.User;
import com.mysql.jdbc.PreparedStatement;
import com.util.JDBCUtil;
import com.util.StringUtils;

public class UserDao {

	/**
	 * 插入用户
	 * @param user
	 */
	public void insertUser(User user) {
		String insertUser = "insert into user (user_name,password,email) values (?,?,?)";
		//用户名
		String userName = user.getUserName();
		//密码
		String password = user.getPassword();
		//为密码加密
		try {
			password = StringUtils.encrypt(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//邮箱
		String email = user.getEmail();
		//参数
		Object[] params = new Object[] {userName,password,email};
		//执行sql
		JDBCUtil.ExcuteNoQuery(insertUser, params);
	}
}
