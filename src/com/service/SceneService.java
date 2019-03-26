package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dao.SceneDao;
import com.entity.Params;
import com.entity.Scene;

public class SceneService {
	SceneDao sceneDao = new SceneDao();
	
	/**
	 * 插入景点
	 * @param scene
	 */
	public void insertScene(Scene scene) {
		sceneDao.insertScene(scene);
	}
	
	/**
	 * 获取景点列表
	 * @param params
	 * @return
	 */
	public List<Scene> getSceneList(Params params){
		return sceneDao.getSceneList(params);
	}
	
	/**
	 * 获取单个景点
	 * @param sceneId
	 * @return
	 */
	public Scene getScene(Integer sceneId) {
		return sceneDao.getSceneById(sceneId);
	}
	
	/**
	 * 删除景点
	 * @param sceneId
	 */
	public void deleteScene(Integer sceneId) {
		sceneDao.deleteScene(sceneId);
	}
}
