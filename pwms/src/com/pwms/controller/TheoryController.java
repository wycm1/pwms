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
public class TheoryController extends BaseController {
	// �鿴�Ƽ��б��Լ�һЩ��ϸ�������Ƽ�
	@Resource
	private INoticeService theoryService;

	@RequestMapping("/")
	public String index(HttpServletRequest request, Model model) {
		List<NoticeTheroyContruction> theoryList = this.theoryService
				.getNoticeByType(4);
		if (verifyClient(request)) {
			outJson("{" + listToJson("theoryList", theoryList) + "}");
			return null;
		} else {
			model.addAttribute("theoryList", theoryList);
			return "website/theory";
		}
	}
	@RequestMapping("")
	public String theory(HttpServletRequest request, Model model) {
		return index(request,model);
	}
	// ��ȡ��ϸ��Ϣ, ���ݴ����id��������ʾ
	@RequestMapping("/detail/{id}")
	public String getInfo(HttpServletRequest request, @PathVariable  int id, Model model) {
		NoticeTheroyContruction theory = this.theoryService.getNoticeById(id);
		if (verifyClient(request)) {
			outJson(theory + "");
			return null;
		} else {
			model.addAttribute("theory", theory);
			return "website/theorydetail";
		}
	}
}
