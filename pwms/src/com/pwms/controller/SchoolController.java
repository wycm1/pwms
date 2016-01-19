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
 * 网上党校
 * @author wy
 *
 */
@Controller
@RequestMapping("/school")
public class SchoolController extends BaseController {
	//查看所有的课程
	@Resource
	private ICourseService courseService;
	@Resource
	private IExamService examService;
	//显示课程列表，显示考试列表
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
	//查看所有的考试
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
	//查看历史成绩
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
	 * 访问网上党校下的列表
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/list")
	public String getList(@PathVariable String type, Model model){
		switch(type){
			case "dxgg":model.addAttribute("type", "党校公告");break;
			case "kcxx":model.addAttribute("type", "课程学习");break;
			case "wybm":model.addAttribute("type", "我要报名");break;
			case "cjcx":model.addAttribute("type", "成绩查询");break;
			case "zscx":model.addAttribute("type", "证书查询");break;
			case "zhzt":model.addAttribute("type", "账号状态");break;
			default:model.addAttribute("type", "党校公告");break;
		}
		return "website/school/list";
	}
}
