<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- test1.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 파라미터를 출력할 때는 param을 사용한다.-> 원래 servlet에서 사용 가능 -->
	<!-- 모든 웹페이지는 사용자가 주소를 직접 입력 가능. data1과 data2를 셋팅 안하고 요청 할 때 문제 -->
	<h1>test1</h1>
	<h3>data1 : ${param.data1 }</h3>
	<h3>data2 : ${param.data2 }</h3>
</body>
</html>