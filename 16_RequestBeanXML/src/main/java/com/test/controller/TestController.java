package com.test.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.beans.DataBean1;
import com.test.beans.DataBean2;

@Controller
public class TestController {

	// root.context.xml에 정의한 bean
	// byType
	// Java 프로젝트와 달리 서버가 가동될 때 주입받으려고 시도한다.
	// 하지만 bean의 scope가 request이기 때문에 객체가 생성되지 않는 시점에서
	// 주입하려고 시도하기 때문에 오류가 발생한다.
	// 따라서 반드시 @Lazy를 명시해야 한다.
	
	@Autowired
	@Lazy
	DataBean1 requestBean1;
	
	// root.context.xml에 정의한 bean
	// byName
	// Java 프로젝트와 달리 서버가 가동될 때 주입받으려고 시도한다.
	// 하지만 bean의 scope가 request이기 때문에 객체가 생성되지 않는 시점에서
	// 주입하려고 시도하기 때문에 오류가 발생한다.
	// 따라서 반드시 @Lazy를 명시해야 한다.
	// XML 기반 프로젝트에서 이름을 통한 주입을 사용할 경우에만
	// 자동으로 request 영역에 저장된다.
	@Resource(name = "requestBean2")
	@Lazy
	DataBean2 requestBean2;
	
	
	@GetMapping("/test1")
	public String test1() {
		
		// 요청이 발생할 때 호출되는 메서드에서 변수를 사용하면
		// 객체가 생성되고 주입이 된다.
		requestBean1.setData1("문자열1");
		requestBean1.setData2("문자열2");
		
		requestBean2.setData3("문자열3");
		requestBean2.setData4("문자열4");
		
		return "forward:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		
		System.out.println("data1 :" + requestBean1.getData1());
		System.out.println("data2 :" + requestBean1.getData2());
		
		System.out.println("data3 :" + requestBean2.getData3());
		System.out.println("data4 :" + requestBean2.getData4());
		// jsp에서 사용하기 위해 request 영역에 저장한다.
		// modelAttribute로 처리를 하는게 일반적 -- >파라미터에도 자동 주입이 되고 저장이 되어서
		// session이나 application에서는 사용할 수 있음
		model.addAttribute("requestBean1",requestBean1);
		return "result1";
	}
}
