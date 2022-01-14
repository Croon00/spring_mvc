package com.test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("*.mvc")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 요청한 주소를 가져온다.
		String url = request.getRequestURI();
//		System.out.println(url);
		
		// 사용할 jsp의 이름을 담을 변수
		String viewName = null;
		
		if(url.contains("main.mvc")) {
			viewName = "main.jsp";
		} else if (url.contains("test1.mvc")) {
			viewName = "test1.jsp";
		} else if (url.contains("test2.mvc")) {
			viewName = "test2.jsp";
		}
		
		// 코드의 흐름을 viewName 변수에 들어 있는 jsp로 이동시킨다.
		RequestDispatcher dis = request.getRequestDispatcher(viewName);
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
