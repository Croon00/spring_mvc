package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.test.beans.DataBean;

@Controller
public class TestController {

	// ModelAttribute로 정의된 객체에는 파라미터 이름과 동일한 이름으로
	// 정의되어 있는 변수에 파라미터 값이 자동 주입된다.
	// 여기에 자동으로 request 영역에 객체를 저장하는 처리까지 이루어진다.
	// 이름을 정해주지 않으면 클래스이름(첫 글자를 소문자)으로 이름이 정해진다.
	// 이에, jsp에서 바로 사용이 가능하다.
	@GetMapping("test1")
	public String test1(@ModelAttribute DataBean bean1) {
		
//		System.out.println(bean1.getData1());
//		System.out.println(bean1.getData2());
//		System.out.println(bean1.getData3());
		
		// ModelAttribute 객체는 request 영역에 자동 저장되기 때문에
		// 이 객체에 값을 담아주면 jsp에서도 사용이 가능하다.
		bean1.setData3(300);
		
		return "test1";
	}
	
	// ModeAttribute 객체를 정의할 때 이름을 정해주면
	// 정해준 이름으로 request 영역에 저장된다.
	@GetMapping("/test2")
	public String test2(@ModelAttribute("testBean") DataBean bean2) {
		bean2.setData3(300);
		
		return "test2";
	}
}
