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
		//执行sql
		try {
			Connection conn = JDBCUtil.getConn();
			PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(insertUser);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, email);
			int i = preparedStatement.executeUpdate();
			JDBCUtil.close(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
