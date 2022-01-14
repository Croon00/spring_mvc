<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- 상단 메뉴 -->
<nav
	class="navbar bg-green navbar-green navbar-expand-md fixed-top shadow-lg">
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
					<a class="dropdown-item" href="board_list">CPU</a> <a
						class="dropdown-item" href="board_list">메인보드</a> <a
						class="dropdown-item" href="board_list">그래픽카드</a> <a
						class="dropdown-item" href="board_list">메모리</a> <a
						class="dropdown-item" href="board_list">SSD</a> <a
						class="dropdown-item" href="board_list">하드디스크</a> <a
						class="dropdown-item" href="board_list">파워</a> <a
						class="dropdown-item" href="board_list">쿨러</a> <a
						class="dropdown-item" href="board_list">케이스</a>
				</div></li>

			<li class="nav-item"><a href="board_list" class="nav-link">모니터</a></li>
			<li class="nav-item"><a href="board_list" class="nav-link">영상게시판</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbardrop"
				data-toggle="dropdown"> 커뮤니티 </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="board_list">요청 게시판</a> <a
						class="dropdown-item" href="board_list">공지사항</a> <a
						class="dropdown-item" href="board_list">이벤트</a>
				</div>
			<li class="nav-item"><a href="#" class="nav-link">스포츠 게시판</a></li>
		</ul>
		<!-- 우측 메뉴 -->
		<ul class="navbar-nav ml-auto">
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbardrop"
				data-toggle="dropdown"> 고객 센터 </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">FAQ</a> <a class="dropdown-item"
						href="#">1:1 고객문의</a>
				</div></li>
			<li class="nav-item"><a href="user_bucket.html" class="nav-link">장바구니</a></li>
			<li class="nav-item"><a href="user_modify.html" class="nav-link">정보수정</a></li>
			<li class="nav-item"><a href="user_login" class="nav-link">로그인</a></li>
			<li class="nav-item"><a href="user_join.html" class="nav-link">회원가입</a></li>
		</ul>
	</div>
</nav>