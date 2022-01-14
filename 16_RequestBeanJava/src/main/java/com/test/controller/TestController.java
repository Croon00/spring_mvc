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
	
	// RootAppContext에서 설정한 bean 주입
	// byType
	// 자동 주입을 설정했다고 하더라도 bean이 RequestScope로 정의되어 있기
	// 때문에 서버 가동시 주입되지 않는다.(@Lazy 를 설정한 것과 같다.)
	// 주입 받은 객체는 자동으로 request 영역에 저장되지 않으므로
	// 직접 저장해야 한다.
	@Autowired
	DataBean1 requestBean1;
	
	// RootAppContext에서 설정한 bean 주입
	// ByName
	// 자동 주입을 설정했다고 하더라도 bean이 RequestScope로 정의되어 있기
	// 때문에 서버 가동시 주입되지 않는다.(@Lazy 를 설정한 것과 같다.)
	// 주입 받은 객체는 자동으로 request 영역에 저장되지 않으므로
	// 직접 저장해야 한다.
	@Resource(name = "requestBean2")
	DataBean2 requestBean2;
	
	// 각 클래스에 정의한 bean을 주입
	// 기타 내용은 위와 동일하다.
	
	// byType
	@Autowired
	DataBean3 requestBean3;
	
	// byName
	@Resource(name = "requestBean4")
	DataBean4 requestBean4;
	
	
	@GetMapping("/test1")
	public String test1() {
		// 요청이 발생하여 호출되는 메서드에서 변수를 사용할 때
		// 객체가 생성되어 주입된다.
		
		//새로고침 할 경우 객체를 사용함으로 새로 계속 생성댐
		System.out.println(requestBean1);
		
		requestBean1.setData1("문자열1");
		requestBean1.setData2("문자열2");
		
		requestBean2.setData3("문자열3");
		requestBean2.setData4("문자열4");
		
		requestBean3.setData5("문자열5");
		requestBean3.setData6("문자열6");
		
		requestBean4.setData7("문자열7");
		requestBean4.setData8("문자열8");
		
		return "forward:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		// test1에서 forward를 통해 이동했기 때문에 전에 생성된 객체를
		// 그대로 사용한다.
		System.out.println(requestBean1);
		
		System.out.println("data1 :" + requestBean1.getData1());
		System.out.println("data2 :" + requestBean1.getData2());
		
		System.out.println("data3 : " + requestBean2.getData3());
		System.out.println("data4 : " + requestBean2.getData4());
		
		System.out.println("data5 : " + requestBean3.getData5());
		System.out.println("data6 : " + requestBean3.getData6());
		
		System.out.println("data7 : " + requestBean4.getData7());
		System.out.println("data8 : " + requestBean4.getData8());
		
		// JSP에서 사용할 수 있도록 request 영역에 저장해준다.
		model.addAttribute("requestBean1", requestBean1);
		model.addAttribute("requestBean2", requestBean2);
		model.addAttribute("requestBean3", requestBean3);
		model.addAttribute("requestBean4", requestBean4);
		
		return "result1";
	}
}
