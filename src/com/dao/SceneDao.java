package com.dao;

import com.entity.Scene;
import com.util.JDBCUtil;

public class SceneDao {

	/**
	 * ≤Â»Îæ∞µ„
	 * @param scene
	 */
	public void insertScene(Scene scene) {
		String insertScene = "insert into scene(scene_name,scene_summary,scene_type) values (?,?,?)";
		String sceneName = scene.getSceneName();
		String sceneSummary = scene.getSceneSumamry();
		Integer sceneType = scene.getSceneType();
		
		Object[] params = new Object[] {sceneName,sceneSummary,sceneType};
		JDBCUtil.ExcuteNoQuery(insertScene, params);
	}
}
