<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${type}</title>
<link href="/pwms/res/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/base.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/style1.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@ include file="../header.jsp"%>
<div class="page-main pb-20">
	<div class="nav radius">
		<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i>
		<a class="maincolor" href="../index.html">首页</a>
		<span class="c-999 en">&gt;</span><a class="maincolor" href="/pwms/school">网上党校</a>
		<span class="c-999 en">&gt;</span>${type}
		</nav>
	</div>
	<div class="row c1 ml-20 mt-10 mr-20">
	<div class="col-xs-12 col-sm-2 radius">
		<ul class="upright-menu">
			<li> <a href="/pwms/school/dxgg/list.html">党校公告</a></li>
			<li> <a href="/pwms/school/kcxx/list.html">课程学习</a></li>
			<li> <a href="/pwms/school/wybm/list.html">我要报名</a></li>
			<li> <a href="/pwms/school/bmjg/list.html">报名结果</a></li>
			<li> <a href="/pwms/school/cjcx/list.html">成绩查询</a></li>
			<li> <a href="/pwms/school/zscx/list.html">证书查询</a></li>
			<li> <a href="/pwms/school/zhzt/list.html">账号状态</a></li>
		</ul>
	</div>
	<div class="col-xs-12 col-sm-10">
		<div class="row c1 ml-10">
			<div class="panel panel-danger radius">
				<div class="panel-header">${type}</div>
				<div class="panel-body">
					<div class="row cl">
				    	<ul>
				    		<c:forEach items="${articleList}" var="item">
					    		<li><a href="#">${item.title}</a><span style="float:right">${item.dateline}</span></li>
				    		</c:forEach>
				    	</ul>
    				</div>
				</div>
		</div>
		</div>
	</div>
	</div>
</div>
<script type="text/javascript" src="/pwms/res/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="/pwms/res/js/H-ui.js"></script> 
<script type="text/javascript" src="/pwms/res/js/H-ui.admin.js"></script>
<script type="text/javascript" src="/pwms/res/website/js/js.js"></script>
<script type="text/javascript">
$(document).ready(function() { 
	$(".upright-menu li").each(function(){
		if($(this).find("a").text() == $("title").text()){
			$(this).attr("class","current");
		}
	});
});
</script>
</body>
</html>