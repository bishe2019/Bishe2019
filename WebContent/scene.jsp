<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Njoy Travels a Travel Category Bootstrap responsive Website Template | Single :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="Njoy Travels Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--// bootstrap-css -->
<!-- css -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<!--// css -->
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<!-- font -->
<link href="//fonts.googleapis.com/css?family=Crimson+Text:400,400i,600,600i,700,700i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700italic,700,400italic,300italic,300' rel='stylesheet' type='text/css'>
<!-- //font -->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script> 
<style>
 ul {
            margin-top:50px;
            padding: 0;
            list-style: none;
        }

        input {
            margin: 0;
        }

        /*初始化样式*/
        .star_evaluate {
            position: relative;
            width: 100px;
            height: 20px;
            background: url(images/icon-star-default.png) repeat-x;
            background-size: 20px 20px;
            overflow: hidden;
        }

        .star,.score{
            display: block;
            height: 20px;
            width: 20px;
            position: absolute;
        }
        .star{
            z-index: 2;
        }
        .score{
            opacity: 0;
        }

        .star_1, .score_1 {
            left: 0;
        }

        .star_2, .score_2 {
            left: 20px;
        }

        .star_3, .score_3 {
            left: 40px;
        }

        .star_4, .score_4 {
            left: 60px;
        }

        .star_5, .score_5 {
            left: 80px;
        }

        /*鼠标悬浮*/
        .star:hover {
            cursor: pointer;
            background: url(images/icon-star-active.png) repeat-x;
            background-size: 20px 20px;
            left: 0;
            z-index: 1;
        }

        .star_1:hover {
            width: 20px;
        }

        .star_2:hover {
            width: 40px;
        }

        .star_3:hover {
            width: 60px;
        }

        .star_4:hover {
            width: 80px;
        }

        .star_5:hover {
            width: 100px;
        }

        /*选中之后*/
        .score:checked + .star {
            background: url("icon-star-active.png") repeat-x;
            background-size: 20px 20px;
            left: 0;
        }

        .score_1:checked + .star_1 {
            width: 20px;
        }

        .score_2:checked + .star_2 {
            width: 40px;
        }

        .score_3:checked + .star_3 {
            width: 60px;
        }

        .score_4:checked + .star_4 {
            width: 80px;
        }

        .score_5:checked + .star_5 {
            width: 100px;
        }
</style>
<%

