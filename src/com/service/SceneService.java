package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.dao.SceneDao;
import com.entity.Params;
import com.entity.Scene;

public class SceneService {
	SceneDao sceneDao = new SceneDao();
	
	/**
	 * ���뾰��
	 * @param scene
	 */
	public void insertScene(Scene scene) {
		sceneDao.insertScene(scene);
	}
	
	/**
	 * ��ȡ�����б�
	 * @param params
	 * @return
	 */
	public List<Scene> getSceneList(Params params){
		return sceneDao.getSceneList(params);
	}
	
	/**
	 * ��ȡ��������
	 * @param sceneId
	 * @return
	 */
	public Scene getScene(Integer sceneId) {
		return sceneDao.getSceneById(sceneId);
	}
	
	/**
	 * ɾ������
	 * @param sceneId
	 */
	public void deleteScene(Integer sceneId) {
		sceneDao.deleteScene(sceneId);
	}
}
