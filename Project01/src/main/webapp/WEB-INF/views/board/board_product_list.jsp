<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!--  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<!-- BOOTSTRAP and JQuery CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
.list_repeat {
	list-style: none;
	padding-left: 0px;
}

.list_option_repeat {
	float: left;
	padding-right: 20px;
	padding-bottom: 20px;
}
</style>


</head>
<body>

	<!-- 상단 메뉴 -->
	<c:import url="/WEB-INF/views/include/top_menu.jsp" />

	<div class="container" style="margin-top: 50px; margin-bottom: 50px;">

		<div class='row'>

			<div class='col-sm-5'>
				<div class="card shadow">
					<div class="card-body">
						<h4 class="card-title">그래픽카드 상세정보</h4>
						<div class="select_list">
							<c:forEach var="option_list_ul" begin="1" end="3">
								<ul class="list_repeat">
									<c:forEach var="option_list" begin="1" end="4">
										<li class="list_option_repeat"><select name="cars">
												<option selected>브랜드</option>
												<option value="volvo">ASUS</option>
												<option value="fiat">GIGABYTE</option>
												<option value="audi">MSI</option>
										</select></li>
									</c:forEach>
								</ul>
							</c:forEach>
						</div>
					</div>
				</div>
				</div>
				<div class='col-sm-2'></div>
				<div class='col-sm-5'>
					<div class="card shadow">
						<div class="card-body">
							<h4 class="card-title">
								<a href="board_video_list">그래픽카드 관련 정보 영상</a>
							</h4>
							<div class="video_list">
								<div class="embed-responsive embed-responsive-16by9">
									<iframe width="560" height="315" 
									src="https://www.youtube.com/embed/Wk8k3I64SbU?controls=0" 
									title="YouTube video player" frameborder="0" 
									allow="accelerometer; autoplay; clipboard-write; 
									encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
								</div>
								<p style="text-align:center">최근 올라온 영상</p>
							</div>
						</div>
					</div>
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
				<h4 class="card-title">게시판 이름</h4>
				<!-- 게시글 리스트 부분 -->
				<table class="table table-hover">

					<thead>
						<tr>
							<th class="text-center d-none d-md-table-cell">상품</th>
							<th></th>
							<th class="text-center d-none d-md-table-cell">금액</th>
							<th></th>
						</tr>
					</thead>

					<tbody>
						<c:forEach var="item_list" begin="0" end="10">
							<tr>
								<td class="text-center d-none d-md-table-cell"
									style="width: 20%">
									<a href="https://www.one-pc.co.kr/shop/item.php?it_id=5565686350">
									<img src="image/rtx 3070 msi.jpg"
									alt="image" style="width: 100%" /></a></td>
								<td class="text-center d-none d-md-table-cell"
									style="width: 30%">
									<table style="width: 100%">
										<tbody>
											<tr>
												<td><a
													href="https://www.one-pc.co.kr/shop/item.php?it_id=5565686350"
													target="parent" style="font-weight: bold; font-size: 14px">
														rtx 3070 msi</a></td>
											</tr>
											<tr height="10"></tr>
											<tr>
												<td><a
													href="https://www.one-pc.co.kr/shop/item.php?it_id=5565686350"
													target="parent" style="font-weight: bold; font-size: 11px">
														어쩌구 저쩌구 설명</a></td>
											</tr>
											<tr></tr>
										</tbody>

									</table>
								</td>
								<td class="text-center d-none d-md-table-cell"
									style="width: 10%; padding-top:90px">900,000</td>

								<td class="text-center d-none d-md-table-cell"
									style="width: 40%">
									<div style="display: table; margin: auto">
										<a
											href="javascript:fitemcheck_wish('add_wish', '5565686350');">
											<img src="image/wish_btn.png" style="margin-top: 50px">
										</a> <a
											href="javascript:fitemcheck_wish('add_wish', '5565686350');">
											<img src="image/cart_btn.png" style="margin-top: 50px">
										</a> <a
											href="javascript:fitemcheck_wish('add_wish', '5565686350');">
											<img src="image/buy_btn.png" style="margin-top: 50px">
										</a>

									</div>
								<td>
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