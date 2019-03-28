<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<meta charset="UTF-8">
		<title>发布微博</title>
		 <style>
        *{
            margin:0;
            padding: 0;
        }
        body{
            background-color: pink;
        }
        .outer{
            width: 600px;
            margin:20px auto 0px;
            padding:20px 40px;
            background-color: #fff;
            border-radius:8px;
        }
        .head{
            font-size: 20px;
            margin-bottom: 20px;
        }
        #userName{
            font-size: 20px;
            outline:none;
            padding: 2px 8px;
        }
        #userWords{
            width: 100%;
            height: 100px;
            outline: none;
            resize: none;
            font-size: 14px;
            padding: 10px;
        }
        .word_footer{
            margin-top: 20px;
            line-height: 30px;
            font-size: 20px;
        }
        #btn{
            float:right;
            width: 80px;
            height: 30px;
            border:none;
            background: #ccc;
            color:#fff;
            font-size: 14px;
            border-radius: 5px;
            outline: none;
        }
        #myList{
            margin-top: 20px;
        }
        #myList li{
            list-style: none;
            overflow: hidden;
        }
        #myList li img{
            width: 50px;
            height: 50px;
            border-radius: 50%;
            float:left;
        }
        .right{
            float:right;
            width: 530px;
        }
        .top a{
            float:right;
            text-decoration: none;
            color:gray;
        }
        .top a:hover{
            color:orange;
        }
        .words{
            margin-top: 10px;
            margin-bottom: 20px;

        }
    </style>
</head>
<body>
    <div class="outer">
        <div class="head">
            用户：<input type="text" id="userName">
        </div>
        <textarea name="" id="userWords" cols="30" rows="10"></textarea>
        <div class="word_footer">
            <span id="wordsNum">还可以输入140个字</span>
            <button id="btn">发布</button>
        </div>
        <ul id="myList">

        </ul>
    </div>

    <script src="../tween.js"></script>
    <script>
        function getId(str){
            return document.getElementById(str);
        }
        var userName = getId('userName');
        var userWords = getId('userWords');
        var wordsNum = getId('wordsNum');
        var btn = getId('btn');
        var myList = getId('myList');
        userName.oninput = function(){
            // 当两个输入框内容都不为空时，改变按钮颜色，可以点击
            judge();
        }
        userWords.oninput = function(){
            // 当两个输入框内容都不为空时，改变按钮颜色，可以点击
            judge();
            // 每次输入都获取内容长度，并计算剩余可输入字数
            var wLength = 140 - userWords.value.length;
            if(wLength <= 0){
                wLength = 0;
                // userWords.disabled = true;
                userWords.value.innerHTML = userWords.value.substring(0,140);
            }
            wordsNum.innerHTML = '还可以输入' + wLength + '个字';
        }
        function judge(){
            if(userWords.value && userName.value){
                btn.style.backgroundColor = 'orangered';
                btn.onclick = function(){
                    var newLi = document.createElement('li');
                    newLi.innerHTML = '<img src="1.gif" alt=""><div class="right"><p class="top"><span class="name">'+userName.value+'</span><a href="#" class="remove">删除</a></p><p class="words">'+userWords.value+'</p></div>';
                    // 将创建好的li添加到ul中
                    if(myList.children.length != 0){
                        console.log(myList.children);
                        myList.insertBefore(newLi,myList.firstElementChild);
                    }else{
                        myList.appendChild(newLi);
                    }
                    // 获取到插入的li的高度,再将li设置为0
                    var end = newLi.offsetHeight;
                    var start = 0;
                    var change = end - start;
                    var t = 0;
                    var maxT = 50;
                    var time = setInterval(function(){
                        t++;
                        if(t >= maxT){
                            clearInterval(time);
                        }
                        newLi.style.height = Tween.Elastic.easeOut(t,start,change,maxT) + 'px';
                    },20);

                    // 元素添加完毕，清除输入框
                    userName.value = '';
                    userWords.value = '';
                    wordsNum.innerHTML = '还可以输入140个字';
                    btn.onclick = null;
                    btn.style.backgroundColor = '#ccc';
                    var remBtn = myList.getElementsByTagName('a');
                    for(var i=0; i<remBtn.length; i++){
                        remBtn[i].onclick = function(){
                            var t = 0;
                            var myLi = this.parentNode.parentNode.parentNode;
                            var start = myLi.offsetHeight;
                            var end = 0;
                            var change = end - start;
                            var maxT = 50;
                            var time = setInterval(function(){
                                t++;
                                if(t >= 50){
                                    clearInterval(time);
                                    myList.removeChild(myLi);
                                }
                                myLi.style.height = Tween.Elastic.easeOut(t,start,change,maxT) + 'px';
                            },20);

                        }
                    }
                }

            }else{
                btn.style.backgroundColor = '#ccc';
                btn.onclick = null;
            }
        }
    </script>
</body>
--------------------- 
作者：yl107 
来源：CSDN 
原文：https://blog.csdn.net/yl107/article/details/74998726 
版权声明：本文为博主原创文章，转载请附上博文链接！
</html>