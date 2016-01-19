<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>党务管理系统</title>
<link href="/pwms/res/website/style/base.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/style1.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="/pwms/res/website/style/normalize.css" />
<link rel="stylesheet" type="text/css" href="/pwms/res/website/style/set2.css" />
<script src="/pwms/res/website/js/jquery.js" type="text/javascript"></script>
<script src="/pwms/res/website/js/js.js" type="text/javascript"></script>
<script src="/pwms/res/website/js/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="/pwms/res/website/js/jquery.cycle.js" type="text/javascript"></script>
     <script src="/pwms/res/website/js/jquery.luara.0.0.1.min.js"></script>
	<link rel="stylesheet" href="/pwms/res/website/style/style3.css"/>
    <!--Luara样式文件-->
    <!--渐隐样式-->
    <link rel="stylesheet" href="/pwms/res/website/style/luara.css"/>
<script type="text/javascript">
	$(function(){
		$('#banner1').cycle({ 
				fx:'scrollLeft',
				pager:'#btn1'
		});
			$('#banner2').cycle({ 
				fx:'scrollLeft',
				pager:'#btn2'
		});
	})
</script>

<style type="text/css">
#tableDiv{
border:1px gray dashed;
}
#table1 td{
padding-left:11px;
padding-bottom:10px;
}
</style>
</head>
<body>
<%@ include file="header.jsp"%>
<div class="main_all">
 <!--滚动图片start
        <div id="adsFla1">
          <div id="banner1"> 
		  <img onClick="diao();" src="/pwms/res/website/images/ad1.png" width="1000" /> 
		  <img onClick="diao();" src="/pwms/res/website/images/ad2.png" width="1000" /> 
		  <img onClick="diao();" src="/pwms/res/website/images/ad3.png" width="1000"  /> 
		  <img onClick="diao();" src="/pwms/res/website/images/ad4.png" width="1000" /> 
		</div>
          <div id="btn1"></div>
        </div>
        <!--滚动图片end-->
<!--<div class="banner"> <img src="/pwms/res/website/images/banner1.png" /></div>-->
<div class="news">
  <div class="news_left">
    <div class="news_move">
		
				 <div class="example">
					<ul>
						<li><img src="/pwms/res/website/images/news_1.jpg" alt="news_1"/></li>
						<li><img src="/pwms/res/website/images/news_2.jpg" alt="news_2"/></li>
						<li><img src="/pwms/res/website/images/news_5.jpg" alt="news_5"/></li>
						<li><img src="/pwms/res/website/images/news_4.jpg" alt="news_4"/></li>
					</ul>
					<ol>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
					</ol>
				</div>
				<!--Luara图片切换骨架end-->
				<script>
				$(function(){
					<!--调用Luara示例-->
					$(".example").luara({width:"310",height:"245",interval:4000,selected:"seleted"});

				});
				</script>

	</div>
    <div class="news_list_a">
    	<div class="news_left_title">
   <div class="index_tab_top">
        <ul class="index_tab_list">
          <li class="press"><a href="#"><img src="/pwms/res/website/images/icon.gif" /> 新闻</a></li>
        </ul>
        <div class="news_more"><a href="news.html"><img src="/pwms/res/website/images/more.gif" border="0" /></a></div>
      </div>
 </div>
    	
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="20"><a href="#"></a><img src="/pwms/res/website/images/dot1.png" width="20" height="23" /> <a href="#"></a></td>
          <td align="left" class="index_table_size"><a href="detail.html">媒体聚焦媒体三问&quot;..</a></td>
          <td width="24" align="center" class="public_color1">2015-10:11</td>
        </tr>
        <tr>
          <td width="20"><img src="/pwms/res/website/images/dot1.png" width="20" height="23" /></td>
          <td align="left" class="index_table_size"><a href="#">用改革之手点燃创新..</a></td>
          <td width="24" align="center" class="public_color1">2016-10:11</td>
        </tr>
        <tr>
          <td width="20"><img src="/pwms/res/website/images/dot1.png" width="20" height="23" /></td>
          <td align="left" class="index_table_size"><a href="#">顾国彪院士：自缚手脚..</a></td>
          <td width="24" align="center" class="public_color1">2015-10:11</td>
        </tr>
      </table>
    </div>
  </div>
  <div class="notify">
     <a href="#" class="nb"><img src="/pwms/res/website/images/icon.gif" />公告</a>
	 <div class="notify_more"><a href="index2.html"><img src="/pwms/res/website/images/more.gif" border="0" /></a></div>
	 <div class="notify_list">
      <marquee onmouseout="this.start();" onmouseover="this.stop();" direction="up" scrolldelay="50" scrollamount="3">
	  <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="20"><img src="/pwms/res/website/images/dot1.png" width="20" height="23" /></td>
          <td align="left" class="index_table_size"><a href="#">评论：残疾人就业没...</a></td>
          <td width="24" align="center" class="public_color1">10:11</td>
        </tr>
		<tr>
          <td width="20"><img src="/pwms/res/website/images/dot1.png" width="20" height="23" /></td>
          <td align="left" class="index_table_size"><a href="#">评论：残疾人就业...</a></td>
          <td width="24" align="center" class="public_color1">10:11</td>
        </tr>
      </table>
	  </marquee>
    </div>
    </div>
    <!--<div class="login_xxrl"><img src="/pwms/res/website/images/xiaoli.png" /></div>-->
  </div>



	
