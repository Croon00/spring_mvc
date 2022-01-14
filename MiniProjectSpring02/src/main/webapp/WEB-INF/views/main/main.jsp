<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- BOOTSTRAP and JQu	ery CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css"
	rel="stylesheet" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/js/bootstrap.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/holder/2.9.1/holder.min.js"></script>

<script>


//캐러셀 시작
function carousel() {
  var auto = null;
  var $carousel_list = null;
  var $section_carousel = null;
  var $carousel_prev = null;
  var $carousel_next = null;
 
  function start() {
    init();
    eventInit();
  }
 
  function init() {
    $carousel_list = $('.carousel_list');
    $section_carousel = $('.section_carousel');
    $carousel_prev = $('.carousel_prev');
    $carousel_next = $('.carousel_next');
  }
 
  function eventInit() {
    // 왼쪽 화살표 눌렀을때
    $carousel_prev.click(function() {
      carousel_prevMove();
    });
 
    // 오른쪽 화살표 눌렀을때
    $carousel_next.click(function() {
      carousel_nextMove();
    });
 
    // 자동실행
    carousel_autoPlay();
 
    // 자동실행 멈춤
    carousel_autoPlayStop();
    // 자동실행 재시작
    carousel_autoPlayRestart();
 
    // 리사이즈 사이즈 재조정
    resize();
  }
  // 자동실행
  function carousel_autoPlay() {
    auto = setInterval(function() {
      carousel_nextMove();
    }, 5000);
  }
  // 자동실행 멈춤
  function carousel_autoPlayStop() {
    /* 마우스 올렸을때 캐러셀 자동 멈춤 */
    $(".carousel_view").mouseenter(function() {
      clearInterval(auto);
    });
  }
  // 자동실행 재시작
  function carousel_autoPlayRestart() {
    $(".carousel_view").mouseleave(function() {
      carousel_autoPlay();
    });
  }
  // 다음버튼 눌렀을때,자동실행 실제 동작하는 부분
  function carousel_prevMove() {
    $carousel_list.stop().animate({
      'margin-left': '0px'
    }, function() {
      $carousel_list.children('li').last().prependTo('.carousel_list');
      $carousel_list.css({
        marginLeft: -$carousel_list.children('li').outerWidth(true)
      });
    });
  }
 
  // 이전버튼 눌렀을때 실제 동작하는 부분
  function carousel_nextMove() {
    $carousel_list.stop().animate({
      'margin-left': -$carousel_list.children('li').outerWidth(true) * 2
    }, function() {
      $carousel_list.children('li').first().appendTo('.carousel_list');
      $carousel_list.css({
        'margin-left': -$carousel_list.children('li').outerWidth(true)
      });
    });
  }
 
  // 화면크기 조정시 화면 재설정
  function resize() {
    $(window).resize(function() {
      init();
    });
  }
  start();
}
// 캐러셀 끝
</script>
<style>
/* 캐러셀 시작 */
 
.section_carousel {
  width: 100%;
  margin: 0 auto;
  padding-top: 50px;
  padding-bottom: 100px;
  background-color: white;
  position: relative;
}
 
.section_carousel>h2 {
  text-align: center;
  color: #6d6d6d;
  font-size: 30px;
  font-weight: 100;
  padding-top: 30px;
  padding-bottom: 25px;
}
 
.section_carousel>a {
  display: block;
  text-align: center;
  font-size: 15px;
  padding-bottom: 20px;
  color: #cd9f7a;
  font-style: italic;
}
 
.section_carousel>a>i {
  padding-left: 15px;
}
 
.carousel_view {
  width: 1260px;
  margin: 0 auto;
  overflow: hidden;
}
 
.carousel_view .carousel_list {
  width: 300%;
  margin-left: -420px;
}
 
.carousel_view .carousel_list > li {
  width: 10.58201%;
  overflow: hidden;
  margin-left: 0.26455%;
  margin-right: 0.26455%;
  position: relative;
}
 
.carousel_view .carousel_list > li>a {
  display: block;
  width: 100%;
  height: 100%;
}
 
.carousel_view .carousel_list > li > a img {
  width: 100%;
}
 
.carousel_list_text {
  width: 70%;
  margin: 0 auto;
  text-align: center;
  padding-bottom: 30px;
  border-bottom: 1px solid #fff;
}
 
.carousel_list>li img {
  transition: all 0.3s;
}
 
.carousel_list>li:hover img {
  transform: scale(1.03);
}
 
.carousel_list>li:hover .carousel_list_text {
  border-bottom: 1px solid #a68164;
}
 
.carousel_list_text>h4 {
  color: #a68164;
  padding-top: 5px;
  padding-bottom: 10px;
  font-size: 18px;
}
 
.carousel_list_text>p {
  font-style: italic;
  font-size: 15px;
}
 
.carousel_prev {
  position: absolute;
  color: #000;
  left: 2%;
  top: 50%;
  cursor: pointer;
}
 
