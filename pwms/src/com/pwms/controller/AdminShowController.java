package com.pwms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * ��̨����ҳ����ʾ����Ҫ����ҳ����ʾ�������ݴ��䵽ǰ̨
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminShowController extends BaseController {
	@RequestMapping("/index")
	public String directView(){
		return "admin/index";
	}
}
