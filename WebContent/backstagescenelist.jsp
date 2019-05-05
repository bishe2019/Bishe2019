<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>景点列表-后台管理系统</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="assets/css/admin.css">
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/app.js"></script>
</head>
<body>
<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->






</head>

<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="assets/i/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">



 <li class="kuanjie">
 	
 	
 </li>

 <li class="soso">
 	
<p>   
	
	
</p>


 </li>




      <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：清风抚雪</div>
   <div class="sideMenu">
    
      <h3 class="am-icon-flag"><em></em> <a href="./backstageSceneList">景点管理</a></h3>
      <ul>
        <li><a href="./backstageSceneList">景点列表</a></li>
        <li><a href="addmovie.jsp">添加景点</a></li>
      </ul>
      
      <h3 class="am-icon-cart-plus"><em></em> <a href="./getTypelist">评论管理</a></h3>
      <ul>
        <li><a href="./getTypelist">类型列表</a></li>
      </ul>
      
      <h3 class="am-icon-users"><em></em> <a href="./getUserList">用户管理</a></h3>
      <ul>
        <li><a href="./getUserList">用户列表 </a></li>
      </ul>
      
    </div>
    <!-- sideMenu End --> 
    
    <script type="text/javascript">
			jQuery(".sideMenu").slide({
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 

    
    
    
    
    
    
    
</div>

<div class=" admin-content">
	
		<div class="daohang">
			<ul>
				
				
			</ul>

       

	
</div>
	
	


<div class="admin-biaogelist">
	
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 景点列表</ul>
      
      <dl class="am-icon-home" style="float: right;"> 当前位置： 首页 > <a href="#">景点列表</a></dl>
      
      <dl>
        <button type="button" class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus"> <a href="addmovie.jsp">新增景点</a></button>
      </dl>
      
      
    </div>
	
	<div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
  <ul>
  <form action = "back_search_movie"  >  
    <li><input type="text" class="am-form-field am-input-sm am-input-xm" name = "name" placeholder="关键词搜索" /></li>
    <li><button  class="am-btn am-radius am-btn-xs am-btn-success" style="margin-top: -1px;">搜索</button></li>
  </form>
  </ul>
</div>


    <form class="am-form am-g">
          <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
            <thead>
              <tr class="am-success">
                <th class="table-id">ID</th>
                <th class="table-author am-hide-sm-only">名称</th>
                <th class="table-author am-hide-sm-only">简介</th>
                <th class="table-type">图片地址</th>
                <th class="table-author am-hide-sm-only">类型</th>
                <th width="163px" class="table-set">操作</th>
              </tr>
            </thead>
            <tbody>
            <c:forEach items="${SceneList}" var="p">
              <tr>
                <td>${p.sceneId}</td>
                <td>${p.sceneName} <a href="re-moviename.jsp?id=${p.sceneId}"><span class="am-icon-pencil-square-o"></span></a></td>
                <td>${p.sceneSumamry} <a href="re-introduction.jsp?id=${p.sceneId}"><span class="am-icon-pencil-square-o"></span></a></td>
                <td>${p.scenePic}</td>
                <td >${p.sceneType} <a href="re-time.jsp?id=${p.sceneId}"><span class="am-icon-pencil-square-o"></span></a></td>
                <td><div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                      <a href="deleteScene?sceneId=${p.sceneId}"><span class="am-icon-trash-o"></span></a>
                    </div>
                    <div class="am-btn-group">
                      <a href="addSceneType?sceneId=${p.sceneId}&sceneName=${p.sceneName}"><span class="am-icon-road"></span></a>
                    </div>
                  </div></td>
              </tr>
              	</c:forEach>
            </tbody>
          </table>
          
          
          
          
      
          <hr />
          <p>注：.....</p>
        </form>
 
 
 
 
 <div class="foods">
 	<p>
					唯一指定邮箱：248207330@qq.com
			© 2018 My Show | Design by  <a
				href="#">七仙女</a>
				</p>
  <dl>
    <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
  </dl>
</div>




</div>

</div>




</div>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]--> 

<!--[if (gte IE 9)|!(IE)]><!--> 
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->



</body>

</html>