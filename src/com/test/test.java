package com.test;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.entity.User;
import com.util.JDBCUtil;


@Component
@Repository
public class test {
	@Autowired
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		String a = "select * from user order by user_id";
		List<Map<String,Object>> b = JDBCUtil.executeQuery(a);
		System.out.println(b);
	}

}
