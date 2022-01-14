package com.test.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor1 implements HandlerInterceptor{

	// Controller의 메서드가 호출되기 전에 호출된다.
	// false를 반환하면 요청 처리에 대한 진행이 중단된다.
	// 주로 사용
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestInterceptor1 - preHandle");
		return true;
	}
	
	// Controller의 메서드가 호출된 후에 호출된다.
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		System.out.println("TestInterceptor1 - postHandle");
	}
	
	// 지정된 View 이름을 통해 응답결과를 생성한 후 호출
	// 응답 결과가 브라우저로 전달되기 전에 호출된다.
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
		
	}
}
