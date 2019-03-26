package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.Params;
import com.entity.Scene;
import com.service.SceneService;

public class SceneController {
	SceneService sceneService = new SceneService();
	
	/**
	 * 插入景点
	 * @param scene
	 * @return
	 */
	public String insertScene(Scene scene) {
		sceneService.insertScene(scene);
		return "";
	}
	
	/**
	 * 获取景点列表
	 * @param params
	 * @param request
	 * @return
	 */
	@GetMapping("/getSceneList")
	public String getSceneList(Params params,HttpServletRequest request) {
		List<Scene> sceneList = sceneService.getSceneList(params);
		request.setAttribute("sceneList", sceneList);
		return "";
	}
	
	/**
	 * 查看单个景点页面
	 * @param sceneId
	 * @return
	 */
	@GetMapping("/getScene")
	public String getScene(Integer sceneId,HttpServletRequest request) {
		Scene scene = sceneService.getScene(sceneId);
		request.setAttribute("scene", scene);
		
		return "";
	}
	
	/**
	 * 删除景点
	 * @param sceneId
	 * @return
	 */
	@GetMapping("/deleteScene")
	public String deleteScene(Integer sceneId) {
		sceneService.deleteScene(sceneId);
		return "";
	}
	
}
