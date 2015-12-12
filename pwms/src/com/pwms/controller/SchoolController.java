package com.pwms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/school")
public class SchoolController extends BaseController {
	//查看所有的课程
	@RequestMapping("/getcourses")
	public String getAllCourses(Model model) {
    	return null;
    }
	//查看所有的考试
	@RequestMapping("/getexams")
	public String getExams(Model model) {
    	return null;
    }
	//查看历史成绩
	@RequestMapping("/getgrade")
	public String getGrade(HttpSession session, Model model)
	{
		return null;
	}
}
