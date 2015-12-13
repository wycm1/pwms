package com.pwms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/process")
public class ProcessController extends BaseController {
	//查看已经完成的进度，以一棵进度树的形式显示
	@RequestMapping("/")
	public String getProcess(HttpSession session, Model model){
		return null;
	}
	//根据id显示详细介绍
	@RequestMapping("/detail")
	public String getDetail(int id, Model model){
		return null;
	}
}
