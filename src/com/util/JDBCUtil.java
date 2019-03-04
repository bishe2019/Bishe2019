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
	 * ִ����ɾ�����
	 * @param sql
	 * @param params
	 * @return
	 */
	public static boolean ExcuteNoQuery(String sql, Object[] params) {
		boolean flag = false;
		Connection conn = getConn();
		PreparedStatement ps = null;
		try {
			conn.setAutoCommit(false);// ��ɾ������Ҫ����֧�ֵ�
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
	 * ��ѯ
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
			//new һ���յ�list����������Ų�ѯ���
			List<Map<String ,Object>> list=new ArrayList<>();
			//��ȡ�����������
			int count = rs.getMetaData().getColumnCount();
			//�Խ��������ÿһ��������һ��Map���ϣ�����k,ֵ��v
			while(rs.next()){
				//һ���յ�map���ϣ��������ÿһ������
				Map<String, Object> map=new HashMap<String, Object>();
				for(int i=0;i<count;i++){
					Object ob=rs.getObject(i+1);//��ȡֵ
					String key = rs.getMetaData().getColumnName(i+1);//��ȡk������
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