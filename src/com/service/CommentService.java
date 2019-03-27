package com.service;

import java.util.List;

import com.dao.CommentDao;
import com.entity.Comment;

public class CommentService {

	CommentDao commentDao = new CommentDao();
	
	/**
	 * 获取某一景点的全部评论
	 * @param sceneId
	 * @return
	 */
	public List<Comment> getCommentList(Integer sceneId){
		return commentDao.getCommentsBySceneId(sceneId);
	}
	
	/**
	 * 插入评论
	 * @param comment
	 */
	public void insertComment(Comment comment) {
		commentDao.insertComment(comment);
	}
}
