package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/process")
public class AdminProcessController extends BaseController {
	//�鿴���еĽ��ȣ����û����Լ������Ⱥ��б���ʾ
	@RequestMapping("/all")
	public String getAll(Model model){
		return null;
	}
	//xls�������еĽ���
	@RequestMapping("/export")
	public String exportXls(Model model){
		return null;
	}
}
