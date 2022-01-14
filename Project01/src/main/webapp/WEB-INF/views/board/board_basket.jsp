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
</head>
<body>

	<!-- 상단 메뉴 -->
	<c:import url="/WEB-INF/views/include/top_menu.jsp" />

	<!-- 게시글 리스트 -->
	<div class="container" style="margin-top: 100px">
		<div class="card shadow">
			<div class="card-body">
				<h4 class="card-title">장바구니</h4>
				<!-- 게시글 리스트 부분 -->
				<table class="table table-hover">

					<thead>
						<tr>
							<th class="text-center d-none d-md-table-cell">
								<div class="form-check" style="padding-bottom:15px">
									<label class="form-check-label"> 
									<input type="checkbox"
										class="form-check-input" value="">
									</label>
								</div>
							</th>
							<th class="text-center d-none d-md-table-cell">상품명</th>
							<th class="text-center d-none d-md-table-cell">상품금액</th>
							<th class="text-center d-none d-md-table-cell">수량</th>
							<th class="text-center d-none d-md-table-cell">주문금액</th>
							<th class="text-center d-none d-md-table-cell">삭제</th>

						</tr>
					</thead>

					<tbody>
						<tr>
							<td class="text-center d-none d-md-table-cell">
								<div class="form-check" style="padding-top:15px">
									<label class="form-check-label"> <input type="checkbox"
										class="form-check-input" value="">
									</label>
								</div>
							</td>
							<td class="text-center d-none d-md-table-cell" style="width: 30%">
								<table style="width: 100%">
									<tbody>
										<tr>
											<td><img src="image/rtx 3070 msi.jpg"
												style="width: 100%; width: 70px; height: 70px; margin-right:30px;"> <a
												href="https://www.one-pc.co.kr/shop/item.php?it_id=5565686350"
												target="parent" style="font-weight: bold; font-size: 14px; 	">
													rtx 3070 msi</a></td>
										</tr>
										<tr height="10"></tr>
										<tr></tr>
									</tbody>
								</table>
							</td>
							<td class="text-center d-none d-md-table-cell" style="padding-top:50px"><img
								src="image/sell_card.jpg" alt="sell"> 200,000원</td>
							<td class="text-center d-none d-md-table-cell"></td>
							<td class="text-center d-none d-md-table-cell" style="padding-top:50px">200,000원</td>
							<td class="text-center d-none d-md-table-cell" style="padding-top:50px"><a href="./cartupdate.php?w=d&amp;it_id=5565687092&amp;ct_id=168955"
								onfocus="blur();"><img src="image/cart_del_btn.jpg"></a>
								
							</td>

						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<div class="container" style="margin-top: 40px">
		<div class="card shadow">
			<div class="card-body">
				<table class="table table-hover" style="width: 1160px; height: 144px">
					<thead>
						<tr height="68">
							<td width="267">상품금액</td>
							<td width="267">추가금액(배송비)</td>
							<td width="267">총 할인금액</td>
							<td>총 결제금액 <span id="LAU_TotalPoint" style="display: none">0</span>
							</td>
						</tr>
						</thead>
						<tbody>
						<tr style="font-size: 20px; font-family: nt-M; font-weight: 400;">
							<td><span id="cart_rs_item_price">200,000</span>원</td>
							<td><span>0</span>원</td>
							<td><span>0</span>원</td>
							<td style="font-weight: 700; position: relative;"><span
								id="LAY_TotalPrice">200,000</span>원<br></td>
						</tr>
					</tbody>

				</table>
			</div>
		</div>
	</div>
	
	<div class="container" style="margin-top: 40px">
		<div class="card shadow">
			<div class="card-body">
			
				<a href="javascript:;" onclick="form_check('selectdelete');">
				<img src="image/cart_selectDel_btn.png" class="fl" alt="선택상품 삭제">
				</a>
				
				<a href="https://www.one-pc.co.kr">
				<img src="image/cart_again_btn2.png" class="fl" alt="쇼핑 계속하기" style="margin-left:5px">
				</a>	
				
				<a href="javascript:;" onclick="form_check('chk_buy');">
				<img src="image/cart_select_btn.png" class="fr" style="margin-left:350px;" alt="선택상품 주문하기">
				</a>
				
				<a href="javascript:;" onclick="form_check('buy');">
				<img src="image/cart_allOrder_btn.png" class="fr" style="margin-left:10px;" alt="전체상품 주문하기">
				</a>
			</div>
		</div>
	</div>

	<!-- 하단 메뉴 -->
	<c:import url="/WEB-INF/views/include/bottom_info.jsp" />


</body>
</html>