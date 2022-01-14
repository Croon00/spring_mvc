package com.test.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.beans.DataBean1;

@Controller
public class TestController {

	@GetMapping("/input_data")
	public String input_data() {
		return "input_data";
	}

	// 유효성 검사는 데이터를 bean 객체에 주입할 때 발생할 수 있다.
	// 데이터를 담을 bean에 어노테이션으로 유효성 조건을 결정해준다.
	// 그리고 @Valid 어노테이션을 설정해준다.
	// BindingResult : 객체에 데이터가 주입된 결과 정보를 가지고 있는 객체
	@PostMapping("input_pro")
	public String input_pro(@Valid @ModelAttribute("testBean") DataBean1 bean1, BindingResult result) {

		System.out.println("bean1.data1 : " + bean1.getData1());
		System.out.println("bean1.data2 : " + bean1.getData2());

		System.out.println("BindingResult : " + result);

		// 유효성 검사에 통과하지 못한 것이 하나라도 있다면
		if (result.hasErrors()) {
			// 오류의 수 만큼 반복한다.
			for (ObjectError obj : result.getAllErrors()) {
				System.out.println("메시지 : " + obj.getDefaultMessage());
				System.out.println("code : " + obj.getCode());
				System.out.println("name : " + obj.getObjectName());

				// 코드 객체를 추출한다.
				String[] codes = obj.getCodes();

				for (String c1 : codes) {
					System.out.println(c1);
				}

				switch (codes[0]) {
				case "Size.testBean.data1":
					System.out.println("testBean에서 data1 변수의 Size위배");
					break;
				case "Max.testBean.data2":
					System.out.println("testBean에서 data2 변수의 Max 위배");
					break;
				}
				System.out.println("===========================================");

			}

			// 오류가 있을 경우에는 응답 결과로 입력 화면을 지정한다.
			return "input_data";
		}
		return "input_success";
	}

}
