package com.service;

import java.util.List;

import com.dao.TypeDao;
import com.entity.Params;
import com.entity.Type;

public class TypeService {

	TypeDao typeDao = new TypeDao();
	
	/**
	 * ��������
	 * @param typeName
	 */
	public void insertType(String typeName) {
		typeDao.insertType(typeName);
	}
	
	/**
	 * ɾ������
	 * @param typeId
	 */
	public void deleteType(Integer typeId) {
		typeDao.deleteType(typeId);
	}
	
	/**
	 * ��ȡ�����б�
	 * @param params
	 * @return
	 */
	public List<Type> getTypeList(Params params){
		return typeDao.getTypeList(params);
	}
	
	/**
	 * �û���ע����
	 * @param userId
	 * @param typeId
	 */
	public void userSubType(Integer userId,Integer typeId) {
		typeDao.userSubType(userId, typeId);
	}
}
