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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamQuestion;
import com.pwms.pojo.User;
import com.pwms.service.IExamQuestionService;
import com.pwms.service.IExamService;

@Controller
@RequestMapping("/school/zxks")
/**
 * ����
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
	/**
	 * �����Խ��
	 * @param examId ����id
	 * @param request
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping("{examId}/postanswer")
	public String execUserAnswer(@PathVariable int examId, HttpServletRequest request,
			HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		Enumeration<String> enumer = request.getParameterNames();
		if(!enumer.hasMoreElements()){
			model.addAttribute("msg", "�벻Ҫ�ظ��ύ��!");
			return "website/notice";
		}
		Map<Integer, String> resultMap = new HashMap<Integer, String>();
		while (enumer.hasMoreElements()) {
			String questionId = enumer.nextElement();
			System.out.println("����id:" + questionId);
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
		model.addAttribute("aqCount", grade/(100/(resultMap.size())));
		return "website/school/exam-result";
	}

	// �鿴��
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
	 * ���ݿ���id�����ȡ������Ŀ
	 * ͨ����ȡ������Ŀ��ֵ����ȷ�����ض��ٵ���Ŀ
	 * @return
	 */
	@RequestMapping("/{id}/exam")
	public String getExam(@PathVariable int id,Model model){
		Exam e = examService.getExam(id);
		int ss = e.getSingleScore();//��ȡ������ķ�ֵ
		int questionCount= 100/ss;
		System.out.println(questionCount);
		model.addAttribute("eqList", examQuestionService.randomSelectByExamId(questionCount, id));
		model.addAttribute("exam", e);
		model.addAttribute("qs",questionCount);
		return "website/school/exam";
	}
}
