package com.test.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/save_cookie")
	public String saveCookie(HttpServletResponse response) {
		// 쿠키는 사용자 브라우저에 저장되는 것으로 
		// 서버에서 응답 결과를 보낼 때 쿠키 저장 정보를 같이 보내게 된다.
		// 이 때문에 응답 객체를 통해서 쿠키 저장 정보를 전달한다.
		try {
			
			// 쿠키에 저장할 정보를 인코딩한다.
			String data1 = URLEncoder.encode("문자열1", "UTF-8");
			String data2 = URLEncoder.encode("문자열2", "UTF-8");
			
			// 쿠키 객체를 생성한다.
			// (이름, 값)
			Cookie cookie1 = new Cookie("cookie1", data1);
			Cookie cookie2 = new Cookie("cookie2", data2);
			
			// 쿠키의 수명을 설정한다.(단위 : 초)
			cookie1.setMaxAge(365 * 24 * 60 * 60);
			cookie2.setMaxAge(365 * 24 * 60 * 60);
			
			// 응답 결과에 포함시켜준다.
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "save_cookie";
		
	}
	
	@GetMapping("/load_cookie1")
	public String load_cookie1(HttpServletRequest request, Model model) {
		
		// 브라우저에서 요청이 발생할 때 서버로 전달되기 때문에
		// 요청 객체에서 쿠키를 추출한다.
		// 이 때, 모든 쿠키가 배열에 담겨져 전달된다.
		Cookie [] cookieArray = request.getCookies();
		
		try {
			// 쿠키의 수 만큼 반복한다.
			for(Cookie c1 : cookieArray) {
				// 쿠키의 이름을 추출한다.
				String name = c1.getName();
				// 쿠키의 값을 디코딩해서 추출한다.
				String value = URLDecoder.decode(c1.getValue(), "UTF-8");
				
				// 쿠키 이름을 검사한다.
				if(name.equals("cookie1")) {
					model.addAttribute("cookie1", value);
				} else if(name.equals("cookie2")) {
					model.addAttribute("cookie2", value);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "load_cookie1";
	}
	
	// 브라우저가 굉장히 많은 쿠키를 전달한다고 하더라도
	// 사용하고자 하는 쿠키의 이름을 통해 주입받을 수 있다.
	// 자동으로 디코딩까지 처리해준다.
	@GetMapping("/load_cookie2")
	public String loadCookie2(@CookieValue("cookie1") String cookie1,
			                  @CookieValue("cookie2") String cookie2,
			                  Model model) {
		
		model.addAttribute("cookie1", cookie1);
		model.addAttribute("cookie2", cookie2);
		
		return "load_cookie2";
		
	}
}




















