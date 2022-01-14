package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	// method에 GET만 설정하였으므로 GET 방식만 처리가 가능하다.
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		return "test1";
	}
	
	// method에 POST만 설정하였으므로 POST 방식만 처리 가능하다.
	@RequestMapping(value = "/test2", method = RequestMethod.POST)
	public String test2() {
		return "test2";
	}
	
	// GetMapping : GET 방식
	@GetMapping("/test3")
	public String test3() {
		System.out.println("test3 메서드 호출");
		return "test1";
	}
	
	// PostMapping : POST 방식
	@PostMapping("/test4")
	public String test4() {
		System.out.println("test4 메서드 호출");
		return "test1";
	}
	
	//////////////////////////////////////////////////////////////
	// 하나의 요청 주소에 대해 get, post 둘 다 지원
	// get, post 각각 처리하는 코드가 다를 경우
	
	@RequestMapping(value="/test5", method = RequestMethod.GET)
	public String test5_get() {
		System.out.println("test5 get");
		return "test1";
	}
	
	@RequestMapping(value= "/test5", method = RequestMethod.POST)
	public String test5_post() {
		System.out.println("test5 post");
		return "test1";
	}
	
	// GetMapping : GET 방식
	@GetMapping("/test6")
	public String test6_get() {
		System.out.println("test6 get");
		return "test1";
	}
	
	// PostMapping : POST 방식
	@PostMapping("/test6")
	public String test6_post() {
		System.out.println("test6 post");
		return "test1";
	}
	
//////////////////////////////////////////////////////////////
// 하나의 요청 주소에 대해 get, post 둘 다 지원
// get, post 구분하지 않고 같은 처리를 하고자 할 때
	
	@RequestMapping(value = "/test7", method = {RequestMethod.GET, RequestMethod.POST})
	public String test7() {
		System.out.println("test7 호출");
		return "test1";
	}
	
	// GetMapping과 PostMapping은 
	// 같이 작성하면 위에것만 설정된다.
	// 그래서 여기에서 post 방식일 때 호출될 메서드를
	// 호출해주어야 한다.
	@GetMapping("test8")
	// @PostMapping("test8")
	@PostMapping("test8")
	public String test8() {
		System.out.println("test8 get 호출");
		return test8_post();
	}
	
	@PostMapping("test8")
	public String test8_post() {
		System.out.println("test8 post 호출");
		return "test1";
	}
	
}

