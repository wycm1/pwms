package com.pwms.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.ExamQuestion;

//党校管理
@Controller
@RequestMapping("/admin/school")
public class AdminSchoolController extends BaseController {
	//查看课程
	@RequestMapping("/showcourse")
	public String showCourse(Model model){
		return null;
	}
	//查看课程详情
	@RequestMapping("/course")
	public String course(int courseid, Model model){
		return null;
	}
	//查看所有的考试
	@RequestMapping("/showexam")
	public String showExam(Model model){
		return null;
	}
	//查看考试的详情
	@RequestMapping("/exam")
	public String exam(int courseid, Model model){
		return null;
	}
	//查看课程组
	@RequestMapping("/showgroup")
	public String showGroup(Model model){
		return null;
	}
	//查看课程组里所有的课程
	@RequestMapping("/group")
	public String group(int groupid, Model model){
		return null;
	}
	//添加课程到课程组
	@RequestMapping("/group/addCourse")
	public String group(int groupid, int courseid, Model model){
		return null;
	}
	//考试题目添加
	@RequestMapping("/exam/addquestion")
	public String addQuestion(ExamQuestion question, int examid, Model model){
		return null;
	}
	//考试题目导入
	@RequestMapping("/exam/importxls")
	public String importXls(File exam, Model model){
		return null;
	}
	//考试成绩导出
	@RequestMapping("/exam/exportxls")
	public String exportXls(File exam, Model model){
		return null;
	}
}
