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
	 * ���뾰��
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
	 * ��ȡ�����б�
	 * @return
	 */
	public List<Scene> getSceneList(Params params){
		StringBuilder getSceneList = new StringBuilder("select * from scene");
		//������
		if (params.getSceneName() != null) {
			getSceneList.append(" where scene_name like '%"+params.getSceneName()+"%'");
		}
		//��������
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
	
	/**
	 * ɾ������
	 * @param sceneId
	 */
	public void deleteScene(Integer sceneId) {
		String deleteScene = "delete from scene where scene_id = ?";
		Object[] params = new Object[] {sceneId};
		JDBCUtil.ExcuteNoQuery(deleteScene, params);
	}
	
	/**
	 * ��ȡĳһ����
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
			scene.setSceneName(String.valueOf(sceneMap.get("scene_pic")));
		}
		if (sceneMap.get("scene_sumamry") != null) {
			scene.setSceneName(String.valueOf(sceneMap.get("sceneSumamry")));
		}
		if (sceneMap.get("scene_type") != null) {
			scene.setSceneName(String.valueOf(sceneMap.get("sceneType")));
		}
		
		return scene;
		
	}
	
	/**
	 * �޸ľ���
	 * @param scene
	 * @param sceneId
	 */
	public void changeScene(Scene scene,Integer sceneId) {
		
	}
	
	/**
	 * ��ȡĳһ���͵�ȫ������
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
	
}