package com.service;

import com.dao.RateDao;

public class RateService {
	RateDao rateDao = new RateDao();
	
	/**
	 * ±£¥Ê∆¿∑÷
	 * @param userId
	 * @param sceneId
	 * @param rate
	 */
	public void saveRate(Integer userId,Integer sceneId,Integer rate) {
		rateDao.saveRate(userId, sceneId, rate);
	}

}
