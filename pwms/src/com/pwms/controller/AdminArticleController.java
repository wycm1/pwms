package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/article")
public class AdminArticleController extends BaseController {
	//查看所有的文章列表
	@RequestMapping("/article-list")
	public String getAll(Model model){
		return "admin/article/article-list";
	}
	//以表单的形式显示理论文章，便于用户修改文章
	@RequestMapping("/modifyview")
	public String modifyview(int id, Model model){
		return null;
	}
	//根据id来修改文章内容
	@RequestMapping("/modify")
	public String modify(int id, Model model){
		return null;
	}
	//删除文章
	@RequestMapping("/delete")
	public String delete(int id, Model model){
		return null;
	}
}
