<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="head_all">
  <div class="head">
    <div class="head_left"></div>
    <div class="head_right">
      <div class="head_sear">
        <div class="head_sear_top">
        	<a href="#"><img src="/pwms/res/website/images/ico1.png" /> 设为首页 </a>
        	<a href="/pwms/register.html"><img src="/pwms/res/website/images/ico2.png" /> 注册</a>
        	<a href="/pwms/login.html"><img src="/pwms/res/website/images/ico4.png" /> 登录</a>
        	<a href="/pwms/user/userdetail-add.html"><img src="/pwms/res/website/images/ico5.png" /> 用户详细信息添加</a>
        	<a href="/pwms/admin/index.html"><img src="/pwms/res/website/images/ico6.png" />后台登录</a>
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
<li><a class="current" href="/pwms/">首页</a>

</li>
<li><a class="current" href="/pwms/notice">通知公告</a>
		<ul>
			<li> <a href="/pwms/notice/hdtz/list.html">活动通知</a></li>
			<li> <a href="/pwms/notice/sqrdx/list.html">申请人党校</a></li>
			<li> <a href="/pwms/notice/jjfzdx/list.html">积极分子党校</a></li>
			<li> <a href="/pwms/notice/ybdydx/list.html">预备党员党校</a></li>
		</ul>
</li>
<li><a class="current" href="/pwms/school">网上党校</a>
		<ul>
			<li> <a href="/pwms/school/dxgg/list.html">党校公告</a></li>
			<li> <a href="/pwms/school/kcxx/list.html">课程学习</a></li>
			<li> <a href="/pwms/school/wybm/list.html">我要报名</a></li>
			<li> <a href="/pwms/school/bmjg/list.html">报名结果</a></li>
			<li> <a href="/pwms/school/cjcx/list.html">成绩查询</a></li>
			<li> <a href="/pwms/school/zscx/list.html">证书查询</a></li>
			<li> <a href="/pwms/school/zhzt/list.html">账号状态</a></li>
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
			<li> <a href="/pwms/theory/classicaltheory-list.html">理论经典</a></li>
			<li> <a href="/pwms/theory/videocourse-list.html"">摄影课程</a></li>
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
<li><a class="current" href="/pwms/user/mybranch.html">我的支部</a>

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