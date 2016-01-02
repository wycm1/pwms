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

@Controller
@RequestMapping("/theory")
public class AdminTheoryController extends BaseController {
	//�鿴���е����۾����б�
	@Resource
	private INoticeService theoryService;
	@RequestMapping("/alltheory")
	public String getAllTheory(Model model){
		List<NoticeTheroyContruction> theoryList = this.theoryService.getNoticeByType(INoticeService.THEORY_TYPE);
		model.addAttribute("theoryList", theoryList);
		return null;
	}
	//�Ա�����ʽ��ʾ�������£������û��޸�����
	@RequestMapping("/modifyview/{id}")
	public String modifyview(@PathVariable int id, Model model){
		NoticeTheroyContruction theory = this.theoryService.getNoticeById(id);
		model.addAttribute("theory", theory);
		return null;
	}
	//����id���޸���������
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, NoticeTheroyContruction theory, Model model){
		this.theoryService.modifyNotice(theory);
		model.addAttribute("msg", "�޸ĳɹ�");
		return publishmsg(request,"�޸ĳɹ�",null); //���һ������Ϊ���ص�ҳ�棬  ���ְ汾���Է���json  ֻ��Ҫ��is_app=1�������
	}
	//ɾ������
	@RequestMapping("/delete/{id}")
	public String delete(HttpServletRequest request,@PathVariable int id,  Model model){
		NoticeTheroyContruction theory = this.theoryService.getNoticeById(id);
		this.theoryService.deleteNotice(theory);
		model.addAttribute("msg", "ɾ���ɹ�");
		return publishmsg(request,"ɾ���ɹ�",null); //���һ������Ϊ���ص�ҳ�棬  ���ְ汾���Է���json  ֻ��Ҫ��is_app=1�������
	}
}
