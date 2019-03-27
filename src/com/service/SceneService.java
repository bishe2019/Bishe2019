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
	public List<Scene> getSceneList(String sceneName){
		return sceneDao.getSceneList(sceneName);
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
	
	/**
	 *��ȡĳһ���͵ľ���
	 * @param typeId
	 * @return
	 */
	public List<Scene> getScnenByTypeId(Integer typeId){
		return sceneDao.getScnenByTypeId(typeId);
	}
	
	/**
	 * Ϊ����ѡȡ����
	 * @param sceneId
	 * @param typeId
	 */
	public void selectType(Integer sceneId,Integer typeId) {
		sceneDao.selectType(sceneId, typeId);
	}
}
