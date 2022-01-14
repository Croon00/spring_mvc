<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%-- index.jsp --%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index</h1>
	
	<!-- 요청과 관련된 정보를 가짐 ->request객체가 가진 정보 -->
	<a href="test1?data=100&data2=200">test1</a></br>
	
	<hr/>
	
	<a href='test2'>HttpServletRequest 사용</a></br>
	
	<hr/>
	
	<a href="test3">Model 사용</a><br/>
	
	<a href='test4'>ModelAndView 사용</a></br>
</body>
</html>





