package com.pwms.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.ExamQuestion;
import com.pwms.pojo.User;
import com.pwms.service.IExamQuestionService;
import com.pwms.service.IExamService;

@Controller
@RequestMapping("/school/zxks")
/**
 * 考试
 * @author wy
 *
 */
public class ExamController extends BaseController {
	@Resource
	private IExamService examService;
	@Resource
	private IExamQuestionService examQuestionService;

	public IExamQuestionService getExamQuestionService() {
		return examQuestionService;
	}

	public void setExamQuestionService(IExamQuestionService examQuestionService) {
		this.examQuestionService = examQuestionService;
	}

	public IExamService getExamService() {
		return examService;
	}

	public void setExamService(IExamService examService) {
		this.examService = examService;
	}

	// 得到考试的所有的考题
	@RequestMapping("/getquestions")
	public String getExamQuestion(HttpServletRequest request, int examId,
			HttpSession session, Model model) {
		List<ExamQuestion> questionList = this.examQuestionService
				.getQuestionsByExamId(examId);
		if (verifyClient(request)) {
			outJson("{" + listToJson("questionList", questionList) + "}");
			return null;
		}
		model.addAttribute("questionList", questionList);
		return null;
	}

	// 接受用户答案,保存并处理用户答案
	@RequestMapping("/postanswer")
	public String execUserAnswer(int examId, HttpServletRequest request,
			HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		Enumeration<String> enumer = request.getParameterNames();
		Map<Integer, String> resultMap = new HashMap<Integer, String>();
		while (enumer.hasMoreElements()) {
			String questionId = enumer.nextElement();
			int questionNum = 0;
			try {
				questionNum = Integer.parseInt(questionId);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			resultMap.put(questionNum, request.getParameter(questionId));
		}
		int grade = this.examQuestionService.calcGrade2Record(examId, resultMap, user);
		model.addAttribute("grade", grade);
		return null;
	}

	// 查看答案
	@RequestMapping("/getanswer")
	public String getanswer(HttpServletRequest request, int examId,
			HttpSession session, Model model) {
		List<ExamQuestion> questionList = this.examQuestionService
				.getQuestionsByExamId(examId);
		if (verifyClient(request)) {
			outJson("{" + listToJson("questionList", questionList) + "}");
			return null;
		}
		model.addAttribute("questionList", questionList);
		return null;
	}
	/**
	 * 考试
	 * @return
	 */
	@RequestMapping("/{id}/exam")
	public String getExam(){
		return "website/school/exam";
	}
}
