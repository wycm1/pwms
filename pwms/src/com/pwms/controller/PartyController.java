package com.pwms.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.service.INoticeService;
import com.pwms.tools.ArticleTools;
/**
 * 暂时不用
 * @author wy
 *
 */
//@Controller
//@RequestMapping("/party")
public class PartyController extends BaseController {
	//查看党建专项，党的宣传信息,党建专项，宣传图片，文章 以及文章列表显示
	@Resource
	private INoticeService noticeService;
	public INoticeService getPartyServer() {
		return noticeService;
	}
	public void setPartyServer(INoticeService partyServer) {
		this.noticeService = partyServer;
	}
	@RequestMapping({"/",""})
	public String party(HttpServletRequest request, Model model){
		return getList("zyjs",model);
	}
	/**
	 * 访问党建专项下的列表
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/list")
	public String getList(@PathVariable String type, Model model){
		return ArticleTools.getArticleListByType(type, model, noticeService);
	}
	/**
	 * 获取具体文章并返回
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/{id}")
	public String getArticle(@PathVariable String type, @PathVariable Integer id,Model model){
		return ArticleTools.getArticleById(model, id, type, noticeService);
	}
}
