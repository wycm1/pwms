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
	@RequestMapping("getJoinOut")
	public @ResponseBody List getJson(){
		return jorService.findAll();
	}
	/**
	 * ��ȡ�����û���Ϣ�޸ļ�¼
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
	 * ͨ���û�id��ȡ�û���ϸ��Ϣ
	 * @param userId
	 * @param model
	 * @return
	 */
	@RequestMapping("/user-show/{userId}")
	public String getUserinfo(@PathVariable int userId,Model model){
		//System.out.println("����ִ��~");
		model.addAttribute("userinfo", userinfoService.getUserinfoByUserid(userId));
		return "admin/user-show";
	}
	/**
	 * ͨ����Ϣ�޸�id��ȡ�޸ļ�¼��Ϣ
	 * @param udmId �޸���Ϣid
	 * @param model
	 * @return
	 */
	@RequestMapping("/userdetail-modify-show/{udmId}")
	public String getUserdetailModify(@PathVariable int udmId,Model model){
		//System.out.println("����ִ��~");
		model.addAttribute("userdetailModify", userinfoService.getUserinfoModifyByid(udmId));
		return "admin/userdetail-modify-show";
	}
}
