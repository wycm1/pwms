package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Course;
import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamRecord;
import com.pwms.pojo.User;
import com.pwms.service.ICourseService;
import com.pwms.service.IExamService;
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
	//��ʾ�γ��б���ʾ�����б�
	@RequestMapping("/")
	private String school(HttpServletRequest request, Model model){
		return null;
	}
	@RequestMapping("")
	private String index(HttpServletRequest request, Model model){
		return getList("dxgg", model);
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
			case "dxgg":model.addAttribute("type", "��У����");break;
			case "kcxx":model.addAttribute("type", "�γ�ѧϰ");break;
			case "wybm":model.addAttribute("type", "��Ҫ����");break;
			case "cjcx":model.addAttribute("type", "�ɼ���ѯ");break;
			case "zscx":model.addAttribute("type", "֤���ѯ");break;
			case "zhzt":model.addAttribute("type", "�˺�״̬");break;
			default:model.addAttribute("type", "��У����");break;
		}
		return "website/school/list";
	}
}
