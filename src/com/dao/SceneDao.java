package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
	public List<Scene> getSceneList(String sceneName){
		StringBuilder getSceneList = new StringBuilder("select * from scene  where scene_name like ?");
//		StringBuilder getSceneList = new StringBuilder("select * from scene");
		//景点名
//		if (sceneName != "") {
//			getSceneList.append(" where scene_name like '%"+sceneName+"%'");
//		}
		//景点类型
//		if (params.getSceneType() != null) {
//			getSceneList.append(" where scene_type = "+params.getSceneType()+"");
//		}
		List<Scene> sceneList = new ArrayList<>();
		List<Map<String,Object>> objList = JDBCUtil.executeQuery(getSceneList.toString(),"%"+sceneName+"%");
		for(int j = 0;j < objList.size();j++){
			Map<String,Object> obj = objList.get(j);
			Scene scene = new Scene();
			if (obj.get("scene_id") != null) {
				scene.setSceneId((int) obj.get("scene_id"));
			}
			if (obj.get("scene_name") != null) {
				scene.setSceneName(String.valueOf(obj.get("scene_name")));
			}
			if (obj.get("scene_pic") != null) {
				scene.setScenePic(String.valueOf(obj.get("scene_pic")));
			}
			if (obj.get("scene_summary") != null) {
				scene.setSceneSumamry(String.valueOf(obj.get("scene_summary")));
			}
			if (obj.get("scene_type") != null) {
				scene.setSceneType((int) obj.get("scene_type"));
			}
			sceneList.add(scene);
		}
		return sceneList;
	}
	
	/**
	 * 删除景点
	 * @param sceneId
	 */
	public void deleteScene(Integer sceneId) {
		String deleteScene = "delete from scene where scene_id = ?";
		Object[] params = new Object[] {sceneId};
		JDBCUtil.ExcuteNoQuery(deleteScene, params);
	}
	
	/**
	 * 获取某一景点
	 * @param sceneId
	 * @return
	 */
	public Scene getSceneById(Integer sceneId) {
		String getSecneById = "select * from scene where scene_id = ?";
		List<Map<String,Object>> sceneList = JDBCUtil.executeQuery(getSecneById, sceneId);
		Scene scene = new Scene();
		
		Map<String,Object> sceneMap = sceneList.get(0);
		if (sceneMap.get("scene_name") != null) {
			scene.setSceneName(String.valueOf(sceneMap.get("scene_name")));
		}
		if (sceneMap.get("scene_pic") != null) {
			scene.setScenePic(String.valueOf(sceneMap.get("scene_pic")));
		}
		if (sceneMap.get("scene_summary") != null) {
			scene.setSceneSumamry(String.valueOf(sceneMap.get("scene_summary")));
		}
		if (sceneMap.get("scene_type") != null) {
			scene.setSceneType((int) sceneMap.get("scene_type"));
		}
		
		return scene;
		
	}
	
	/**
	 * 修改景点
	 * @param scene
	 * @param sceneId
	 */
	public void changeScene(Scene scene,Integer sceneId) {
		
	}
	
	/**
	 * 获取某一类型的全部景点
	 * @param TypeId
	 * @return
	 */
	public List<Scene> getScnenByTypeId(Integer typeId){
		String getSceneByTypeId = "select * from scene where scene_id in (select scene_id from scene_type where type_id = ?)";
		List<Map<String,Object>> ObjList = JDBCUtil.executeQuery(getSceneByTypeId, typeId);
		List<Scene> sceneList = new ArrayList<>();
		ObjList.forEach(obj->{
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
	
	/**
	 * 为景点选择类型
	 * @param sceneId
	 * @param typeId
	 */
	public void selectType(Integer sceneId,Integer typeId) {
		String selectType = "insert into scene_type(scene_id,type_id) values(?,?)";
		Object[] params = new Object[] {sceneId,typeId};
		JDBCUtil.ExcuteNoQuery(selectType, params);
	}
	
	
}
