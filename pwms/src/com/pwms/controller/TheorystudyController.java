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
import com.pwms.tools.ArticleTools;
/**
 * 暂时不用
 * @author Administrator
 *
 */
//@Controller
//@RequestMapping("/theory")
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
		return getList("lljd",model);
	}
	@RequestMapping("")
	public String theory(HttpServletRequest request, Model model) {
		return getList("lljd",model);
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
	@RequestMapping("/{type}/list")
	public String getList(@PathVariable String type, Model model){
		return ArticleTools.getArticleListByType(type, model, noticeService);
	}
} 
