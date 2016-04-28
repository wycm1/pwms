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
	//��ҳ
    @RequestMapping("/index")
    public String index(Model model,HttpSession session){
    	Integer [] atid = new Integer[]{2,3,4,5};
    	//���µ�֪ͨ����ؼ����ר��ؼ����ѧϰؼ��Ҫ�ļ�
    	List<NoticeTheroyContruction> allTop = noticeService.selectTopArticleByAtid(atid);
    	//���µĵ�У���������
    	List<NoticeTheroyContruction> xWAndDXGG = noticeService.selectTopXWAndDXGG();
    	session.setAttribute("user", userService.getUserById(4));
    	classify(allTop,model);
    	classifyXWAndDXGG(xWAndDXGG,model);
    	model.addAttribute("tcList", theoryCourseService.selectTopCourse());//��ȡ�������ۿγ�
    	return "website/index";
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
    @RequestMapping("/admin/welcome")
    public String welcome(){
    	return "admin/welcome";
    }
    /**
     * ������һ����Ŀ���з���
     * @param list
     * @param model
     */
    public void classify(List<NoticeTheroyContruction> list,Model model){
    	String pAtValue;
    	List<NoticeTheroyContruction> tzgg = new ArrayList<NoticeTheroyContruction>();//֪ͨ����
    	List<NoticeTheroyContruction> djzx = new ArrayList<NoticeTheroyContruction>();//����ר��
    	List<NoticeTheroyContruction> llxx = new ArrayList<NoticeTheroyContruction>();//����ѧϰ
    	List<NoticeTheroyContruction> zywj = new ArrayList<NoticeTheroyContruction>();//��Ҫ�ļ�
    	for(int i = 0;i < list.size();i++){
    		pAtValue = list.get(i).getArticletype().getpArticletype().getValue();
    		switch(pAtValue){
    			case "֪ͨ����":tzgg.add(list.get(i));break;
    			case "����ר��":djzx.add(list.get(i));break;
    			case "����ѧϰ":llxx.add(list.get(i));break;
    			case "��Ҫ�ļ�":zywj.add(list.get(i));break;
    			default:break;
    		}
    	}
    	model.addAttribute("tzggList", tzgg);
    	model.addAttribute("djzxList", djzx);
    	model.addAttribute("llxxList", llxx);
    	model.addAttribute("zywjList", zywj);
    }
    /**
     * �������ź͵�У������з���
     * @param list
     * @param model
     */
    public void classifyXWAndDXGG(List<NoticeTheroyContruction> list,Model model){
    	String atValue;
    	List<NoticeTheroyContruction> xw = new ArrayList<NoticeTheroyContruction>();//֪ͨ����
    	List<NoticeTheroyContruction> dxgg = new ArrayList<NoticeTheroyContruction>();//����ר��
    	for(int i = 0;i < list.size();i++){
    		atValue = list.get(i).getArticletype().getValue();
    		switch(atValue){
    			case "����":xw.add(list.get(i));break;
    			case "��У����":dxgg.add(list.get(i));break;
    			default:break;
    		}
    	}
    	model.addAttribute("xwList", xw);
    	model.addAttribute("dxggList", dxgg);
    }
}
