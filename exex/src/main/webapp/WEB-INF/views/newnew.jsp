<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!--  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>

* { margin:0px;padding:0px;}
ul { list-style:none;}
a { text-decoration:none;}
img { border:none; vertical-align:top;}

.carousel{
    width: 550px; margin: 0 auto;
    background-color: aqua;
    position: relative;
}

.carousel .view{
    width: 450px; margin: 0 auto;
    background-color: pink;
    overflow: hidden;
}

.carousel .view .list{
    width: 1350px; margin-left: -450px;
}
.carousel .view .list:after{content: "";display: block;clear: both;}

.carousel .view .list > li{
    float:left;
}
.carousel .view .list > li ul:after{content: "";display: block;clear: both;}

.carousel .view .list > li ul li{
    float: left;
    width: 130px; height: 150px;
    margin-left: 10px; margin-right: 10px;
}
.carousel .view .list > li ul li.a1{background-color: red;} 
.carousel .view .list > li ul li.a2{background-color: green;} 
.carousel .view .list > li ul li.a3{background-color: gray;} 
.carousel .view .list > li ul li.a4{background-color: darkgray;} 
.carousel .view .list > li ul li.a5{background-color: firebrick;} 
.carousel .view .list > li ul li.a6{background-color: purple;} 
.carousel .view .list > li ul li.a7{background-color: orange;} 
.carousel .view .list > li ul li.a8{background-color: blue;} 
.carousel .view .list > li ul li.a9{background-color: blueviolet;} 

.carousel .prev{
    position: absolute; width: 25px; height: 50px; background-color: #000; color:#fff;
    left: 0; top: 50%;
    -webkit-transform: translateY(-50%);
    -ms-transform: translateY(-50%);
    -o-transform:translateY(-50%);
    transform: translateY(-50%);
}

.carousel .next{
    position: absolute; width: 50px; height: 50px; background-color: #000; color:#fff;
    right: 0; top: 50%;
    -webkit-transform: translateY(-50%);
    -ms-transform: translateY(-50%);
    -o-transform:translateY(-50%);
    transform: translateY(-50%);
}
</style>
</head>
<body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script>

$(document).ready(function(){
    
	   $('.prev').click(function(){
	       $('.list').stop().animate({'margin-left':'-900px'},function(){
	           $('.list>li').eq(0).appendTo('.list');
	           $('.list').css({'margin-left':'-450px'});
	       });
	   });
	   $('.next').click(function(){
	       $('.list').stop().animate({'margin-left':'0px'},function(){
	           $('.list>li').eq(2).prependTo('.list');
	           $('.list').css({'margin-left':'-450px'});
	       });
	   });
	   
	   var auto = setInterval(function(){
	   		$('.list').stop().animate({'margin-left':'0px'},function(){
	           $('.list>li').eq(2).prependTo('.list');
	           $('.list').css({'margin-left':'-450px'});
	       });
	   },2000);
	   
	   /* 마우스 올렸을때 캐러셀 자동 멈춤 */
	   $('.carousel').mouseenter(function(){
	        clearInterval(auto);  
	   });
	   
	   /* 마우스 내렸을때 캐러셀 자동 다시실행 */
	   $('.carousel').mouseleave(function(){
	        auto = setInterval(function(){
	         		$('.list').stop().animate({'margin-left':'0px'},function(){
	           $('.list>li').eq(2).prependTo('.list');
	           $('.list').css({'margin-left':'-450px'});
	        });
	    },2000);
	   });
	});

</script>

    <div class="carousel">
        <div class="view">
            <ul class="list">
                <li>
                   <ul>
                       <li class="a1"><a href="#">
                       <img src="image/product1.jpg" alt="carousel image">
                       </a></li>
                       <li class="a2"><a href="#">
                         <img src="image/product2.jpg" alt="carousel image">
                       
                       </a>
                       
                       </li>
                       <li class="a3"><a href="#">
                         <img src="image/product3.jpg" alt="carousel image">
                       
                       </a></li>
                   </ul>
                </li>
                <li>
                    <ul>
                       <li class="a4"><a href="#">
                         <img src="image/product4.jpg" alt="carousel image">
                       
                       </a></li>
                       <li class="a5"><a href="#">
                         <img src="image/product1.jpg" alt="carousel image">
                       
                       </a></li>
                       <li class="a6"><a href="#">
                         <img src="image/product5.jpg" alt="carousel image">
                     
                       </a></li>
                   </ul>
                </li>
                <li>
                    <ul>
                       <li class="a7"><a href="#">
                         <img src="image/product1.jpg" alt="carousel image">
                       
                       </a></li>
                       <li class="a8"><a href="#">
                         <img src="image/product2.jpg" alt="carousel image">
                       
                       </a></li>
                       <li class="a9"><a href="#">
                         <img src="image/product3.jpg" alt="carousel image">
                       
                       </a></li>
                   </ul>
                </li>
            </ul>
        </div>
        <p class="prev">이<br>전</p>
        <p class="next">이<br>후</p>
    </div>

	

</body>
</html>