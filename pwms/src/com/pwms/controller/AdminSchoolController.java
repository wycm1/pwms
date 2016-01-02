package com.pwms.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.CoureseGroup;
import com.pwms.pojo.Course;
import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamQuestion;
import com.pwms.service.ICourseGroupService;
import com.pwms.service.ICourseService;
import com.pwms.service.IExamQuestionService;
import com.pwms.service.IExamService;

//党校管理
@Controller
@RequestMapping("/admin/school")
public class AdminSchoolController extends BaseController {
	
	@Resource
	private ICourseService courseService;
	@Resource
	private IExamService examService;
	@Resource
	private IExamQuestionService questionService;
	@Resource
	private ICourseGroupService groupService;
	//查看课程
	@RequestMapping("/showcourse")
	public String showCourse(Model model){
		List<Course> courseList = courseService.getCourseByDate();
		model.addAttribute("courseList", courseList);
		return null;
	}
	//查看课程详情
	@RequestMapping("/course/{id}")
	public String course(@PathVariable int id, Model model){
		Course course = this.courseService.getCourse(id);
		model.addAttribute("course", course);
		return null;
	}
	//查看所有的考试
	@RequestMapping("/showexam")
	public String showExam(Model model){
		List<Exam> examList = this.examService.getExamDesc();
		model.addAttribute("examList", examList);
		return null;
	}
	//查看考试的详情
	@RequestMapping("/exam/{id}")
	public String exam(@PathVariable int id, Model model){
		Exam exam = this.examService.getExam(id);
		model.addAttribute("exam", exam);
		return null;
	}
	//查看课程组
	@RequestMapping("/showgroup")
	public String showGroup(Model model){
		List<CoureseGroup> groupList = this.groupService.getCourseGroupList();
		model.addAttribute("groupList", groupList);
		return null;
	}
	//查看课程组里所有的课程
	@RequestMapping("/group/{id}")
	public String group(@PathVariable int id, Model model){
		List<Course> courseList = this.courseService.getCourseByGroupId(id);
		model.addAttribute("courseList", courseList);
		return null;
	}
	//添加课程到课程组
	@RequestMapping("/group/addCourse")
	public String group(HttpServletRequest request, int groupid, int courseid, Model model){
		Course course = this.courseService.getCourse(courseid);
		CoureseGroup group = this.groupService.getCourseGroupById(groupid);
		if(group!=null&&course!=null){
			course.setGroupId(group.getId());
			this.courseService.save(course);
			return publishmsg(request, "增加成功", null );
		}else{
		    return publishmsg(request, "修改失败", null );
		}
	}
	//考试题目添加
	@RequestMapping("/exam/addquestion")
	public String addQuestion(HttpServletRequest request, ExamQuestion question, int examid, Model model){
		Exam exam = this.examService.getExam(examid);
		this.questionService.saveQuestion(question);
		return publishmsg(request, "修改失败", null );
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
