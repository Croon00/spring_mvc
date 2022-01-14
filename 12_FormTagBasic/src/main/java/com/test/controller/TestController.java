package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.test.beans.DataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(@ModelAttribute DataBean bean1) {
		// bean에 데이터를 담아준다.
		bean1.setData1(100);
		bean1.setData2(200);
		bean1.setData3(300);
		
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(@ModelAttribute("testBean1") DataBean bean1) {
		// bean에 데이터를 담아준다.
		bean1.setData1(100);
		bean1.setData2(200);
		bean1.setData3(300);
		
		return "test2";
	}
}
