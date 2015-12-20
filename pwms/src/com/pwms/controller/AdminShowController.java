package com.pwms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pwms.pojo.JoinOutRecord;
import com.pwms.pojo.RewardPunishRecord;
import com.pwms.service.IJoinOutRecordService;
import com.pwms.service.IRewardPunishRecordService;
import com.pwms.tools.FileManage;
/**
 * ��̨����ҳ����ʾ����Ҫ����ҳ����ʾ�������ݴ��䵽ǰ̨
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
	@RequestMapping("/index")
	public String directView(){
		return "admin/index";
	}
	@RequestMapping("/reward-punish-add")
	public String rewardPunishAdd(){
		return "admin/reward-punish-add";
	}
	@RequestMapping("/join-out-add")
	public String joinOutAdd(){
		return "admin/join-out-add";
	}
	/**
	 * ��ȡ���н��ͼ�¼
	 * @param model
	 * @return
	 */
	@RequestMapping("/reward-punish-list")
	public ModelAndView getAllRPR(){
		ModelAndView mav = new ModelAndView("admin/reward-punish-list");
		List<RewardPunishRecord> allRPR = rprService.findAll();
		System.out.println(allRPR.size());
		System.out.println(allRPR.get(0).getName());
		mav.addObject("rpList", allRPR);
        return mav;
	}
	/**
	 * ��ȡ����ת��ת����¼
	 * @param model
	 * @return
	 */
	@RequestMapping("/join-out-list")
	public ModelAndView getAllJOR(){
		ModelAndView mav = new ModelAndView("admin/join-out-list");
		mav.addObject("joList", jorService.findAll());
        return mav;
	}
}
