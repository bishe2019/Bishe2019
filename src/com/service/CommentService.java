package com.service;

import java.util.List;

import com.dao.CommentDao;
import com.entity.Comment;

public class CommentService {

	CommentDao commentDao = new CommentDao();
	
	/**
	 * ��ȡĳһ�����ȫ������
	 * @param sceneId
	 * @return
	 */
	public List<Comment> getCommentList(Integer sceneId){
		return commentDao.getCommentsBySceneId(sceneId);
	}
	
	/**
	 * ��������
	 * @param comment
	 */
	public void insertComment(Comment comment) {
		commentDao.insertComment(comment);
	}
}
