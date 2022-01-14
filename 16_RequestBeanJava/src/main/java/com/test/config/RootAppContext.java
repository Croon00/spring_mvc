package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.test.beans.DataBean1;
import com.test.beans.DataBean2;

// 프로젝트에서 사용할 bean을 정의하는 곳
@Configuration
public class RootAppContext {
	
	// 타입을 통해 사용할 경우
	// 서버가 가동이 될때 객체가 생성됨.--> IoC 컨테이너에서
	@Bean
	@RequestScope
	public DataBean1 dataBean1() {
		DataBean1 d1 = new DataBean1();
		return d1;
	}
	
	// 이름을 통해 사용할 경우
	// java 프로젝트에서는 lazy를 붙이나 안 붙이나 똑같고 xml에서는 붙여야 함으로 전부 붙인다.
	@Bean("requestBean2")
	@RequestScope
	public DataBean2 dataBean2() {
		DataBean2 d2 = new DataBean2();
		return d2;
	}
}
