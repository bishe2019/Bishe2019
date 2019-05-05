package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dao.SceneDao;
import com.entity.Params;
import com.entity.Scene;
import com.entity.User;

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
	public List<Scene> getSceneList(String sceneName){
		return sceneDao.getSceneList(sceneName);
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
	
	/**
	 *获取某一类型的景点
	 * @param typeId
	 * @return
	 */
	public List<Scene> getScnenByTypeId(Integer typeId){
		return sceneDao.getScnenByTypeId(typeId);
	}
	
	/**
	 * 为景点选取类型
	 * @param sceneId
	 * @param typeId
	 */
	public void selectType(Integer sceneId,Integer typeId) {
		sceneDao.selectType(sceneId, typeId);
	}
	
	/**
	 * 获取用户打分的景点信息
	 * @param user
	 * @return
	 */
	public List<Scene> getUserRateSceneList(User user){
		return sceneDao.getUserRateSceneList(user);
	}
}
