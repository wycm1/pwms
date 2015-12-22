package com.pwms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 后台管理页面显示，主要负责将页面显示所需数据传输到前台
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
