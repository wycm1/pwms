package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/importdoc")
public class AdminImportDocController extends BaseController {
	//�鿴���е���Ҫ�ļ��б�
	@RequestMapping("/")
	public String index(Model model){
		return null;
	}
	//�Ա���ʽ��ʾ�������޸�
	@RequestMapping("/modifyview")
	public String modifyView(int id, Model model){
		return null;
	}
	//�޸���Ҫ�ļ�����
	@RequestMapping("/modify")
	public String modify(int id, Model model){
		return null;
	}
	//ɾ����Ҫ�ļ�
	@RequestMapping("/delete")
	public String delete(int id, Model model){
		return null;
	}
}
