package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.entity.User;
import com.mysql.jdbc.PreparedStatement;
import com.util.HibernateUtil;
import com.util.JDBCUtil;

@Component
@Repository
public class test {
	@Autowired
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		try {
			Connection con = JDBCUtil.getConn();
			String a = "insert into User(user_name) values ('aaaa')";
			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(a);
			int i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
