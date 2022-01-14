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
<title>board/board_list.jsp</title>
</head>
<body>
	<!-- 상단 메뉴 -->
	<c:import url="/WEB-INF/views/include/top_menu.jsp"/>
	
	
	<!-- 게시글 리스트 -->
	<div class='container' style='margin-top:100px'>		
		<div class='card shadow'>
			<div class='card-body'>
				<h4 class='card-title'>게시판이름</h4>
				<!-- 게시글 리스트 부분 -->
				<table class='table table-hover'>
					<thead>
						<tr>
							<th class='text-center d-none d-md-table-cell'>글번호</th>
							<th class='w-50'>제목</th>
							<th class='text-center d-none d-md-table-cell'>작성자</th>
							<th class='text-center d-none d-md-table-cell'>작성날짜</th>
						</tr>
					</thead>
					<tbody>
					
						<c:forEach begin="1" end="10">
						<tr>
							<td class='text-center d-none d-md-table-cell'>10</td>
							<td><a href='board_read.html'>글 제목 입니다</a></td>
							<td class='text-center d-none d-md-table-cell'>홍길동</td>
							<td class='text-center d-none d-md-table-cell'>2021-08-09</td>
						</tr>
						</c:forEach>
					
					</tbody>
				</table>
				
				<!-- Pagination : 페이지 번호, PC 용 -->
				<div class='d-none d-md-block'>
					<ul class='pagination justify-content-center'>
						<li class='page-item'>
							<a href='#' class='page-link'>이전</a>
						</li>
						
						<c:forEach begin="1" end="10">
						<li class='page-item'>
							<a href='#' class='page-link'>1</a>
						</li>
						</c:forEach>
						
						<li class='page-item'>
							<a href='#' class='page-link'>다음</a>
						</li>
					</ul>
				</div>		
				
				<!-- pagination - mobile -->
				<div class='d-block d-md-none'>
					<ul class='pagination justify-content-center'>
						<li class='page-item'>
							<a href='#' class='page-link'>이전</a>
						</li>
						<li class='page-item'>
							<a href='#' class='page-link'>다음</a>
						</li>
					</ul>
				</div>
				
				<!-- 글쓰기 -->
				<div class='text-right'>
					<a href='board_write.html' class='btn btn-primary'>글쓰기</a>
				</div>
			</div>
		</div>	
	</div>
	
	
	
	<c:import url="/WEB-INF/views/include/bottom_info.jsp"/>
	
</body>
</html>