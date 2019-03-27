package com.controller;

import com.entity.Comment;
import com.service.CommentService;

public class CommentController {

	CommentService commentService = new CommentService();
	
	/**
	 * ÁôÏÂÆÀÂÛ
	 * @param comment
	 * @return
	 */
	public String leaveComment(Comment comment) {
		commentService.insertComment(comment);
		return "";
	}
}
