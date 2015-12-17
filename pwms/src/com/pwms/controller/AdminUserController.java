package com.pwms.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.JoinOutRecord;
import com.pwms.pojo.RewardPunishRecord;
//后台用户信息管理
@Controller
@RequestMapping("/amdin/user")
public class AdminUserController extends BaseController {
	//用户验证信息导入
	@RequestMapping("/importuserxls")
	public String importUserXls(File verifyxls, Model model){
		return null;
	}
	//查看当前有修改了用户信息，但未生效的用户
	@RequestMapping("/modifylist")
	public String modifylist(Model model){
		return null;
	}
	//处理修改，通过，或者不通过
	@RequestMapping("/deal")
	public String deal(int modifyid, Model model){
		return null;
	}
	//xls用户信息导出
	@RequestMapping("/exportxls")
	public String exportXls(Model model){
		return null;
	}
	//xls转入转出信息导出
	@RequestMapping("/exportout")
	public String exportOutXls(Model model){
		return null;
	}
	//转入转出信息增加
	@RequestMapping("/addjoinout")
	public String addJoinOut(JoinOutRecord record, Model model){
		return null;
	}
	//xls奖惩登记表导出
	@RequestMapping("/exportXlsReward")
	public String exportReward(Model model){
		return null;
	}
	//添加奖惩记录
	@RequestMapping("/addreword")
	public String addReward(RewardPunishRecord record, Model model){
		return null;
	}
	
}
