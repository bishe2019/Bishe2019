package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.User;
import com.service.TypeService;

@Controller
public class TypeController {

	TypeService typeService = new TypeService();
	
	/**
	 * 用户关注类型
	 * @param session
	 * @param typeId
	 * @return
	 */
	@GetMapping("/subType")
	public String userSubType(HttpSession session,Integer typeId) {
		User user = (User) session.getAttribute("user");
		Integer userId = user.getUserId();
		typeService.userSubType(userId, typeId);
		return "";
	}
}