.carousel_next {
  position: absolute;
  color: #000;
  right: 2%;
  top: 50%;
  cursor: pointer;
}
 
 
/* 캐러셀 끝 */
}
</style>
<title>index</title>
</head>
<body>
	<!-- 상단 메뉴 -->
	<c:import url="/WEB-INF/views/include/top_menu.jsp" />

	<!-- 게시판 리스트 -->
	<div class="container" style="margin-top: 100px">
		<!-- 12칸의 길이를 반반 씩 나눔 -->

		<div class="row">

			<%-- 게시판의 수 만큼 반복한다. --%>
			<c:forEach begin="1" end="1">

				<div class="col-lg-6" style="margin-top: 20px">

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
											<td><a href="#">제목입니다</a></td>
											<td class="text-center d-none d-xl-table-cell">2021-08-09</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>

							<div class="text-right">
								<a href="#" class="btn btn-primary">더보기</a>
							</div>


						</div>
					</div>


				</div>


			</c:forEach>


			<div class="col-lg-6 embed-responsive embed-responsive-16by9">
				<iframe class="embed-responsive-item" width="100" height="100"
					src="https://www.youtube.com/embed/pBuZEGYXA6E" frameborder="0"
					allow="autoplay; encrypted-media" allowfullscreen></iframe>
			</div>
		</div>


	</div>

	<div class="s_main" style="margin-top: 50px">
		<div class="c_main_title up-transition lazyloaded">
			<h2>시선 집중</h2>
			<div id="demo" class="carousel slide d-block w-100"
				data-ride="carousel">

				<!-- Indicators -->
				<ul class="carousel-indicators" background-color="black">
					<li data-target="#demo" data-slide-to="0" class="active"></li>
					<li data-target="#demo" data-slide-to="1"></li>
					<li data-target="#demo" data-slide-to="2"></li>
					<li data-target="#demo" data-slide-to="3"></li>
					<li data-target="#demo" data-slide-to="4"></li>
				</ul>

				<!-- The slideshow -->
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="caroussel-inner-item">
							<img src="image/product1.jpg" class="d-block w-10"
								alt="Graphiccard" style="float: left" style="margin-right:20px">
						</div>
						<div class="caroussel-inner-item">
							<img src="image/product1.jpg" class="d-block w-10"
								alt="Graphiccard" style="float: left" style="margin-right:20px">

						</div>
						<div class="caroussel-inner-item">
							<img src="image/product1.jpg" class="d-block w-10"
								alt="Graphiccard" style="float: left" style="margin-right:20px">
						</div>

					</div>
					<div class="carousel-item">
						<img src="image/product2.jpg" class="d-block w-100" alt="CPU">
						<div class="carousel-caption">
							<h3 style="color: black">RYZEN 5600X</h3>
							<p style="color: black">지금 가장 잘 팔리는 CPU 1위</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="image/product3.jpg" class="d-block w-100" alt="Moniter">
						<div class="carousel-caption">
							<h3 style="color: black">크로스오버 QHD 144HZ</h3>
							<p style="color: black">지금 가장 잘 팔리는 모니터 1위</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="image/product4.jpg" class="d-block w-100" alt="SSD">
						<div class="carousel-caption">
							<h3 style="color: black">SK 하이닉스 m.2 GOLD</h3>
							<p style="color: black">지금 가장 잘 팔리는 SSD 1위</p>
						</div>
					</div>
					<div class="carousel-item">
						<img src="image/product5.jpg" class="d-block w-100" alt="Case">
						<div class="carousel-caption">
							<h3 style="color: black">DLX21 MESH</h3>
							<p style="color: black">지금 가장 잘 팔리는 케이스 1위</p>
						</div>
					</div>
				</div>

				<!-- Left and right controls -->
				<a class="carousel-control-prev" href="#demo" data-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</a> <a class="carousel-control-next" href="#demo" data-slide="next">
					<span class="carousel-control-next-icon"></span>
				</a>

			</div>
		</div>
	</div>

	<section class="section_carousel">
        <h2>LATEST PRODUCTS</h2>
        <a href="#">View All Watches<i class="fa fa-arrow-right" aria-hidden="true"></i></a>
        <div class="carousel_view">
            <ul class="carousel_list clear">
               <li class="fl">
                   <a href="#">
                       <img src="image/product1.jpg" alt="캐러셀 시계이미지1">
                       <div class="carousel_list_text">
                           <h4>SUB MARINER</h4>
                           <p>Fashion, Photograph, Vacation</p>
                       </div>
                   </a>
               </li>
                <li class="fl">
                   <a href="#">
                       <img src="image/product2.jpg" alt="캐러셀 시계이미지2">
                       <div class="carousel_list_text">
                           <h4>NAUTILUS</h4>
                           <p>Identity, Sport, Website</p>
                       </div>
                    </a>
                </li>
               <li class="fl">
                   <a href="#">
                       <img src="image/product4.jpg" alt="캐러셀 시계이미지3">
                       <div class="carousel_list_text">
                           <h4>AQUADANT</h4>
                           <p>Leather, Sport, Website</p>
                       </div>
                    </a>
                </li>
               <li class="fl">
                   <a href="#">
                       <div class="carousel_list_img"><img src="image/product5.jpg" alt="캐러셀 시계이미지4"></div>
                       <div class="carousel_list_text">
                           <h4>SUPERIOR SERIES</h4>
                           <p>Identity, Leather</p>
                       </div>
                    </a>
                </li>
               <li class="fl">
                   <a href="#">
                       <img src="image/abc.jpg" alt="캐러셀 시계이미지5">
                       <div class="carousel_list_text">
                           <h4>YATCH MASTER</h4>
                           <p>Branding, Classic, Identity</p>
                       </div>
                    </a>
                </li>
               <li class="fl">
                   <a href="#">
                       <img src="img/carousel6.jpg" alt="캐러셀 시계이미지6">
                       <div class="carousel_list_text">
                           <h4>AQUADANT</h4>
                           <p>Leather, Sport, Website</p>
                       </div>
                    </a>
                </li>
            </ul>
        </div>
        <p class="carousel_prev"><i class="fa fa-angle-left fa-5x" aria-hidden="true"></i></p>
        <p class="carousel_next"><i class="fa fa-angle-right fa-5x" aria-hidden="true"></i></p>
 
      </section>




	<!-- 하단 정보 부분 -->
	<c:import url="/WEB-INF/views/include/bottom_info.jsp" />

</body>
</html>