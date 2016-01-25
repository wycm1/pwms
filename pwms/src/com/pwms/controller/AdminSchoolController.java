package com.pwms.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.pwms.pojo.CoureseGroup;
import com.pwms.pojo.Course;
import com.pwms.pojo.Exam;
import com.pwms.pojo.ExamQuestion;
import com.pwms.service.ICourseGroupService;
import com.pwms.service.ICourseService;
import com.pwms.service.IExamQuestionService;
import com.pwms.service.IExamService;

//��У����
@Controller
@RequestMapping("/admin/school")
public class AdminSchoolController extends BaseController {
	
	@Resource
	private ICourseService courseService;
	@Resource
	private IExamService examService;
	@Resource
	private IExamQuestionService questionService;
	@Resource
	private ICourseGroupService groupService;
	//�鿴�γ�
	@RequestMapping("/course-list")
	public String showCourse(Model model){
		List<Course> courseList = courseService.getCourseByDate();
		model.addAttribute("courseList", courseList);
		return null;
	}
	//�鿴�γ�����
	@RequestMapping("/course/{id}")
	public String course(@PathVariable int id, Model model){
		Course course = this.courseService.getCourse(id);
		model.addAttribute("course", course);
		return null;
	}
	//�鿴���еĿ���
	@RequestMapping("/showexam")
	public String showExam(Model model){
		List<Exam> examList = this.examService.getExamDesc();
		model.addAttribute("examList", examList);
		return null;
	}
	//�鿴���Ե�����
	@RequestMapping("/exam/{id}")
	public String exam(@PathVariable int id, Model model){
		Exam exam = this.examService.getExam(id);
		model.addAttribute("exam", exam);
		return null;
	}
	//�鿴�γ���
	@RequestMapping("/showgroup")
	public String showGroup(Model model){
		List<CoureseGroup> groupList = this.groupService.getCourseGroupList();
		model.addAttribute("groupList", groupList);
		return null;
	}
	//�鿴�γ��������еĿγ�
	@RequestMapping("/group/{id}")
	public String group(@PathVariable int id, Model model){
		List<Course> courseList = this.courseService.getCourseByGroupId(id);
		model.addAttribute("courseList", courseList);
		return null;
	}
	//��ӿγ̵��γ���
	@RequestMapping("/group/addCourse")
	public String group(HttpServletRequest request, int groupid, int courseid, Model model){
		Course course = this.courseService.getCourse(courseid);
		CoureseGroup group = this.groupService.getCourseGroupById(groupid);
		if(group!=null&&course!=null){
			course.setGroupId(group.getId());
			this.courseService.save(course);
			return publishmsg(request, "���ӳɹ�", null );
		}else{
		    return publishmsg(request, "�޸�ʧ��", null );
		}
	}
	/**
	 * ��ӿγ�
	 * @param course
	 * @param request
	 * @return
	 */
	@RequestMapping("/addCourse")
	public String addCourse(@RequestParam(value = "file", required = false) MultipartFile file,Course course,HttpServletRequest request,Model model){
		String path = request.getSession().getServletContext().getRealPath("") + "/upload/video/";//
		String fileName = file.getOriginalFilename();
		fileName = System.currentTimeMillis() + fileName.substring(fileName.indexOf("."));
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        System.out.println("�ļ��ϴ���\n" + path + fileName + "\n�ɹ���");
        course.setSummary("/upload/video/");
        course.setUserId(4);
        course.setDateline(new Date());
        courseService.save(course);
		model.addAttribute("msg", "�γ���ӳɹ���");
		return "admin/notice-msg";
	}
	/**
	 * ��ʾ�޸Ŀγ�ҳ��
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/course-modify/{id}")
	public String showCourseModify(@PathVariable int id,Model model){
		model.addAttribute("course", courseService.getCourse(id));
		return "admin/school/course-modify";
	}
	/**
	 * �޸Ŀγ�
	 * @param model
	 * @param course
	 * @return
	 */
	@RequestMapping("/modifyCourse")
	public String modifyCourse(Model model,Course course){
		course.setDateline(new Date());
		course.setUserId(4);
		courseService.updateById(course);
		model.addAttribute("msg","�γ��޸ĳɹ���");
		return "admin/notice-msg";
	}
	//������Ŀ���
	@RequestMapping("/exam/addquestion")
	public String addQuestion(HttpServletRequest request, ExamQuestion question, int examid, Model model){
		Exam exam = this.examService.getExam(examid);
		this.questionService.saveQuestion(question);
		return publishmsg(request, "��ӳɹ�", null );
	}
	//������Ŀ����
	@RequestMapping("/exam/importxls/{id}")
	public String importXls(HttpServletRequest request, @PathVariable int id, File exam, Model model){
		this.questionService.xls2ExamQuestion(exam, id);
		return publishmsg(request, "����ɹ�", null );
	}
	//���Գɼ�����
	@RequestMapping("/exam/exportxls")
	public String exportXls(File exam, Model model){
		return null;
	}
}
