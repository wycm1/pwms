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
			case "kczx":getKCZX(model, "课程中心");return "website/school/course-list";
			case "xxjl":getArticleByType(model, "学习记录");return "website/school/study-record-list";
			case "zxks":getArticleByType(model, "在线考试");return "website/school/online-exam-list";
			case "cjcx":getArticleByType(model, "成绩查询");return "website/school/score-list";
			default:getArticleByType(model, "课程中心");break;
		}
		return "website/school/list";
	}
	/**
	 * 该方法还要完善
	 * 根据类型获取文章列表
	 * @param model
	 * @param typeValue 文章类型的参数
	 */
	public void getArticleByType(Model model,String typeValue){
		List<NoticeTheroyContruction> noticeList = this.noticeService.getNoticeByType(1);
		model.addAttribute("articleList", noticeList);
		model.addAttribute("type", typeValue);
	}
	/**
	 * 获取课程列表
	 * @param type
	 * @param model
	 */
	public void getKCZX(Model model,String typeValue){
		model.addAttribute("type", typeValue);
		model.addAttribute("courseList",courseService.getCourseByDate());
	}
	/**
	 * 课程学习
	 * @return
	 */
	@RequestMapping("/kczx/{id}/course")
	public String getCourse(@PathVariable int id,Model model){
		Course course = courseService.getCourse(id);
		model.addAttribute("course", course);
		return "website/school/video-course";
	}
}
