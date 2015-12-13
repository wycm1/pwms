package com.pwms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/school/course")
public class CourseController extends BaseController {
	//学习次课程，记录学习课程的记录
	@RequestMapping("/")
	public String getdetail(HttpSession session, int courseid, Model model){
		return null;
	}
}
