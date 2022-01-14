package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1() {
		// 파라미터 데이터를 jsp에 출력하고자 할 때는 
		// 받아내지 않아도 된다.
		// request 객체에 파라미터 데이터가 담겨져 있고
		// jsp를 처리할 때 request 객체가 전달됨으로 
		// 추출할 필요가 없다.
		return "test1";
	}
	
	// HttpServletRequest를 주입받아 데이터를 저장한다.
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		// request에 데이터를 저장한다.
		request.setAttribute("data1", 100);
		request.setAttribute("data2", 200);
		
		return "test2";
	}
	
	// Model 사용하기
	// Model에 값을 저장하면 HttpServletRequest에 저장해준다
	@GetMapping("/test3")
	public String test3(Model model) {
		model.addAttribute("data3", 300);
		model.addAttribute("data4", 400);
		
		return "test3";
	}
	// ModelAndView 사용하기
	// 데이터를 저장하는 Model의 역할과
	// 사용할 jsp의 이름을 관리하는 역할의 객체
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		mv.addObject("data5", 500);
		mv.addObject("data6", 600);
		
		// 사용할 jsp를 지정한다
		mv.setViewName("test4");
		
		return mv;
	}
}
