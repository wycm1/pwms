package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.INoticeService;
/**
 * 理论学习
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/theory")
public class TheorystudyController extends BaseController {
	// 查看推荐列表，以及一些详细的内容推荐
	@Resource
	private INoticeService theoryService;
	@Resource
	private INoticeService noticeService;
	public INoticeService getTheoryService() {
		return theoryService;
	}
	public void setTheoryService(INoticeService theoryService) {
		this.theoryService = theoryService;
	}
	@RequestMapping("/")
	public String index(HttpServletRequest request, Model model) {
		List<NoticeTheroyContruction> theoryList = this.theoryService
				.getNoticeByType(INoticeService.THEORY_TYPE);
		if (verifyClient(request)) {
			outJson("{" + listToJson("theoryList", theoryList) + "}");
			return null;
		} else {
			model.addAttribute("theoryList", theoryList);
			return "website/theory";
		}
	}
	@RequestMapping("")
	public String theory(HttpServletRequest request, Model model) {
		return getClassicaltheoryList(model);
	}
	// 获取详细信息, 根据传入的id来具体显示
	@RequestMapping("/detail/{id}")
	public String getInfo(HttpServletRequest request, @PathVariable  int id, Model model) {
		NoticeTheroyContruction theory = this.theoryService.getNoticeById(id);
		if (verifyClient(request)) {
			outJson(theory + "");
			return null;
		} else {
			model.addAttribute("theory", theory);
			return "website/theorydetail";
		}
	}
	/**
     * 显示经典理论列表
     * @param model
     * @return
     */
	@RequestMapping("classicaltheory-list")
	public String getClassicaltheoryList(Model model){
		getArticleByType(model,"理论经典");
		return "website/theroystudy/classicaltheory-list";
	}
	/**
     * 显示影像课程列表
     * @param model
     * @return
     */
	@RequestMapping("videocourse-list")
	public String getVideotheoryList(Model model){
		getArticleByType(model,"摄影课程");
		return "website/theroystudy/videocourse-list";
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
