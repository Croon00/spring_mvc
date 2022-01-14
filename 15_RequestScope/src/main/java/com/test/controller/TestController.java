package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.test.beans.DataBean;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		//request 영역에 데이터를 저장한다.
		request.setAttribute("data1", "문자열1");
		// result1으로 redirect 한다.
		// 응답 결과를 브라우저로 전달한다.
		// redirect는 응답 결과가 브라우저로 전달되므로
		// request 영역은 소멸된다.
		return "redirect:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		// test1에서 request 영역에 저장한 데이터를 추출한다.
		String data1 = (String)request.getAttribute("data1");
		System.out.println("data1 :" + data1);
		
		return "result1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		// request 영역에 데이터를 저장한다.
		request.setAttribute("data2", "문자열2");
		
		// fowarding : 서버상에서 코드 흐름이 이동한다.
		// 응답 결과가 브라우저로 전달되지 않고 다음으로 이동한다.
		// request 영역은 소멸되지 않고 전달된다.
		return "forward:/result2";
	}
		
	@GetMapping("/result2")
	public String result2(HttpServletRequest request) {
		// test2 에서 request영역에 저장한 데이터를 추출한다.
		String data2 = (String)request.getAttribute("data2");
		System.out.println("data2 : " + data2);
		
		return "result2";
	}
	
	// Model 사용
	// Model을 통해 객체를 저장하면 request 영역에 저장된다.
	@GetMapping("/test3")
	public String test3(Model model) {
		
		// request 영역에 데이터를 저장한다.
		model.addAttribute("data3", "문자열3");
		
		return "forward:/result3";
	}
	
	@GetMapping("/result3")
	public String result3(HttpServletRequest request) {
		String data3 = (String)request.getAttribute("data3");
		System.out.println("data3 : " + data3);
		
		return "result3";
	}
	
	// ModeAndView 를 통해 저장을 하면
	// request 영역에 저장된다.
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		
		mv.addObject("data4", "문자열4");
		
		mv.setViewName("forward:/result4");
		
		return mv;
		
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		// test4에서 request 영역에 저장한 데이터를 추출한다.
		String data4 = (String)request.getAttribute("data4");
		System.out.println("data4 :" + data4);
		
		return "result4";
	}
	
	// ModelAttribute로 정의된 객체는 파라미터 데이터가
	// 자동으로 주입되기도 하지만
	// 객체 자체를 request 영역에 저장해주기도 한다.
	@GetMapping("/test5")
	public String test5(@ModelAttribute("testBean") DataBean bean1) {
		
		bean1.setValue1(100);
		bean1.setValue2(200);
		
		System.out.println(bean1);
		return "forward:/result5";
	}
	
	@GetMapping("/result5")
	// ModelAttribute로 정의된 객체는 새롭게 생성되어 request 영역에 저장되므로
	// test5에서 저장된 객체는 소멸되서 새로운 객체가 생성되어 저장된다.
	// 따라서 새롭게 정의하면 안된다.
	//public String result5(@ModelAttribute("testBean") DataBean bean1) {
		
	public String result5(HttpServletRequest request) {
		
		DataBean bean1 = (DataBean)request.getAttribute("testBean");
		
		System.out.println(bean1.getValue1());
		System.out.println(bean1.getValue1());
		
		System.out.println(bean1);

		
		return "result5";
	}
}
