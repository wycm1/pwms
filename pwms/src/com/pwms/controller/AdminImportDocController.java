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
	//�鿴���е���Ҫ�ļ��б�
	@RequestMapping("/")
	public String index(Model model){
		List<ImportDoc> docList = this.importdocService.getImportDocList();
		model.addAttribute("docList", docList);
		return null;
	}
	//�Ա���ʽ��ʾ�������޸�,��ʾ�ľ���ĳһ��
	@RequestMapping("/modifyview/{id}")
	public String modifyView(@PathVariable int id, Model model){
		ImportDoc doc = this.importdocService.getImportDocById(id);
		model.addAttribute("doc", doc);
		return null;
	}
	//�޸���Ҫ�ļ�����
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, ImportDoc doc, Model model){
		this.importdocService.updateById(doc);
		model.addAttribute("msg", "�޸ĳɹ�!");
		return publishmsg(request,"�޸ĳɹ�!",null); //���һ������Ϊ���ص�ҳ�棬  ���ְ汾���Է���json  ֻ��Ҫ��is_app=1�������
	}
	//ɾ����Ҫ�ļ�
	@RequestMapping("/delete/{id}")
	public String delete(HttpServletRequest request,@PathVariable int id, Model model){
		ImportDoc doc = this.importdocService.getImportDocById(id);
		this.importdocService.deleteById(doc);
		model.addAttribute("msg", "ɾ���ɹ�!");
		return publishmsg(request,"ɾ���ɹ�!",null); //���һ������Ϊ���ص�ҳ�棬  ���ְ汾���Է���json  ֻ��Ҫ��is_app=1�������
	}
}
