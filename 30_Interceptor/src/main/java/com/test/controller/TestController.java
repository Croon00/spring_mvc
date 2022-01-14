package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Interceptor : 요청 주소를 등록해주면 해당 주소를 요청할 떄
// Controller의 메서드 호출을 중간에 가로채가서
// Interceptior에 구현된 메서드를 호출할 수 있다
// 이 때, Interceptor는 다음 단계로 진행할 것인지 여부를 판단할 수 있다.
// Interceptor 등록은 ServletAppContext에서 한다.

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1() {
		System.out.println("test1");
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		System.out.println("test2");
		return "test2";
	}
	
	@GetMapping("/sub1/test3")
	public String test3() {
		System.out.println("test3");
		return "test3";
	}
	
	@GetMapping("sub1/test4")
	public String test4() {
		System.out.println("test4");
		return "test4";
	}
}
