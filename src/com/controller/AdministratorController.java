package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import com.entity.Administrator;
import com.service.AdministratorService;

@Controller
public class AdministratorController {
	AdministratorService administratorService = new AdministratorService();
	
	/**
	 * ����Աע��
	 * @param administrator
	 * @return
	 */
	public String administratorRegister(Administrator administrator) {
		administratorService.insertAdministrator(administrator);
		return "";
	}
	
	/**
	 * ����Ա��¼
	 * @param administrator
	 * @param session
	 * @return
	 */
	public String administratorLogin(Administrator administrator,HttpSession session) {
		administratorService.administratorLogin(administrator, session);
		return "";
	}
}
