<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- test1.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	<%-- 입력 요소의 value 속성에 값을 넣어주면 화면이 구성될 때 값이 설정된 상태가 된다. --%>
	<form action='result' method='post'>
		data1 = <input type='text' name='data1' value='${requestScope.dataBean.data1 }'/>
		<br/>
		data2 = <input type='text' name='data2' value='${requestScope.dataBean.data2 }'/>
		<br/>
		data3 = <input type='text' name='data3' value='${requestScope.dataBean.data3 }'/>
		<br/>
		<button type='button'>확인</button>
	</form>
</body>
</html>