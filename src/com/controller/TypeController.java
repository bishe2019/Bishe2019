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
		return "redirect:/userCenter";
	}
	
	/**
	 * 用户取消关注类型
	 * @param session
	 * @param typeId
	 * @return
	 */
	@GetMapping("/deleteUserType")
	public String userUnSubType(HttpSession session,Integer typeId) {
		User user = (User) session.getAttribute("user");
		Integer userId = user.getUserId();
		typeService.userUnSubType(userId, typeId);
		return "redirect:/userCenter";
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
	public String getTypeList(HttpServletRequest request,HttpSession session) {
		Params params = new Params();
		User user = (User) session.getAttribute("user");
		List<Type> typeList = typeService.getTypeList(params,user);
		request.setAttribute("typeList", typeList);
		return "";
	}
	
	/**
	 * 景点关联类型
	 * @param scenenId
	 * @param typeId
	 */
	@GetMapping("/addScentType")
	public String sceneConnType(Integer sceneId,Integer typeId,String sceneName) {
		typeService.sceneConnType(sceneId, typeId);
		return "redirect:/addSceneType?sceneId="+sceneId+"&sceneName="+sceneName+"";
	} 
	
	/**
	 * 景点取消关联类型
	 * @param sceneId
	 * @param typeId
	 * @return
	 */
	@GetMapping("/deleteScentType")
	public String sceneUnconnType(Integer sceneId,Integer typeId,String sceneName) {
		typeService.sceneUnConnType(sceneId, typeId);
		return "redirect:/addSceneType?sceneId="+sceneId+"&sceneName="+sceneName+"";
	}
}
