package com.test.interceptor;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.servlet.HandlerInterceptor;

import com.test.beans.ContentBean;
import com.test.beans.UserBean;
import com.test.service.BoardService;

public class WriterCheckInterceptor implements HandlerInterceptor {
	
	// 사용자 로그인 정보 객체 주입
	@Resource(name = "loginUserBean")
	@Lazy
	private UserBean loginUserBean;
	
	// BoardService를 주입
	@Autowired
	private BoardService boardService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		// 게시글 번호를 추출한다.
		String data1 = request.getParameter("content_idx");
		int content_idx = Integer.parseInt(data1);
		
		// 게시글 정보를 가져온다.
		ContentBean bean1 = boardService.getContentData(content_idx);
		
		// 작성자와 로그인한 사람이 같은지 확인한다.
		if(bean1.getContent_writer_idx() != loginUserBean.getUser_idx()) {
			
			request.setAttribute("msg", "잘못된 접근입니다.");
			request.setAttribute("url", "main");
			
			String path = "/WEB-INF/views/main/message.jsp";
			RequestDispatcher dis = request.getRequestDispatcher(path);
			dis.forward(request, response);
			return false;
		}
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
		
		
	}

	
}
