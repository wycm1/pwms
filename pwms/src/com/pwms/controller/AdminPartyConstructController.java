package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.NoticeTheroyContruction;

@Controller
@RequestMapping("/admin/party")
public class AdminPartyConstructController extends BaseController {
	//�鿴���еĵ���ר����Ϣ
	@RequestMapping("/articlelist")
	public String articlelist(Model model){
		return null;
	}
	//�޸�����
	@RequestMapping("/modify")
	public String modify(int id, Model model){
		return null;
	}
	//��������
	@RequestMapping("/add")
	public String addParty(NoticeTheroyContruction notice, Model model){
		return null;
	}
	//ɾ������
	@RequestMapping("/delete")
	public String deleter(int id, Model model){
		return null;
	}
}
