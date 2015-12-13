package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/party")
public class PartyController extends BaseController {
	//查看党建专项，党的宣传信息,党建专项，宣传图片，文章 以及文章列表显示
	@RequestMapping("/")
	public String party(Model model){
		return null;
	}
	
	@RequestMapping("/article")
	public String getArticle(int id, Model model){
		return null;
	}
}
