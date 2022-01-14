<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- inert.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>insert</h1>
	
	<form action="insert_pro" method="post">
		data1 : <input type="text" name="data1"/><br/>
		data2 : <input type="text" name="data2"/><br/>
		data3 : <input type="text" name="data3"/><br/>
		
		<button type="submit">저장하기</button>
		
	</form>	
	

</body>
</html>