String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<![endif]-->
</head>
<body>
	<!-- banner -->
	<div class="banner about-banner">
		<div class="header">
			<div class="container">
				<div class="header-left">
					<div class="w3layouts-logo">
						<h1>
							<a href="index.html"><span>Njoy</span> Travels</a>
						</h1>
					</div>
				</div>
				<div class="header-right">
					<div class="w3-header-top">
						<ul>
							<li><i class="fa fa-phone" aria-hidden="true"></i> : +1 234 567 9871</li>
							<li><i class="fa fa-envelope" aria-hidden="true"></i> : <a href="mailto:info@example.com">mail@example.com</a></li>
						</ul>
					</p>
					</div>
					<div class="w3-header-bottom">
						<div class="top-nav">
							<nav class="navbar navbar-default">
									<div class="navbar-header">
										<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
											<span class="sr-only">Toggle navigation</span>
											<span class="icon-bar"></span>
											<span class="icon-bar"></span>
											<span class="icon-bar"></span>
										</button>
									</div>
								<!-- Collect the nav links, forms, and other content for toggling -->
								<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
									<ul class="nav navbar-nav">
										<li><a class="active" href="index.jsp">主页</a></li>
										<li><a href="list.jsp">列表</a></li>
										<li><a href="hot.jsp">热门排行</a></li>					
										<li><a href="typography.jsp">论坛</a></li>
										<li><a href="contact.jsp">联系</a></li>
									</ul>	
									<div class="clearfix"> </div>
								</div>	
							</nav>		
						</div>
						<div class="agileinfo-social-grids">
							<ul>
								<li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-rss"></i></a></li>
								<li><a href="#"><i class="fa fa-vk"></i></a></li>
							</ul>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="w3ls-heading">
			<h2>景点详情</h2>	
		</div>
	</div>
	<!-- //banner -->
	<!-- single -->
	<div class="single">
		<div class="container">	
			<div class="agileits-single-img">
				<img src="<%=basePath%>images/${scene.scenePic}" alt="" />
				<h4>${scene.sceneName}</h4>
				<div class="agileinfo-single-icons" >
					<ul>
						<li><a href="#"><i class="fa fa-user" aria-hidden="true"></i> <span>Admin</span></a></li>
						<li><i class="fa fa-calendar" aria-hidden="true"></i><span>04.Nov.2015</span></li>
						<li><a href="#"><i class="fa fa-comments-o" aria-hidden="true"></i><span>20 Comments</span></a></li>
						<li><a href="#"><i class="fa fa-heart" aria-hidden="true"></i><span>300 Likes</span></a></li>
					</ul>				
				</div>
				<p>${scene.sceneSumamry}</p>
			</div>	
			<!-- comments -->
	<form id="score_form"  action="getRate" method="get">用户打分
    <div class="star_evaluate" style="margin-top:50px;margin-left:30px;">
        <a href="getRate?rate=1&sceneId=${param.sceneId }"><input type="radio" id="scoreId_1" class="score score_1" name="rate" value="1"/>
        <label for="scoreId_1" class="star star_1"></label></a>
         <a href="getRate?rate=2&sceneId=${param.sceneId }"><input type="radio" id="scoreId_2" class="score score_2" name="rate" value="2"/>
        <label for="scoreId_2" class="star star_2"></label></a>
         <a href="getRate?rate=3&sceneId=${param.sceneId }"><input type="radio" id="scoreId_3" class="score score_3" name="rate" value="3"/>
        <label for="scoreId_3" class="star star_3"></label></a>
         <a href="getRate?rate=4&sceneId=${param.sceneId }"><input type="radio" id="scoreId_4" class="score score_4" name="rate" value="4"/>
        <label for="scoreId_4" class="star star_4"></label></a>
        <a href="getRate?rate=5&sceneId=${param.sceneId }"> <input type="radio" id="scoreId_5" class="score score_5" name="rate" value="5"/>
        <label for="scoreId_5" class="star star_5"></label></a>
         <input type="hidden" name="sceneId"  value=${param.sceneId } />
         
    </div>
    <input type="submit" value="打分" style="margin-left:150px">
	</form>
			<div class="agileits_three_comments">
				<h3>评论</h3>
				<c:forEach items="${commentList}" var="p" begin="0" end="1" step="1">
				<div class="agileits_three_comment_grid">
					<div class="agileits_tom">
						<img src="images/t2.jpg" alt=" " class="img-responsive">
					</div>
					<div class="agileits_tom_right">
						<div class="hardy">
							<h4>${p.userName}</h4>
							<p>${p.commentTime}</p>
						</div>
						<div class="clearfix"> </div>
						<p class="lorem">${p.commentText}</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				</c:forEach>
			</div>
			<div>
				<form action="leaveComment" method="get">  
  					评论：<br/> <!--clos指每行可以显示60个字符 rows指行数-->  
  						<textarea name="commentText"width="800px"cols="160" rows="5">  </textarea><!--textarea指可以创建多行文本-->  
  						<br/><br/><!-- input指表单控件，type指向的是控件类型，例如下行中submit（中文意思为顺从）指提交按钮控件 value（中文意思为价值价格重要性）指控件上显示的名字-->  
  							<input type="hidden" name="sceneId" value=${param.sceneId } />
  							<input type="hidden" name="userId" value=${user.userId } />
  							<input type="hidden" name="userName" value=${user.userName } />
  							<input type="submit" value="提交"/  >  
  				</form>  
			</div>
			<!-- //comments -->
			<!-- leave-comments -->
			
		</div>
	</div>
	<!-- //single -->
	<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="agile-footer-grids">
				<div class="col-md-4 agile-footer-grid">
					<h4>History of Us</h4>
					<p>Pellentesque urna ex, ultricies a nunc at, pretium maximus nisi. Vestibulum non auctor diam. Mauris eget consectetur mauris. <span>Aenean leo elit, accumsan vel elit vitae, mattis ultricies lacus. Cras consectetur justo lorem, sed dictum sapien eleifend at.</span></p>
				</div>
				<div class="col-md-4 agile-footer-grid">
					<h4>Twitter Posts</h4>
					<ul class="w3agile_footer_grid_list">
						<li>Ut aut reiciendis voluptatibus maiores <a href="#">http://example.com</a> alias, ut aut reiciendis.
							<span><i class="fa fa-twitter" aria-hidden="true"></i> 02 days ago</span></li>
						<li>Itaque earum rerum hic tenetur a sapiente delectus <a href="#">http://mail.com</a> ut aut
							voluptatibus.<span><i class="fa fa-twitter" aria-hidden="true"></i> 03 days ago</span></li>
					</ul>
				</div>
				<div class="col-md-2 agile-footer-grid">
					<h4>Events</h4>
					<ul>
						<li>12th Aug <a href="single.html">Curabitur</a></li>
						<li>10th Sept <a href="single.html">Fusce urna</a></li>
						<li>24th Sept <a href="single.html">Praesent</a></li>
						<li>17th Oct <a href="single.html">Malesuada </a></li>
						<li>09th Dec <a href="single.html">Cum sociis</a></li>
					</ul>
				</div>
				<div class="col-md-2 agile-footer-grid">
					<h4>Navigation</h4>
					<ul>
						<li class="text"><a href="index.html">Home</a></li>
						<li class="text"><a href="about.html">About</a></li>
						<li class="text"><a href="icons.html">Icons</a></li>
						<li class="text"><a href="typography.html">Typography</a></li>
						<li class="text"><a href="gallery.html">Gallery</a></li>
						<li class="text"><a href="contact.html">Contact</a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- //footer -->
	<!-- copyright -->
	<div class="agileits-w3layouts-copyright">
		<div class="container">
			<p>© 2017 Njoy Travels. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
		</div>
	</div>
	<!-- //copyright -->
	<script src="js/SmoothScroll.min.js"></script>
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
	<!-- //here ends scrolling icon -->
</body>	
</html>