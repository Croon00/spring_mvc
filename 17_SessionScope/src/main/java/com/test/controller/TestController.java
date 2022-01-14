package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.beans.DataBean1;

@Controller
// 이 컨트롤러의 메서드에서 사용하는 ModelAttribute로 정의한 bean을 
// request 영역이 아닌 session 영역에 저장되도록 설정한다.
// 현재 컨트롤에서 사용하는 ModelAttribute 들 중에
// sessionBean2와 sessionBean3는 request 영역이 아닌 session 영역에
// 저장될 수 있도록 한다. 여기에 명시되지 않은 것들은 모두 request 영역에 저장된다.
@SessionAttributes({"sessionBean2", "sessionBean3"})
public class TestController {
	
	// @SessionAttribute쪽에 정의된 이름을 세션영역에 저장될 객체를 생성하는
	// 메서드를 만든다.
	// 여기에서 만든 메서드를 호출해서 반환하는 객체들을 세션영역에 저장해주고
	// @ModelAttribute를 사용하는 쪽에서 이 객체를 주입해준다.
	
	// 메서드 이름은 달라도 상관없다
	@ModelAttribute("sessionBean2")
	public DataBean1 sessionBean2() {
		return new DataBean1();
	}
	
	@ModelAttribute("sessionBean3")
	public DataBean1 sessionBean3() {
		return new DataBean1();
	}
	
	
	// HttpSession 객체를 주입받는다.
	@GetMapping("/test1")
	public String test1(HttpSession session) {
		// session 영역에 데이터를 저장한다.
		session.setAttribute("data1", "문자열1");
		// redirect를 사용했음으로 브라우저에 의해 새로운 요청이 발생한다.
		return "redirect:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpSession session) {
		
		String data1 = (String)session.getAttribute("data1");
		System.out.println(data1);
		
		return "result1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpSession session) {
	 //public String test2(@SessionAttribute("sessionBean1") DataBean1 d1) {
		
		DataBean1 d1 = new DataBean1();
		d1.setData1("문자열1");
		d1.setData2("문자열2");
		
		session.setAttribute("sessionBean1",d1);
		
		return "redirect:/result2";
	}
	
	// @SessionAttribute : 세션영역에 저장되어 있는 bean을 주입받는 어노테이션
	// 지정된 이름으로 세션영역에 저장되어 있는 bean이 없다면 오류가 발생한다.
	@GetMapping("/result2")
	//public String result2(HttpSession session) {
	public String result2(@SessionAttribute("sessionBean1") DataBean1 d2) {
		
		//DataBean1 d2 = (DataBean1)session.getAttribute("sessionBean1");
		System.out.println(d2.getData1());
		System.out.println(d2.getData2());
		
		return "result2";
	}
	
	// 세션영역에 저장되어 있는 객체를 주입받는다.
	@GetMapping("/test3")
	public String test3(@ModelAttribute("sessionBean2") DataBean1 d3,
						@ModelAttribute("sessionBean3") DataBean1 d4) {
		
		d3.setData1("문자열1");
		d3.setData2("문자열2");
		
		d4.setData1("문자열3");
		d4.setData2("문자열4");
		
		return "forward:/result3";
	}
	
	// session 영역에 있는 객체를 주입받는다.
	@GetMapping("/result3")
	public String result3(@ModelAttribute("sessionBean2") DataBean1 d30,
						  @ModelAttribute("sessionBean3") DataBean1 d40) {
//		
//		DataBean1 d30 = (DataBean1)request.getAttribute("sessionBean2");
//		DataBean1 d40 = (DataBean1)request.getAttribute("sessionBean3");
//		
		System.out.println(d30.getData1());
		System.out.println(d30.getData2());
//		
		System.out.println(d40.getData1());
		System.out.println(d40.getData2());
		
		return "result3";
	}
	
}
