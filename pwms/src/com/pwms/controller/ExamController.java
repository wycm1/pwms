package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.ExamQuestion;
import com.pwms.service.IExamQuestionService;
import com.pwms.service.IExamService;

@Controller
@RequestMapping("/exam")
public class ExamController extends BaseController {
	//��ȡ������Ŀ
	@Resource
	private IExamService examService;
//	@Resource
//	private IExamQuestionService examQuestionService;
//	public IExamQuestionService getExamQuestionService() {
//		return examQuestionService;
//	}
//	public void setExamQuestionService(IExamQuestionService examQuestionService) {
//		this.examQuestionService = examQuestionService;
//	}
	public IExamService getExamService() {
		return examService;
	}
	public void setExamService(IExamService examService) {
		this.examService = examService;
	}
	//�õ����Ե����еĿ���
//	@RequestMapping("/getquestions")
//	public String getExamQuestion(HttpServletRequest request, int examId, HttpSession session, Model model){
//		List<ExamQuestion> questionList = this.examQuestionService.getQuestionsByExamId(examId);
//		if(verifyClient(request)){
//			outJson("{"+listToJson("questionList",questionList)+"}");
//			return null;
//		}
//		model.addAttribute("questionList", questionList);
//		return null;
//	}
	//�����û���,���沢�����û���
	@RequestMapping("/postanswer")
	public String execUserAnswer(int examId,String[] questions, HttpSession session, Model model){
		return null;
	}
	//�鿴��
//	@RequestMapping("/getanswer")
//	public String getanswer(HttpServletRequest request, int examId, HttpSession session, Model model){
//		List<ExamQuestion> questionList = this.examQuestionService.getQuestionsByExamId(examId);
//		if(verifyClient(request)){
//			outJson("{"+listToJson("questionList",questionList)+"}");
//			return null;
//		}
//		model.addAttribute("questionList", questionList);
//		return null;
//	}
}
