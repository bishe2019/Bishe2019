package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.User;
import com.service.UserService;

@Controller
public class UserController {
	UserService userService = new UserService();

	@GetMapping("/userRegister")
	public String userRegister(HttpSession session,User user) {
		userService.userRegister(user, session);
		return "index";
	}
}
