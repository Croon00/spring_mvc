package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	// 게시글 리스트
	@GetMapping("/board_list")
	public String board_list(){
		return "board/board_list";
	}
}
