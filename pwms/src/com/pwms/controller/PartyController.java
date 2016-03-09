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
 * ��ʱ����
 * @author wy
 *
 */
//@Controller
//@RequestMapping("/party")
public class PartyController extends BaseController {
	//�鿴����ר�����������Ϣ,����ר�����ͼƬ������ �Լ������б���ʾ
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
	 * ���ʵ���ר���µ��б�
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/list")
	public String getList(@PathVariable String type, Model model){
		return ArticleTools.getArticleListByType(type, model, noticeService);
	}
	/**
	 * ��ȡ�������²�����
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/{id}")
	public String getArticle(@PathVariable String type, @PathVariable Integer id,Model model){
		return ArticleTools.getArticleById(model, id, type, noticeService);
	}
}
