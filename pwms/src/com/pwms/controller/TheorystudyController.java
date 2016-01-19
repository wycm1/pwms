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
 * ����ѧϰ
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/theory")
public class TheorystudyController extends BaseController {
	// �鿴�Ƽ��б��Լ�һЩ��ϸ�������Ƽ�
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
	// ��ȡ��ϸ��Ϣ, ���ݴ����id��������ʾ
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
     * ��ʾ���������б�
     * @param model
     * @return
     */
	@RequestMapping("classicaltheory-list")
	public String getClassicaltheoryList(Model model){
		getArticleByType(model,"���۾���");
		return "website/theroystudy/classicaltheory-list";
	}
	/**
     * ��ʾӰ��γ��б�
     * @param model
     * @return
     */
	@RequestMapping("videocourse-list")
	public String getVideotheoryList(Model model){
		getArticleByType(model,"��Ӱ�γ�");
		return "website/theroystudy/videocourse-list";
	}
	/**
	 * �÷�����Ҫ����
	 * �������ͻ�ȡ�����б�
	 * @param model
	 * @param typeValue �������͵Ĳ���
	 */
	public void getArticleByType(Model model,String typeValue){
		List<NoticeTheroyContruction> noticeList = this.noticeService.getNoticeByType(1);
		model.addAttribute("articleList", noticeList);
		model.addAttribute("type", typeValue);
	}
} 
