package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
	
	// properties 파일을 Message로 등록한다.
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		// Message 관리 객체를 생성한다.
		ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
		
		// properties 파일을 등록한다.
		// 확장자는 제외한다.
		res.setBasenames("/WEB-INF/properties/data1", "/WEB-INF/properties/data2", "/WEB-INF/properties/data3");
		
		return res;
	}
}
