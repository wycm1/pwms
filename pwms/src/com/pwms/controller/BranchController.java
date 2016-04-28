package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Branch;
import com.pwms.pojo.User;
import com.pwms.service.IBranchService;
import com.pwms.service.IUserService;

@Controller
@RequestMapping("/branch")
public class BranchController extends BaseController {
	// ��ʾ�ҵ�֧����Ϣ
	@Resource
	private IBranchService branchService;
	@Resource 
	private IUserService userService;
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public IBranchService getBranchService() {
		return branchService;
	}

	public void setBranchService(IBranchService branchService) {
		this.branchService = branchService;
	}

	@RequestMapping({"/",""})
	public String branchIndex(HttpServletRequest request, HttpSession session,
			Model model) {
		User user = (User) session.getAttribute("user");
		Branch branch = this.branchService.getUserBranch(user);
		if(branch == null){
			return publishmsg(request,"�û���û�м���֧��",null);
		}
		if(verifyClient(request)){
			outJson(objectToJson("branch", branch));
			return null;
		}
		model.addAttribute("branch", branch);
		return null;
	}
	// ����֧��id����֧��
	@RequestMapping("/addbranch")
	public String addBranch(HttpServletRequest request, HttpSession session,
			int branchId, Model model) {
		User user = (User) session.getAttribute("user");
		Branch branch = this.branchService.getBranch(branchId);
		// branch.setId(branchId);
		if (!this.branchService.isMember(branch, user)) {
			return publishmsg(request, "error", null);
		}
		this.branchService.addMember(branch, user);
		return publishmsg(request, "modify success", null);
	}

	// ��ȡ�����е�֧����Ϣ
	@RequestMapping("/detail/{branchId}")
	public String getallBranch(HttpServletRequest request, HttpSession session,@PathVariable int branchId, Model model) {
		Branch branch = this.branchService.getBranch(branchId);
		if(verifyClient(request)){
			outJson(objectToJson("branch",branch));
			return null;
		}
		model.addAttribute("branch", branch);
		return null;
	}

	// ����֧��������֧��������
	@RequestMapping("/searchbranch")
	public String searchBranch(HttpServletRequest request, HttpSession session, String branchName,
			Model model) {
		List<Branch> branchList = this.branchService.findByName(branchName);
		if(verifyClient(request)){
			outJson("{"+listToJson("branchList",branchList)+"}");
			return null;
		}
		return null;
	}
	// test
}
