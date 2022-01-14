package com.test.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// properties 파일을 Message로 등록하면
// 다국어처리, 포맷 문자열, JSP에서의 사용 등 다양한
// 기능을 사용할 수 있다.
// Java 기반 mvc에서는 config 패키지에 있는
// ServletApContext에서 등록한다.

@Controller
public class TestController {

	// Message를 관리하는 객체를 주입받는다.
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/test1")
	public String test1(Locale locale, Model model) {
		
		// 현재 브라우저의 언어값을 출력해본다.
		System.out.println("locale : " + locale);
		
		// Message에 등록된 문자열 값을 가져온다.
		String a1 = res.getMessage("aaa.a1", null, null);
		String b1 = res.getMessage("bbb.b1", null, null);
		
		// { } 부분에 셋팅될 값
		Object [] args = {"홍길동", 30};
		// Message에 등록된 문자열 값을 가져온다.
		// 이 때, { }안에 대입될 값을 지정한다.
		String a2 = res.getMessage("aaa.a2", args, null);
		
		// 다국어를 설정한 메시지를 가져온다.
		String k1 = res.getMessage("kkk.k1", null, locale);
		
		System.out.println("aaa.a1 :" + a1);
		System.out.println("bbb.b1 :" + b1);
		System.out.println("aaa.a2 :" + a2);
		System.out.println("kkk.k1 :" + k1);
		
		model.addAttribute("args", args);
		return "test1";
	}
}
