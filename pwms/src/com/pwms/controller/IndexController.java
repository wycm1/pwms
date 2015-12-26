package com.pwms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Course;
import com.pwms.pojo.ImportDoc;
import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.pojo.Process;
import com.pwms.service.ICourseService;
import com.pwms.service.IImportDocService;
import com.pwms.service.INoticeService;
import com.pwms.service.IProcessService;
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController{
	@Resource
	private INoticeService noticeService;
	@Resource
	private ICourseService courseService;
	@Resource
	private IImportDocService importService;
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
	public IImportDocService getImportService() {
		return importService;
	}
	public void setImportService(IImportDocService importService) {
		this.importService = importService;
	}
	public IProcessService getProcessService() {
		return processService;
	}
	public void setProcessService(IProcessService processService) {
		this.processService = processService;
	}
	@Resource
	private IProcessService processService;
    //首页信息，
    @RequestMapping("/")
    public String index(Model model){
    	System.out.println("called!");
    	noticeListByTime(model);
    	courseList(model);
    	theoryList(model);
    	importDocList(model);
    	processList(model);
    	return "index";
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
    	model.addAttribute("courses", courseListTmp);
//    	return null;
    }
    //按时间排序获取党建的最新的党建
    public void theoryList(Model model){
    	List<NoticeTheroyContruction> theoryList = this.noticeService.getNoticeByType(4);
    	List<NoticeTheroyContruction> theoryListTmp = new ArrayList<NoticeTheroyContruction>();
    	for(int i=0; i< theoryList.size()&&i<6; i++){
    		theoryListTmp.add(theoryList.get(i));
    	}
    	model.addAttribute("theory", theoryListTmp);
    }
    //重要文章列表
    public void importDocList(Model model){
    	List<ImportDoc> importDocList = this.importService.getImportDocList();
    	List<ImportDoc> importDocListTmp = new ArrayList<ImportDoc>();
    	for(int i=0; i< importDocList.size()&&i<6; i++){
    		importDocListTmp.add(importDocList.get(i));
    	}
    	model.addAttribute("importdoc", importDocListTmp);
    }
    //入党流程
    public void processList(Model model){
    	List<Process> processList = this.processService.getProcessList();
    	List<Process> processListTmp = new ArrayList<Process>();
    	for(int i=0; i< processList.size()&&i<6; i++){
    		processListTmp.add(processList.get(i));
    	}
    	model.addAttribute("process", processListTmp);
    }
}
