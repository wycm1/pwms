package com.pwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pwms.pojo.User;
import com.pwms.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
    @Resource
    private IUserService userService;

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
    public String login(HttpSession session, User user, Model model) {
    	return null;
    }
    //ע��
    @RequestMapping("/logout")
    public String logout(HttpSession session, Model model) {
    	return null;
    }
    //�鿴������Ϣ
    @RequestMapping("/userinfo")
    public String getuserinfo(HttpSession session, int userid, Model model) {
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
