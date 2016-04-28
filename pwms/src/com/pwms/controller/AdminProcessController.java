package com.pwms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.Process;
import com.pwms.service.IProcessService;

@Controller
@RequestMapping("/admin/process")
public class AdminProcessController extends BaseController {
	@Resource
	private IProcessService processService;
	//�鿴���еĽ��ȣ����û����Լ������Ⱥ��б���ʾ
	@RequestMapping("/all")
	public String getAll(Model model){
		List<Process> processList = this.processService.getProcessList();
		model.addAttribute("processList", processList);
		return null;
	}
	//xls�������еĽ���
	@RequestMapping("/export")
	public String exportXls(Model model){
		return null;
	}
}
