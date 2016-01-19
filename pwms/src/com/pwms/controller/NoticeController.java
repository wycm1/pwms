package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.pojo.User;
import com.pwms.service.INoticeService;
import com.pwms.service.IUserService;
/**
 * ֪ͨ����
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/notice")
public class NoticeController extends BaseController {
	//������ҳ���鿴�����б��ֲ�ͼ��������Ϣ��֧�����棬��֧����
	@Resource
	private INoticeService noticeService;
	@Resource
	private IUserService userService;
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public INoticeService getNoticeService() {
		return noticeService;
	}
	public void setNoticeService(INoticeService noticeService) {
		this.noticeService = noticeService;
	}
	@RequestMapping("")
	public String index(HttpServletRequest request, Model model){
//		List<NoticeTheroyContruction> noticeList = this.noticeService.getNoticeByType(INoticeService.NOTICE_TYPE);
//		if(verifyClient(request)){
//			outJson("{"+listToJson("noticeList",noticeList)+"}");
//			return null;
//		}
//		model.addAttribute("noticeList", noticeList);
		return getList("hdtz",model);
	}
	@RequestMapping("/")
	public String index_o(HttpServletRequest request, Model model){
		return index(request,model);
	}
	//��ȡ��������
	@RequestMapping("/detail")
	public String getDetail(HttpServletRequest request, int id, Model model){
		NoticeTheroyContruction notice = this.noticeService.getNoticeById(id);
//		User user =null;
//		if(notice!=null){
//			user = userService.getUserById(notice.getUserId());
//		}
		if(verifyClient(request)){
//			outJson("{\"notice\":"+notice+", author :\""+user+"\"}");
			outJson(objectToJson("notice",notice));
			return null;
		}
		model.addAttribute("notice", notice);
//		model.addAttribute("author", user);
//		"website/noticedetail"
		return "website/noticedetail";
	}
	/**
	 * ���ʵ���ר���µ��б�
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/list")
	public String getList(@PathVariable String type, Model model){
		switch(type){
			case "hdtz":getArticleByType(model, "�֪ͨ");break;
			case "sqrdx":getArticleByType(model, "�����˵�У");break;
			case "jjfzdx":getArticleByType(model, "�������ӵ�У");break;
			case "ybdydx":getArticleByType(model, "Ԥ����Ա��У");break;
			default:getArticleByType(model, "�֪ͨ");break;
		}
		return "website/notice/list";
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
}
