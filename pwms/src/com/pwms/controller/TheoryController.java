package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/theory")
public class TheoryController extends BaseController {
	//�鿴�Ƽ��б��Լ�һЩ��ϸ�������Ƽ�
	@RequestMapping("/")
	public String index(Model model){
		return null;
	}
	//��ȡ��ϸ��Ϣ, ���ݴ����id��������ʾ
	@RequestMapping("/getinfo")
	public String getInfo(int id, Model model){
		return null;
	}
}
