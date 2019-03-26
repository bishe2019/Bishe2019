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
	 * 插入用户
	 * 
	 * @param user
	 */
	public void insertUser(User user) {
		String insertUser = "insert into user (user_name,password,email) values (?,?,?)";
		// 用户名
		String userName = user.getUserName();
		// 密码
		String password = user.getPassword();
		// 为密码加密
		try {
			password = StringUtils.encrypt(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 邮箱
		String email = user.getEmail();
		// 参数
		Object[] params = new Object[] { userName, password, email };
		// 执行sql
		JDBCUtil.ExcuteNoQuery(insertUser, params);
	}

	/**
	 * 用户登录
	 * @param params
	 * @return
	 */
	public boolean isHaveUser(Params params) {
		String getUser = "select * from user where email = '?' and password = '?'";
		Boolean isHave = false;
		String email = params.getEmail();
		String password = params.getPassword();
		// 为密码加密
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
	 * 关注类型
	 * @param TypeId
	 */
	public void subType(Integer TypeId) {
		
	}
}
