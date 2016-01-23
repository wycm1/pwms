<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>网上党校-在线考试</title>
<link href="/pwms/res/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/base.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/website/style/style1.css" rel="stylesheet" type="text/css" />
<link href="/pwms/res/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<style type="text/css">
*{margin:0;padding:0;word-wrap:break-word;}
body{
	font:12px/1.75 "瀹嬩綋", arial, sans-serif,'DejaVu Sans','Lucida Grande',Tahoma,'Hiragino Sans GB',STHeiti,SimSun,sans-serif;
	background:url(/pwms/res/website/images/bg_a1.jpg) repeat-x center top;
}
a{color:#333;text-decoration:none;float:none;}
a:hover{text-decoration:underline;}
a img{border:none;} 
div,ul,li,p,form{padding: 0px; margin: 0px;list-style-type: none;}
em{font-style: normal;font-weight: normal;}
table {padding: 0px; margin: 0px auto;list-style-type: none;}
dt,dl,dd {padding: 0px; margin: 0px;list-style-type: none;}
form{margin:0px;padding:0px;}
tr {padding: 0px; margin: 0px;list-style-type: none;}
h1 { color:#F00;}
h3,h4{padding:0px; font-size:14px; font-weight:bold;}
.clear {clear:both;height:0px; overflow:hidden;}
.line{margin:8px;height:1px;font-size:0;border-top:1px solid #E5E5E5;margin-top:8px;}

* html, * html body {
background:url(/pwms/res/website/images/bg_a1.jpg) repeat-x center top;
background-attachment:fixed;
height:100%;
}
* html { overflow:hidden;}
* html body { overflow:auto;}
* html #loading {
bottom:auto;
position:absolute;
right:0;
top: 0%;
left: 0%;
width:100%;
background-color: #E5E5E5;
z-index:1001;
height:expression(eval(document.documentElement.clientHeight));
}

#loading{
	position:fixed;
	top: 0%;
	left: 0%;
	width:100%;
	height:100%;
	background-color: #E5E5E5;
	z-index:1001;
	_height:500px;
}
.grapa{
	background:url(/pwms/res/website/images/loadingbg.jpg) no-repeat top;
	width: 337px;
	height:97px;
	margin:100px auto 0px auto;
}
.graph {
	width:2px;
	margin-left:19px;
	margin-right:18px;
	margin-top:36px;
	height:46px;
	background-image: url(/pwms/res/website/images/loading.jpg);
	background-repeat: no-repeat;
	background-position: left bottom;
}
.grapa #txt{
	text-align:right;
	float:right;
	left: 530px;
	width:40px;
	margin-top:13px;
	margin-right:20px;
	font-family:"Arial";
	font-size:13px;
}

.kchd { width:950px; margin:0 auto; height:90px;}
.kclogo {
	float:left;
	width:400px;
	margin-left: 20px;
}
.kctopr {
	float:right;
	width:400px;
	font-size: 14px;
	color: #004566;
	margin-top: 30px;
	margin-right: 15px;
}
.dbt{ margin-top:15px;
	}
