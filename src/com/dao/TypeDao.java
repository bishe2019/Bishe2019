package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.entity.Params;
import com.entity.Type;
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
	public List<Type> getTypeList(Params params){
		StringBuilder getTypeList = new StringBuilder("select * from type");
		List<Type> typeList = new ArrayList<>();
		if (params.getTypeName() != null) {
			getTypeList.append(" where type_name like '%"+params.getTypeName()+"%'");
		}
		List<Map<String,Object>> objList = JDBCUtil.executeQuery(getTypeList.toString());
		objList.forEach(obj->{
			Type type = new Type();
			if (obj.get("type_id") != null) {
				type.setTypeId((int) obj.get("type_id"));
			}
			if (obj.get("type_Name") != null) {
				type.setTypeName(String.valueOf(obj.get("type_Name")));
			}
			typeList.add(type);
		});
		return typeList;
		
	}
}
