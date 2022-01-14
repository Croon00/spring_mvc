<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- result2.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result2</h1>
	
	<h3>sessionBean1.data1 : ${sessionScope.sessionBean1.data1 }</h3>
	<h3>sessionBean1.data2 : ${sessionScope.sessionBean1.data2 }</h3>

</body>
</html>