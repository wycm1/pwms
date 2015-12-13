package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/process")
public class AdminProcessController extends BaseController {
	//查看所有的进度，以用户名以及，进度号列表显示
	@RequestMapping("/all")
	public String getAll(Model model){
		return null;
	}
	//xls导出所有的进度
	@RequestMapping("/export")
	public String exportXls(Model model){
		return null;
	}
}
