<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
<link href="/pwms/res/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/base.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/style1.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<script language="javascript" src="/pwms/res/website/js/js.js"></script>
</head>
<body>
<%@ include file="header.jsp"%>
<br>
<div class="login-main">
<div class="nav">
	<nav class="breadcrumb">
	<a class="maincolor" href="/">首页</a>
	<span class="c-999 en">&gt;</span>登录
</nav>
</div>
<div class="login-wrapper">
	<div class="pd-20">
  <form action=""  method="post" class="form form-horizontal" id="form-reward-punish-add">
    <div class="row cl">
      <label class="form-label col-3"></label>
      <div class="formControls col-5">
        <input type="text" class="input-text radius size-L" value="" placeholder="身份证号或者学号" id="card" name="card" datatype="*11-16" nullmsg="不能为空" errormsg="格式不正确">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="filling"></div>
    <div class="row cl">
      <label class="form-label col-3"></label>
      <div class="formControls col-5">
        <input type="text" class="input-text radius size-L" value="" placeholder="密码" id="password" name="password" datatype="*6-16" nullmsg="密码不能为空" errormsg="密码在6~16位之间">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="filling"></div>
    <div class="row cl">
      <div class="formControls col-5 col-offset-3">
        <input id="submit" class="btn btn-primary radius size-L btn-block" type="submit" value="&nbsp;&nbsp;登录&nbsp;&nbsp;">
      </div>
    </div>
  </form>
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