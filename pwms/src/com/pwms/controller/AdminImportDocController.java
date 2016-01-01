package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.ImportDoc;
import com.pwms.service.IImportDocService;

@Controller
@RequestMapping("/admin/importdoc")
public class AdminImportDocController extends BaseController {
	@Resource
	private IImportDocService importdocService;
	//查看所有的重要文件列表
	@RequestMapping("/")
	public String index(Model model){
		List<ImportDoc> docList = this.importdocService.getImportDocList();
		model.addAttribute("docList", docList);
		return null;
	}
	//以表单形式显示，便于修改,显示的具体某一个
	@RequestMapping("/modifyview/{id}")
	public String modifyView(@PathVariable int id, Model model){
		ImportDoc doc = this.importdocService.getImportDocById(id);
		model.addAttribute("doc", doc);
		return null;
	}
	//修改重要文件对象
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, ImportDoc doc, Model model){
		this.importdocService.updateById(doc);
		model.addAttribute("msg", "修改成功!");
		return publishmsg(request,"修改成功!",null); //最后一个参数为返回的页面，  这种版本可以返回json  只需要有is_app=1这个参数
	}
	//删除重要文件
	@RequestMapping("/delete/{id}")
	public String delete(HttpServletRequest request,@PathVariable int id, Model model){
		ImportDoc doc = this.importdocService.getImportDocById(id);
		this.importdocService.deleteById(doc);
		model.addAttribute("msg", "删除成功!");
		return publishmsg(request,"删除成功!",null); //最后一个参数为返回的页面，  这种版本可以返回json  只需要有is_app=1这个参数
	}
}
