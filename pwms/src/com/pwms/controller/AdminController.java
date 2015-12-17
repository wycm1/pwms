package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping("/index")
	public String directView(){
		return "admin/index";
	}
	@RequestMapping("/reward-punish-list")
	public String rewardPunishList(){
		return "admin/reward-punish-list";
	}
	@RequestMapping("/reward-punish-add")
	public String rewardPunishAdd(){
		return "admin/reward-punish-add";
	}
}
