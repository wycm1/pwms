package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/notice")
public class AdminNoticeController extends BaseController {
	//�鿴���е������б�
	@RequestMapping("/all")
	public String getAll(Model model){
		return null;
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
	//ɾ������
	@RequestMapping("/delete")
	public String delete(int id, Model model){
		return null;
	}
}
