package com.pwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.service.IExamService;

@Controller
@RequestMapping("/exam")
public class ExamController extends BaseController {
	//��ȡ������Ŀ
	@Resource
	private IExamService examService;
	public IExamService getExamService() {
		return examService;
	}
	public void setExamService(IExamService examService) {
		this.examService = examService;
	}
	@RequestMapping("/getquestion")
	public String getExamQuestion(int examId, HttpSession session, Model model){
//		examService.
		return null;
	}
	//�����û���,���沢�����û���
	@RequestMapping("/postanswer")
	public String execUserAnswer(int examId,String[] questions, HttpSession session, Model model){
		return null;
	}
	//�鿴��
	@RequestMapping("/getanswer")
	public String getanswer(int examId, HttpSession session, Model model){
		return null;
	}
}
