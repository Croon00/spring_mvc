<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- BOOTSTRAP and JQuery CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<title>index</title>
</head>
<body>
	<!-- 상단 메뉴 -->
	<c:import url="/WEB-INF/views/include/top_menu.jsp"/>
	
	<div class="container" style="margin-top:100px">
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
				<div class="card shadow">
					<div class="card-body">
						<!-- 로그인 실패시 보여줄 alert -->
						<div class="alert alert-danger">
							<h3>로그인 실패</h3>
							<p>아이디와 비밀번호를 확인해주세요</p>
						</div>
						<!-- id 비밀번호 입력하는 곳 -->
						<form action="index.html" method="post">
						
							<div class="form-group">
								<label for="user_id">아이디</label>
								<input type="text" id="user_id" name="user_id" class="form-control"/>
							</div>
							
							<div class="form-group">
								<label for="user_pw">비밀번호</label>
								<input type="password" id="user_pw" name="user_pw" class="form-control"/>
							</div>
							
							<div class="form-group">
								<div class="text-right">
								<button type="submit" class="btn btn-primary">로그인</button>
								<a href="user_join.html" class="btn btn-info">회원가입</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="col-sm-3"></div>
		</div>
		
	</div>
	
	
	<p style="margin-bottom:200px">&nbsp;</p>
	<c:import url="/WEB-INF/views/include/bottom_info.jsp"/>
		

</body>
</html>