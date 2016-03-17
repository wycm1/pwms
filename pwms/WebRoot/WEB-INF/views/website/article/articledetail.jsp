<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${article.title}</title>
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
		<a class="maincolor" href="/pwms/index.html">首页</a>
		<span class="c-999 en">&gt;</span><a class="maincolor" href="/pwms/${article.articletype.pArticletype.linkname}">${article.articletype.pArticletype.value}</a>
		<span class="c-999 en">&gt;</span><a class="maincolor" href="/pwms/${article.articletype.pArticletype.linkname}/${article.articletype.linkname}/list.html">${article.articletype.value}</a>
		<span class="c-999 en">&gt;</span>${article.title}
		</nav>
	</div>
	<div class="row c1 ml-20 mt-10 mr-20">
	<div class="col-xs-12 col-sm-2 radius">
		<ul class="upright-menu">
			<c:forEach items="${cArticletypeList}" var="item">
				<li> <a href="/pwms/${article.articletype.pArticletype.linkname}/${item.linkname}/list.html">${item.value}</a></li>
			</c:forEach>
		</ul>
	</div>
	<div class="col-xs-12 col-sm-10">
		<div class="row c1 ml-10 pl-20 pr-20 radius">
			<div class="news-header">
	 	    ${article.title}
	 	    <p style="color:#444;font-weight:400;font-size:14px;padding-top:5px;">
			发布时间:${article.dateline}
			</p>
			</div>
			<div class="news-content">
			<p>${article.contents}</p>
		</div>
	</div>
	</div>
</div>
</div>
<%@ include file="../bottom.jsp" %>
<script type="text/javascript" src="/pwms/res/js/H-ui.js"></script> 
<script type="text/javascript" src="/pwms/res/js/H-ui.admin.js"></script>
<script type="text/javascript">
$(document).ready(function() { 
	var atVal = "${article.articletype.value}"; 
	$(".upright-menu li").each(function(){
		if($(this).find("a").text() == atVal){ 
			$(this).attr("class","current");
		}
	});
});
</script>
</body>
</html>