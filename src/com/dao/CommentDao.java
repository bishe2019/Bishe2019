package com.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.entity.Comment;
import com.util.JDBCUtil;

public class CommentDao {
	
	/**
	 * 插入评论
	 * @param comment
	 */
	public void insertComment(Comment comment) {
		String insertCopmment = "insert into comment (comment_text,user_id,scene_id,comment_time) values (?,?,?,?)";
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String commentText = comment.getCommentText();
		Integer userId = comment.getUserId();
		Integer sceneId = comment.getSceneId();
		Object[] params = new Object[] {commentText,userId,sceneId,df.format(new Date())};
		
		JDBCUtil.ExcuteNoQuery(insertCopmment, params);
	}
	
	/**
	 * 获取某一景点的全部评论
	 * @param movieId
	 * @return
	 */
	public List<Comment> getCommentsBySceneId(Integer sceneId){
		String getCommentsByMovieId = "select * from comment where scene_id = ?";
		List<Comment> commentList = new ArrayList<>();
		List<Map<String,Object>> ObjLIst = JDBCUtil.executeQuery(getCommentsByMovieId, sceneId);
		ObjLIst.forEach(obj->{
			Comment comment = new Comment();
			if (obj.get("comment_id") != null) {
				comment.setCommentId((int) obj.get("comment_id"));
			}
			if (obj.get("user_id") != null) {
				comment.setUserId((int) obj.get("user_id"));
			}
			if (obj.get("comment_text") != null) {
				comment.setCommentText(String.valueOf(obj.get("comment_text")));
			}
			if (obj.get("comment_time") != null) {
				comment.setCommentTime(String.valueOf(obj.get("comment_time")));
			}
			commentList.add(comment);
		});
		
		return commentList;
	}
	
}
