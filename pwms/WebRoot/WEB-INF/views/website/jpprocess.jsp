<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>入党流程</title>
<link href="/pwms/res/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/base.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/style1.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<script language="javascript" src="/pwms/res/website/js/js.js"></script>
</head>
<body>
<%@ include file="header.jsp"%>
<div class="jpprocess-main">
<div class="nav">
	<nav class="breadcrumb">
	<i class="Hui-iconfont">&#xe67f;</i>
	<a class="maincolor" href="/">首页</a>
	<span class="c-999 en">&gt;</span>入党流程
</nav>
</div>
<div class="jpprocess-wrapper">
	<div class="five steps">
		  <span class="step">1.第一步</span>
		  <span class="active step">2.积极分子</span>
		  <span class="disabled step">3.加入支部</span>
		  <span class="disabled step">3.预备党员</span>
		  <span class="disabled step">4.正式党员</span>
	</div>
</div>
</div>
<script type="text/javascript" src="/pwms/res/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="/pwms/res/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="/pwms/res/lib/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="/pwms/res/js/H-ui.js"></script> 
<script type="text/javascript" src="/pwms/res/js/H-ui.admin.js"></script>
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