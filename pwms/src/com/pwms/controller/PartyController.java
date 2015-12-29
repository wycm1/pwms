package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.INoticeService;

@Controller
@RequestMapping("/party")
public class PartyController extends BaseController {
	//�鿴����ר�����������Ϣ,����ר�����ͼƬ������ �Լ������б���ʾ
	@Resource
	private INoticeService partyServer;
	@RequestMapping("/")
	public String party(HttpServletRequest request, Model model){
		List<NoticeTheroyContruction> partyList = this.partyServer.getNoticeByType(4);
		model.addAttribute("partyList", partyList);
		if(verifyClient(request)){
			outJson("{"+listToJson("partyList",partyList)+"}");
			return null;
		}
		return "website/party";
	}
	
	@RequestMapping("/article")
	public String getArticle(int id, Model model){
		NoticeTheroyContruction party = this.partyServer.getNoticeById(id);
		model.addAttribute("party", party);
		return null;
	}
}
