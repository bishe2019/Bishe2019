package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.Administrator;
import com.service.AdministratorService;

@Controller
public class AdministratorController {
	AdministratorService administratorService = new AdministratorService();
	
	/**
	 * 管理员注册
	 * @param administrator
	 * @return
	 */
	public String administratorRegister(Administrator administrator) {
		administratorService.insertAdministrator(administrator);
		return "";
	}
	
	/**
	 * 管理员登录
	 * @param administrator
	 * @param session
	 * @return
	 */
	@GetMapping("/adminLogin")
	public String administratorLogin(Administrator administrator,HttpSession session) {
		administratorService.administratorLogin(administrator, session);
		return "adminindex";
	}
}
