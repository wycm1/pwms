package com.pwms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/school")
public class SchoolController extends BaseController {
	//�鿴���еĿγ�
	@RequestMapping("/getcourses")
	public String getAllCourses(Model model) {
    	return null;
    }
	//�鿴���еĿ���
	@RequestMapping("/getexams")
	public String getExams(Model model) {
    	return null;
    }
	//�鿴��ʷ�ɼ�
	@RequestMapping("/getgrade")
	public String getGrade(HttpSession session, Model model)
	{
		return null;
	}
}
