<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Njoy Travels a Travel Category Bootstrap responsive Website Template | Home :: w3layouts</title>
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
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<![endif]-->
</head>
<%

String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>
<body>
	<!-- banner -->
	<div class="banner">
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
									<li><form action="getSceneList" method="get">
					<input type="text"  name="sceneName" >
					<input type="submit" value="搜索">
				</form></li>
									<li><a class="active" href="index.jsp">主页</a></li>
										<li><a href="list.jsp">列表</a></li>
										<li><a href="getSceneList?sceneName=" >热门排行</a></li>					
										<li><a href="typography.jsp">论坛</a></li>
										<li><a href="contact.jsp">联系</a></li>
									</ul>	
									<div class="clearfix"> </div>
								</div>	
							</nav>		
						</div>
						<div class="agileinfo-social-grids">
							
							<ul>
								<li><c:if test="${! empty  user.userId }" >
									 <a href="personal.jsp">
						 			<button class="btn btn-primary" data-toggle="modal" >  		            
                						<td style="font-weight:900;font-size: 100%;color:white;"> ${user.userName }  <td> 	 
                		 			</button>  
                	     			</a>
                	     			<a href = "remove_user">注销</a>      			    
                					</c:if>   
                					<c:if test="${empty  user.userId }" >	
               	    	 			 <a href="login.jsp"><button class="btn btn-primary" data-toggle="modal" >  		           
                			<td  style="font-weight:900;font-size: 100%;color:white;">未登录</td> 	
                		 </button>   </a>
                					 </c:if>    
                				</li>
								
							</ul>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="w3layouts-banner-slider">
			<div class="container">
				<div class="slider">
				
					<div class="callbacks_container">
						<ul class="rslides callbacks callbacks1" id="slider4">
							<li>
								<div class="agileits-banner-info">
									<h6>varius</h6>
									<h3>Your Holiday!</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque sit amet massa in eros euismod suscipit at ut augue. Donec imperdiet risus vel sem luctus, a viverra augue ornare.</p>
									<div class="w3-button">
										<a href="single.html">More</a>
									</div>
								</div>
							</li>
							<li>
								<div class="agileits-banner-info">
									<h6>Lorem</h6>
									<h3>Your Trip!</h3>
									<p>Mauris ac diam vestibulum, vestibulum risus tincidunt, accumsan neque. Praesent pellentesque ullamcorper scelerisque. Nam vestibulum augue quam, ac hendrerit odio molestie ornare. Etiam</p>
									<div class="w3-button">
										<a href="single.html">More</a>
									</div>
								</div>
							</li>
						</ul>
					</div>
					<script src="js/responsiveslides.min.js"></script>
					<script>
						// You can also use "$(window).load(function() {"
						$(function () {
						  // Slideshow 4
						  $("#slider4").responsiveSlides({
							auto: true,
							pager:true,
							nav:true,
							speed: 500,
							namespace: "callbacks",
							before: function () {
							  $('.events').append("<li>before event fired.</li>");
							},
							after: function () {
							  $('.events').append("<li>after event fired.</li>");
							}
						  });
					
						});
					 </script>
					<!--banner Slider starts Here-->
				</div>
			</div>
		</div>
	</div>
	<!-- //banner -->
	<!-- welcome -->
	<div class="welcome">
		<div class="container">
			<div class="w3l-heading">
				<h2>热门景点</h2>
			</div>
			<c:forEach items="${SceneList}" var="p" begin="0" end="1" step="1">
			<div class="w3-welcome-grids">
				<div class="col-md-7 w3-welcome-left">
					<h5>${p.sceneName}</h5>
					<p><span>${p.sceneSumamry}</span></span></p>
					<div class="w3l-button">
						<a href="${p.sceneId}">More</a>
					</div>
				</div>
				<div class="col-md-5 w3ls-welcome-img1">
					<img src="<%=basePath%>images/${p.scenePic}"   width="400" height="300" />
				</div>
				<div class="clearfix"> </div>
			</div>
			</c:forEach>
		</div>
	</div>
	<!-- //welcome -->
	<!-- services -->
	<div class="services">
		<div class="container">
			<div class="w3l-heading">
				<h3>特别推荐</h3>
			</div>
			<div class="agileits-services">
				<div class="services-right-grids">
				<c:forEach items="${SceneList}" var="p" begin="2" end="7" step="1">
					<div class="col-sm-4 services-right-grid">
						<div class="services-icon hvr-radial-in">
							<img src="<%=basePath%>images/${p.scenePic}" width="400" height="300"  />
						</div>
						<div class="services-icon-info">
							<h5>${p.sceneName}</h5>
							<p style="width:350px; white-space:nowrap; text-overflow:ellipsis; overflow:hidden;">${p.sceneSumamry}</p>
						</div>
					</div>
				</c:forEach>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	</div>
	<!-- //services -->
	<!-- news -->
	<!-- //news -->
	<!-- newsletter -->
	<div class="jarallax newsletter">
		<div class="container">
			<div class="w3l-heading newsletter-heading">
				<h3>Join The Club</h3>
			</div>
		</div>
		<div class="w3-agileits-newsletter">
			<div class="subscribe-grid">
				<form action="#" method="post">
					<input type="text" placeholder="Subscribe" name="Subscribe" required="">
					<button class="btn1"><i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
				</form>
			</div>
		</div>
	</div>
	<!-- //newsletter -->
	<!-- footer -->

	<!-- //footer -->
	<!-- copyright -->
	<div class="agileits-w3layouts-copyright">
		<div class="container">
			<p>© 2017 Njoy Travels. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
		</div>
	</div>
	<!-- //copyright -->
	<script src="js/responsiveslides.min.js"></script>
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
	<script src="js/jarallax.js"></script>
	<script type="text/javascript">
			/* init Jarallax */
			$('.jarallax').jarallax({
				speed: 0.5,
				imgWidth: 1366,
				imgHeight: 768
			})
	</script>
</body>	
</html>