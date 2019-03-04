package com.test;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.entity.User;
import com.util.StringUtils;


@Component
@Repository
public class test {
	@Autowired
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		User user = new User();
		user.setUserName("123");
		user.setPassword("asd");
		user.setEmail("asd");
		dao.insertUser(user);
	}

}
