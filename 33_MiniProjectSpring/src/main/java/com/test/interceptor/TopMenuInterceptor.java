package com.test.interceptor;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.servlet.HandlerInterceptor;

import com.test.beans.BoardBean;
import com.test.beans.UserBean;
import com.test.service.BoardService;

public class TopMenuInterceptor implements HandlerInterceptor{

	@Autowired
	private BoardService boardService;
	
	// 세션 scope로 지정된 객체를 주입받는다.
	// 이 객체에는 로그인한 사용자으 정보가 담겨져 있다.
	@Resource(name = "loginUserBean")
	@Lazy
	private UserBean loginUserBean;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		// 데이터를 가져온다
		List<BoardBean> menu_list = boardService.getBoardList();
		request.setAttribute("top_menu_list", menu_list);
		
		// 로그인 정보를 담는다.
		request.setAttribute("loginUserBean", loginUserBean);
		// 다음 단계로 진행할 수 있도록 true를 반환한다.
		return true;
	}
	
	
}
