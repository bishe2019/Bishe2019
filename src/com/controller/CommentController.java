package com.controller;

import org.springframework.stereotype.Controller;

import com.entity.Comment;
import com.service.CommentService;

@Controller
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
