package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import com.entity.User;
import com.service.RateService;

@Controller
public class RateController {
	
	RateService rateService = new RateService();
	
	/**
	 * �û�Ϊ������
	 * @param session
	 * @param sceneId
	 * @param rate
	 * @return
	 */
	public String saveRate(HttpSession session,Integer sceneId,Integer rate) {
		User user = (User) session.getAttribute("user");
		rateService.saveRate(user.getUserId(), sceneId, rate);
		
		return "";
	}
}
