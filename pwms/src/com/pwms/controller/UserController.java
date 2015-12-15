package com.pwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.User;
import com.pwms.pojo.Userinfo;
import com.pwms.service.IUserService;
import com.pwms.service.IUserinfoService;
//import java.lang.Integer;
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
    @Resource
    private IUserService userService;
    private IUserinfoService userinfoService;
    public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public IUserinfoService getUserinfoService() {
		return userinfoService;
	}
	public void setUserinfoService(IUserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}
	//    @RequestMapping("/showUser")
//    public String toIndex(HttpServletRequest request, Model model) {
//    	System.out.println("ִ�й�����");
//        int userId = Integer.parseInt(request.getParameter("id"));
//        User user = this.userService.getUserById(userId);
//        model.addAttribute("user", user);
//        return "hello";
//    }
    //��½
    @RequestMapping("/login")
    public String login(HttpSession session, HttpServletRequest request, User user, Model model) {
    	this.userService.login(session, user.getName(), user.getPassword());
    	return publishmsg(request,"success",null);
    }
    //ע��
    @RequestMapping("/logout")
    public String logout(HttpSession session, HttpServletRequest request, Model model) {
    	this.userService.logout(session);
    	return publishmsg(request,"success",null);
    }
    //�鿴������Ϣ
    //���޸�
    @RequestMapping("/userinfo")
    public String getuserinfo(HttpSession session, int userid, Model model) {
    	Userinfo userinfo = this.userinfoService.getUserinfoByUserid(userid);
    	model.addAttribute(userinfo);
    	return null;
    }
    //ע��
    @RequestMapping("/register")
    public String register(HttpSession session,User user, Model model) {
    	return null;
    }
    //�޸�����
    @RequestMapping("/modifypasswd")
    public String modifypasswd(HttpSession session, Model model) {
    	return null;
    }
}
