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
	
	<a href='test1?data1=100&data2=200&data3=300&data3=400'>get 요청</a><br/>
	
	<hr/>

	<form action='test2' method='post'>
		<input type='text' name='data1'/><br/>
		<input type='text' name='data2'/><br/>
		
		<input type='checkbox' name='data3' value='300'/>300<br/>
		<input type='checkbox' name='data3' value='400'/>400<br/>
		
		<button type='submit'>post 요청</button>
	</form>
	
	<hr/>
	
	<a href='test3?data1=100&data2=200&data3=300&data3=400'>get 요청2</a><br/>
	
	<hr/>

	<form action='test4' method='post'>
		<input type='text' name='data1'/><br/>
		<input type='text' name='data2'/><br/>
		
		<input type='checkbox' name='data3' value='300'/>300<br/>
		<input type='checkbox' name='data3' value='400'/>400<br/>
		
		<button type='submit'>post 요청2</button>
	</form>
	
	<hr/>
	
	<a href='test5/100/200/300'>path value 1</a><br/>
	<a href='test5/1000/2000/3000'>path value 2</a><br/>
	
	
	<a href='test6?data1=100&data2=200&data3=300&data3=400'>get 요청3</a><br/>
	
	<hr/>

	<form action='test7' method='post'>
		<input type='text' name='data1'/><br/>
		<input type='text' name='data2'/><br/>
		
		<input type='checkbox' name='data3' value='300'/>300<br/>
		<input type='checkbox' name='data3' value='400'/>400<br/>
		
		<button type='submit'>post 요청3</button>
	</form>
	
	<hr/>
	<a href='test8?data1=100&data2=200&data3=300&data3=400'>get 요청4</a><br/>
	
	<hr/>
	<a href='test9?data1=100'>get 요청5</a><br/>
	
</body>
</html>