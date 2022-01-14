package com.test.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.test.beans.DataBean;

public class TestValidator implements Validator{

	// 매개변수로 들어오는 클래스에 대해 유효성 검사를 허용할 것인지
	// 파악한다.
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		
		return DataBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		// data1에 대해 공백이 있는지 확인한다. 스페이스는 문자로 취급
		// 변수 이름 / 에러 코드
		ValidationUtils.rejectIfEmpty(errors, "data1", "error1");
		
		// data2에 대해 공백이 있는지 확인한다.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "data2", "error2");
		
		// bean 객체를 형변환 한다.
		DataBean bean1 = (DataBean)target;
		
		// 값을 추출한다.
		String data1 = bean1.getData1();
		String data2 = bean1.getData2();
		
		if(data1.length() > 10) {
			errors.rejectValue("data1", "error3");
		}
		if(data2.contains("@") == false) {
			errors.rejectValue("data2", "error4");
		}
	}
	
	

}
