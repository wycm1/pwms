package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Branch;
import com.pwms.pojo.User;
import com.pwms.service.IBranchService;

@Controller
@RequestMapping("/branch")
public class BranchController extends BaseController {
	// ��ʾ�ҵ�֧����Ϣ
	@Resource
	private IBranchService branchService;

	public IBranchService getBranchService() {
		return branchService;
	}

	public void setBranchService(IBranchService branchService) {
		this.branchService = branchService;
	}

	@RequestMapping("/")
	public String branchIndex(HttpServletRequest request, HttpSession session,
			Model model) {

		return null;
	}

	// ��ʾ֧����Ա��Ϣ
	@RequestMapping("/members")
	public String getMembers(int branchid, HttpServletRequest request,
			HttpSession session, Model model) {
		Branch branch = new Branch();
		branch.setId(branchid);
		List<User> memberList = this.branchService.getBranchMember(branch);
		if (verifyClient(request)) {
			outJson("{" + listToJson("memberList", memberList) + "}");
			return null;
		}
		model.addAttribute("memberList", memberList);
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
	@RequestMapping("/getailbranch")
	public String getallBranch(HttpServletRequest request, HttpSession session, int branchId, Model model) {
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
	public String searchBranch(HttpSession session, String branchName,
			Model model) {
		
		return null;
	}
	// test
}
