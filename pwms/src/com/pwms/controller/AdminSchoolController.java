package com.pwms.controller;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Course;
import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamQuestion;
import com.pwms.service.ICourseService;
import com.pwms.service.IExamService;

//��У����
@Controller
@RequestMapping("/admin/school")
public class AdminSchoolController extends BaseController {
	
	@Resource
	private ICourseService courseService;
	@Resource
	private IExamService examService;
	//�鿴�γ�
	@RequestMapping("/showcourse")
	public String showCourse(Model model){
		List<Course> courseList = courseService.getCourseByDate();
		model.addAttribute("courseList", courseList);
		return null;
	}
	//�鿴�γ�����
	@RequestMapping("/course/{id}")
	public String course(@PathVariable int id, Model model){
		Course course = this.courseService.getCourse(id);
		model.addAttribute("course", course);
		return null;
	}
	//�鿴���еĿ���
	@RequestMapping("/showexam")
	public String showExam(Model model){
		List<Exam> examList = this.examService.getExamDesc();
		model.addAttribute("examList", examList);
		return null;
	}
	//�鿴���Ե�����
	@RequestMapping("/exam/{id}")
	public String exam(@PathVariable int id, Model model){
		Exam exam = this.examService.getExam(id);
		model.addAttribute("exam", exam);
		return null;
	}
	//�鿴�γ���
	@RequestMapping("/showgroup")
	public String showGroup(Model model){
		return null;
	}
	//�鿴�γ��������еĿγ�
	@RequestMapping("/group")
	public String group(int groupid, Model model){
//		this.courseService.ge
		return null;
	}
	//��ӿγ̵��γ���
	@RequestMapping("/group/addCourse")
	public String group(int groupid, int courseid, Model model){
		return null;
	}
	//������Ŀ���
	@RequestMapping("/exam/addquestion")
	public String addQuestion(ExamQuestion question, int examid, Model model){
		return null;
	}
	//������Ŀ����
	@RequestMapping("/exam/importxls")
	public String importXls(File exam, Model model){
		return null;
	}
	//���Գɼ�����
	@RequestMapping("/exam/exportxls")
	public String exportXls(File exam, Model model){
		return null;
	}
}
