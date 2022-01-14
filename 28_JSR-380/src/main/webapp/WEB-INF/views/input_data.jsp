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

	<form:form modelAttribute="dataBean" action='input_pro'>
		
		data1 : <form:input path="data1"/><br/>
			    <form:errors path="data1"/><br/>
			    
		data2 : <form:input path="data2"/><br/>
				<form:errors path="data2"/><br/>
		
		data3 : <form:input path="data3"/><br/>
				<form:errors path="data3"/><br/>
		
		data4 : <form:input path="data4"/><br/>
				<form:errors path="data4"/><br/>
				
		data5 : <form:input path="data5"/><br/>
				<form:errors path="data5"/><br/>
				
		data6 : <form:input path="data6"/><br/>
			    <form:errors path="data6"/><br/>
		
		data7 : <form:input path="data7"/><br/>
				<form:errors path="data7"/><br/>
				
		<form:button>확인</form:button>
		
		
	</form:form>
</body>
</html>