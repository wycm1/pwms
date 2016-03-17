<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="head_all">
  <div class="head">
    <div class="head_left"></div>
    <div class="head_right">
      <div class="head_sear">
       <div class="head_sear_top">
       	<c:choose>
       		<c:when test="${sessionScope.user == null}">
	        	<a href="/pwms/register.html">注册</a>
	        	<span>|</span>
	        	<a href="/pwms/login.html">登录</a>
        	</c:when>
        	<c:otherwise>
        		<font color="yellow">${sessionScope.user.name},欢迎登录</font>
	        	<span>|</span>
	        	<a href="/pwms/user/logout.html">注销</a>
        	</c:otherwise>
        </c:choose>
        	<span>|</span>
        	<a href="/pwms/admin/index.html">后台登录</a>
        </div>
        <div class="head_sear_bot">
          <div class="head_sear_con">
            <input name="" type="text" class="head_sear1" />
            &nbsp;
            <input type="image" src="/pwms/res/website/images/search1.png" />
            
          </div>
        </div>
      </div>
    </div>
  </div>
  <table border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td>
   <div id="navmenu" class="menu">
<ul>
<li><a class="current" href="/pwms/index.html">首页</a>

</li>
<li><a class="current" href="/pwms/school">网上党校</a>
		<ul>
			<li> <a href="/pwms/school/llkc/list.html">理论课程</a></li>
			<li> <a href="/pwms/school/spkc/list.html">视频课程</a></li>
			<li> <a href="/pwms/school/xxjl/list.html">学习记录</a></li>
			<li> <a href="/pwms/school/zxks/list.html">在线考试</a></li>
			<li> <a href="/pwms/school/cjcx/list.html">成绩查询</a></li>
		</ul>
</li>
<li><a class="current" href="/pwms/notice">通知公告</a>
		<ul>
			<li> <a href="/pwms/notice/hdtz/list.html">活动通知</a></li>
			<li> <a href="/pwms/notice/sqrdx/list.html">申请人党校</a></li>
			<li> <a href="/pwms/notice/jjfzdx/list.html">积极分子党校</a></li>
			<li> <a href="/pwms/notice/ybdydx/list.html">预备党员党校</a></li>
			<li> <a href="/pwms/notice/dxgg/list.html">党校公告</a></li>
			<li> <a href="/pwms/notice/xw/list.html">新闻</a></li>
		</ul>
</li>
<li><a class="current" href="/pwms/party">党建专项</a>
		<ul>
			<li> <a href="/pwms/party/zyjs/list.html">中央精神</a></li>
			<li> <a href="/pwms/party/qzlx/list.html">群众路线</a></li>
			<li> <a href="/pwms/party/zgm/list.html">中国梦</a></li>
		</ul>
</li>
<li><a class="current" href="/pwms/theory">理论学习</a>
		<ul>
			<li> <a href="/pwms/theory/lljd/list.html">理论经典</a></li>
		</ul>
</li>
<li><a class="current" href="/pwms/impdoc">重要文件</a>
		<ul>
			<li> <a href="/pwms/impdoc/dswx/list.html">党史文献</a></li>
			<li> <a href="/pwms/impdoc/gzzd/list.html">规则制度</a></li>
			<li> <a href="/pwms/impdoc/jddd/list.html">经典导读</a></li>
			<li> <a href="/pwms/impdoc/cyws/list.html">常用文书</a></li>
			<li> <a href="/pwms/impdoc/rdbd/list.html">入党必读</a></li>
			<li> <a href="/pwms/impdoc/xtsc/list.html">系统手册</a></li>
		</ul>
</li>
<li><a class="current" href="/pwms/process">入党流程</a>
 <ul>
	<li><a href="/pwms/process/jpprocess.html">入党流程</a></li>  
	<li><a href="/pwms/process/myprocess.html">我的流程</a></li>  
</ul>
</li>
<li><a class="current" href="/pwms/user/mybranch.html">个人中心</a>
	<ul>
		<li><a href="/pwms/user/mybranch.html">个人状态</a></li>  
		<li><a href="/pwms/user/mybranch.html">支部情况</a></li>  
		<li><a href="/pwms/user/mybranch.html">我的消息</a></li>  
		<li><a href="/pwms/user/userdetail-add.html">添加详细信息</a></li>  
	</ul>
</li>

<div class="clear"> </div>
</div>
      </td>
    </tr>
  </table>
</div>
<!-- <script src="/pwms/res/website/js/jquery-1.8.3.min.js" type="text/javascript"></script> -->
<script src="/pwms/res/lib/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
  	$("#navmenu ul li:has(ul)").hover(function() {
        $(this).children("a").css({
            color: "white"
        });
        if ($(this).find("li").length > 0) {
            $(this).children("ul").stop(true, true).slideDown(100);
        }
    }, function() {
        $(this).children("a").css({
            color: "wheat"
        });
        $(this).children("ul").stop(true, true).slideUp("fast");
    }); 
});
</script>