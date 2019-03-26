package com.test;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dao.CommentDao;
import com.dao.UserDao;
import com.entity.Comment;
import com.entity.User;
import com.util.JDBCUtil;
import com.util.StringUtils;



@Component
@Repository
public class test {
	@Autowired
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) {
//		Comment comment = new Comment();
//		comment.setCommentText("aaaa");
//		comment.setSceneId(1);
//		comment.setUserId(1);
//		
//		CommentDao dao = new CommentDao();
//		dao.insertComment(comment);
		try {
			System.out.println(StringUtils.decrypt("Q0vYdtyWQ34="));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
