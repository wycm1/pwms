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
@RequestMapping("/party")
public class PartyController extends BaseController {
	//查看党建专项，党的宣传信息,党建专项，宣传图片，文章 以及文章列表显示
	@Resource
	private INoticeService partyServer;
	public INoticeService getPartyServer() {
		return partyServer;
	}
	public void setPartyServer(INoticeService partyServer) {
		this.partyServer = partyServer;
	}
	@RequestMapping("/")
	public String party(HttpServletRequest request, Model model){
		List<NoticeTheroyContruction> partyList = this.partyServer.getNoticeByType(2);
		model.addAttribute("partyList", partyList);
		if(verifyClient(request)){
			outJson("{"+listToJson("partyList",partyList)+"}");
			return null;
		}
		return "website/party";
	}
	@RequestMapping("")
	public String index(HttpServletRequest request, Model model){
		return party(request,model);
	}
	@RequestMapping("/article/{id}")
	public String getArticle(HttpServletRequest request,@PathVariable  int id, Model model){
		NoticeTheroyContruction party = this.partyServer.getNoticeById(id);
		if(verifyClient(request)){
			outJson(objectToJson("party",party));
			return null;
		}
		model.addAttribute("party", party);
		return "website/partydetail";
	}
}
