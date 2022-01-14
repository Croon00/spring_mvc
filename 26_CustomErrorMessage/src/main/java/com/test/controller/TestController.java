package com.test.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.beans.DataBean;

// properties 파일에 값을 작성할 때
// 값의 이름을
// 어노테이션.빈이름.변수이름 형태로 넣어주면
// 유효성 검사에서 통과하지 못했을 때 보여주는 메시지를
// 재정의 할 수 있다.


@Controller
public class TestController {

	@GetMapping("/input_data")
	public String input_data(@ModelAttribute("dataBean") DataBean bean1) {
		
		return "input_data";
		
	}
	
	@PostMapping("/input_pro")
	public String input_pro(@Valid @ModelAttribute("dataBean") DataBean bean1,
							BindingResult result) {
		
		if(result.hasErrors()) {
			return "input_data";
		}
		
		return "input_success";
		
	}
}
