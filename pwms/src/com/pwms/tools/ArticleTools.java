package com.pwms.tools;

import java.util.List;

import org.springframework.ui.Model;

import com.pwms.pojo.Articletype;
import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.INoticeService;

public class ArticleTools {
	/**
	 * ����type��ѯ��type��������
	 * �ֳ�������ѯ
	 * @param type
	 * @param model
	 * @param noticeService
	 * @return "website/notice/list"
	 */
	public static String getArticleListByType(String type, 
			Model model, 
			INoticeService noticeService){
		Articletype at = noticeService.selectByLinkname(type);
//		System.out.println("test��" + at.getId() + noticeService.getArticletypeByid(at.getId()).getArticles().size());
		List<Articletype> atList = noticeService.getByPid(at.getpArticletype().getId());
		model.addAttribute("cArticletypeList",atList);
		model.addAttribute("articletype", at);
		return "website/article/articlelist";
	}
	/**
	 * ��������id��ȡ����
	 * @param model
	 * @param id
	 * @param typeValue
	 */
	public static String getArticleById(Model model,int id,String linkname,INoticeService noticeService){
		NoticeTheroyContruction notice = noticeService.getNoticeById(id);
		Articletype at = noticeService.selectByLinkname(linkname);
		List<Articletype> atList = noticeService.getByPid(at.getpArticletype().getId());
		model.addAttribute("cArticletypeList",atList);
		model.addAttribute("article", notice);
		return "website/article/articledetail";
	}
}
