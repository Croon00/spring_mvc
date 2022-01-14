package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestContrlloer {
	
	// GET : HttpServletRequest를 주입
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		// 파라미터 데이터 추출
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String [] data3 = request.getParameterValues("data3");
		
		// 파라미터는 모두 문자열로 전달되기 때문에 숫자로 사용하고 싶다면
		// 직접 변환을 해야 한다.
		
		int k1 = Integer.parseInt(data1);
		
		System.out.println(k1);
		System.out.println(data2);
		
		for(String str : data3) {
			System.out.println(str);
		}
		
		return "result";
	}
	
	@PostMapping("/test2")
	public String test2(HttpServletRequest request) {
		// 파라미터 데이터 추출
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String [] data3 = request.getParameterValues("data3");
		
		// 파라미터는 모두 문자열로 전달되기 때문에 숫자로 사용하고 싶다면
		// 직접 변환을 해야 한다.
		
		int k1 = Integer.parseInt(data1);
		
		System.out.println(k1);
		System.out.println(data2);
		
		for(String str : data3) {
			System.out.println(str);
		}
		
		return "result";
	}
	

	// GET : WebRequest를 주입
	// WebRequest는 HttpServletRequest를 상속받아 제공하는 클래스이다.
	// 사용방법은 HttpServletRequest와 동일하다.
	@GetMapping("/test3")
	public String test3(WebRequest request) {
		// 파라미터 데이터 추출
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String [] data3 = request.getParameterValues("data3");
		
		// 파라미터는 모두 문자열로 전달되기 때문에 숫자로 사용하고 싶다면
		// 직접 변환을 해야 한다.
		
		int k1 = Integer.parseInt(data1);
		
		System.out.println(k1);
		System.out.println(data2);
		
		for(String str : data3) {
			System.out.println(str);
		}
		
		return "result";
	}

	// POST : WebRequest 를 주입
	@PostMapping("/test4")
	public String test4(WebRequest request) {
		// 파라미터 데이터 추출
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String [] data3 = request.getParameterValues("data3");
		
		// 파라미터는 모두 문자열로 전달되기 때문에 숫자로 사용하고 싶다면
		// 직접 변환을 해야 한다.
		
		int k1 = Integer.parseInt(data1);
		
		System.out.println(k1);
		System.out.println(data2);
		
		for(String str : data3) {
			System.out.println(str);
		}
		
		return "result";
	}
	
	// PathValue : 요청 주소의 경로 부분을 데이터로 받아 사용할 수 있다.
	// 주소/{변수명}/{변수명}/{변수명}
	// 이 때, 변수의 타입을 보고 형변환을 해준다.
	@GetMapping("/test5/{data1}/{data2}/{data3}")
	public String test5(@PathVariable int data1,
						@PathVariable int data2,
						@PathVariable int data3) {
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
		int add = data1 + data2 + data3;
		System.out.println(add);
		
		return "result";
		
	}
	
	// RequestParam : 매개변수의 이름과 파라미터의 이름이 동일하면 
	// 자동으로 주입이 된다.
	// 형변환도 처리해준다.
	@GetMapping("/test6")
	public String test6(@RequestParam int data1,
						@RequestParam int data2,
						@RequestParam int [] data3) {
		System.out.println(data1);
		System.out.println(data2);
		for (int a1 : data3) {
			System.out.println(a1);
		}
		
		return "result";
	}
	
	@PostMapping("/test7")
	public String test7(@RequestParam int data1,
						@RequestParam int data2,
						@RequestParam int [] data3) {
		System.out.println(data1);
		System.out.println(data2);
		for (int a1 : data3) {
			System.out.println(a1);
		}
		
		return "result";
	}
	
	// 파라미터의 이름과 변수의 이름이 다를 경우
	// value에 파라미터 이름을 작성해준다.
	@GetMapping("/test8")
	public String test8(@RequestParam(value = "data1") int value1,
						@RequestParam(value = "data2") int value2,
						@RequestParam(value = "data3") int [] value3,
						@RequestParam int data1,
						@RequestParam int data2,
						@RequestParam int [] data3) {
		System.out.println(value1);
		System.out.println(value1);
		for(int a1 : value3) {
			System.out.println(a1);
		}
		System.out.println("=========================");
		
		System.out.println(data1);
		System.out.println(data2);
		for(int a1 : data3) {
			System.out.println(a1);
		}
		
		return "result";
	}
	
	// 받는 쪽에서 받아야 하는 파라미터가 전달되지 않으면 오류가 발생하게 된다.
	// 만약 파라미터 값이 넘어오지 않았을 경우에도 오류가 발생하지 않게 하겠다면
	// required에 false를 넣어준다.
	// required에 false를 설정해줄 경우 주입될 파라미터가 없다면 null이 주입된다.
	// 따라서 반드시 변수의 타입은 기본 자료형으로 하면 안된다.
	// 만약 기본 자료형 변수를 쓰고 싶다면 required 설정 보다는 
	// defaultValue를 통한 기본 값을 설정해서 사용한다.
	@GetMapping("/test9")
	public String test9(@RequestParam int data1,
						@RequestParam(required = false) Integer data2,
						// 널 값을 정수형으로 바꾸려는 시도 때문에 오류
						@RequestParam(defaultValue = "0") int data3) {
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
		return "result";
	}

		
}
