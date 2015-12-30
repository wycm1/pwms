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
  <div class="two_page">
    <table width="1000" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="221" valign="top"><div class="two_left">
            <div class="two_left_title">新闻动态</div>
            <table border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td class="two_center"><ul class="left_empty">
                    <li><a href="news.html">学院新闻</a></li>
                    <li><a href="notis.html">通知通告</a></li>
                  </ul></td>
              </tr>
              <tr>
                <td><img src="/pwms/res/website/images/two_bottom.png" width="221" height="37" /></td>
              </tr>
            </table>
          </div></td>
        <td valign="top">
		<div class="two_right">
            <div class="two_right_title">
              <div class="two_right_title_h1"> 通知通告</div>
              <div class="two_right_title_next"> <img src="/pwms/res/website/images/next_ico.png" width="2" height="10" /> 当前位置 ：首页 &gt;    新闻动态 &gt;    通知通告</div></div>
              <div class="two_img"><img src="/pwms/res/website/images/notice.jpg" /></div>
              <div class="two_news_list">
                <table width="98%" border="0" align="left" cellpadding="0" cellspacing="0">
                  <c:forEach items="${noticeList}" var="item"> 
                  <tr>
                    <td width="20"><a href="#"></a><img src="/pwms/res/website/images/dot2.png" width="4" height="6" /> <a href="#"></a></td>
                    <td align="left" class="index_table_size"><a href="./party/detail/${item.id}">${item.title}</a></td>
                    <td width="24" align="center" class="public_color1">10:11</td>
                  </tr>
                 </c:forEach>
                </table>
				 
              </div>
             <div class="page"><a href="#">上一页</a><a href="#">1</a><a href="#">2</a><a href="#">3</a><a href="#">4</a><a href="#">下一页</a></div>
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
