package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.INoticeService;

@Controller
@RequestMapping("/theory")
public class AdminTheoryController extends BaseController {
	//查看所有的理论经典列表
	@Resource
	private INoticeService theoryService;
	@RequestMapping("/alltheory")
	public String getAllTheory(Model model){
		List<NoticeTheroyContruction> theoryList = this.theoryService.getNoticeByType(INoticeService.THEORY_TYPE);
		model.addAttribute("theoryList", theoryList);
		return null;
	}
	//以表单的形式显示理论文章，便于用户修改文章
	@RequestMapping("/modifyview/{id}")
	public String modifyview(@PathVariable int id, Model model){
		NoticeTheroyContruction theory = this.theoryService.getNoticeById(id);
		model.addAttribute("theory", theory);
		return null;
	}
	//根据id来修改文章内容
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, NoticeTheroyContruction theory, Model model){
		this.theoryService.modifyNotice(theory);
		model.addAttribute("msg", "修改成功");
		return publishmsg(request,"修改成功",null); //最后一个参数为返回的页面，  这种版本可以返回json  只需要有is_app=1这个参数
	}
	//删除文章
	@RequestMapping("/delete/{id}")
	public String delete(HttpServletRequest request,@PathVariable int id,  Model model){
		NoticeTheroyContruction theory = this.theoryService.getNoticeById(id);
		this.theoryService.deleteNotice(theory);
		model.addAttribute("msg", "删除成功");
		return publishmsg(request,"删除成功",null); //最后一个参数为返回的页面，  这种版本可以返回json  只需要有is_app=1这个参数
	}
}
