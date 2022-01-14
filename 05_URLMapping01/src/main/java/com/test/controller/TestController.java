package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// 컨트롤러 역할하는 빈
public class TestController {

	// test1으로 요청하면 호출되는 메서드
	// value : 브라우저가 요청하는 주소를 설정한다.
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		return "test1";
	}
	
	// test2로 요청하면 호출되는 메서드
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {
		return "test2";
	}
}
