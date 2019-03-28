package com.service;

import java.util.List;

import com.dao.TypeDao;
import com.entity.Params;
import com.entity.Type;

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
	public List<Type> getTypeList(Params params){
		return typeDao.getTypeList(params);
	}
	
	/**
	 * 用户关注类型
	 * @param userId
	 * @param typeId
	 */
	public void userSubType(Integer userId,Integer typeId) {
		typeDao.userSubType(userId, typeId);
	}
}
