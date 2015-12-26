package com.pwms.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.ImportDoc;
import com.pwms.service.IImportDocService;

@Controller
@RequestMapping("/doc")
public class ImportDocController extends BaseController {
	@Resource
	private IImportDocService importDocService;
	//重要文件列表
	@RequestMapping("/")
	public String index(Model model){
		List<ImportDoc> importDocList = importDocService.getImportDocList();
		
		model.addAttribute("importDocList", importDocList);
		return null;
	}
	//查看具体的重要文件
	@RequestMapping("/download")
	public String index(int id,HttpServletResponse response, Model model){
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
