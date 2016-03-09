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
@RequestMapping("/admin/party")
public class AdminPartyConstructController extends BaseController {
	//�鿴���еĵ���ר����Ϣ
	@Resource
	private INoticeService theoryService;
	@RequestMapping("/articlelist")
	public String articlelist(Model model){
		List<NoticeTheroyContruction> partyList = this.theoryService
				.getNoticeByType(8);
		model.addAttribute("partyList", partyList);
		return null;
	}
	//��ʾ�޸ĵ����±�
	@RequestMapping("/modifyview/{id}")
	public String modifyview(@PathVariable int id, Model model){
		NoticeTheroyContruction party = this.theoryService.getNoticeById(id);
		model.addAttribute("party", party);
		return null;
	}
	//�޸�����
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, NoticeTheroyContruction party, Model model){
		this.theoryService.modifyNotice(party);
		model.addAttribute("msg", "�޸ĳɹ�");
		return publishmsg(request,"�޸ĳɹ�",null); //���һ������Ϊ���ص�ҳ�棬  ���ְ汾���Է���json  ֻ��Ҫ��is_app=1�������
	}
	//��������
	@RequestMapping("/add")
	public String addParty(HttpServletRequest request, NoticeTheroyContruction notice, Model model){
		this.theoryService.save(notice);
		model.addAttribute("msg", "�����ɹ�");
		return publishmsg(request,"�����ɹ�",null); //���һ������Ϊ���ص�ҳ�棬  ���ְ汾���Է���json  ֻ��Ҫ��is_app=1�������
	}
	//ɾ������
	@RequestMapping("/delete/{id}")
	public String deleter(HttpServletRequest request, @PathVariable int id, Model model){
		NoticeTheroyContruction party = this.theoryService.getNoticeById(id);
		this.theoryService.deleteNotice(party);
		model.addAttribute("msg", "ɾ���ɹ�");
		return publishmsg(request,"ɾ���ɹ�",null); //���һ������Ϊ���ص�ҳ�棬  ���ְ汾���Է���json  ֻ��Ҫ��is_app=1�������
	}
}
