package com.dao;

import com.util.JDBCUtil;

public class RateDao {

	/**
	 * ±£¥Ê∆¿∑÷
	 * @param userId
	 * @param sceneId
	 * @param rate
	 */
	public void saveRate(Integer userId,Integer sceneId,Integer rate) {
		String saveRate = "insert into rate(user_id,scene_id,rate) values (?,?,?)";
		Object[] params = new Object[] {userId,sceneId,rate};
		JDBCUtil.ExcuteNoQuery(saveRate, params);
	}
}
