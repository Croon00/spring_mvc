<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- result.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result1</h1>
	
	<h3>session data1 : ${requestScope.sessionBean1.data1 }</h3>
	<h3>session data2 : ${requestScope.sessionBean1.data2 }</h3>
	
	<h3>session data3 : ${requestScope.sessionBean2.data3 }</h3>
	<h3>session data4 : ${requestScope.sessionBean2.data4 }</h3>
	
	<h3>session data5 : ${requestScope.sessionBean3.data5 }</h3>
	<h3>session data6 : ${requestScope.sessionBean3.data6 }</h3>
	
	<h3>session data7 : ${requestScope.sessionBean4.data7 }</h3>
	<h3>session data8 : ${requestScope.sessionBean4.data8 }</h3>

</body>
</html>