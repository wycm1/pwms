package com.pwms.tools;

import java.util.List;

import org.springframework.ui.Model;

import com.pwms.pojo.Articletype;
import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.INoticeService;

public class ArticleTools {
	/**
	 * 根据type查询该type所有文章
	 * 分成两部查询
	 * @param type
	 * @param model
	 * @param noticeService
	 * @return "website/notice/list"
	 */
	public static String getArticleListByType(String type, 
			Model model, 
			INoticeService noticeService){
		Articletype at = noticeService.selectByLinkname(type);
		List<NoticeTheroyContruction> noticeList = noticeService.getNoticeByType(at.getId());
		Articletype pAt = noticeService.getArticletypeByid(at.getPid());//获取该文章一级类型
		List<Articletype> atList = noticeService.getByPid(at.getPid());
		model.addAttribute("pArticletype", pAt);
		model.addAttribute("cArticletypeList",atList);
		model.addAttribute("articleList", noticeList);
		model.addAttribute("type", at.getValue());
		return "website/article/articlelist";
	}
	/**
	 * 根据文章id获取文章
	 * @param model
	 * @param id
	 * @param typeValue
	 */
	public static String getArticleById(Model model,int id,String linkname,INoticeService noticeService){
		NoticeTheroyContruction notice = noticeService.getNoticeById(id);
		Articletype at = noticeService.selectByLinkname(linkname);
		Articletype pAt = noticeService.getArticletypeByid(at.getPid());//获取该文章一级类型
		List<Articletype> atList = noticeService.getByPid(at.getPid());
		model.addAttribute("pArticletype", pAt);
		model.addAttribute("cArticletypeList",atList);
		model.addAttribute("article", notice);
		model.addAttribute("type", linkname);
		return "website/article/articledetail";
	}
}