<div class="news">
  <div class="news1">
    <div class="news1_title">
      <div class="news1_title_text">通知公告</div>
      <div  class="news_more"><a href="#"><img src="/pwms/res/website/images/more.gif" border="0" /></a></div>
    </div>
    <div class="news_pic"><img src="/pwms/res/website/images/pic1.png" /></div>
    <div class="news_list">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
      	<c:forEach items="${noticeList}" var="item"> 
        <tr>
          <td width="20"><img src="/pwms/res/website/images/5.png" width="11" height="11" /></td>
          <td align="left" class="index_table_size"><a href="#">${item.title}</a></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="news2">
    <div class="news1_title">
      <div class="news1_title_text">课程列表</div>
      <div  class="news_more"><a href="#"><img src="/pwms/res/website/images/more.gif" border="0" /></a></div>
    </div>
    <div class="news_pic"><img src="/pwms/res/website/images/pic2.png" width="290" height="99" /></div>
    <div class="news_list">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
      	<c:forEach items="${courseList}" var="item"> 
        <tr>
          <td width="20"><img src="/pwms/res/website/images/5.png" width="11" height="11" /></td>
          <td align="left" class="index_table_size"><a href="#">${item.title}</a></td>
        </tr>
       </c:forEach>
      </table>
    </div>
  </div>
  <div class="news3">
    <div class="news1_title">
      <div class="news1_title_text">理论学习</div>
      <div  class="news_more"><a href="#"><img src="/pwms/res/website/images/more.gif" border="0" /></a></div>
    </div>
    <div class="news_pic"><img src="/pwms/res/website/images/pic3.png" width="290" height="99" /></div>
    <div class="news_list">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
      	<c:forEach items="${courseList}" var="item"> 
        <tr>
          <td width="20"><a href="#"></a><img src="/pwms/res/website/images/1.png" /> <a href="#"></a></td>
          <td align="left" class="index_table_size"><a href="#">${item.title}</a></td>
        </tr>
       </c:forEach>
      </table>
    </div>
  </div>
  </div>
  <div class="news">
  <div class="news1">
    <div class="news1_title">
      <div class="news1_title_text"> 重要文件列表</div>
      <div  class="news_more"><a href="#"><img src="/pwms/res/website/images/more.gif" border="0" /></a></div>
    </div>
    <div class="news_pic"><img src="/pwms/res/website/images/pic1.png" /></div>
    <div class="news_list">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
      	<c:forEach items="${importdocList}" var="item">
        <tr> 
          <td width="20"><a href="#"></a><img src="/pwms/res/website/images/1.png" /> <a href="#"></a></td>
          <td align="left" class="index_table_size"><a href="#">${item.title}</a></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="news2">
    <div class="news1_title">
      <div class="news1_title_text">进度</div>
      <div  class="news_more"><a href="#"><img src="/pwms/res/website/images/more.gif" border="0" /></a></div>
    </div>
    <div class="news_pic"><img src="/pwms/res/website/images/pic2.png" width="290" height="99" /></div>
    <div class="news_list">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
      	<c:forEach items="${processList}" var="item">
        <tr>
          <td width="20"><a href="#"></a><img src="/pwms/res/website/images/1.png" /> <a href="#"></a></td>
          <td align="left" class="index_table_size"><a href="#">${item.title}</a></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </div>
  <div class="news3">
    <div class="news1_title">
      <div class="news1_title_text">学生工作</div>
      <div  class="news_more"><a href="#"><img src="/pwms/res/website/images/more.gif" border="0" /></a></div>
    </div>
    <div class="news_pic"><img src="/pwms/res/website/images/pic3.png" width="290" height="99" /></div>
    <div class="news_list">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="20"><a href="#"></a><img src="/pwms/res/website/images/1.png" /> <a href="#"></a></td>
          <td align="left" class="index_table_size"><a href="#">媒体聚焦媒体三问&quot;22人公考零分&quot;：如此恶劣违何</a></td>
        </tr>
        <tr>
          <td width="20"><img src="/pwms/res/website/images/2.png" width="11" height="11" /></td>
          <td align="left" class="index_table_size"><a href="#">三部门解读普通高等学校毕业生就业创业工作通知</a></td>
        </tr>
        <tr>
          <td width="20"><img src="/pwms/res/website/images/3.png" width="11" height="11" /></td>
          <td align="left" class="index_table_size"><a href="#">党报评论君：国家级“科技粉”习近平的“科技经”</a></td>
        </tr>
        <tr>
          <td width="20"><img src="/pwms/res/website/images/4.png" width="11" height="11" /></td>
          <td align="left" class="index_table_size"><a href="#">用改革之手点燃创新引擎（人民时评）</a></td>
        </tr>
        <tr>
          <td width="20"><img src="/pwms/res/website/images/5.png" width="11" height="11" /></td>
          <td align="left" class="index_table_size"><a href="#">顾国彪院士：自缚手脚何以弯道超车</a></td>
        </tr>
      </table>
    </div>
  </div>
  
  
</div>
<div class="zyjs">
<div class="zyjs_title">
</div>
<div class="zyjs_pic">
	<p>
<span>校内友情链接：</span>
<ul>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	
</ul></p>
<br />
<p>
<span>校外友情链接：</span>
<ul>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	<li><a>中国共青团 </a></li>
	
</ul></p>
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
