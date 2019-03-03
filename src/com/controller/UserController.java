package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/test")
	public void test() {
		System.out.println("≤‚ ‘≥…π¶");
	}
}
