package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// 중간 경로가 같은 것들끼리 모아 놓은다고 하면 
// 여기에 중간 경로를 명시할 수 있다.
@RequestMapping("/sub2")
public class Sub2Controller {
	
	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	public String test5() {
		return "sub2/test5";
	}
	
	@RequestMapping(value = "/test6", method = RequestMethod.GET)
	public String test6() {
		return "sub2/test6";
	}
}
