package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//properties 파일 사용을 명시한다.
@PropertySource("/WEB-INF/properties/data1.properties")
@PropertySource("/WEB-INF/properties/data2.properties")
public class TestController {

	// properties 파일에 있는 값을 주입받는다.
	@Value("${aaa.a1}")
	private int a1;
	
	@Value("${bbb.b1}")
	private int b1;
	
	@Value("${aaa.a2}")
	private String a2;
	
	@Value("${bbb.b2}")
	private String b2;
	
	@Value("${ccc.c1}")
	private int c1;
	
	@Value("${ccc.c2}")
	private String c2;
	
	@Value("${ddd.d1}")
	private int d1;
	
	@Value("${ddd.d2}")
	private String d2;
	
	@GetMapping("/test1")
		public String test1(Model model) {
			
			model.addAttribute("a1", a1);
			model.addAttribute("b1", b1);
			model.addAttribute("a2", a2);
			model.addAttribute("b2", b2);
			model.addAttribute("c1", c1);
			model.addAttribute("c2", c2);
			model.addAttribute("d1", d1);
			model.addAttribute("d2", d2);
			
			return "test1";
		}
	}

