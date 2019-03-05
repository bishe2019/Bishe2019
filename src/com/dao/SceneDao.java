package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.entity.Params;
import com.entity.Scene;
import com.util.JDBCUtil;

public class SceneDao {

	/**
	 * 插入景点
	 * @param scene
	 */
	public void insertScene(Scene scene) {
		String insertScene = "insert into scene(scene_name,scene_summary,scene_type,scene_pic) values (?,?,?,?)";
		String sceneName = scene.getSceneName();
		String sceneSummary = scene.getSceneSumamry();
		String scenePic = scene.getScenePic();
		Integer sceneType = scene.getSceneType();
		
		Object[] params = new Object[] {sceneName,sceneSummary,sceneType,scenePic};
		JDBCUtil.ExcuteNoQuery(insertScene, params);
	}
	
	/**
	 * 获取景点列表
	 * @return
	 */
	public List<Scene> getSceneList(Params params){
		StringBuilder getSceneList = new StringBuilder("select * from scene");
		//景点名
		if (params.getSceneName() != null) {
			getSceneList.append(" where scene_name like '%"+params.getSceneName()+"%'");
		}
		//景点类型
		if (params.getSceneType() != null) {
			getSceneList.append(" where scene_type = "+params.getSceneType()+"");
		}
		List<Scene> sceneList = new ArrayList<>();
		List<Map<String,Object>> objList = JDBCUtil.executeQuery(getSceneList.toString());
		objList.forEach(obj->{
			Scene scene = new Scene();
			if (obj.get("scene_name") != null) {
				scene.setSceneName(String.valueOf(obj.get("scene_name")));
			}
			if (obj.get("scene_pic") != null) {
				scene.setSceneName(String.valueOf(obj.get("scene_pic")));
			}
			if (obj.get("scene_sumamry") != null) {
				scene.setSceneName(String.valueOf(obj.get("sceneSumamry")));
			}
			if (obj.get("scene_type") != null) {
				scene.setSceneName(String.valueOf(obj.get("sceneType")));
			}
			sceneList.add(scene);
		});
		
		return sceneList;
	}
}
