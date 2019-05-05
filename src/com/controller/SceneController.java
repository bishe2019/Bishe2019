package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Comment;
import com.entity.Params;
import com.entity.Scene;
import com.entity.Type;
import com.service.CommentService;
import com.service.SceneService;

@Controller
public class SceneController {
	SceneService sceneService = new SceneService();
	CommentService commentService = new CommentService();
	
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
	public String getSceneList(@RequestParam("sceneName") String sceneName,HttpServletRequest request) {
		List<Scene> sceneList = sceneService.getSceneList(sceneName);
		request.setAttribute("sceneList", sceneList);
		return "hot";
	}
	
	@GetMapping("/backstageSceneList")
	public String getSceneList1(HttpServletRequest request) {
		List<Scene> sceneList = sceneService.getSceneList("");
		request.setAttribute("SceneList", sceneList);
		return "backstagescenelist";
	}
	
	/**
	 * 查看单个景点页面
	 * @param sceneId
	 * @return
	 */
	@GetMapping("/getScene")
	public String getScene(Integer sceneId,HttpServletRequest request) {
		Scene scene = sceneService.getScene(sceneId);
		List<Comment> commentList = commentService.getCommentList(sceneId);
		request.setAttribute("scene", scene);
		request.setAttribute("commentList", commentList);
		
		return "scene";
	}
	
	/**
	 * 删除景点
	 * @param sceneId
	 * @return
	 */
	@GetMapping("/deleteScene")
	public String deleteScene(Integer sceneId) {
		sceneService.deleteScene(sceneId);
		return "redirect:/backstageSceneList";
	}
	
	/**
	 * 获取景点未关联的类型
	 * @param request
	 * @param sceneId
	 * @return
	 */
	public String getUnConType(HttpServletRequest request,Integer sceneId,String sceneName) {
		List<Type> unConnTypeList = sceneService.getSceneTypeList(sceneId, 1);
		List<Type> connTypeList = sceneService.getSceneTypeList(sceneId, 2);
		request.setAttribute("unConnTypeList", unConnTypeList);
		request.setAttribute("connTypeList", connTypeList);
		request.setAttribute("sceneName", sceneName);
		return "";
	}
	
	/**
	 * 获取景点已关联的类型
	 * @param request
	 * @param sceneId
	 * @return
	 */
	public String getConType(HttpServletRequest request,Integer sceneId) {
		List<Type> typeList = sceneService.getSceneTypeList(sceneId, 2);
		request.setAttribute("typeList", typeList);
		return "";
	}
	
}
