package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Articletype;
import com.pwms.pojo.Course;
import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamRecord;
import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.pojo.User;
import com.pwms.service.ICourseService;
import com.pwms.service.IExamService;
import com.pwms.service.INoticeService;
import com.pwms.tools.ArticleTools;
/**
 * ���ϵ�У
 * @author wy
 *
 */
@Controller
@RequestMapping("/school")
public class SchoolController extends BaseController {
	//�鿴���еĿγ�
	@Resource
	private ICourseService courseService;
	@Resource
	private IExamService examService;
	@Resource
	private INoticeService noticeService;
	@RequestMapping({"","/"})
	private String index(HttpServletRequest request, Model model){
		return getList("kczx", model);
	}
	@RequestMapping("/getcourses")
	public String getAllCourses(HttpServletRequest request, Model model) {
		List<Course> courseList = courseService.getCourseByDate();
		if(verifyClient(request)){
			outJson("{"+listToJson("courseList",courseList)+"}");
			return null;
		}
		model.addAttribute("courseList", courseList);
    	return null;
    }
	//�鿴���еĿ���
	@RequestMapping("/getexams")
	public String getExams(HttpServletRequest request, Model model) {
		List<Exam> examList = examService.getExamDesc();
		if(verifyClient(request)){
			outJson("{"+listToJson("examList",examList)+"}");
			return null;
		} 
		model.addAttribute("examList", examList);
    	return null;
    }
	//�鿴��ʷ�ɼ�
	@RequestMapping("/getgrade")
	public String getGrade(HttpServletRequest request, HttpSession session, Model model)
	{
		User user = (User) session.getAttribute("user");
		List<ExamRecord> examRecordList = this.examService.getRecord(user);
		if(verifyClient(request)){
			outJson("{"+listToJson("examRecordList",examRecordList)+"}");
			return null;
		} 
		model.addAttribute("examRecordList", examRecordList);
		return null;
	}
	/**
	 * �������ϵ�У�µ��б�
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/list")
	public String getList(@PathVariable String type, Model model){
		switch(type){
			case "kczx":getKCZX(model, "�γ�����");return "website/school/course-list";
			case "xxjl":getArticleByType(model, "ѧϰ��¼");return "website/school/study-record-list";
			case "zxks":getArticleByType(model, "���߿���");return "website/school/online-exam-list";
			case "cjcx":getArticleByType(model, "�ɼ���ѯ");return "website/school/score-list";
			default:getArticleByType(model, "�γ�����");break;
		}
		return "website/school/list";
	}
	/**
	 * �÷�����Ҫ����
	 * �������ͻ�ȡ�����б�
	 * @param model
	 * @param typeValue �������͵Ĳ���
	 */
	public void getArticleByType(Model model,String typeValue){
		List<NoticeTheroyContruction> noticeList = this.noticeService.getNoticeByType(1);
		model.addAttribute("articleList", noticeList);
		model.addAttribute("type", typeValue);
	}
	/**
	 * ��ȡ�γ��б�
	 * @param type
	 * @param model
	 */
	public void getKCZX(Model model,String typeValue){
		model.addAttribute("type", typeValue);
		model.addAttribute("courseList",courseService.getCourseByDate());
	}
	/**
	 * �γ�ѧϰ
	 * @return
	 */
	@RequestMapping("/kczx/{id}/course")
	public String getCourse(@PathVariable int id,Model model){
		Course course = courseService.getCourse(id);
		model.addAttribute("course", course);
		return "website/school/video-course";
	}
}
