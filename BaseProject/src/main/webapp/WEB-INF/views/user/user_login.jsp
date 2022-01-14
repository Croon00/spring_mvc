<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- BOOTSTRAP and JQuery CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script>
	function check_input(){
		
		// 사용자가 입력한 내용을 가져온다.
		var user_id = $("#user_id").val()
		var user_pw = $("#user_pw").val()
		
		// 정규식
		// 첫글자는 영문대소문자, 나머지는 영문대소 숫자, 4 ~ 20글자
		var id_pattern =  /^[A-Za-z]{1}[A-Za-z0-9]{3,19}$/
		// 최소 8글자이며 숫자,문자,특수문자가 최소 1개씩 있어야 한다.
		var pw_pattern =  /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,}$/
		
		if(id_pattern.test(user_id) == false){
			alert("아이디는 영문으로시작하고 영문과 숫자, 4 ~ 20글자를 허용합니다")
			$("#user_id").val('')
			$("#user_id").focus()
			return false
		}
		
		
		if(pw_pattern.test(user_pw) == false){
			alert("비밀번호는 8글자 이상이며, 영문,숫자,특수문자를 포함해야 합니다")
			$("#user_pw").val('')
			$("#user_pw").focus()
			return false
		}
	
		return true
	}
</script>

<title>user/user_login.jsp</title>
</head>
<body>
	<!-- 상단 메뉴 -->
	<c:import url="/WEB-INF/views/include/top_menu.jsp"/>
	
	<div class='container' style='margin-top:100px'>
	
		<div class='row'>
			<div class='col-sm-3'></div>
			<div class='col-sm-6'>
				<div class='card shadow'>
					<div class='card-body'>
					
						<c:if test="${chk == true }">
						<!-- 로그인 실패시 보여줄 alert -->
						<div class='alert alert-danger'>
							<h3>로그인 실패</h3>
							<p>아이디와 비밀번호를 확인해주세요</p>
						</div>
						</c:if>
						
						
						<!-- id 비밀번호 입력하는 곳 -->
						<form action='user_login_pro' method='post' onsubmit='return check_input()'>
							<div class='form-group'>
								<label for='user_id'>아이디</label>
								<input type='text' id='user_id' name='user_id' class='form-control'/>
							</div>
							<div class='form-group'>
								<label for='user_pw'>비밀번호</label>
								<input type='password' id='user_pw' name='user_pw' class='form-control'/>
							</div>
							<div class='form-group'>
								<div class='text-right'>
									<button type='submit' class='btn btn-primary'>로그인</button>
									<a href='user_join' class='btn btn-info'>회원가입</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class='col-sm-3'></div>
		</div>
	
	</div>
	
	<p style='margin-bottom:200px'>&nbsp;</p>
	
	<c:import url="/WEB-INF/views/include/bottom_info.jsp"/>
	
</body>
</html>
	