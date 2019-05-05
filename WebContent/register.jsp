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
<script>
function validate() {
var pw1 = document.getElementById("password").value;
var pw2 = document.getElementById("checkPassword").value;
if(pw1 == pw2) {
document.getElementById("tishi").innerHTML="<font color='green'>两次密码相同</font>";
document.getElementById("submit").disabled = false;
}
else {
document.getElementById("tishi").innerHTML="<font color='red'>两次密码不相同</font>";
document.getElementById("submit").disabled = true;
}
}
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
		height: 700px;
		width: 800px;
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
		margin-left: 250px;
		margin-top: 5px;
		text-align: center;
		font-size: 28px;
		font-weight: 800;
		color: #ff5000;
		line-height: 50px;
	}
	.xiao-userName-box{
		position: absolute;
		width: 420px;
		height: 40px;
		line-height: 40px;
		margin-top:100px;
		margin-left:80px;
		font-weight: 700;
	}
	.xiao-userName-input{
		display: inline-block;
		margin-left: 45px;
		/*background: green;*/
	}
	#userName{
		height: 35px;
		width: 290px;
		border: 2px solid #ccc;
		border-radius: 5px;
	}
	.xiao-password-box{
		position: absolute;
		width: 420px;
		height: 40px;
		line-height: 40px;
		margin-top:180px;
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
	.xiao-userRePassword-box{
		position: absolute;
		width: 420px;
		height: 40px;
		line-height: 40px;
		margin-top:260px;
		margin-left:80px;
		font-weight: 700;
	}
	.xiao-userRePassword-input{
		display: inline-block;
		margin-left: 28px;
	}
	#userRePassword{
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
		margin-top:340px;
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
		margin-top: 480px;
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
		margin-top: 500px;
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
									<li><form action="getSceneList" method="get">
					<input type="text"  name="sceneName" >
					<input type="submit" value="搜索">
				</form></li>
									<li><a class="active" href="userLogin?email=${user.email}&password=${user.password}">主页</a></li>
										<!-- <li><a href="list.jsp">列表</a></li> -->
										<li><a href="getSceneList?sceneName=" >热门排行</a></li>					
										<li><a href="contact.jsp">联系</a></li>
									</ul>	
									<div class="clearfix"> </div>
								</div>	
							</nav>		
						</div>
						<div class="agileinfo-social-grids">
							
							<ul>
								<li><c:if test="${! empty  user.userId }" >
									 <a href="userCenter">
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
				<div class="xiao-container">
		<div class="xiao-register-box">
			<div class="xiao-title-box">
				<span>用户注册</span>
			</div>
			<form action="/Bishe_2019/userRegister" method="get">
				<div class="xiao-userName-box">
					<span class="xiao-require">*</span>
					<label for="userName">用户名</label>
					<div class="xiao-userName-input">
						<input type="text" id="userName" name="userName" placeholder="请输入用户名 长度:6-12个字符" />
					</div>
				</div>
 
				<div class="xiao-password-box">
					<span class="xiao-require">*</span>
					<label for="password">密码</label>
					<div class="xiao-password-input">
						<input type="password" id="password" name="password" placeholder="请输入密码 长度:6-12个字符" />
					</div>
				</div>
 
				<div class="xiao-userRePassword-box">
				<span class="xiao-require">*</span>
						<label for="checkPassword">确认密码</label>
					<div class="xiao-userRePassword-input">
						<input type="password" id="checkPassword" name="checkPassword" placeholder="请重复输入密码" onkeyup="validate()"/><span id="tishi"></span></p>
					</div>
				</div>
				<div class="xiao-email-box">
					<span class="xiao-require">*</span>
					<label for="email">电子邮箱</label>
					<div class="xiao-email-input">
						<input type="text" id="email" name="email" placeholder="请输入您的邮箱地址，如：123@qq.com" />
					</div>
				</div>
				
				<div class="xiao-submit-box">
					<input id = "xiao-submit-button" type="submit" value="注册">
				</div>
				
				<div class="xiao-goLogin-box">
					<a href="#" style="text-decoration: none;">已有账号？去登录</a>
				</div>
			</form>
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