package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	// main
	@GetMapping("/main")
	public String main() {
		return "main/main";
	}
}
