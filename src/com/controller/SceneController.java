package com.controller;

import com.entity.Scene;
import com.service.SceneService;

public class SceneController {
	SceneService sceneService = new SceneService();
	
	/**
	 * ���뾰��
	 * @param scene
	 * @return
	 */
	public String insertScene(Scene scene) {
		sceneService.insertScene(scene);
		return "";
	}
	
}
