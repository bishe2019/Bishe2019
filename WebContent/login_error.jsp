<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<style type="text/css">
	body,input{
		margin: 0;
		padding: 0;
		background: pink;
	}
	input{
		display: inline-block;
		background: #fff;
	}
	.xiao-container{
		width: 100%;
	}
	.xiao-register-box{
		position: relative;
		height: 500px;
		width: 700px;
		top: 50px;
		margin: 0 auto;
		z-index: 99999;
		background:#ffffff;
		border: 7px solid #ccc;
	}
	.xiao-title-box{
		position: absolute;
		width: 300px;
		height: 50px;
		margin-left: 180px;
		margin-top: 155px;
		text-align: center;
		font-size: 28px;
		font-weight: 800;
		color: #ff5000;
		line-height: 50px;
	}
	.xiao-password-box{
		position: absolute;
		width: 420px;
		height: 40px;
		line-height: 40px;
		margin-top:220px;
		margin-left:80px;
		font-weight: 700;
	}
	.xiao-password-input{
		display: inline-block;
		margin-left: 61px;
	}
	#password{
		height: 35px;
		width: 290px;
		border: 2px solid #ccc;
		border-radius: 5px;
	}
	
	.xiao-email-box{
		position: absolute;
		width: 420px;
		height: 40px;
		line-height: 40px;
		margin-top:120px;
		margin-left:80px;
		font-weight: 700;
	}
	.xiao-email-input{
		display: inline-block;
		margin-left: 28px;
	}
	#email{
		height: 35px;
		width: 290px;
		border: 2px solid #ccc;
		border-radius: 5px;
	}
	.xiao-require{
		color: red;
	}
	.xiao-submit-box{
		position:absolute;
		width: 80px;
		height: 40px;
		line-height: 40px;
		margin-top: 360px;
		margin-left:200px;
		border-radius: 5px;
		background: grey;
	}
	#xiao-submit-button{
		display: inline-block;
		width: 80px;
		height: 40px;
		border-radius: 5px;
		background: red;
	}
	.xiao-goLogin-box{
		position:absolute;
		width: 150px;
		height: 20px;
		margin-top: 370px;
		margin-left:320px;
 
	}
 
	</style>
</head>
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
		<div class="w3layouts-banner-slider">
			<div class="container">
				<div class="xiao-container">
		<div class="xiao-register-box">
			<div class="xiao-title-box">
				<span>用户名或密码错误，请重新登录</span>
			</div>
			<div class="xiao-title-box">
				<a href="login.jsp"><span>用户名或密码错误，请重新登录</span></a>
			</div>
		</div>
	</div>

					
			</div>
		</div>
	</div>
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