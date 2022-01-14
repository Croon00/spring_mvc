<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%-- index.jsp --%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index</h1>
	
	<form action="test1" method="post">
		text : <input type='text' name='data1'/><br/>
		textarea : <textarea name="data2"></textarea><br/>
		password : <input type='password' name='data3'/><br/>
		select : <select name='data4'>
					<option value='100'>100</option>
					<option value='200'>200</option>
					<option value='300'>300</option>
				 </select>
				 <br/>
		checkbox : <input type='checkbox' name="data5" value="100"/>check1<br/>
		checkbox : <input type='checkbox' name="data5" value="200"/>check2<br/>
		checkbox : <input type='checkbox' name="data5" value="300"/>check3<br/>
		
		radio : <input type='radio' name='data6' value='100' checked="checked">radio<br/>
		radio : <input type='radio' name='data6' value='200'>radio2<br/>
		radio : <input type='radio' name='data6' value='300'>radio3<br/>
		
		<button type='submit'>확인</button>
		<button type='reset'>취소</button>
	</form>
</body>
</html>