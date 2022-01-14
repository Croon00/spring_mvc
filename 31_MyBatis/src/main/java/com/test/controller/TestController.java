package com.test.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.beans.DataBean;

@Controller
public class TestController {
	
	// 쿼리문을 관리하는 bean을 주입 받는다.
	@Autowired
	SqlSessionTemplate tmp;
	
	
	@GetMapping("/insert")
	public String insert() {
		return "insert";
	}
	
	@PostMapping("/insert_pro")
	public String insert_pro(@ModelAttribute("dataBean") DataBean bean1) {
		
		// 파라미터 주입 확인
//		System.out.println(bean1.getData1());
//		System.out.println(bean1.getData2());
//		System.out.println(bean1.getData3());
		
		// 쿼리를 실행한다
		tmp.insert("test_db.insert_data",bean1);
		
		return"insert_pro";
	}
	
	@GetMapping("/select")
	public String select(Model model) {
		
		// 데이터를 가져온다.
		List<DataBean> list = tmp.selectList("test_db.select_data");
		// 가져온 데이터를 request에 저장한다.
		model.addAttribute("list", list);
		
		return "select";
	}
	
	@GetMapping("/update")
	public String update() {
		DataBean bean1 = new DataBean();
		bean1.setData1("문자열1");
		bean1.setData2("문자열200");
		
		tmp.update("test_db.update_data", bean1);
		
		return "update";
	}
	
	@GetMapping("/delete")
	public String delete() {
		
		tmp.delete("test_db.delete_data", "문자열1");
		
		return "delete";
	}
}
