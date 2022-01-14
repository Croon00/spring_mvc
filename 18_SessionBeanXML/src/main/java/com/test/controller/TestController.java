package com.test.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.beans.DataBean1;
import com.test.beans.DataBean2;
import com.test.beans.DataBean3;
import com.test.beans.DataBean4;

@Controller
public class TestController {

	// RootAppContext에서 등록한 bean 주입
	
	// root-context.xml에서 등록한 bean 주입
	
	// byType
	// session 영역에 자동 저장이 안된다.
	@Autowired
	@Lazy
	DataBean1 sessionBean1;
	
	// byName
	// session 영역에 자동 저장이 된다.
	@Resource(name = "sessionBean2")
	@Lazy
	DataBean2 sessionBean2;
	
	// 클래스 자체에 설정해 등록한 bean 주입
	
	// byType
	// session 영역에 자동 저장이 안된다.
	@Autowired
	@Lazy
	DataBean3 sessionBean3;
	
	// byName
	// session 영역에 자동 저장이 안된다.
	@Resource(name = "sessionBean4")
	@Lazy
	DataBean4 sessionBean4;
	
	//JSP에서 사용하기 위해 Model에 담는다.
	@GetMapping("/test1")
	public String test1() {
		
		// 주입된 객체에 값을 담겠다.
		sessionBean1.setData1("문자열1");
		sessionBean1.setData2("문자열2");
		
		sessionBean2.setData3("문자열3");
		sessionBean2.setData4("문자열4");
		
		sessionBean3.setData5("문자열5");
		sessionBean3.setData6("문자열6");
		
		sessionBean4.setData7("문자열7");
		sessionBean4.setData8("문자열8");
		
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		
		// 주입 받은 bean의 담긴 값을 출력한다
		System.out.println("sessionBean1 data1 :" + sessionBean1.getData1());
		System.out.println("sessionBean1 data2 :" + sessionBean1.getData2());
		
		System.out.println("sessionBean1 data3 :" + sessionBean2.getData3());
		System.out.println("sessionBean1 data4 :" + sessionBean2.getData4());
		
		System.out.println("sessionBean1 data5 :" + sessionBean3.getData5());
		System.out.println("sessionBean1 data6 :" + sessionBean3.getData6());
		
		System.out.println("sessionBean1 data7 :" + sessionBean4.getData7());
		System.out.println("sessionBean1 data8 :" + sessionBean4.getData8());
		
		// 세션영역에 자동 저장되지 않는 객체들을 request에 저장한다.
		// sessionBean2는 세션영역에 자동 저장되기 때문에 제외한다.
		model.addAttribute("sessionBean1", sessionBean1);
		model.addAttribute("sessionBean3", sessionBean3);
		model.addAttribute("sessionBean4", sessionBean4);
		
		return "result1";
	}
}
