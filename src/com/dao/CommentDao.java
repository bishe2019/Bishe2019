package com.dao;

import java.util.Date;

import com.entity.Comment;

public class CommentDao {
	
	public void insertComment(Comment comment) {
		String commentText = comment.getCommentText();
		Integer userId = comment.getUserId();
		Integer sceneId = comment.getSceneId();
		
	}
}
