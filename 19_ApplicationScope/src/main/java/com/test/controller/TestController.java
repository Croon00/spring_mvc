package com.test.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	// application 영역에 데이터를 저장할 수 있는
	// 객체를 주입받는다.
	@Autowired
	ServletContext application;
	
	@GetMapping("/test1")
	public String test1() {
		// applicaiton 영역에 데이터를 저장한다
		application.setAttribute("data1", "문자열1");
		application.setAttribute("data2", "문자열2");
		
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1() {
		// application 영역에 저장된 데이터를 출력한다.
		System.out.println("application data1 :" + application.getAttribute("data1"));
		System.out.println("application data2 :" + application.getAttribute("data2"));
		
		return "result1";
	}
}
