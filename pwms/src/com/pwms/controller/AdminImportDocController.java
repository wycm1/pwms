package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/importdoc")
public class AdminImportDocController extends BaseController {
	//查看所有的重要文件列表
	@RequestMapping("/")
	public String index(Model model){
		return null;
	}
	//以表单形式显示，便于修改
	@RequestMapping("/modifyview")
	public String modifyView(int id, Model model){
		return null;
	}
	//修改重要文件对象
	@RequestMapping("/modify")
	public String modify(int id, Model model){
		return null;
	}
	//删除重要文件
	@RequestMapping("/delete")
	public String delete(int id, Model model){
		return null;
	}
}
