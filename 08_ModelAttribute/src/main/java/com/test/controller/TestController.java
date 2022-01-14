package com.test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.beans.DataBean1;

@Controller
public class TestController {

	// @RequestParam에 Map을 설정하면
	// 파라미터의 이름으로 값을 저장하여 주입해준다.
	// data3은 두 개가 전달되지만 map으로 주입 받을 때는 처음 것 하나만 주입된다.
	// 이 때문에 동일한 이름으로 여러개가 전달 될때는 각각을 리스트로 주입받을 수 있다.
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map,
						@RequestParam List<String> data3) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		//String data3 = map.get("data3");
		
		System.out.println(data1);
		System.out.println(data2);
		//System.out.println(data3);
		
		for (String a1 : data3) {
			System.out.println(a1);
		}
		
		return "result";
	}
	
	// ModelAttribute : 파라미터 데이터를 주입 받을 클래스를 정의한다.
	// 생략 가능하다.
	// 클래스의 객체를 생성한 후에 파라미터 이름과 동일한 이름의 변수에 값을 주입해준다.
	@GetMapping("/test2")
	// public String test2()
	public String test2(DataBean1 bean1) {
		
		System.out.println(bean1.getData1());
		System.out.println(bean1.getData2());
		
		for(int a1 : bean1.getData3()) {
			System.out.println(a1);
		}
		return "result";
	}
}
