<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- test2.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test2</h1>
	<%-- modelAttribute : 사용할 bean의 이름 --%>
	<%-- path : bean의 변수 이름 --%>
	<!-- 정보수정에서 사용 할 수 있음 -->
	<form:form modelAttribute="testBean1" action='result'>
	 data1 : <form:input path="data1"/><br/>
	 data2 : <form:input path="data2"/><br/>
	 data3 : <form:input path="data3"/><br/>
	 <button type="submit">확인</button>
	</form:form>

</body>
</html>