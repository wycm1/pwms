package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.NoticeTheroyContruction;

@Controller
@RequestMapping("/admin/party")
public class AdminPartyConstructController extends BaseController {
	//查看现有的党建专项信息
	@RequestMapping("/articlelist")
	public String articlelist(Model model){
		return null;
	}
	//修改文章
	@RequestMapping("/modify")
	public String modify(int id, Model model){
		return null;
	}
	//增加文章
	@RequestMapping("/add")
	public String addParty(NoticeTheroyContruction notice, Model model){
		return null;
	}
	//删除文章
	@RequestMapping("/delete")
	public String deleter(int id, Model model){
		return null;
	}
}
