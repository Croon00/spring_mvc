package com.test.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.beans.BoardBean;
import com.test.beans.ContentBean;
import com.test.service.BoardService;

@Controller
public class MainController {
	
	@Autowired
	private BoardService boardService;
	
	
	// main
	@GetMapping("/main")
	public String main(Model model) {
		
		// 게시판 정보를 가져온다.
		List<BoardBean> board_list = boardService.getBoardList();
		model.addAttribute("board_list", board_list);
		
		// 상위 5개의 데이터를 담을 Map
		HashMap<String, List<ContentBean>> map1 = new HashMap<String, List<ContentBean>>();
		
		// 게시판의 수 마늠 반복한다.
		for(BoardBean bean1 : board_list) {
			// 상위 5개를 가져온다.
			List<ContentBean> list1 = boardService.top5_list(bean1.getBoard_idx());
			// 해시맵에 담는다.
			map1.put(bean1.getBoard_name(), list1);
		}
		
		model.addAttribute("top5_map", map1);
		
		return "main/main";
	}
	
	
}
