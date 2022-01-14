<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- input_data.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>input_data</h1>

	<form:form modelAttribute="dataBean" action='input_pro' method="post">
	
		data1 : <form:input path="data1"/><br/>
			    <form:errors path="data1"/><br/>
		
		data2 : <form:input path="data2"/><br/>
				<form:errors path='data2'/><br/>
				
		<form:button>확인</form:button>
		
	</form:form>
</body>
</html>