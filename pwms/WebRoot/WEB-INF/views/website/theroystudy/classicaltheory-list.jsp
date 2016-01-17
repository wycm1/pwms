<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>经典理论</title>
<link href="/pwms/res/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/base.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/style1.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@ include file="../header.jsp"%>
<div class="page-main">
	<div class="nav radius">
		<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i>
		<a class="maincolor" href="../index.html">首页</a>
		<span class="c-999 en">&gt;</span><a class="maincolor" href="classtheroy-list.html">理论学习</a>
		<span class="c-999 en">&gt;</span>理论经典
		</nav>
	</div>
	<div class="main-container">
	<div class="left-side radius">
		<ul class="upright-menu">
			<li> <a href="/pwms/theory/classicaltheory-list.html">理论经典</a></li>
			<li> <a href="/pwms/theory/videocourse-list.html"">摄影课程</a></li>
		</ul>
	</div>
	<div class="main-box">
		<div class="panel panel-danger radius">
				<div class="panel-header">理论经典</div>
				<div class="panel-body">
					<div class="row cl">
				    	<ul>
				    	<li>2015年上半年经济形势分析与全年展望（文章）..</li>
				    	<li>2015年上半年经济形势分析与全年展望（文章）..</li>
				    	<li>2015年上半年经济形势分析与全年展望（文章）..</li>
				    	<li>2015年上半年经济形势分析与全年展望（文章）..</li>
				    	<li>2015年上半年经济形势分析与全年展望（文章）..</li>
				    	<li>2015年上半年经济形势分析与全年展望（文章）..</li>
				    	</ul>
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
$(function(){
	$("#form-reward-punish-add").Validform({
		tiptype:2,
		callback:function(form){
			form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
	$("#submit").click(function(){
		$("#form-reward-punish-add").submit();
		window.close();
	});
});
</script>
</body>
</html>