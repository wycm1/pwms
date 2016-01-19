package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.pojo.User;
import com.pwms.service.INoticeService;
import com.pwms.service.IUserService;
/**
 * 通知公告
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/notice")
public class NoticeController extends BaseController {
	//公告首页，查看公告列表，轮播图，公告信息，支部公告，总支公告
	@Resource
	private INoticeService noticeService;
	@Resource
	private IUserService userService;
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public INoticeService getNoticeService() {
		return noticeService;
	}
	public void setNoticeService(INoticeService noticeService) {
		this.noticeService = noticeService;
	}
	@RequestMapping("")
	public String index(HttpServletRequest request, Model model){
//		List<NoticeTheroyContruction> noticeList = this.noticeService.getNoticeByType(INoticeService.NOTICE_TYPE);
//		if(verifyClient(request)){
//			outJson("{"+listToJson("noticeList",noticeList)+"}");
//			return null;
//		}
//		model.addAttribute("noticeList", noticeList);
		return getList("hdtz",model);
	}
	@RequestMapping("/")
	public String index_o(HttpServletRequest request, Model model){
		return index(request,model);
	}
	//获取公告详情
	@RequestMapping("/detail")
	public String getDetail(HttpServletRequest request, int id, Model model){
		NoticeTheroyContruction notice = this.noticeService.getNoticeById(id);
//		User user =null;
//		if(notice!=null){
//			user = userService.getUserById(notice.getUserId());
//		}
		if(verifyClient(request)){
//			outJson("{\"notice\":"+notice+", author :\""+user+"\"}");
			outJson(objectToJson("notice",notice));
			return null;
		}
		model.addAttribute("notice", notice);
//		model.addAttribute("author", user);
//		"website/noticedetail"
		return "website/noticedetail";
	}
	/**
	 * 访问党建专项下的列表
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/list")
	public String getList(@PathVariable String type, Model model){
		switch(type){
			case "hdtz":getArticleByType(model, "活动通知");break;
			case "sqrdx":getArticleByType(model, "申请人党校");break;
			case "jjfzdx":getArticleByType(model, "积极分子党校");break;
			case "ybdydx":getArticleByType(model, "预备党员党校");break;
			default:getArticleByType(model, "活动通知");break;
		}
		return "website/notice/list";
	}
	/**
	 * 该方法还要完善
	 * 根据类型获取文章列表
	 * @param model
	 * @param typeValue 文章类型的参数
	 */
	public void getArticleByType(Model model,String typeValue){
		List<NoticeTheroyContruction> noticeList = this.noticeService.getNoticeByType(1);
		model.addAttribute("articleList", noticeList);
		model.addAttribute("type", typeValue);
	}
}
