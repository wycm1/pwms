<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="/pwms/res/website/style/base.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/style1.css" rel="stylesheet" type="text/css" />
<script language="javascript" src="/pwms/res/website/js/jquery.js"></script>
<script language="javascript" src="/pwms/res/website/js/js.js"></script>
</head>
<body>
<%@ include file="header.jsp"%>
<div class="main_all">
  <div class="detail">
   <div class="detail_title"> <img src="/pwms/res/website/images/next_ico.png" width="2" height="10" /> 当前位置 ：首页 &gt;    新闻动态 &gt;     学院新闻</div>
   <div class="detail_h1">${party.title}</div>
   <div class="detail_time">发布时间：${party.dateline}</div>
   <div class="detail_text"></div>
            ${party.contents}
   </div>
    </td>
   </tr>
    </table>
  </div>
</div>
<div class="foot_mat">
  <div class="foot">
    <div class="foot_left">总访问量：4 5 6 8 <br />
      日访问量： </div>
    <div class="foot_right">建议使用1024*768分辨率以上，16位色以上，IE6以上版本浏览本网站<br />
      Copyright@enducation School ALL Rights
      版权所有@<br />
      四川理工学院艺术学院 闽ICP备 05020335 号<br />
    </div>
  </div>
</div>
</body>
</html>
