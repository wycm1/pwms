package com.pwms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Service("branch")
public class BranchController extends BaseController {
	//显示我的支部信息
	@RequestMapping("/")
	public String branchIndex(HttpSession session, Model model)
	{
		return null;
	}
	//显示支部成员信息
	@RequestMapping("/members")
	public String getMembers(HttpSession session, Model model)
	{
		return null;
	}
	//根据支部id加入支部
	@RequestMapping("/addbranch")
	public String addBranch(HttpSession session,int branchId, Model model)
	{
		return null;
	}
	//获取到所有的支部信息
	@RequestMapping("/getallbranch")
	public String getallBranch(HttpSession session,int branchId, Model model)
	{
		return null;
	}
	//搜索支部，根据支部的名称
	@RequestMapping("/searchbranch")
	public String searchBranch(HttpSession session,String branchName, Model model)
	{
		return null;
	}
	//test
}
