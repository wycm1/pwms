package com.pwms.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.INoticeService;

@Controller
@RequestMapping("/admin/article")
public class AdminArticleController extends BaseController {
	@Resource
	private INoticeService articleService;
	/**
	 * ��ȡ��������
	 * @param model
	 * @return
	 */
	@RequestMapping("/article-list")
	public String getAll(Model model){
		List<NoticeTheroyContruction> article = new ArrayList<NoticeTheroyContruction>();
		article.addAll(articleService.getNoticeByType(1));
		article.addAll(articleService.getNoticeByType(2));
		article.addAll(articleService.getNoticeByType(4));
		model.addAttribute("aList", article);//�˴�Ӧ��ȡȫ������
		return "admin/article/article-list";
	}
	/**
	 * �������
	 * @param article
	 * @param model
	 * @return
	 */
	@RequestMapping("/addarticle")
	public String addArticle(NoticeTheroyContruction article,Model model){
		//System.out.println(article.getTitle());
		//System.out.println(article.getContents());
		article.setDateline(new Date());
		article.setUserId(4);
		articleService.save(article);
		model.addAttribute("msg", "���·����ɹ���");
		return "admin/notice-msg";
	}
	//�Ա�����ʽ��ʾ�������£������û��޸�����
	@RequestMapping("/modifyview")
	public String modifyview(int id, Model model){
		return null;
	}
	//����id���޸���������
	@RequestMapping("/modify")
	public String modify(int id, Model model){
		return null;
	}
	/**
	 * ɾ������
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/delete")
	public @ResponseBody String delete(int id, Model model){
		NoticeTheroyContruction a = articleService.getNoticeById(id);
		articleService.deleteNotice(a);
		return "ɾ���ɹ�";
	}
}
