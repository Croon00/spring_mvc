package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	// 로그인
	@GetMapping("/user_login")
	public String user_login() {
		return "user/user_login";
	}
}
