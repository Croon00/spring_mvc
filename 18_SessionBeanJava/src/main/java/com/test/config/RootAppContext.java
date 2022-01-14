package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import com.test.beans.DataBean1;
import com.test.beans.DataBean2;

@Configuration
public class RootAppContext {

	@Bean
	@SessionScope
	public DataBean1 dataBean1() {
		
		return new DataBean1();
	}
	
	@Bean("sessionBean2")
	@SessionScope
	public DataBean2 dataBean2() {
		
		return new DataBean2();
	}
}
