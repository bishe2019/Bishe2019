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
	 * �û���ע����
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
	 * �û�ȡ����ע����
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
	 * ���������
	 * @param typeName
	 * @return
	 */
	@GetMapping("/insertType")
	public String insertType(String typeName) {
		typeService.insertType(typeName);
		return "";
	}
	
	/**
	 * ɾ������
	 * @param typeId
	 * @return
	 */
	@GetMapping("/deleteType")
	public String deleteType(Integer typeId) {
		typeService.deleteType(typeId);
		return "";
	}
	
	/**
	 * ��ȡ�����б�
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
	 * �����������
	 * @param scenenId
	 * @param typeId
	 */
	@GetMapping("/addScentType")
	public String sceneConnType(Integer sceneId,Integer typeId,String sceneName) {
		typeService.sceneConnType(sceneId, typeId);
		return "redirect:/addSceneType?sceneId="+sceneId+"&sceneName="+sceneName+"";
	} 
	
	/**
	 * ����ȡ����������
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
