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
	<nav
		class="navbar bg-dark navbar-dark navbar-expand-md fixed-top shadow-lg">
		<!-- 좌측 로고 -->
		<a class="navbar-brand" href="index.html">JICA</a>
		<!-- 모바일 페이지일 경우 메뉴를 토글 시키는 버튼 -->
		<!-- data-target에 설정한 부분이 토글된다. -->
		<button class=navbar-toggler type="button" data-toggle="collapse"
			data-target="#navMenu">
			<span class="navbar-toggler-icon"></span>
		</button>

		<!-- 메뉴 항목 -->
		<div id="navMenu" class="collapse navbar-collapse">
			<!-- 좌측 메뉴 -->
			<ul class="navbar-nav">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> 주요 부품 </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="board_list.html">CPU</a> 
						<a class="dropdown-item" href="board_list.html">메인보드</a> 
						<a class="dropdown-item" href="board_list.html">그래픽카드</a>
						<a class="dropdown-item" href="board_list.html">메모리</a>
						<a class="dropdown-item" href="board_list.html">SSD</a>
						<a class="dropdown-item" href="board_list.html">하드디스크</a>
						<a class="dropdown-item" href="board_list.html">파워</a>
						<a class="dropdown-item" href="board_list.html">쿨러</a>
						<a class="dropdown-item" href="board_list.html">케이스</a>
					</div></li>
					
				<li class="nav-item"><a href="board_list.html" class="nav-link">모니터</a></li>
				<li class="nav-item"><a href="board_list.html" class="nav-link">영상 게시판</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> 커뮤니티 </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="board_list.html">요청 게시판</a> 
						<a	class="dropdown-item" href="board_list.html">공지사항</a> 
						<a	class="dropdown-item" href="board_list.html">이벤트</a>
						
					
				<li class="nav-item"><a href="#" class="nav-link">스포츠 게시판</a></li>


			</ul>
			<!-- 우측 메뉴 -->
			<ul class="navbar-nav ml-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbardrop"
					data-toggle="dropdown"> 고객 센터 </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="#">FAQ</a> 
						<a class="dropdown-item" href="#">1:1 고객문의</a> 
					</div></li>
				<li class="nav-item"><a href="user_bucket.html" class="nav-link">장바구니</a></li>
				<li class="nav-item"><a href="user_modify.html" class="nav-link">정보수정</a></li>
				<li class="nav-item"><a href="user_login.html" class="nav-link">로그인</a></li>
				<li class="nav-item"><a href="user_join.html" class="nav-link">회원가입</a></li>
			</ul>
		</div>
	</nav>
	
	
	<!-- 게시판 리스트 -->
	<div class="container" style="margin-top:100px">
		<!-- 12칸의 길이를 반반 씩 나눔 -->
		
		<div class="row">
			<div class="col-lg-6" style="margin-top:20px">
			
			<div class="card shadow">
				<div class="card-body">
					<h4 class="card-title">자유 게시판</h4>
					<!-- 테이블 -->
					<table class="table table-hover">
						<!-- 표의 제목 부분 -->
						<thead>
							<tr>
								<!-- w-25 : 가로길이 25% 정도를 차지하게 한다. -->
								<!-- d-none : 제거한다 -->
								<!-- d-xl-table-cell : 브라우저 길이에 따라 보이게 한다. -->
								<th class="text-center w-25">글번호</th>
								<th>제목</th>
								<th class="text-center w-25 d-none d-xl-table-cell">작성 날짜</th>
							</tr>
						</thead>
						<!-- 표의 항목 부분 -->
						<tbody>
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
						</tbody>
					</table>
					
					<a href="#" class="btn btn-primary">더보기</a>
					
				</div>
			</div>
			</div>
			
			
			<div class="col-lg-6" style="margin-top:20px">
			
			<div class="card shadow">
				<div class="card-body">
					<h4 class="card-title">자유 게시판</h4>
					<!-- 테이블 -->
					<table class="table table-hover">
						<!-- 표의 제목 부분 -->
						<thead>
							<tr>
								<!-- w-25 : 가로길이 25% 정도를 차지하게 한다. -->
								<!-- d-none : 제거한다 -->
								<!-- d-xl-table-cell : 브라우저 길이에 따라 보이게 한다. -->
								<th class="text-center w-25">글번호</th>
								<th>제목</th>
								<th class="text-center w-25 d-none d-xl-table-cell">작성 날짜</th>
							</tr>
						</thead>
						<!-- 표의 항목 부분 -->
						<tbody>
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
						</tbody>
					</table>
					
					<a href="#" class="btn btn-primary">더보기</a>
					
				</div>
			</div>
			</div>
			
			<div class="col-lg-6" style="margin-top:20px">
			
			<div class="card shadow">
				<div class="card-body">
					<h4 class="card-title">자유 게시판</h4>
					<!-- 테이블 -->
					<table class="table table-hover">
						<!-- 표의 제목 부분 -->
						<thead>
							<tr>
								<!-- w-25 : 가로길이 25% 정도를 차지하게 한다. -->
								<!-- d-none : 제거한다 -->
								<!-- d-xl-table-cell : 브라우저 길이에 따라 보이게 한다. -->
								<th class="text-center w-25">글번호</th>
								<th>제목</th>
								<th class="text-center w-25 d-none d-xl-table-cell">작성 날짜</th>
							</tr>
						</thead>
						<!-- 표의 항목 부분 -->
						<tbody>
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
						</tbody>
					</table>
					
					<a href="#" class="btn btn-primary">더보기</a>
					
				</div>
			</div>
			</div>
			
			<div class="col-lg-6" style="margin-top:20px">
			
			<div class="card shadow">
				<div class="card-body">
					<h4 class="card-title">자유 게시판</h4>
					<!-- 테이블 -->
					<table class="table table-hover">
						<!-- 표의 제목 부분 -->
						<thead>
							<tr>
								<!-- w-25 : 가로길이 25% 정도를 차지하게 한다. -->
								<!-- d-none : 제거한다 -->
								<!-- d-xl-table-cell : 브라우저 길이에 따라 보이게 한다. -->
								<th class="text-center w-25">글번호</th>
								<th>제목</th>
								<th class="text-center w-25 d-none d-xl-table-cell">작성 날짜</th>
							</tr>
						</thead>
						<!-- 표의 항목 부분 -->
						<tbody>
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
							
							<tr>
								<td class="text-center">5</td>
								<td><a href="#">제목입니다</a></td>
								<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
							</tr>
						</tbody>
					</table>
					
					<a href="#" class="btn btn-primary">더보기</a>
					
				</div>
			</div>
			</div>
		</div>
	
	</div>
	
	<div class="container-fluid bg-dark text-white" 
		 style="margin-top:100px; padding-top:30px; padding-bottom:30px;">
		<div class="container">
			<p>https://jica.kr</p>
			<p>게시판 예제</p>
			<p>전화번호 : 010-0000-2222</p>
		</div>
		
	</div>

</body>
</html>