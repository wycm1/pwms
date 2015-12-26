package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.INoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController extends BaseController {
	//公告首页，查看公告列表，轮播图，公告信息，支部公告，总支公告
	@Resource
	private INoticeService theoryService;
	@RequestMapping("/")
	public String index(Model model){
		List<NoticeTheroyContruction> theoryList = this.theoryService.getNoticeByType(1);
		model.addAttribute("theoryList", theoryList);
		return null;
	}
	//获取公告详情
	@RequestMapping("/detail")
	public String getDetail(int id, Model model){
		NoticeTheroyContruction theory = this.theoryService.getNoticeById(id);
		model.addAttribute("theory", theory);
		return null;
	}
//	@RequestMapping("/")
}
