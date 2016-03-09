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
		article = articleService.selectAll();
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
	/**
	 * ��ʾҪ�޸ĵ�����
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/article-modify")
	public String modify(int id, Model model){
		//System.out.println(id);
		model.addAttribute("article", articleService.getNoticeById(id));
		System.out.println("��������id��" + articleService.getNoticeById(id).getArticletype().getId());
		System.out.println("��������pid��" + articleService.getNoticeById(id).getArticletype().getPid());
		model.addAttribute("articletypes",articleService.getAllChildrenType());
		return "admin/article/article-modify";
	}
	/**
	 * �޸�����
	 * @param article
	 * @param model
	 * @return
	 */
	@RequestMapping("/updatearticle")
	public String updateArticle(NoticeTheroyContruction article,Model model){
		article.setDateline(new Date());
		articleService.modifyNotice(article);
		model.addAttribute("msg", "�����޸ĳɹ���");
		return "admin/notice-msg";
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
