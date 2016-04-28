package com.pwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Course;
import com.pwms.service.ICourseService;

@Controller
@RequestMapping("/school/course")
public class CourseController extends BaseController {
	//ѧϰ�ογ̣���¼ѧϰ�γ̵ļ�¼
	@Resource
	private ICourseService courseService;
	@RequestMapping("/")
	public String getdetail(HttpServletRequest request, HttpSession session, int courseid, Model model){
		Course course = courseService.getCourse(courseid);
		if(verifyClient(request)){
			outJson(objectToJson("course",course));
			return null;
		}
		model.addAttribute("course", course);
		return null;
	}
}
