package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.Params;
import com.entity.Type;
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
	
	/**
	 * 添加新类型
	 * @param typeName
	 * @return
	 */
	@GetMapping("/insertType")
	public String insertType(String typeName) {
		typeService.insertType(typeName);
		return "";
	}
	
	/**
	 * 删除类型
	 * @param typeId
	 * @return
	 */
	@GetMapping("/deleteType")
	public String deleteType(Integer typeId) {
		typeService.deleteType(typeId);
		return "";
	}
	
	/**
	 * 获取类型列表
	 * @return
	 */
	public String getTypeList(HttpServletRequest request) {
		Params params = new Params();
		List<Type> typeList = typeService.getTypeList(params);
		request.setAttribute("typeList", typeList);
		return "";
	}
}
