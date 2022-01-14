<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- test2.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test2</h1>
	<!-- request와 session에 데이터 값의 이름이 중복 되는 경우 request의 값만 호출됨 -->
	<!-- requestScope.는 생략이 가능하지만 명시해 놓으면 범위를 정해줌 -->
	<h3>data1 : ${requestScope.data1 }</h3>
	<h3>data2 : ${requestScope.data2 }</h3>
</body>
</html>