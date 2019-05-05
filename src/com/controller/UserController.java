package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.Params;
import com.entity.Scene;
import com.entity.Type;
import com.entity.User;
import com.service.SceneService;
import com.service.TypeService;
import com.service.UserService;

@Controller
public class UserController {
	UserService userService = new UserService();
	SceneService sceneService = new SceneService();
	TypeService typeService = new TypeService();

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
			List<Scene> sceneList = sceneService.getSceneList("");
			request.setAttribute("SceneList", sceneList);
			return "index";
		}else {
			return "login_error";
		}
	}
	
	/**
	 * 获取用户列表
	 * @param request
	 * @return
	 */
	@GetMapping("/getUserList")
	public String getUserList(HttpServletRequest request) {
		List<User> userList = userService.getUserList();
		request.setAttribute("userList", userList);
		return "backstageuserlist";
	}
	
	/**
	 * 删除用户
	 * @param userId
	 * @return
	 */
	@GetMapping("/deleteUser")
	public String deleteUser(Integer userId) {
		userService.deleteUser(userId);
		return "redirect:/getUserList";
	}
	
	/**
	 * 进入个人中心页
	 * @return
	 */
	@GetMapping("/userCenter")
	public String userCenter(HttpServletRequest request,HttpSession session) {
		User user = (User) session.getAttribute("user");
		List<Type> typeList = typeService.getTypeList(new Params(),user);
		List<Scene> sceneList = sceneService.getUserRateSceneList(user);
		request.setAttribute("typeList", typeList);
		request.setAttribute("sceneList", sceneList);
		return "";
	}
}
