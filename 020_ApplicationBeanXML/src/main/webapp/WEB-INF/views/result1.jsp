<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- result1.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result1</h1>
	
	<h3>application data1 : ${requestScope.applicationBean1.data1 }</h3>
	<h3>application data2 : ${requestScope.applicationBean1.data2 }</h3>
	
	<h3>application data3 : ${applicationScope.applicationBean2.data3 }</h3>
	<h3>application data4 : ${applicationScope.applicationBean2.data4 }</h3>
	
	<h3>application data5 : ${requestScope.applicationBean3.data5 }</h3>
	<h3>application data6 : ${requestScope.applicationBean3.data6 }</h3>
	
	<h3>application data7 : ${requestScope.applicationBean4.data7 }</h3>
	<h3>application data8 : ${requestScope.applicationBean4.data8 }</h3>
</body>
</html>










