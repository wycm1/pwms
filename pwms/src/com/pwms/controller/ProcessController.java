package com.pwms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/process")
public class ProcessController extends BaseController {
	//�鿴�Ѿ���ɵĽ��ȣ���һ�ý���������ʽ��ʾ
	@RequestMapping("/")
	public String getProcess(HttpSession session, Model model){
		return null;
	}
	//����id��ʾ��ϸ����
	@RequestMapping("/detail")
	public String getDetail(int id, Model model){
		return null;
	}
}
