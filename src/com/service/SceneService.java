package com.service;

import com.dao.SceneDao;
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
}
