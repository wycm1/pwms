package com.pwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pwms.pojo.Branch;
import com.pwms.service.IBranchService;
import com.pwms.service.IUserService;

//��̨����֧������
@Controller
@RequestMapping("/admin/branch")
public class AdminBranchController extends BaseController {
	@Resource
	private IBranchService branchService;
	@Resource
	private IUserService userService;
	//ҳ����ʾ
	/**
	 * �鿴����֧��
	 * @param model
	 * @return
	 */
	@RequestMapping("/branch-list")
	public ModelAndView showBranches(){
		ModelAndView mav = new ModelAndView("admin/branch/branch-list");
		System.out.println("��ʾ����֧��");
		mav.addObject("branchList",branchService.findAll());
		return mav;
	}
	/**
	 * ��ʾ֧�������г�Ա
	 * @param branchid
	 * @param model
	 * @return
	 */
		@RequestMapping(value="/branch-member-list")
		public String showMember(@RequestParam("branch") int branchid, Model model){
			Branch branch = branchService.getBranch(branchid);
			model.addAttribute("bmList", branchService.getBranchMember(branch));
			return "admin/branch/branch-member-list";
		}
	/**
	 * ���֧��
	 * @param stuid
	 * @param branch
	 * @param model
	 * @return
	 */
	@RequestMapping("/addbranch")
	public String addBranch(@RequestParam("stuid") String stuid,Branch branch, Model model){
		int userId = userService.getUseridByStuid(stuid);
		branch.setLeaderId(userId);
		branchService.save(branch);
		model.addAttribute("msg", "���֧���ɹ�");
		return "admin/notice-msg";
	}
	//���ӳ�Ա
	@RequestMapping("/addmember")
	public String addMember(int memberid, int branchid, Model model){
		return null;
	}
	//�޸�֧����Ϣ
	@RequestMapping("/modify")
	public String modify(Branch branch, Model model)
	{
		return null;
	}
	//֧������Ա��ʾ�ҵ�֧��
	@RequestMapping("/mybranch")
	public String myBranch(HttpSession session, Model model){
		return null;
	}
}
