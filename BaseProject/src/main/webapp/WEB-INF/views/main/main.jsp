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
	
	<!-- 게시판 리스트 -->
	<div class="container" style="margin-top:100px">
		<!-- 12칸의 길이를 반반 씩 나눔 -->
		
		<div class="row">
		
		<%-- 게시판의 수 만큼 반복한다. --%>
			<c:forEach begin="1" end="1">
			
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
							<%-- 5번 반복한다. --%>
							<c:forEach begin="1" end="5">
								<tr>
									<td class="text-center">5</td>
									<td><a href="board_read">제목입니다</a></td>
									<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
								</tr>
							</c:forEach>
							
						</tbody>	
					</table>
					
					<div class="text-right">
						<a href="board_list" class="btn btn-primary">더보기</a>
					</div>
				</div>
			</div>
			</div>
			
			
			</c:forEach>
			
		
		</div>
	
	</div>
	
	<!-- 하단 정보 부분 -->
	<c:import url="/WEB-INF/views/include/bottom_info.jsp"/>

</body>
</html>