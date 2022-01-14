package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.beans.DataBean;

@Controller
public class TestController {
	
	// 파라미터 데이터를 받을 객체의 변수와 파라미터 이름이 동일하기 때문에
	// ModelAttribute를 통해 주입받는다.
	@PostMapping("/test1")
	public String test1(@ModelAttribute DataBean bean1) {
		return "test1";
	}
}
