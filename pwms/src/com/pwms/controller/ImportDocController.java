package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doc")
public class ImportDocController extends BaseController {
	//��Ҫ�ļ��б�
	@RequestMapping("/")
	public String index(Model model){
		return null;
	}
	//�鿴�������Ҫ�ļ�
	@RequestMapping("/download")
	public String index(int id, Model model){
		return null;
	}
}
