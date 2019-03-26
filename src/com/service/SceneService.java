package com.service;

import com.dao.SceneDao;
import com.entity.Scene;

public class SceneService {
	SceneDao sceneDao = new SceneDao();
	
	/**
	 * ≤Â»Îæ∞µ„
	 * @param scene
	 */
	public void insertScene(Scene scene) {
		sceneDao.insertScene(scene);
	}
}