.ztbg { margin:0;background:url(/pwms/res/website/images/bg_a2.jpg) repeat-x center bottom;}
.ztbf1{
	width:950px;
	margin:0 auto;
	background-color:#FFFFFF;
	border-top: 1px solid #CCC;
	border-left:1px solid #CCC;
	border-right:1px solid #CCC;
}
.ztbf2{
	width:950px;
	margin:0 auto;
	background-color:#FFFFFF;
	border-left:1px solid #CCC;
	border-right:1px solid #CCC;
	border-bottom:1px solid #CCC;
}
.dibu{ padding-bottom:10px;}
.sjbf{ width:900px; margin:0 auto;}
.st{ width:860px; margin:0 auto;}
.sttm{
	color:#B50000;
	font-size:14px;
	margin-top:5px;
}
.stxx{ color:#000000; font-size:14px; padding-left:25px;}
.stda{
	font-size:14px;
	padding-left:15px;
	border: 1px solid #FFF;
}
.stda_bj{
	font-size:14px;
	padding-left:15px;
	background-color:#FF0;
	border: 1px solid #FC0;
}
.st_zq{
	font-size:14px;
	padding-left:15px;
	background-color:#d6ebc2;
	color:#6fac35;
	border: #6fac35 1px solid;
}
.st_cw{
	font-size:14px;
	padding-left:15px;
	background-color:#ffe2db;
	color:#cc3300;
	border: #cc3300 1px solid;
}

.zts1{ float:left; width:195px;}
.zts2{
	float:left;
	width:550px;
	background-image: url(http://dx.jgjy.gov.cn/images/xinb/d_1_bg.jpg);
	background-position: center top;
	background-repeat: repeat-x;
	font-size: 20px;
	line-height: 92px;
	color: #DC0E13;
	font-weight: bold;
	padding-left:124px;
}
.zts3{ float:right; width:81px;}
.ztl{ width:360px; float:left; margin-left:15px;}
.zjr { font-size:16px; color:#996600;font-weight: bold;}
.zjrjj {font-size:14px;}
.ztr{
	width:545px;
	float:right;
	border-left-width: 1px;
	border-left-style: dashed;
	border-left-color: #000000;
	margin-right: 15px;
}
.jybt { margin-left:20px;font-size:16px; color:#996600;font-weight: bold;}
.jynr { margin-left:10px; height:450px;overflow-y:scroll; font-size:14px; line-height:150%; padding-right:10px;}

.cj_z {width:880px; margin:0 auto;}
.cjbg { width:500px; height:500px; margin:20px auto;}
.cjbg_t { margin-left:70px;}

.exam_button{cursor:pointer;margin-top:3px;margin-bottom:2px;PADDING-RIGHT: 0px;PADDING-LEFT: 0px;FONT-SIZE: 18px;PADDING-BOTTOM: 0px;PADDING-TOP: 0px;FONT-FAMILY: "榛戜綋" color: #000;width:135px;border:0px;height:40px;background-image:url(/pwms/res/website/images/btn_2.gif)}

.foot{background:url(/pwms/res/website/images/bg_a3.jpg) repeat-x center top;}
.copyright{width:950px;margin:0px auto; padding-top:10px;text-align:center;line-height:24px;}
</style> 
<script src="/pwms/res/lib/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
</head>
<body>
<div id="loading"><div class="grapa"><div class="graph" id="graph"></div></div></div>
<script type="text/javascript">
$("#graph").animate({width:"30px"},{duration:500});
</script>
<%@include file="../header.jsp"%>
<div class="kchd">
	<div class="kclogo"><img src="/pwms/res/website/images/kslogo.jpg" /></div>
	<div class="kctopr">
		<div style="float:left;">欢迎 <span style="color:red">王洋</span> 参加在线考试！</div>
	</div>
</div>
<!-- 顶部结束 -->
<div class="clear"></div>
<!--内容页主体开始-->
<div class="ztbf1">
	<div class="zts1"><img src="/pwms/res/website/images/d_11.jpg"></div>
	<div class="zts2">考试项目:2013学习十八大党章试题</div>
	<div class="zts3"><img src="/pwms/res/website/images/d_2.jpg"></div>
</div>
<div class="clear"></div>
<script type="text/javascript">
$("#graph").animate({width:"54px"},{duration:500})
</script>
<div class="ztbg">
<div class="ztbf2 dibu">
<form action="User_examfinish.asp" method="post" name="myform" id="myform" class="sjbf">
<div align="center">本项目考试总分：100分，其中，单选题50题。</div>
<div class=dbt><h3>一、单项选择题。（共50题，每题2分，每题只有1个正确的答案，少选、多选、错选不得分）</h3></div>
<div class="st">
	  <div class="sttm">1、国有企业中党的基层组织，发挥____作用，围绕企业生产经营开展工作。<BR>
</div>
      <div class="stxx">A.领导核心<BR>
B.政治核心<BR>
C.组织领导<BR>
</div>
      <div class="stda" id="dan1">您的答案：<input type="radio" name="dan1" value="A">A　<input type="radio" name="dan1" value="B">B　<input type="radio" name="dan1" value="C">C　<input type="radio" name="dan1" value="D">D　　　<a href='javascript:tag("dan1")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">2、“一切为了群众，一切依靠群众，从群众中来，到群众中去，把党的正确主张变为群众的自觉行动。”这是党章对____的表述。<BR>
</div>
      <div class="stxx">A.党的思想路线<BR>
B.党的政治路线<BR>
C.党的群众路线<BR>
</div>
      <div class="stda" id="dan2">您的答案：<input type="radio" name="dan2" value="A">A　<input type="radio" name="dan2" value="B">B　<input type="radio" name="dan2" value="C">C　<input type="radio" name="dan2" value="D">D　　　<a href='javascript:tag("dan2")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">3、在党的纪律面前____。<BR>
</div>
      <div class="stxx">A.党员和群众一律平等<BR>
B.不同级别的党员干部有所区别<BR>
C.所有党员一律平等<BR>
</div>
      <div class="stda" id="dan3">您的答案：<input type="radio" name="dan3" value="A">A　<input type="radio" name="dan3" value="B">B　<input type="radio" name="dan3" value="C">C　<input type="radio" name="dan3" value="D">D　　　<a href='javascript:tag("dan3")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">4、中国共产党主张按照____的方针，完成祖国统一的大业。<BR>
</div>
      <div class="stxx">A.和平谈判<BR>
B.两岸三通<BR>
C.“一个国家、两种制度”<BR>
</div>
      <div class="stda" id="dan4">您的答案：<input type="radio" name="dan4" value="A">A　<input type="radio" name="dan4" value="B">B　<input type="radio" name="dan4" value="C">C　<input type="radio" name="dan4" value="D">D　　　<a href='javascript:tag("dan4")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">5、入党誓词如下：我志愿加入中国共产党，拥护党的纲领，____，履行党员义务，执行党的决定，严守党的纪律，保守党的秘密，对党忠诚，积极工作，为共产主义奋斗终身，随时准备为党和人民牺牲一切，永不叛党。<BR>
</div>
      <div class="stxx">A.遵守党的章程<BR>
B.遵守国家的法律<BR>
C.遵守党的纪律<BR>
</div>
      <div class="stda" id="dan5">您的答案：<input type="radio" name="dan5" value="A">A　<input type="radio" name="dan5" value="B">B　<input type="radio" name="dan5" value="C">C　<input type="radio" name="dan5" value="D">D　　　<a href='javascript:tag("dan5")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">6、党组织对党员作出处分决定所依据的事实材料和处分决定____同本人见面。<BR>
</div>
      <div class="stxx">A.可以<BR>
B.必须<BR>
C.不<BR>
</div>
      <div class="stda" id="dan6">您的答案：<input type="radio" name="dan6" value="A">A　<input type="radio" name="dan6" value="B">B　<input type="radio" name="dan6" value="C">C　<input type="radio" name="dan6" value="D">D　　　<a href='javascript:tag("dan6")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">7、发展党员，必须坚持____的原则。<BR>
</div>
      <div class="stxx">A.集体吸收<BR>
B.个别吸收<BR>
C.个别吸收和集体吸收相结合</div>
      <div class="stda" id="dan7">您的答案：<input type="radio" name="dan7" value="A">A　<input type="radio" name="dan7" value="B">B　<input type="radio" name="dan7" value="C">C　<input type="radio" name="dan7" value="D">D　　　<a href='javascript:tag("dan7")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">8、实行党委领导下的行政领导人负责制的事业单位中党的基层组织，对重大问题进行讨论和____，同时保证行政领导人充分行使自己的职权。<BR>
</div>
      <div class="stxx">A.提出意见和建议<BR>
B.作出决定<BR>
C.参与决策<BR>
</div>
      <div class="stda" id="dan8">您的答案：<input type="radio" name="dan8" value="A">A　<input type="radio" name="dan8" value="B">B　<input type="radio" name="dan8" value="C">C　<input type="radio" name="dan8" value="D">D　　　<a href='javascript:tag("dan8")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">9、在选举党的各级代表大会的代表和委员会委员时，应当采用____的方式进行选举。<BR>
</div>
      <div class="stxx">A.举手表决<BR>
B.口头表决<BR>
C.无记名投票<BR>
</div>
      <div class="stda" id="dan9">您的答案：<input type="radio" name="dan9" value="A">A　<input type="radio" name="dan9" value="B">B　<input type="radio" name="dan9" value="C">C　<input type="radio" name="dan9" value="D">D　　　<a href='javascript:tag("dan9")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">10、党的各级委员会向____负责并报告工作。<BR>
</div>
      <div class="stxx">A.同级党委书记办公会<BR>
B.同级党的代表大会<BR>
C.同级党委常委会<BR>
</div>
      <div class="stda" id="dan10">您的答案：<input type="radio" name="dan10" value="A">A　<input type="radio" name="dan10" value="B">B　<input type="radio" name="dan10" value="C">C　<input type="radio" name="dan10" value="D">D　　　<a href='javascript:tag("dan10")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">11、坚持解放思想，实事求是，与时俱进，____。党的思想路线是一切从实际出发，理论联系实际，实事求是，在实践中检验真理和发展真理。<BR>
</div>
      <div class="stxx">A.求真务实<BR>
B.艰苦奋斗<BR>
C.执政为民<BR>
</div>
      <div class="stda" id="dan11">您的答案：<input type="radio" name="dan11" value="A">A　<input type="radio" name="dan11" value="B">B　<input type="radio" name="dan11" value="C">C　<input type="radio" name="dan11" value="D">D　　　<a href='javascript:tag("dan11")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">12、党章总纲强调，要不断提高党的创造力、凝聚力、战斗力，建设学习型、____、创新型的马克思主义执政党，使我们党始终走在时代前列，成为领导全国人民沿着中国特色社会主义道路不断前进的坚强核心。<BR>
</div>
      <div class="stxx">A.科学型<BR>
B.制度型<BR>
C.服务型<BR>
</div>
      <div class="stda" id="dan12">您的答案：<input type="radio" name="dan12" value="A">A　<input type="radio" name="dan12" value="B">B　<input type="radio" name="dan12" value="C">C　<input type="radio" name="dan12" value="D">D　　　<a href='javascript:tag("dan12")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">13、党选拔干部努力实现干部队伍的革命化、____、知识化、专业化。<BR>
</div>
      <div class="stxx">A.年轻化<BR>
B.青年化<BR>
C.科学化<BR>
</div>
      <div class="stda" id="dan13">您的答案：<input type="radio" name="dan13" value="A">A　<input type="radio" name="dan13" value="B">B　<input type="radio" name="dan13" value="C">C　<input type="radio" name="dan13" value="D">D　　　<a href='javascript:tag("dan13")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">14、党的各级组织和每一个党员都要维护党徽党旗的____，要按照规定制作和使用党徽党旗。<BR>
</div>
      <div class="stxx">A.形象<BR>
B.尊严<BR>
C.声誉</div>
      <div class="stda" id="dan14">您的答案：<input type="radio" name="dan14" value="A">A　<input type="radio" name="dan14" value="B">B　<input type="radio" name="dan14" value="C">C　<input type="radio" name="dan14" value="D">D　　　<a href='javascript:tag("dan14")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">15、党的各级代表大会的代表和委员会的产生，要体现____的意志。<BR>
</div>
      <div class="stxx">A.选举人<BR>
B.同级党委<BR>
C.上级党委<BR>
</div>
      <div class="stda" id="dan15">您的答案：<input type="radio" name="dan15" value="A">A　<input type="radio" name="dan15" value="B">B　<input type="radio" name="dan15" value="C">C　<input type="radio" name="dan15" value="D">D　　　<a href='javascript:tag("dan15")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">16、中国共产党的最大政治优势是____。<BR>
</div>
      <div class="stxx">A.密切联系群众<BR>
B.理论联系实际<BR>
C.批评与自我批评<BR>
</div>
      <div class="stda" id="dan16">您的答案：<input type="radio" name="dan16" value="A">A　<input type="radio" name="dan16" value="B">B　<input type="radio" name="dan16" value="C">C　<input type="radio" name="dan16" value="D">D　　　<a href='javascript:tag("dan16")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">17、入党介绍人的任务是认真了解申请人的思想、品质、经历和工作表现，向他解释____，说明党员的条件、义务和权利，并向党组织作出负责的报告。<BR>
</div>
      <div class="stxx">A.党的路线方针政策<BR>
B.党的纲领和党的章程<BR>
C.党的历史<BR>
</div>
      <div class="stda" id="dan17">您的答案：<input type="radio" name="dan17" value="A">A　<input type="radio" name="dan17" value="B">B　<input type="radio" name="dan17" value="C">C　<input type="radio" name="dan17" value="D">D　　　<a href='javascript:tag("dan17")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">18、现阶段我们党的统一战线是在中国共产党领导下由全体社会主义劳动者、社会主义事业的____、拥护社会主义的爱国者、拥护祖国统一的爱国者组成的最广泛的爱国统一战线。<BR>
</div>
      <div class="stxx">A.建设者<BR>
B.经营者<BR>
C.领导者<BR>
</div>
      <div class="stda" id="dan18">您的答案：<input type="radio" name="dan18" value="A">A　<input type="radio" name="dan18" value="B">B　<input type="radio" name="dan18" value="C">C　<input type="radio" name="dan18" value="D">D　　　<a href='javascript:tag("dan18")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">19、党章规定，中国共产主义青年团是中国共产党领导的____的群众组织。<BR>
</div>
      <div class="stxx">A.青年<BR>
B.青少年<BR>
C.先进青年<BR>
</div>
      <div class="stda" id="dan19">您的答案：<input type="radio" name="dan19" value="A">A　<input type="radio" name="dan19" value="B">B　<input type="radio" name="dan19" value="C">C　<input type="radio" name="dan19" value="D">D　　　<a href='javascript:tag("dan19")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">20、党章要求各级领导干部要正确行使人民赋予的权力，____，依法办事，清正廉洁。<BR>
</div>
      <div class="stxx">A.追求卓越<BR>
B.坚持原则<BR>
C.稳重为先<BR>
</div>
      <div class="stda" id="dan20">您的答案：<input type="radio" name="dan20" value="A">A　<input type="radio" name="dan20" value="B">B　<input type="radio" name="dan20" value="C">C　<input type="radio" name="dan20" value="D">D　　　<a href='javascript:tag("dan20")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">21、中国共产党是中国工人阶级的先锋队，同时是____的先锋队，是中国特色社会主义事业的领导核心，代表中国先进生产力的发展要求，代表中国先进文化的前进方向，代表中国最广大人民的根本利益。<BR>
</div>
      <div class="stxx">A.中国人民<BR>
B.中华民族<BR>
C.中国人民和中华民族<BR>
</div>
      <div class="stda" id="dan21">您的答案：<input type="radio" name="dan21" value="A">A　<input type="radio" name="dan21" value="B">B　<input type="radio" name="dan21" value="C">C　<input type="radio" name="dan21" value="D">D　　　<a href='javascript:tag("dan21")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">22、共青团的地方各级组织与同级党的地方委员会之间是____关系。<BR>
</div>
      <div class="stxx">A.领导与被领导<BR>
B.被领导与领导<BR>
C.指导与被指导</div>
      <div class="stda" id="dan22">您的答案：<input type="radio" name="dan22" value="A">A　<input type="radio" name="dan22" value="B">B　<input type="radio" name="dan22" value="C">C　<input type="radio" name="dan22" value="D">D　　　<a href='javascript:tag("dan22")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">23、党的领导主要是____的领导。<BR>
</div>
      <div class="stxx">A.政治<BR>
B.思想<BR>
C.政治、思想和组织<BR>
</div>
      <div class="stda" id="dan23">您的答案：<input type="radio" name="dan23" value="A">A　<input type="radio" name="dan23" value="B">B　<input type="radio" name="dan23" value="C">C　<input type="radio" name="dan23" value="D">D　　　<a href='javascript:tag("dan23")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">24、党的省、自治区、直辖市的代表大会，每____年举行一次。<BR>
</div>
      <div class="stxx">A.5<BR>
B.4<BR>
C.3<BR>
</div>
      <div class="stda" id="dan24">您的答案：<input type="radio" name="dan24" value="A">A　<input type="radio" name="dan24" value="B">B　<input type="radio" name="dan24" value="C">C　<input type="radio" name="dan24" value="D">D　　　<a href='javascript:tag("dan24")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">25、党章规定，党员必须履行的义务有____。<BR>
</div>
      <div class="stxx">A.6项<BR>
B.8项<BR>
C.10项</div>
      <div class="stda" id="dan25">您的答案：<input type="radio" name="dan25" value="A">A　<input type="radio" name="dan25" value="B">B　<input type="radio" name="dan25" value="C">C　<input type="radio" name="dan25" value="D">D　　　<a href='javascript:tag("dan25")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">26、社会主义初级阶段需要____的时间。<BR>
</div>
      <div class="stxx">A.十几年<BR>
B.几十年<BR>
C.上百年<BR>
</div>
      <div class="stda" id="dan26">您的答案：<input type="radio" name="dan26" value="A">A　<input type="radio" name="dan26" value="B">B　<input type="radio" name="dan26" value="C">C　<input type="radio" name="dan26" value="D">D　　　<a href='javascript:tag("dan26")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">27、我国正处于并将长期处于____。<BR>
</div>
      <div class="stxx">A.社会主义中级阶段<BR>
B.社会主义高级阶段<BR>
C.社会主义初级阶段<BR>
</div>
      <div class="stda" id="dan27">您的答案：<input type="radio" name="dan27" value="A">A　<input type="radio" name="dan27" value="B">B　<input type="radio" name="dan27" value="C">C　<input type="radio" name="dan27" value="D">D　　　<a href='javascript:tag("dan27")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">28、下列说法中，错误的应该是____。<BR>
</div>
      <div class="stxx">A.党员只能向上级党组织提出请求、申诉和控告<BR>
B.党员可以向上级党组织直至中央提出请求、申诉和控告<BR>
C.党员可以向上级党组织直至中央提出请求、申诉和控告，并要求有关组织给以负责的答复</div>
      <div class="stda" id="dan28">您的答案：<input type="radio" name="dan28" value="A">A　<input type="radio" name="dan28" value="B">B　<input type="radio" name="dan28" value="C">C　<input type="radio" name="dan28" value="D">D　　　<a href='javascript:tag("dan28")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">29、在现阶段，我国社会的主要矛盾是____。<BR>
</div>
      <div class="stxx">A.阶级矛盾<BR>
B.人民内部矛盾<BR>
C.人民日益增长的物质文化需要同落后的社会生产之间的矛盾<BR>
</div>
      <div class="stda" id="dan29">您的答案：<input type="radio" name="dan29" value="A">A　<input type="radio" name="dan29" value="B">B　<input type="radio" name="dan29" value="C">C　<input type="radio" name="dan29" value="D">D　　　<a href='javascript:tag("dan29")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">30、当党员对党的决议和政策有不同意见时，下列说法中，正确的应该是____。<BR>
</div>
      <div class="stxx">A.可以不执行党的决议和政策<BR>
B.在坚决执行的前提下，可以声明保留，并且可以把自己的意见向党的上级组织直至中央提出<BR>
C.必须坚决执行，不可以声明保留，也不允许向上级组织提出<BR>
</div>
      <div class="stda" id="dan30">您的答案：<input type="radio" name="dan30" value="A">A　<input type="radio" name="dan30" value="B">B　<input type="radio" name="dan30" value="C">C　<input type="radio" name="dan30" value="D">D　　　<a href='javascript:tag("dan30")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">31、党章总纲指出：马克思列宁主义揭示了____，它的基本原理是正确的，具有强大的生命力。<BR>
</div>
      <div class="stxx">A.共产党执政规律<BR>
B.社会主义建设规律<BR>
C.人类社会历史发展规律</div>
      <div class="stda" id="dan31">您的答案：<input type="radio" name="dan31" value="A">A　<input type="radio" name="dan31" value="B">B　<input type="radio" name="dan31" value="C">C　<input type="radio" name="dan31" value="D">D　　　<a href='javascript:tag("dan31")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">32、在选举产生党的各级代表大会的代表和委员会委员时，下列表述中，正确的是____。<BR>
</div>
      <div class="stxx">A.只能采取差额选举的办法<BR>
B.必须先采取差额选举办法进行预选，产生候选人名单，然后进行正式选举<BR>
C.可以直接采用候选人数多于应选人数的差额选举办法进行正式选举；也可以先采用差额选举办法进行预选，产生候选人名单，然后进行正式选举<BR>
</div>
      <div class="stda" id="dan32">您的答案：<input type="radio" name="dan32" value="A">A　<input type="radio" name="dan32" value="B">B　<input type="radio" name="dan32" value="C">C　<input type="radio" name="dan32" value="D">D　　　<a href='javascript:tag("dan32")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">33、党的全国代表大会每____举行一次，由中央委员会召集。<BR>
</div>
      <div class="stxx">A.3年<BR>
B.4年<BR>
C.5年<BR>
</div>
      <div class="stda" id="dan33">您的答案：<input type="radio" name="dan33" value="A">A　<input type="radio" name="dan33" value="B">B　<input type="radio" name="dan33" value="C">C　<input type="radio" name="dan33" value="D">D　　　<a href='javascript:tag("dan33")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">34、我国的社会主义建设，必须从我国的国情出发，走____道路。<BR>
</div>
      <div class="stxx">A.资本主义<BR>
B.中国特色社会主义<BR>
C.社会主义<BR>
</div>
      <div class="stda" id="dan34">您的答案：<input type="radio" name="dan34" value="A">A　<input type="radio" name="dan34" value="B">B　<input type="radio" name="dan34" value="C">C　<input type="radio" name="dan34" value="D">D　　　<a href='javascript:tag("dan34")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">35、党的____是党的全部工作和战斗力的基础。<BR>
</div>
      <div class="stxx">A.基层组织<BR>
B.干部<BR>
C.党员<BR>
</div>
      <div class="stda" id="dan35">您的答案：<input type="radio" name="dan35" value="A">A　<input type="radio" name="dan35" value="B">B　<input type="radio" name="dan35" value="C">C　<input type="radio" name="dan35" value="D">D　　　<a href='javascript:tag("dan35")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">36、党章规定，党总支部委员会和支部委员会每届任期____。<BR>
</div>
      <div class="stxx">A.2年<BR>
B.3年<BR>
C.2年或3年<BR>
</div>
      <div class="stda" id="dan36">您的答案：<input type="radio" name="dan36" value="A">A　<input type="radio" name="dan36" value="B">B　<input type="radio" name="dan36" value="C">C　<input type="radio" name="dan36" value="D">D　　　<a href='javascript:tag("dan36")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">37、预备党员预备期满，党组织认为需要继续考察和教育的，可以延长预备期，但不能超过____。<BR>
</div>
      <div class="stxx">A.半年<BR>
B.1年<BR>
C.2年<BR>
</div>
      <div class="stda" id="dan37">您的答案：<input type="radio" name="dan37" value="A">A　<input type="radio" name="dan37" value="B">B　<input type="radio" name="dan37" value="C">C　<input type="radio" name="dan37" value="D">D　　　<a href='javascript:tag("dan37")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">38、申请入党的人必须有两名党员作介绍人。这里的党员是指____。<BR>
</div>
      <div class="stxx">A.党员领导干部<BR>
B.正式党员<BR>
C.预备党员<BR>
</div>
      <div class="stda" id="dan38">您的答案：<input type="radio" name="dan38" value="A">A　<input type="radio" name="dan38" value="B">B　<input type="radio" name="dan38" value="C">C　<input type="radio" name="dan38" value="D">D　　　<a href='javascript:tag("dan38")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">39、党章要求各级领导干部要加强道德修养，讲党性、____、作表率，做到自重、自省、自警、自励。<BR>
</div>
      <div class="stxx">A.重原则<BR>
B.重品行<BR>
C.重形象<BR>
</div>
      <div class="stda" id="dan39">您的答案：<input type="radio" name="dan39" value="A">A　<input type="radio" name="dan39" value="B">B　<input type="radio" name="dan39" value="C">C　<input type="radio" name="dan39" value="D">D　　　<a href='javascript:tag("dan39")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">40、党组织对违犯党的纪律的党员，应当本着____的精神，按照错误性质和情节轻重，给以批评教育直至纪律处分。<BR>
</div>
      <div class="stxx">A.从严治党<BR>
B.批评与自我批评<BR>
C.惩前毖后、治病救人<BR>
</div>
      <div class="stda" id="dan40">您的答案：<input type="radio" name="dan40" value="A">A　<input type="radio" name="dan40" value="B">B　<input type="radio" name="dan40" value="C">C　<input type="radio" name="dan40" value="D">D　　　<a href='javascript:tag("dan40")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">41、实行行政领导人负责制的事业单位中党的基层组织，发挥____作用。<BR>
</div>
      <div class="stxx">A.领导核心<BR>
B.组织核心<BR>
C.政治核心<BR>
</div>
      <div class="stda" id="dan41">您的答案：<input type="radio" name="dan41" value="A">A　<input type="radio" name="dan41" value="B">B　<input type="radio" name="dan41" value="C">C　<input type="radio" name="dan41" value="D">D　　　<a href='javascript:tag("dan41")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">42、党的纪律处分有：警告、严重警告、____、留党察看、开除党籍。<BR>
</div>
      <div class="stxx">A.撤销党内外一切职务<BR>
B.撤销党内职务<BR>
C.记过<BR>
</div>
      <div class="stda" id="dan42">您的答案：<input type="radio" name="dan42" value="A">A　<input type="radio" name="dan42" value="B">B　<input type="radio" name="dan42" value="C">C　<input type="radio" name="dan42" value="D">D　　　<a href='javascript:tag("dan42")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">43、在党组织讨论决定对党员的党纪处分或作出鉴定时，下列说法中，正确的应该是____。<BR>
</div>
      <div class="stxx">A.本人无权参加和进行申辩<BR>
B.其他党员不可以为他作证和辩护<BR>
C.本人有权参加和进行申辩，其他党员可以为他作证和辩护<BR>
</div>
      <div class="stda" id="dan43">您的答案：<input type="radio" name="dan43" value="A">A　<input type="radio" name="dan43" value="B">B　<input type="radio" name="dan43" value="C">C　<input type="radio" name="dan43" value="D">D　　　<a href='javascript:tag("dan43")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">44、各基层单位，凡是有正式党员____以上，都应当成立党的基层组织。<BR>
</div>
      <div class="stxx">A.3人<BR>
B.5人<BR>
C.10人<BR>
</div>
      <div class="stda" id="dan44">您的答案：<input type="radio" name="dan44" value="A">A　<input type="radio" name="dan44" value="B">B　<input type="radio" name="dan44" value="C">C　<input type="radio" name="dan44" value="D">D　　　<a href='javascript:tag("dan44")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">45、中国共产主义青年团是广大青年在实践中学习____的学校。<BR>
</div>
      <div class="stxx">A.共产主义<BR>
B.中国特色社会主义<BR>
C.中国特色社会主义和共产主义<BR>
</div>
      <div class="stda" id="dan45">您的答案：<input type="radio" name="dan45" value="A">A　<input type="radio" name="dan45" value="B">B　<input type="radio" name="dan45" value="C">C　<input type="radio" name="dan45" value="D">D　　　<a href='javascript:tag("dan45")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">46、党选拔干部坚持____、任人唯贤，反对任人唯亲。<BR>
</div>
      <div class="stxx">A.五湖四海<BR>
B.政绩突出<BR>
C.政治性强<BR>
</div>
      <div class="stda" id="dan46">您的答案：<input type="radio" name="dan46" value="A">A　<input type="radio" name="dan46" value="B">B　<input type="radio" name="dan46" value="C">C　<input type="radio" name="dan46" value="D">D　　　<a href='javascript:tag("dan46")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">47、党的各级委员会实行____的制度。<BR>
</div>
      <div class="stxx">A.集体领导<BR>
B.个人分工负责<BR>
C.集体领导和个人分工负责相结合<BR>
</div>
      <div class="stda" id="dan47">您的答案：<input type="radio" name="dan47" value="A">A　<input type="radio" name="dan47" value="B">B　<input type="radio" name="dan47" value="C">C　<input type="radio" name="dan47" value="D">D　　　<a href='javascript:tag("dan47")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">48、预备党员的预备期，从____之日算起。<BR>
</div>
      <div class="stxx">A.递交入党申请书<BR>
B.递交入党志愿书<BR>
C.支部大会通过他为预备党员<BR>
</div>
      <div class="stda" id="dan48">您的答案：<input type="radio" name="dan48" value="A">A　<input type="radio" name="dan48" value="B">B　<input type="radio" name="dan48" value="C">C　<input type="radio" name="dan48" value="D">D　　　<a href='javascript:tag("dan48")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">49、中国共产党员要贯彻执行党的基本路线和各项方针、政策，带头参加改革开放和社会主义现代化建设，带动群众为经济发展和社会进步艰苦奋斗，在生产、工作、学习和社会生活中起____。<BR>
</div>
      <div class="stxx">A.桥梁和纽带作用<BR>
B.先锋模范作用<BR>
C.战斗堡垒作用<BR>
</div>
      <div class="stda" id="dan49">您的答案：<input type="radio" name="dan49" value="A">A　<input type="radio" name="dan49" value="B">B　<input type="radio" name="dan49" value="C">C　<input type="radio" name="dan49" value="D">D　　　<a href='javascript:tag("dan49")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div class="st">
	  <div class="sttm">50、坚持四项基本原则是我们的立国之本，坚持____是我们的强国之路。<BR>
</div>
      <div class="stxx">A.以经济建设为中心<BR>
B.改革开放<BR>
C.科教兴国战略<BR>
</div>
      <div class="stda" id="dan50">您的答案：<input type="radio" name="dan50" value="A">A　<input type="radio" name="dan50" value="B">B　<input type="radio" name="dan50" value="C">C　<input type="radio" name="dan50" value="D">D　　　<a href='javascript:tag("dan50")'>标记：<img border='0' src='/pwms/res/website/images/yw.gif' title='答案不确定标记一下！'></a></div>
     <div class="line"></div>
   </div>
<div align=center><input type=hidden name=subjectid value=14><input type=hidden name=sjkuid value=327><Input class="exam_button" onClick="ExamSubmit()" type=button value=" 提交答卷 " name=Submit></div>
</form>
<script type="text/javascript">
$("#graph").animate({width:"300px"},{duration:1000});
function ExamSubmit() {
	var i;
		for (i=1;i<=50;i++) {
			if(!testdan("dan"+i)){
				alert('单选题第'+i+'题尚未作答！');
				$("#dan"+i).attr("class","stda_bj");
				$("#dan"+i+" a").focus();
				return false;
				}
		}
$("#myform").submit();
}
function testdan(did) {
var dan=0;
dan=$("input[name="+did+"]:checked").length;
if(dan>=1){
	$('#'+did).attr("class","stda");
	return true;
	}
}
function tag(tid){
   if ($('#'+tid).attr("class")=="stda"){
     $('#'+tid).attr("class","stda_bj")
   }else{
     $('#'+tid).attr("class","stda")
   }
  }
</script>
</div>
<div style="height:2px;"></div>
</div>
<script type="text/javascript">
$("#graph").animate({width:"300px"},500,function(){$("#loading").hide(500);});
</script>
<!--内容页主体结束-->
<div class="clear"></div>
<div class="foot">
	<div class="copyright">四川理工学院经管学院　版权所有<br/></div>
</div>
<script type="text/javascript"> 
  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-21978991-1']);
  _gaq.push(['_setDomainName', '.jgjy.gov.cn']);
  _gaq.push(['_trackPageview']);
  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();
</script>
</body>
</html>
