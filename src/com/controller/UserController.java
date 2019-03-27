package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.Params;
import com.entity.Scene;
import com.entity.User;
import com.service.SceneService;
import com.service.UserService;

@Controller
public class UserController {
	UserService userService = new UserService();
	SceneService sceneService = new SceneService();

	/**
	 * 用户注册
	 * @param session
	 * @param user
	 * @param request
	 * @return
	 */
	@GetMapping("/userRegister")
	public String userRegister(HttpSession session,User user,HttpServletRequest request) {
		userService.userRegister(user, session);
		List<Scene> sceneList = sceneService.getSceneList("");
		request.setAttribute("SceneList", sceneList);
		return "index";
	}
	
	/**
	 * 用户登录
	 * @param session
	 * @param user
	 * @param request
	 * @return
	 */
	@GetMapping("/userLogin")
	public String userLogin(HttpSession session,User user,HttpServletRequest request) {
		boolean isHave = userService.userLogin(user, session);
		if (isHave) {
			Params params = new Params();
			List<Scene> sceneList = sceneService.getSceneList(params);
			request.setAttribute("SceneList", sceneList);
			return "index";
		}else {
			return "login_error";
		}
	}
}
