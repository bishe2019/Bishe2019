package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	private static String url = "jdbc:mysql://localhost:3306/bishe_db";
	private static String username = "root";
	private static String password = "";
	private JDBCUtil(){}
	
	public static Connection getConn() throws SQLException{
		return DriverManager.getConnection(url,username,password);
	}
	
	public static void close(Connection conn){
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}