package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	@GetMapping("/leaveComment")
	public String leaveComment(Comment comment) {
		commentService.insertComment(comment);
		return "";
	}
	
}
