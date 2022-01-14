<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- input_data.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>input_data</h1>
	<form action='input_pro' method='post'>
		data1 : <input type='text' name='data1'/><br/>
		<%-- 만약 testBean에 대해 유효성 검사가 실패했다면 --%>
		<spring:hasBindErrors name="testBean">
			<%-- 만약 data1이 유효성 검사에 실패했다면 --%>
			<c:if test="${errors.hasFieldErrors('data1') }">
				<%-- 에러 메시지를 보여준다. --%>
				${errors.getFieldError('data1').defaultMessage }<br/>
			</c:if>
		</spring:hasBindErrors>
		
		
		data2 : <input type='text' name='data2'/><br/>
		<%-- 만약 testBean에 대해 유효성 검사가 실패했다면 --%>
		<spring:hasBindErrors name="testBean">
			<%-- 만약 data2이 유효성 검사에 실패했다면 --%>
			<c:if test="${errors.hasFieldErrors('data2') }">
				<%-- 에러 메시지를 보여준다. --%>
				${errors.getFieldError('data2').defaultMessage }<br/>
			</c:if>
		</spring:hasBindErrors>
		
		<button type='submit'>확인</button>
	</form>
</body>
</html>
