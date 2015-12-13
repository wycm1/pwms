package com.pwms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Branch;

//后台管理，支部管理
@Controller
@RequestMapping("/amdin/branch")
public class AdminBranchController extends BaseController {
	//增加支部
	@RequestMapping("/add")
	public String addBranch(Branch branch, Model model){
		return null;
	}
	//增加成员
	@RequestMapping("/addmember")
	public String addMember(int memberid, int branchid, Model model){
		return null;
	}
	//查看所有的支部
	@RequestMapping("/showbranches")
	public String showBranches(Model model){
		return null;
	}
	//显示支部内成员
	@RequestMapping("/showmember")
	public String showMember(int branchid, Model model){
		return null;
	}
	//修改支部信息
	@RequestMapping("/modify")
	public String modify(Branch branch, Model model)
	{
		return null;
	}
	//支部管理员显示我的支部
	@RequestMapping("/")
	public String myBranch(HttpSession session, Model model){
		return null;
	}
}
