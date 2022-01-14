<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!--  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result3</h1>
	
	<h3>request sessionBean2 : ${requestScope.sessionBean2.data1 }</h3>
	<h3>request sessionBean2 : ${requestScope.sessionBean2.data2 }</h3>
	<h3>request sessionBean3 : ${requestScope.sessionBean3.data1 }</h3>
	<h3>request sessionBean3 : ${requestScope.sessionBean3.data2 }</h3>

	<hr/>
	
	<h3>session sessionBean2 : ${sessionScope.sessionBean2.data1 }</h3>
	<h3>session sessionBean2 : ${sessionScope.sessionBean2.data2 }</h3>
	<h3>session sessionBean3 : ${sessionScope.sessionBean3.data1 }</h3>
	<h3>session sessionBean3 : ${sessionScope.sessionBean3.data2 }</h3>
</body>
</html>