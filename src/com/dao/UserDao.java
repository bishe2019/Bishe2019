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
	public boolean isHaveUser(User user,HttpSession session) {
		String getUser = "select * from user where email = '?' and password = '?'";
		Boolean isHave = false;
		String email = user.getEmail();
		String password = user.getPassword();
		// Ϊ�������
		try {
			password = StringUtils.encrypt(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Map<String,Object>> userList = JDBCUtil.executeQuery(getUser, email,password);
		if (userList.size() == 1) {
			isHave = true;
			Map<String,Object> userMap = userList.get(0);
			if (userMap.get("user_name") != null) {
				user.setUserName(String.valueOf(userMap.get("user_name")));
			}
			if (userMap.get("user_id") != null) {
				user.setUserId((int) userMap.get("user_id"));
			}
			session.setAttribute("user", user);
		}
		
		return isHave;
	}
	
	/**
	 * ��ע����
	 * @param TypeId
	 */
	public void subType(Integer typeId,User user) {
		String subType = "insert into favor(user_id,type_id) values(?,?)";
		Integer userId = user.getUserId();
		Object[] params = new Object[] {userId,typeId};
	}
}
