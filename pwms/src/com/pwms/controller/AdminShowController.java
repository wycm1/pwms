package com.pwms.controller;

import javax.annotation.Resource;





import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.service.IJoinOutRecordService;
import com.pwms.service.IRewardPunishRecordService;
import com.pwms.service.IUserinfoService;
/**
 * 后台管理页面显示，主要负责将页面显示所需数据传输到前台
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminShowController extends BaseController {
	@Resource
	private IRewardPunishRecordService rprService;
	@Resource
	private IJoinOutRecordService jorService;
	@Resource
	private IUserinfoService userinfoService;
	@RequestMapping("/index")
	public String directView(){
		return "admin/index";
	}
}
