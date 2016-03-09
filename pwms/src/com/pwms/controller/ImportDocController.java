package com.pwms.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Articletype;
import com.pwms.pojo.ImportDoc;
import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.IImportDocService;
import com.pwms.service.INoticeService;
import com.pwms.tools.ArticleTools;
/**
 * 暂时不用
 * @author Administrator
 *
 */
//@Controller
//@RequestMapping("/impdoc")
public class ImportDocController extends BaseController {
	@Resource
	private IImportDocService importDocService;
	@Resource
	private INoticeService noticeService;
	public IImportDocService getImportDocService() {
		return importDocService;
	}
	public void setImportDocService(IImportDocService importDocService) {
		this.importDocService = importDocService;
	}
	//重要文件列表
	@RequestMapping("/")
	public String index(HttpServletRequest request, Model model){
		List<ImportDoc> importDocList = importDocService.getImportDocList();
		if(verifyClient(request)){
			outJson("{"+listToJson("importDocList",importDocList)+"}");
			return null;
		}
		model.addAttribute("importDocList", importDocList);
		return "website/doc";
	}
	@RequestMapping("")
	public String doc(HttpServletRequest request, Model model){
//		return index(request, model);
		return getList("dswx",model);
	}
	@RequestMapping("/detail/{id}")
	public String detail(HttpServletRequest request, @PathVariable int id, Model model){
		ImportDoc importDoc = this.importDocService.getImportDocById(id);
		if(verifyClient(request)){
			outJson(objectToJson("importDoc", importDoc));
			return null;
		}
		model.addAttribute("importDoc", importDoc);
		return "website/docdetail";
	}
	//查看具体的重要文件
	@RequestMapping("/download/{id}")
	public String dowmload(@PathVariable int id,HttpServletResponse response, Model model){
		ImportDoc importDoc = this.importDocService.getImportDocById(id);
		response.setContentType("application/x-download");
		File file = new File(importDoc.getFilepath());
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		InputStream input = null;
		try {
			input = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] data = new byte[(int) file.length()];
		try {
			input.read(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print(data);
		return null;
	}
	/**
	 * 访问重要文件下的列表
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/{type}/list")
	public String getList(@PathVariable String type, Model model){
		return ArticleTools.getArticleListByType(type, model, noticeService);
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
//		System.out.println(noticeList.get(0).getArticletype() == null);
		Articletype at = noticeService.getArticletypeByid(1);
//		System.out.println("总共有文章:" + at.getArticles().size());
		model.addAttribute("type", typeValue);
	}
	@RequestMapping("/{type}/{id}")
	public String getArticle(@PathVariable String type, @PathVariable int id,Model model){
		switch(type){
			case "dswx":getArticleByType(model, id,"党史文献");break;
			case "gzzd":getArticleByType(model, id,"规则制度");break;
			case "jddd":getArticleByType(model, id,"经典导读");break;
			case "cyws":getArticleByType(model, id,"常用文书");break;
			case "rdbd":getArticleByType(model, id,"入党必读");break;
			case "xtsc":getArticleByType(model, id,"系统手册");break;
			default:getArticleByType(model, "党史文献");break;
		}
		return "website/impdoc/article";
	}
	/**
	 * 该方法还要完善
	 * 根据id获取文章
	 * @param model
	 * @param typeValue 文章类型的参数
	 */
	public void getArticleByType(Model model,int id,String typeValue){
		NoticeTheroyContruction notice = this.noticeService.getNoticeById(id);
		model.addAttribute("article", notice);
		model.addAttribute("type", typeValue);
	}
}
