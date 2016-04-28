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
import com.pwms.pojo.BranchMember;
import com.pwms.pojo.User;
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
	@RequestMapping("/branch-add")
	public String branchAddShow(){
		return "admin/branch/branch-add";
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
	 * ��ʾ֧����Ϣ�޸�ҳ��
	 * @param branchid
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/branch-info-modify")
	public String showBranchModify(@RequestParam("branch") int branchid, Model model){
		Branch branch = branchService.getBranch(branchid);
		String studentId = userService.getUserById(branch.getLeaderId()).getStuOrJobid();
		model.addAttribute("studentId", studentId);
		model.addAttribute("branch", branch);
		return "admin/branch/branch-info-modify";
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
	/**
	 * ���֧����Ա
	 * @param memberid
	 * @param branchid
	 * @param model
	 * @return
	 */
	@RequestMapping("/addBranchMember")
	public String addMember(@RequestParam("stuid") String stuid, BranchMember bm, HttpSession session, Model model){
		Branch branch = (Branch) session.getAttribute("branch");
		User user = userService.getUserById(userService.getUseridByStuid(stuid));
		branchService.addMember(branch, user);
		model.addAttribute("msg", "֧����Ա��ӳɹ���");
		return "admin/notice-msg";
	}
	/**
	 * �޸�֧����Ϣ
	 * @param branch
	 * @param model
	 * @return
	 */
	@RequestMapping("/branchInfoModify")
	public String modify(@RequestParam("studentId") String studentId,Branch branch, Model model)
	{	
		int userId = userService.getUseridByStuid(studentId);
		branch.setLeaderId(userId);
		branchService.update(branch);
		model.addAttribute("msg", "֧����Ϣ�޸ĳɹ�");
		return "admin/notice-msg";
	}
	//֧������Ա��ʾ�ҵ�֧��
	@RequestMapping("/mybranch")
	public String myBranch(HttpSession session, Model model){
		return null;
	}
	/**
	 * ���֧����Ա
	 * @return
	 */
	@RequestMapping("/branch-member-add")
	public String addBranchMemeber(){
		return "admin/branch/branch-member-add";
	}
}
