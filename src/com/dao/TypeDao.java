package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.entity.Params;
import com.entity.Type;
import com.entity.User;
import com.util.JDBCUtil;

public class TypeDao {

	/**
	 * 添加类型
	 * @param typeName
	 */
	public void insertType(String typeName) {
		String insertType = "insert into type (type_name) values (?)";
		Object[] params = new Object[] {typeName};
		JDBCUtil.ExcuteNoQuery(insertType, params);
	}
	
	/**
	 * 删除类型
	 * @param typeId
	 */
	public void deleteType(Integer typeId) {
		String deleteType = "delete from type where type_id = ?";
		Object[] params = new Object[] {typeId};
		JDBCUtil.ExcuteNoQuery(deleteType, params);
	}
	
	/**
	 * 获取类型列表
	 * @param params
	 * @return
	 */
	public List<Type> getTypeList(Params params,User user){
		StringBuilder getTypeList = new StringBuilder("select * from type");
		StringBuilder getUserSubType = new StringBuilder("select type_id from favor where user_id = "+user.getUserId()+" and type_id is not null");
		List<Type> typeList = new ArrayList<>();
		if (params.getTypeName() != null) {
			getTypeList.append(" where type_name like '%"+params.getTypeName()+"%'");
		}
		List<Map<String,Object>> objList = JDBCUtil.executeQuery(getTypeList.toString());
		List<Map<String,Object>> userSubList = JDBCUtil.executeQuery(getUserSubType.toString());
		List<Integer> typeIdList = new ArrayList<>();
		userSubList.forEach(type->{
			if (null != type.get("type_id")) {
				typeIdList.add((Integer)type.get("type_id"));
			}
		});
		objList.forEach(obj->{
			Type type = new Type();
			if (obj.get("type_id") != null) {
				type.setTypeId((int) obj.get("type_id"));
			}
			if (obj.get("type_name") != null) {
				type.setTypeName(String.valueOf(obj.get("type_name")));
			}
			if (typeIdList.contains((Integer)obj.get("type_id"))) {
				type.setIsSub(1);
			}else {
				type.setIsSub(0);
			}
			typeList.add(type);
		});
		return typeList;
	}
	
	/**
	 * 用户关注类型
	 * @param userId
	 * @param typeId
	 */
	public void userSubType(Integer userId,Integer typeId) {
		String userSubType = "insert into favor (user_id,type_id) values (?,?)";
		Object[] params = new Object[] {userId,typeId};
		JDBCUtil.ExcuteNoQuery(userSubType, params);
	}
}
