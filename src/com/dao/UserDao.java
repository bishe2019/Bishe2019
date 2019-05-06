package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
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
	public boolean isHaveUser(User user,HttpSession session) {
		String getUser = "select * from user where email = ? and password = ?";
		Boolean isHave = false;
		String email = user.getEmail();
		String password = user.getPassword();
		// 为密码加密
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
	 * 关注类型
	 * @param TypeId
	 */
	public void subType(Integer typeId,User user) {
		String subType = "insert into favor(user_id,type_id) values(?,?)";
		Integer userId = user.getUserId();
		Object[] params = new Object[] {userId,typeId};
	}
	
	/**
	 * 获取用户列表
	 * @return
	 */
	public List<User> getUserList(){
		String getUserList = "select * from user";
		List<Map<String,Object>> userObj = JDBCUtil.executeQuery(getUserList);
		List<User> userList = new ArrayList<>();
		userObj.forEach(obj->{
			User user = new User();
			user.setUserId((int)obj.get("user_id"));	
			user.setUserName(String.valueOf(obj.get("user_name")));
			user.setEmail(String.valueOf(obj.get("email")));
			userList.add(user);
		});
		
		return userList;
	}
	
	/**
	 * 删除用户
	 */
	public void deleteUser(Integer userId) {
		String deleteUser = "delete from user where user_id = ?";
		Object[] params = new Object[] {userId};
		JDBCUtil.ExcuteNoQuery(deleteUser, params);
	}
	
	/**
	 * 修改用户名
	 * @param userId
	 * @param username
	 */
	public void changeUsername(Integer userId,String username) {
		String sql = "update user set user_name = ? where user_id = ?";
		JDBCUtil.ExcuteNoQuery(sql, new Object[] {username,userId});
	}
	
}
