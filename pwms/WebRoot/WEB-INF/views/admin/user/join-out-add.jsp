﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<%@ include file="../path.jsp" %>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,member-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="res/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="res/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="res/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="res/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加转入转出记录</title>
</head>
<body>
<div class="pd-20">
  <form action="admin/user/addjoinout"  method="post" class="form form-horizontal" id="form-join-out-add">
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>姓名：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="" id="name" name="name" datatype="*2-5" nullmsg="姓名不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>学号：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" value="" placeholder="" id="stuid" name="stuid"  datatype="stuid" nullmsg="学号不能为空">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>转出单位：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" name="outUnit" id="outUnit" datatype="*" nullmsg="请输入转出单位！">
      </div>
      <div class="col-4"> </div>
    </div>
	<div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>转入单位：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" name="joinUnit" id="joinUnit" datatype="*" nullmsg="请输入转入单位！">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>转出时间：</label>
      <div class="formControls col-5">
		<input type="text" name="outDate" onfocus="WdatePicker()" id="datemin" class="input-text Wdate" style="width:120px;">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>原基层党委通讯地址：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" name="originContactAddress" id="originContactAddress" datatype="*" nullmsg="请输入原基层党委通讯地址！">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>原基层党委联系电话：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" name="originContactPhone" id="originContactPhone" datatype="m" nullmsg="请输入原基层党委联系电话！">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>转入单位经办人：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" name="destAgent" id="destAgent" datatype="*" nullmsg="请输入转入单位经办人！">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>转入单位经办人联系电话：</label>
      <div class="formControls col-5">
        <input type="text" class="input-text" name="destAgentPhone" id="destAgentPhone" datatype="m" nullmsg="请输入转入单位经办人联系电话！">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <label class="form-label col-3"><span class="c-red">*</span>接受时间：</label>
      <div class="formControls col-5">
		<input type="text" name="joinDate" onfocus="WdatePicker()" id="datemin" class="input-text Wdate" style="width:120px;">
      </div>
      <div class="col-4"> </div>
    </div>
    <div class="row cl">
      <div class="col-9 col-offset-3">
        <input id="submit" class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
      </div>
    </div>
  </form>
</div>
</div>
<script type="text/javascript" src="res/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="res/lib/icheck/jquery.icheck.min.js"></script>  
<script type="text/javascript" src="res/lib/Validform/5.3.2/Validform.min.js"></script>
<script type="text/javascript" src="res/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="res/lib/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="res/js/H-ui.js"></script> 
<script type="text/javascript" src="res/js/H-ui.admin.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-join-out-add").Validform({
		tiptype:2,
		callback:function(form){
			form[0].submit();
			var index = parent.layer.getFrameIndex(window.name);
			parent.$('.btn-refresh').click();
			parent.layer.close(index);
		}
	});
	$("#submit").click(function(){
		$("#form-join-out-add").submit();
		window.close();
	});
});
</script>
</body>
</html>