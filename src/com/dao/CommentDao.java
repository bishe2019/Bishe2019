package com.dao;

import com.entity.Comment;
import com.util.JDBCUtil;

public class CommentDao {
	
	/**
	 * ≤Â»Î∆¿¬€
	 * @param comment
	 */
	public void insertComment(Comment comment) {
		String insertCopmment = "insert into comment (copmment_text,user_id,scene_id) values (?,?,?)";
		String commentText = comment.getCommentText();
		Integer userId = comment.getUserId();
		Integer sceneId = comment.getSceneId();
		
		Object[] params = new Object[] {commentText,userId,sceneId};
		
		JDBCUtil.ExcuteNoQuery(insertCopmment, params);
	}
	
}
