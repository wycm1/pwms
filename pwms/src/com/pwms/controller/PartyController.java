package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/party")
public class PartyController extends BaseController {
	//�鿴����ר�����������Ϣ,����ר�����ͼƬ������ �Լ������б���ʾ
	@RequestMapping("/")
	public String party(Model model){
		return null;
	}
	
	@RequestMapping("/article")
	public String getArticle(int id, Model model){
		return null;
	}
}
