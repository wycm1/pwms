package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/article")
public class AdminArticleController extends BaseController {
	//�鿴���е������б�
	@RequestMapping("/article-list")
	public String getAll(Model model){
		return "admin/article/article-list";
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
