<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Njoy Travels a Travel Category Bootstrap responsive Website Template | Gallery :: w3layouts</title>
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
<link rel="stylesheet" href="css/lightbox.css">
<!-- font -->
<link rel="stylesheet" type="text/css" href="./后台用户中心_files/iconfont.css">
		<link rel="stylesheet" type="text/css" href="./后台用户中心_files/style.css">
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
			<h2>个人中心</h2>	
		</div>
	</div>
	<!-- //banner -->
	<!-- gallery -->
	<div class="gallery">
			<div class="header">
			<div class="user-info">
				<div class="w1200">
					<div class="user-headface">
						<img src="./后台用户中心_files/user_face.jpg">
					</div>
					<div class="user-account">
						<p class="tip">下午好，${user.userName}</p>
						<p class="account">
							<span>帐户名：${user.email}</span>
							<span>用户：${user.userName }  </span>
						</p>
					</div>
					<div class="user-modify">
						<a href="">修改资料&gt;</a>
					</div>
				</div>
			</div>
		</div>
		<div class="main w1200">
			<!-- <div class="left" style="height:500px;">
				<ul>
				 <c:forEach items="${typeList}" var="p">
					<li>
						<div style="float:left;width:60%;text-align:center">${p.typeName}</div>
                   <c:if test="${p.isSub==1}">
                 	 <div style="float:left;width:60%;text-align:center">已关注</div>
                   </c:if>
                   <c:if test="${p.isSub==0}">
					<div style="float:left;width:40%;text-align:center;"><a href="subType" style="padding:0">添加关注</a></div>
                  </c:if>
				
					
					</li>
					</c:forEach>
				</ul>
			</div> -->
				<div class="left" style="height:500px">
					<ul>
					 <c:forEach items="${typeList}" var="p">
						<li>
							<div style="float:left;width:60%;text-align:center">${p.typeName}</div>
							 <c:if test="${p.isSub==1}"><div style="float:left;width:35%;text-align:center"><a href="deleteUserType?typeId=${p.typeId}" style="padding:0">取消关注</a></div></c:if>
							<c:if test="${p.isSub==0}"><div style="float:left;width:35%;text-align:center;"><a href="subType?typeId=${p.typeId}" style="padding:0">添加关注</a></div></c:if>
						</li>
						</c:forEach>
					</ul>
				</div>
			<div class="right">
				<div class="tap">
					<span>打分记录</span>
				</div>
				<div class="container">
					<div class="no-doc">
						<img src="./后台用户中心_files/no_doc.jpg">
						<p>您还没有消息哦~</p>
					</div>
				</div>
			</div>
	</div>
	</div>
	<!-- //gallery -->
	<!-- footer -->

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