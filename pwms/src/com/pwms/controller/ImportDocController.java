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

import com.pwms.pojo.ImportDoc;
import com.pwms.service.IImportDocService;

@Controller
@RequestMapping("/doc")
public class ImportDocController extends BaseController {
	@Resource
	private IImportDocService importDocService;
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
		return index(request, model);
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
}
