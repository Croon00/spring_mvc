package com.test.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.beans.DataBean1;
import com.test.beans.DataBean2;
import com.test.beans.DataBean3;
import com.test.beans.DataBean4;

@Controller
public class TestController {
	
	// RootAppContext에 등록한 bean 주입
	// byType
	@Autowired
	DataBean1 applicationBean1;
	
	// byName
	@Resource(name = "applicationBean2")
	DataBean2 applicationBean2;
	
	// 클래스 자체에 bean 설정을 한 bean 주입
	// byType
	@Autowired
	DataBean3 applicationBean3;
	
	// byName
	@Resource(name = "applicationBean4")
	DataBean4 applicationBean4;
	
	
	@GetMapping("/test1")
	public String test1() {
		
		applicationBean1.setData1("문자열1");
		applicationBean1.setData2("문자열2");
		
		applicationBean2.setData3("문자열3");
		applicationBean2.setData4("문자열4");

		applicationBean3.setData5("문자열5");
		applicationBean3.setData6("문자열6");
		
		applicationBean4.setData7("문자열7");
		applicationBean4.setData8("문자열8");
		
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		
		System.out.println("application data1 : " + applicationBean1.getData1());
		System.out.println("application data2 : " + applicationBean1.getData2());
		
		System.out.println("application data3 : " + applicationBean2.getData3());
		System.out.println("application data4 : " + applicationBean2.getData4());
		
		System.out.println("application data5 : " + applicationBean3.getData5());
		System.out.println("application data6 : " + applicationBean3.getData6());
		
		System.out.println("application data7 : " + applicationBean4.getData7());
		System.out.println("application data8 : " + applicationBean4.getData8());
		
		// application 영역에 자동 저장되지 않으므로 직접 저장을 해줘야 한다.
		// jsp에서 사용하기 위해 request 영역에 저장해준다.
		model.addAttribute("applicaiotnBean1", applicationBean1);
		model.addAttribute("applicationBean2", applicationBean2);
		model.addAttribute("applicationBean3", applicationBean3);
		model.addAttribute("applicationBean4", applicationBean4);
		
		return "result1";
	}
}
