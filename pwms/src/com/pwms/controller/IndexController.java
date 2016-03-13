package com.pwms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Course;
import com.pwms.pojo.TheoryCourse;
import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.pojo.Process;
import com.pwms.service.ICourseService;
import com.pwms.service.ITheoryCourseService;
import com.pwms.service.INoticeService;
import com.pwms.service.IProcessService;
import com.pwms.service.IUserService;
import com.pwms.tools.ArticleTools;
@Controller
@RequestMapping("")
public class IndexController extends BaseController{
	@Resource
	private INoticeService noticeService;
	@Resource
	private ICourseService courseService;
	@Resource
	private ITheoryCourseService theoryCourseService;
	@Resource
	private IUserService userService;
	@Resource
	private IProcessService processService;
	public INoticeService getNoticeService() {
		return noticeService;
	}
	public void setNoticeService(INoticeService noticeService) {
		this.noticeService = noticeService;
	}
	public ICourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}
	
	public ITheoryCourseService getTheoryCourseService() {
		return theoryCourseService;
	}
	public void setTheoryCourseService(ITheoryCourseService theoryCourseService) {
		this.theoryCourseService = theoryCourseService;
	}
	public IProcessService getProcessService() {
		return processService;
	}
	public void setProcessService(IProcessService processService) {
		this.processService = processService;
	}
	
    public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	//首页信息，
    @RequestMapping("/index")
    public String index(Model model,HttpSession session){
    	System.out.println("called!");
    	noticeListByTime(model);
    	courseList(model);
    	theoryList(model);
    	theoryCourseList(model);
    	processList(model);
    	session.setAttribute("user", userService.getUserById(4));
    	System.out.println("session设置成功");
    	return "website/index";
    }
    @RequestMapping("/news")
    public String news(Model model){
    	return "website/news";
    }
    @RequestMapping("/news_1")
    public String news1(Model model){
    	return "website/news_1";
    }
    @RequestMapping("/notis")
    public String notis(Model model){
    	return "website/notis";
    }
    @RequestMapping("/notis_1")
    public String notis1(Model model){
    	return "website/notis_1";
    }
    @RequestMapping("/register")
    public String register(Model model){
    	return "website/register";
    }
    @RequestMapping("/login")
    public String login(Model model){
    	return "website/login";
    }
    @RequestMapping("/jpprocess")
    public String jpprocess(Model model){
    	return "website/jpprocess";
    }
    //按时间列出最近的公告
    public void noticeListByTime(Model model){
    	List<NoticeTheroyContruction> noticeList = this.noticeService.getNoticeByType(1);
    	List<NoticeTheroyContruction> noticeListTmp = new ArrayList<NoticeTheroyContruction>();
    	for(int i=0; i< noticeList.size()&&i<6; i++){
    		noticeListTmp.add(noticeList.get(i));
    	}
    	model.addAttribute("noticeList", noticeListTmp);
//    	return null;
    }
    //获取课程列表
    public void courseList(Model model){
    	List<Course> courseList = null;
    	courseList = this.courseService.getCourseByDate();
    	if(courseList==null){
    		return;
    	}
    	List<Course> courseListTmp = new ArrayList<Course>();
    	for(int i=0;i<courseList.size()&&i<6; i++){
    		courseListTmp.add(courseList.get(i));
    	}
    	model.addAttribute("courseList", courseListTmp);
//    	return null;
    }
    //按时间排序获取党建的最新的党建
    public void theoryList(Model model){
    	List<NoticeTheroyContruction> theoryList = this.noticeService.getNoticeByType(4);
    	List<NoticeTheroyContruction> theoryListTmp = new ArrayList<NoticeTheroyContruction>();
    	for(int i=0; i< theoryList.size()&&i<6; i++){
    		theoryListTmp.add(theoryList.get(i));
    	}
    	model.addAttribute("theoryList", theoryListTmp);
    }
    //理论课程列表
    public void theoryCourseList(Model model){
    	List<TheoryCourse> theoryCourseList = this.theoryCourseService.getTheoryCourseList();
    	List<TheoryCourse> theoryCourseListTmp = new ArrayList<TheoryCourse>();
    	for(int i=0; i< theoryCourseList.size()&&i<6; i++){
    		theoryCourseListTmp.add(theoryCourseList.get(i));
    	}
    	model.addAttribute("theoryCourseList", theoryCourseListTmp);
    }
    //入党流程
    public void processList(Model model){
    	List<Process> processList = this.processService.getProcessList();
    	List<Process> processListTmp = new ArrayList<Process>();
    	for(int i=0; i< processList.size()&&i<6; i++){
    		processListTmp.add(processList.get(i));
    	}
    	model.addAttribute("processList", processListTmp);
    }
}
