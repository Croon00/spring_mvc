<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- test1.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	
	<h3>aaa.a1 : <spring:message code='aaa.a1'/></h3>
	<h3>bbb.b1 : <spring:message code='bbb.b1'/></h3>
	<h3>aaa.a2 : <spring:message code='aaa.a2' arguments="${args }"/></h3>
	<h3>kkk.k1 : <spring:message code='kkk.k1'/></h3>
</body>
</html>