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
	 * 获取所有文章
	 * @param model
	 * @return
	 */
	@RequestMapping("/article-list")
	public String getAll(Model model){
		List<NoticeTheroyContruction> article = new ArrayList<NoticeTheroyContruction>();
		article.addAll(articleService.getNoticeByType(1));
		article.addAll(articleService.getNoticeByType(2));
		article.addAll(articleService.getNoticeByType(4));
		model.addAttribute("aList", article);//此处应获取全部文章
		return "admin/article/article-list";
	}
	/**
	 * 添加文章
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
		model.addAttribute("msg", "文章发布成功！");
		return "admin/notice-msg";
	}
	//以表单的形式显示理论文章，便于用户修改文章
	@RequestMapping("/modifyview")
	public String modifyview(int id, Model model){
		return null;
	}
	/**
	 * 显示要修改的文章
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/article-modify")
	public String modify(int id, Model model){
		//System.out.println(id);
		model.addAttribute("article", articleService.getNoticeById(id));
		return "admin/article/article-modify";
	}
	/**
	 * 修改文章
	 * @param article
	 * @param model
	 * @return
	 */
	@RequestMapping("/updatearticle")
	public String updateArticle(NoticeTheroyContruction article,Model model){
		article.setDateline(new Date());
		articleService.modifyNotice(article);
		model.addAttribute("msg", "文章修改成功！");
		return "admin/notice-msg";
	}
	/**
	 * 删除文章
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/delete")
	public @ResponseBody String delete(int id, Model model){
		NoticeTheroyContruction a = articleService.getNoticeById(id);
		articleService.deleteNotice(a);
		return "删除成功";
	}
}
