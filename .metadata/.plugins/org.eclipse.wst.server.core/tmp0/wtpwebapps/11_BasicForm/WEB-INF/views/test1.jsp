<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- test1.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	
	<h3>data1 : ${requestScope.dataBean.data1 }</h3>
	<h3>data2 : ${requestScope.dataBean.data2 }</h3>
	<h3>data3 : ${requestScope.dataBean.data3 }</h3>
	<h4>data4 : ${requestScope.dataBean.data4 }</h4>
	
	<!-- str1 이름으로 페이지 영역에 저장 for문 대신에 태그형태로 반복문-> jstl 	-->
	<c:forEach var='str1' items="${requestScope.dataBean.data5 }">
	<h3>data5 : ${str1 }</h3>
	</c:forEach>
	
	<h3>data6 : ${requestScope.dataBean.data6 }</h3>

</body>
</html>