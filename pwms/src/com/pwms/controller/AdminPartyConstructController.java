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
@RequestMapping("/admin/party")
public class AdminPartyConstructController extends BaseController {
	//查看现有的党建专项信息
	@Resource
	private INoticeService theoryService;
	@RequestMapping("/articlelist")
	public String articlelist(Model model){
		List<NoticeTheroyContruction> partyList = this.theoryService
				.getNoticeByType(8);
		model.addAttribute("partyList", partyList);
		return null;
	}
	//显示修改的文章表单
	@RequestMapping("/modifyview/{id}")
	public String modifyview(@PathVariable int id, Model model){
		NoticeTheroyContruction party = this.theoryService.getNoticeById(id);
		model.addAttribute("party", party);
		return null;
	}
	//修改文章
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, NoticeTheroyContruction party, Model model){
		this.theoryService.modifyNotice(party);
		model.addAttribute("msg", "修改成功");
		return publishmsg(request,"修改成功",null); //最后一个参数为返回的页面，  这种版本可以返回json  只需要有is_app=1这个参数
	}
	//增加文章
	@RequestMapping("/add")
	public String addParty(HttpServletRequest request, NoticeTheroyContruction notice, Model model){
		this.theoryService.save(notice);
		model.addAttribute("msg", "发布成功");
		return publishmsg(request,"发布成功",null); //最后一个参数为返回的页面，  这种版本可以返回json  只需要有is_app=1这个参数
	}
	//删除文章
	@RequestMapping("/delete/{id}")
	public String deleter(HttpServletRequest request, @PathVariable int id, Model model){
		NoticeTheroyContruction party = this.theoryService.getNoticeById(id);
		this.theoryService.deleteNotice(party);
		model.addAttribute("msg", "删除成功");
		return publishmsg(request,"删除成功",null); //最后一个参数为返回的页面，  这种版本可以返回json  只需要有is_app=1这个参数
	}
}
