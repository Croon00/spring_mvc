<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<nav
	class='navbar bg-dark navbar-dark navbar-expand-md fixed-top shadow-lg'>
	<!-- 좌측 로고 -->
	<a class='navbar-brand' href='main'>JICA</a>
	<!-- 모바일 페이지일 경우 메뉴를 토글 시키는 버튼 -->
	<!-- data-target에 설정한 부분이 토글된다. -->
	<button class=navbar-toggler type='button' data-toggle='collapse'
		data-target='#navMenu'>
		<span class='navbar-toggler-icon'></span>
	</button>
	
	<!-- 메뉴 항목 -->
	<div id='navMenu' class='collapse navbar-collapse'>
		<!-- 좌측 메뉴 -->
		<ul class='navbar-nav' >

			<c:forEach var="abc" items="${top_menu_list }">
				<li class="nav-item">

				<a href="board_list?board_idx=${abc.board_idx }" class="nav-link">${abc.board_name }</a>
				</li>
			</c:forEach>

		</ul>
		<!-- 우측 메뉴 -->
		<ul class='navbar-nav ml-auto'>

			<c:choose>
				<%-- 로그인 상태라면 --%>
				<c:when test="${loginUserBean.check_login == true}">
					<li class='nav-item'><a href='user_modify' class='nav-link'>정보수정</a>
					</li>
					<li class='nav-item'><a href='user_logout' class='nav-link'>로그아웃</a>
					</li>
				</c:when>
				<%-- 로그인 상태가 아니라면 --%>
				<c:otherwise>
					<li class='nav-item'><a href='user_login' class='nav-link'>로그인</a>
					</li>
					<li class='nav-item'><a href='user_join' class='nav-link'>회원가입</a>
					</li>
				</c:otherwise>
			</c:choose>


		</ul>
	</div>

</nav>
