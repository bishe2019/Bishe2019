package com.service;

import java.util.List;

import com.dao.TypeDao;
import com.entity.Params;
import com.entity.Type;
import com.entity.User;

public class TypeService {

	TypeDao typeDao = new TypeDao();
	
	/**
	 * 插入类型
	 * @param typeName
	 */
	public void insertType(String typeName) {
		typeDao.insertType(typeName);
	}
	
	/**
	 * 删除类型
	 * @param typeId
	 */
	public void deleteType(Integer typeId) {
		typeDao.deleteType(typeId);
	}
	
	/**
	 * 获取类型列表
	 * @param params
	 * @return
	 */
	public List<Type> getTypeList(Params params,User user){
		return typeDao.getTypeList(params,user);
	}
	
	/**
	 * 用户关注类型
	 * @param userId
	 * @param typeId
	 */
	public void userSubType(Integer userId,Integer typeId) {
		typeDao.userSubType(userId, typeId);
	}
	
	/**
	 * 用户取关类型
	 * @param userId
	 * @param typeId
	 */
	public void userUnSubType(Integer userId,Integer typeId) {
		typeDao.userUnSubType(userId, typeId);
	}
	
	/**
	 * 景点关联类型
	 * @param scenenId
	 * @param typeId
	 */
	public void sceneConnType(Integer scenenId,Integer typeId) {
		typeDao.sceneConnType(scenenId, typeId);
	}
	
	/**
	 * 景点取消关联类型
	 * @param scenenId
	 * @param typeId
	 */
	public void sceneUnConnType(Integer scenenId,Integer typeId) {
		typeDao.sceneUnConnType(scenenId, typeId);
	}
}
