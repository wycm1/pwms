package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
public class NoticeController extends BaseController {
	//������ҳ���鿴�����б��ֲ�ͼ��������Ϣ��֧�����棬��֧����
	@RequestMapping("/")
	public String index(Model model){
		return null;
	}
	//��ȡ��������
	@RequestMapping("/detail")
	public String getDetail(int id, Model model){
		return null;
	}
//	@RequestMapping("/")
}
