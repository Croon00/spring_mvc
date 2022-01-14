<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!--  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<!-- BOOTSTRAP and JQuery CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>

	<!-- 상단 메뉴 -->
	<c:import url="/WEB-INF/views/include/top_menu.jsp" />


	<div class="container" style="margin-top: 50px">
		<!-- Grid row -->
		<div class="row">

			<!-- Grid column -->
			<div class="col-md-12 mb-4">

				<button type="button" class="btn btn-primary px-3">
					<img src="image/cpu_btn.png">
				</button>
				<button type="button" class="btn btn-info px-3">
					<img src="image/vga_btn.png">
				</button>
				<button type="button" class="btn btn-secondary px-3">
					<img src="image/ssd_btn.png">
				</button>
				<button type="button" class="btn btn-success px-3">
					<img src="image/ram_btn.png">
				</button>
				<button type="button" class="btn btn-info px-3">
					<img src="image/mb_btn.png">
				</button>
				<button type="button" class="btn btn-warning px-3">
					<img src="image/power_btn.png">
				</button>
				<button type="button" class="btn btn-danger px-3">
					<img src="image/moniter_btn2.png">
				</button>
				<button type="button" class="btn btn-danger px-3">
					<img src="image/case_btn.png">
				</button>

			</div>
		</div>

	</div>

	<div class='container' style="margin-top: 20px;">

		<div class='row'>

			<div class='col-sm-4'></div>
			<div class='col-sm-6'>
				<form class="form-inline md-form mr-auto mb-4">
					<input class="form-control mr-sm-2" type="text"
						placeholder="상세정보 입력" aria-label="Search">
					<button class="btn btn-outline-warning btn-rounded btn-sm my-0"
						type="submit">Search</button>
				</form>
			</div>
			<div class='col-sm-3'></div>
		</div>
	</div>

	<!-- 게시글 리스트 -->
	<div class="container">
		<div class="card shadow">
			<div class="card-body">
				<h4 class="card-title">영상 게시판</h4>


				<!-- 게시글 리스트 부분 -->
				<table class="table table-hover">

					<thead>
						<tr>
							<th class="text-center d-none d-md-table-cell">영상 종류</th>
							<th class="text-center d-none d-md-table-cell">영상/제목</th>
						</tr>
					</thead>

					<tbody>
						<c:forEach var="viedo_list" begin="1" end="10">
						<tr>
							<td class="text-center d-none d-md-table-cell" style="width:20%">
								<img src="image/cpu_btn.png" class=bg-primary alt="btn" style="margin-top:200px">
							<td class="text-center d-none d-md-table-cell" style="width:80%">
								<h3 style="text-align:center">제목입니다</h3>
								<div class="embed-responsive embed-responsive-16by9">
									<iframe width="560" height="315"
										src="https://www.youtube.com/embed/rQcE_GMUCaU"
										title="YouTube video player" frameborder="0"
										allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
										allowfullscreen></iframe>
								</div>

						</tr>
						</c:forEach>
					</tbody>
				</table>

				<!-- Pagination : 페이지 번호, PC 용 -->
				<div class="d-none d-md-block">
					<ul class="pagination justify-content-center">
						<li class="page-item"><a href="#" class="page-link">이전</a></li>
						<li class="page-item"><a href="#" class="page-link">1</a>
						<li class="page-item"><a href="#" class="page-link">2</a></li>
						<li class="page-item"><a href="#" class="page-link">3</a></li>
						<li class="page-item"><a href="#" class="page-link">다음</a></li>
					</ul>

				</div>

				<!-- pagination - mobile -->
				<div class="d-black d-md-none">
					<ul class="pagination justify-content-center">
						<li class="page-item"><a href="#" class="page=link">이전</a></li>
						<li class="page-item"><a href="#" class="page=link">다음</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>


	<c:import url="/WEB-INF/views/include/bottom_info.jsp" />

</body>
</html>