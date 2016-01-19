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
/**
 * 党建专项
 * @author wy
 *
 */
@Controller
@RequestMapping("/party")
public class PartyController extends BaseController {
	//查看党建专项，党的宣传信息,党建专项，宣传图片，文章 以及文章列表显示
	@Resource
	private INoticeService noticeService;
	public INoticeService getPartyServer() {
		return noticeService;
	}
	public void setPartyServer(INoticeService partyServer) {
		this.noticeService = partyServer;
	}
	@RequestMapping("/")
	public String party(HttpServletRequest request, Model model){
		List<NoticeTheroyContruction> partyList = this.noticeService.getNoticeByType(INoticeService.PARTY_TYPE);
		model.addAttribute("partyList", partyList);
		if(verifyClient(request)){
			outJson("{"+listToJson("partyList",partyList)+"}");
			return null;
		}
		return "website/party";
	}
	@RequestMapping("")
	public String index(HttpServletRequest request, Model model){
		return getList("zyjs",model);
	}
	@RequestMapping("/article/{id}")
	public String getArticle(HttpServletRequest request,@PathVariable  int id, Model model){
		NoticeTheroyContruction party = this.noticeService.getNoticeById(id);
		if(verifyClient(request)){
			outJson(objectToJson("party",party));
			return null;
		}
		model.addAttribute("party", party);
		return "website/partydetail";
	}
	/**
	 * 访问党建专项下的列表
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/list")
	public String getList(@PathVariable String type, Model model){
		switch(type){
			case "zyjs":getArticleByType(model, "中央精神");break;
			case "qzlx":getArticleByType(model, "群众路线");break;
			case "zgm":getArticleByType(model, "中国梦");break;
			default:getArticleByType(model, "中央精神");break;
		}
		return "website/party/list";
	}
	/**
	 * 该方法还要完善
	 * 根据类型获取文章列表
	 * @param model
	 * @param typeValue 文章类型的参数
	 */
	public void getArticleByType(Model model,String typeValue){
		List<NoticeTheroyContruction> noticeList = this.noticeService.getNoticeByType(1);
		model.addAttribute("articleList", noticeList);
		model.addAttribute("type", typeValue);
	}
}
