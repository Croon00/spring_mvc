package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.test.beans.DataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(@ModelAttribute("testBean") DataBean bean1) {
		
		bean1.setData1("문자열1");
		bean1.setData2("abcd1234");
		bean1.setData3("문자열3");
		bean1.setData4("문자열4");
		bean1.setData5("value2");
		
		String [] check_list = {"check1", "check3"};
		bean1.setData6(check_list);
		
		bean1.setData7("radio1");
		return "test1";
	}
}