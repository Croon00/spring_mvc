package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping("/board_video_list")
	public String board_video_list() {
		
		return"board/board_video_list";
	}
	
	@GetMapping("/board_product_list")
	public String board_product_list() {
		
		return"board/board_product_list";
	}
	
	@GetMapping("/board_basket")
	public String board_basket() {
		
		return"board/board_basket";
	}
	
	@GetMapping("/board_list")
	public String board_list() {
		
		return"board/board_list";
	}
	
	@GetMapping("/board_read")
	public String board_read() {
		
		return"board/board_read";
	}
	
	@GetMapping("/board_modify")
	public String board_modify() {
		
		return"board/board_modify";
	}
}
