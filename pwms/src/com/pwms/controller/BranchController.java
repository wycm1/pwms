package com.pwms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Service("branch")
public class BranchController extends BaseController {
	//��ʾ�ҵ�֧����Ϣ
	@RequestMapping("/")
	public String branchIndex(HttpSession session, Model model)
	{
		return null;
	}
	//��ʾ֧����Ա��Ϣ
	@RequestMapping("/members")
	public String getMembers(HttpSession session, Model model)
	{
		return null;
	}
	//����֧��id����֧��
	@RequestMapping("/addbranch")
	public String addBranch(HttpSession session,int branchId, Model model)
	{
		return null;
	}
	//��ȡ�����е�֧����Ϣ
	@RequestMapping("/getallbranch")
	public String getallBranch(HttpSession session,int branchId, Model model)
	{
		return null;
	}
	//����֧��������֧��������
	@RequestMapping("/searchbranch")
	public String searchBranch(HttpSession session,String branchName, Model model)
	{
		return null;
	}
	//test
}
