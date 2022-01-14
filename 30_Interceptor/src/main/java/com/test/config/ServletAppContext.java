package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.test.interceptor.TestInterceptor1;
import com.test.interceptor.TestInterceptor2;
import com.test.interceptor.TestInterceptor3;
import com.test.interceptor.TestInterceptor4;
import com.test.interceptor.TestInterceptor5;
import com.test.interceptor.TestInterceptor6;
import com.test.interceptor.TestInterceptor7;
import com.test.interceptor.TestInterceptor8;

// Spring MVC 프로젝트에 관련된 설정을 하는 bean으로 등록한다.

@Configuration
// Controller 어노테이션이 셋팅되어 있는 클래스를 Controller로 등록한다
@EnableWebMvc
// 패키지 스캔
@ComponentScan(basePackages = "com.test.controller")
public class ServletAppContext implements WebMvcConfigurer{
	
	// Controller의 메서드가 반환하는 문자열 앞,뒤에 붙힐 jsp의 경로
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/",".jsp");
	}
	
	// 정적 파일의 경로를 매핑한다
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	// Interceptor 등록
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		
		// Interceptor 객체 생성
		TestInterceptor1 inter1 = new TestInterceptor1();
		TestInterceptor2 inter2 = new TestInterceptor2();
		TestInterceptor3 inter3 = new TestInterceptor3();
		TestInterceptor4 inter4 = new TestInterceptor4();
		TestInterceptor5 inter5 = new TestInterceptor5();
		TestInterceptor6 inter6 = new TestInterceptor6();
		TestInterceptor7 inter7 = new TestInterceptor7();
		TestInterceptor8 inter8 = new TestInterceptor8();
		
		// Interceptor 등록
		InterceptorRegistration reg1 = registry.addInterceptor(inter1);
		InterceptorRegistration reg2 = registry.addInterceptor(inter2);
		InterceptorRegistration reg3 = registry.addInterceptor(inter3);
		InterceptorRegistration reg4 = registry.addInterceptor(inter4);
		InterceptorRegistration reg5 = registry.addInterceptor(inter5);
		InterceptorRegistration reg6 = registry.addInterceptor(inter6);
		InterceptorRegistration reg7 = registry.addInterceptor(inter7);
		InterceptorRegistration reg8 = registry.addInterceptor(inter8);
		
		// 관심 주소 등록
		reg1.addPathPatterns("/test1");
		reg2.addPathPatterns("/test1");
		reg3.addPathPatterns("/test2");
		
		// test1, test2에 Interceptor4를 등록한다.
//		reg4.addPathPatterns("/test1");
//		reg4.addPathPatterns("/test2");
		reg4.addPathPatterns("/test1", "/test2");	
		
		reg5.addPathPatterns("/sub1/test3", "/sub1/test4");
		
		// 모든 주소에 대해 동작하는 인터셉터
		// 하위 주소가 없는 경우 (/test1, /test2)
		reg6.addPathPatterns("/*");
		
		// 중간 경로가 있는 모든 주소 (/sub1/test3, /sub1/test4)
		reg7.addPathPatterns("/sub1/*");
		
		// 중간경로 여부에 관계없이 모든 주소
		reg8.addPathPatterns("/**");
		
		// 등록된 경로 중에서 제외하고 싶은것이 있다면..
		reg8.excludePathPatterns("/test1");
	}
	
}
