<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- test3.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%-- Model에 저장한 데이터는 requestScope로 사용하면 된다. --%>
	<h1>test3</h1>
	<h3>data3 : ${requestScope.data3 }</h3>
	<h3>data3 : ${requestScope.data4 }</h3>
</body>
</html>