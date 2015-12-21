package com.pwms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pwms.pojo.JoinOutRecord;
import com.pwms.pojo.RewardPunishRecord;
import com.pwms.pojo.User;
import com.pwms.service.IJoinOutRecordService;
import com.pwms.service.IRewardPunishRecordService;
import com.pwms.service.IUserinfoService;
import com.pwms.tools.FileManage;
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
	@RequestMapping("/reward-punish-add")
	public String rewardPunishAdd(){
		return "admin/reward-punish-add";
	}
	@RequestMapping("/join-out-add")
	public String joinOutAdd(){
		return "admin/join-out-add";
	}
	/**
	 * 获取所有奖惩记录
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
	 * 获取所有转入转出记录
	 * @param model
	 * @return
	 */
	@RequestMapping("/join-out-list")
	public ModelAndView getAllJOR(){
		ModelAndView mav = new ModelAndView("admin/join-out-list");
		mav.addObject("joList", jorService.findAll());
        return mav;
	}
	@RequestMapping("getJoinOut")
	public @ResponseBody List getJson(){
		return jorService.findAll();
	}
	/**
	 * 获取所有用户信息修改记录
	 * @return
	 */
	@RequestMapping("/userdetail-modify-list")
	public ModelAndView getAllUserinfoModify(HttpServletRequest request){
		ModelAndView mav = new ModelAndView("admin/userdetail-modify-list");
		User u = new User();
		u.setId(4);
		HttpSession session = request.getSession();
		session.setAttribute("user", u);
		User user = (User) session.getAttribute("user");
		mav.addObject("udmList", userinfoService.getModifyByUserFlag(user, 0));
        return mav;
	}
	/**
	 * 通过用户id获取用户详细信息
	 * @param userId
	 * @param model
	 * @return
	 */
	@RequestMapping("/user-show/{userId}")
	public String getUserinfo(@PathVariable int userId,Model model){
		//System.out.println("正在执行~");
		model.addAttribute("userinfo", userinfoService.getUserinfoByUserid(userId));
		return "admin/user-show";
	}
	/**
	 * 通过信息修改id获取修改记录信息
	 * @param udmId 修改信息id
	 * @param model
	 * @return
	 */
	@RequestMapping("/userdetail-modify-show/{udmId}")
	public String getUserdetailModify(@PathVariable int udmId,Model model){
		//System.out.println("正在执行~");
		model.addAttribute("userdetailModify", userinfoService.getUserinfoModifyByid(udmId));
		return "admin/userdetail-modify-show";
	}
}
