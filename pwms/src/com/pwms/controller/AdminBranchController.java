package com.pwms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Branch;

//��̨����֧������
@Controller
@RequestMapping("/amdin/branch")
public class AdminBranchController extends BaseController {
	//����֧��
	@RequestMapping("/add")
	public String addBranch(Branch branch, Model model){
		return null;
	}
	//���ӳ�Ա
	@RequestMapping("/addmember")
	public String addMember(int memberid, int branchid, Model model){
		return null;
	}
	//�鿴���е�֧��
	@RequestMapping("/showbranches")
	public String showBranches(Model model){
		return null;
	}
	//��ʾ֧���ڳ�Ա
	@RequestMapping("/showmember")
	public String showMember(int branchid, Model model){
		return null;
	}
	//�޸�֧����Ϣ
	@RequestMapping("/modify")
	public String modify(Branch branch, Model model)
	{
		return null;
	}
	//֧������Ա��ʾ�ҵ�֧��
	@RequestMapping("/")
	public String myBranch(HttpSession session, Model model){
		return null;
	}
}
