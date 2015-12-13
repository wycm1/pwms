package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
public class NoticeController extends BaseController {
	//公告首页，查看公告列表，轮播图，公告信息，支部公告，总支公告
	@RequestMapping("/")
	public String index(Model model){
		return null;
	}
	//获取公告详情
	@RequestMapping("/detail")
	public String getDetail(int id, Model model){
		return null;
	}
//	@RequestMapping("/")
}
