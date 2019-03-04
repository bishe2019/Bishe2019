package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.jdbc.PreparedStatement;

public class JDBCUtil {
	private static String url = "jdbc:mysql://localhost:3306/bishe_db";
	private static String username = "root";
	private static String password = "";

	private JDBCUtil() {
	}

	public static Connection getConn() {
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 执行增删改语句
	 * @param sql
	 * @param params
	 * @return
	 */
	public static boolean ExcuteNoQuery(String sql, Object[] params) {
		boolean flag = false;
		Connection conn = getConn();
		PreparedStatement ps = null;
		try {
			conn.setAutoCommit(false);// 增删改是需要事物支持的
			ps = (PreparedStatement) conn.prepareStatement(sql);
			if (params != null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i + 1, params[i]);
				}
			}

			int result = ps.executeUpdate();
			ps.close();
			if (result > 0) {
				flag = true;
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn);
		}

		return flag;
	}
	
	/**
	 * 查询
	 * @param sql
	 * @param obj
	 * @return
	 */
	public static List<Map<String,Object>> executeQuery(String sql,Object...obj){
		Connection con = getConn();
		ResultSet rs=null;
		PreparedStatement ps=null;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			for(int i=0;i<obj.length;i++){
				ps.setObject(i+1, obj[i]);
			}
			rs = ps.executeQuery();
			//new 一个空的list集合用来存放查询结果
			List<Map<String ,Object>> list=new ArrayList<>();
			//获取结果集的列数
			int count = rs.getMetaData().getColumnCount();
			//对结果集遍历每一条数据是一个Map集合，列是k,值是v
			while(rs.next()){
				//一个空的map集合，用来存放每一行数据
				Map<String, Object> map=new HashMap<String, Object>();
				for(int i=0;i<count;i++){
					Object ob=rs.getObject(i+1);//获取值
					String key = rs.getMetaData().getColumnName(i+1);//获取k即列名
					map.put(key, ob);
				}
				list.add(map);
			}
			rs.close();
			ps.close();
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(con);
			
		}
		
		return null;
	}

}