package com.test.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.beans.DataBean;
import com.test.validator.TestValidator;

@Controller
public class TestController {

	@GetMapping("/input_data")
	public String inputData(@ModelAttribute("dataBean") DataBean bean1) {
		
		return "input_data";
	}
	
	@PostMapping("/input_pro")
	public String inputpro(@Valid @ModelAttribute("dataBean") DataBean bean1,
							BindingResult result) {
		
		if(result.hasErrors()) {
			return "input_data";
		}
		
		return "input_success";	
	}
	
	// Validator 등록
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		TestValidator validator = new TestValidator();
		binder.addValidators(validator);
	}
}
