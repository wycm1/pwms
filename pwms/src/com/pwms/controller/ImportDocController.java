package com.pwms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.service.IImportDocService;

@Controller
@RequestMapping("/doc")
public class ImportDocController extends BaseController {
	@Resource
	private IImportDocService importDocService;
	//��Ҫ�ļ��б�
	@RequestMapping("/")
	public String index(Model model){
//		importDocService.
		return null;
	}
	//�鿴�������Ҫ�ļ�
	@RequestMapping("/download")
	public String index(int id, Model model){
		return null;
	}
}
