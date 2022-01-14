<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- test1.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	
	<form action='result' method='post'>
		text : <input type='text' id='data1' name='data1' value='${requestScope.testBean.data1 }'/>
		<br/>
		password : <input type='password' id='data2' name='data2' value='${requestScope.testBean.data2 }'/>
		<br/>
		textarea : <textarea id='data3' name='data3'>${requestScope.testBean.data3 }</textarea>
		<br/>
		<input type='hidden' id='data4' name='data4' value='${requestScope.testBean.data4 }'/>
		select : <select id='data5' name='data5'>
			<c:choose>
				<c:when test="${requestScope.testBean.data5 =='value1' }">
					<option value='value1' selected="selected">항목1</option>
					<option value='value2'>항목2</option>
					<option value='value3'>항목3</option>
				</c:when>
				<c:when test="${requestScope.testBean.data5 =='value2' }">
					<option value='value1'>항목1</option>
					<option value='value2' selected="selected">항목2</option>
					<option value='value3'>항목3</option>
				</c:when>
				<c:when test="${requestScope.testBean.data5 =='value3' }">
					<option value='value1'>항목1</option>
					<option value='value2'>항목2</option>
					<option value='value3' selected="selected">항목3</option>
				</c:when>
			</c:choose>
		</select>
		
	</form>
	
	<hr/>
	
	<!-- path의 값이 id/name에 들어가게 되고 value 값이 testBean의 객체의 값을 받아온다. -->
	<form:form action='result' modelAttribute="testBean">
		text : <form:input path='data1'/><br/>
		<!-- 값을 셋팅 기본적으로 안 해주고 showPassword를 해주어야 값을 보여줌 -->
		password : <form:password path='data2' showPassword="true"/><br/>
		textarea : <form:textarea path="data3"/><br/>
		<!-- 글 수정할 때 변경되면 안되는 것들 혹은 이전 버튼 -> 사용자가 수정하면 안되는 값-->
		<form:hidden path="data4"/><br/>
		<%-- option의 value가 data5와 같은 것에 selected가 설정된다. --%> 
		select : <form:select path="data5">
					<form:option value="value1">항목1</form:option>
					<form:option value="value2">항목2</form:option>
					<form:option value="value3">항목3</form:option>
					
		</form:select>
		<br/>
					<%--path에 설정된 리스트에 value 속성값이 있으면 checked가 설정된다. --%>
		checkbox : <form:checkbox path="data6" value='check1'/>check1<br/>
				   <form:checkbox path="data6" value='check2'/>check2<br/>
				   <form:checkbox path="data6" value='check3'/>check3<br/>
				   <form:checkbox path="data6" value='check4'/>check4<br/>
		<br/>
		<%-- value 속성값과 data7의 값이 같은 것에만 checked가 설정된다. --%>
		radio : <form:radiobutton path="data7" value='radio1'/>radio1<br/>
			    <form:radiobutton path="data7" value='radio2'/>radio2<br/>
			    <form:radiobutton path="data7" value='radio3'/>radio3<br/>
	</form:form>

</body>
</html>