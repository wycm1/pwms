package com.pwms.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.service.IBranchService;
/**
 * ��̨����ҳ����ʾ����Ҫ����ҳ����ʾ�������ݴ��䵽ǰ̨
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminShowController extends BaseController {
	@Resource
	private IBranchService branchService;
	@RequestMapping("/index")
	public String directView(HttpSession session){
		//����ר�ã�����֧��session
		session.setAttribute("branch", branchService.getBranch(1));
		System.out.println("֧�������˵�¼�ɹ���");
		return "admin/index";
	}
}
