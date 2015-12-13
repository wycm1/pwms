package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/theory")
public class TheoryController extends BaseController {
	//查看推荐列表，以及一些详细的内容推荐
	@RequestMapping("/")
	public String index(Model model){
		return null;
	}
	//获取详细信息, 根据传入的id来具体显示
	@RequestMapping("/getinfo")
	public String getInfo(int id, Model model){
		return null;
	}
}
