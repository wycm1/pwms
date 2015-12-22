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

//后台管理，支部管理
@Controller
@RequestMapping("/admin/branch")
public class AdminBranchController extends BaseController {
	@Resource
	private IBranchService branchService;
	@Resource
	private IUserService userService;
	//页面显示
	/**
	 * 查看所有支部
	 * @param model
	 * @return
	 */
	@RequestMapping("/branch-list")
	public ModelAndView showBranches(){
		ModelAndView mav = new ModelAndView("admin/branch/branch-list");
		System.out.println("显示所有支部");
		mav.addObject("branchList",branchService.findAll());
		return mav;
	}
	/**
	 * 显示支部内所有成员
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
	 * 添加支部
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
		model.addAttribute("msg", "添加支部成功");
		return "admin/notice-msg";
	}
	//增加成员
	@RequestMapping("/addmember")
	public String addMember(int memberid, int branchid, Model model){
		return null;
	}
	//修改支部信息
	@RequestMapping("/modify")
	public String modify(Branch branch, Model model)
	{
		return null;
	}
	//支部管理员显示我的支部
	@RequestMapping("/mybranch")
	public String myBranch(HttpSession session, Model model){
		return null;
	}
}
