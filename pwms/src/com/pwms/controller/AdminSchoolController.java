package com.pwms.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.ExamQuestion;

//��У����
@Controller
@RequestMapping("/admin/school")
public class AdminSchoolController extends BaseController {
	//�鿴�γ�
	@RequestMapping("/showcourse")
	public String showCourse(Model model){
		return null;
	}
	//�鿴�γ�����
	@RequestMapping("/course")
	public String course(int courseid, Model model){
		return null;
	}
	//�鿴���еĿ���
	@RequestMapping("/showexam")
	public String showExam(Model model){
		return null;
	}
	//�鿴���Ե�����
	@RequestMapping("/exam")
	public String exam(int courseid, Model model){
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
