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
//    	System.out.println("执行过来了");
//        int userId = Integer.parseInt(request.getParameter("id"));
//        User user = this.userService.getUserById(userId);
//        model.addAttribute("user", user);
//        return "hello";
//    }
    //登陆
    @RequestMapping("/login")
    public String login(HttpSession session, User user, Model model) {
    	return null;
    }
    //注销
    @RequestMapping("/logout")
    public String logout(HttpSession session, Model model) {
    	return null;
    }
    //查看个人信息
    @RequestMapping("/userinfo")
    public String getuserinfo(HttpSession session, int userid, Model model) {
    	return null;
    }
    //注册
    @RequestMapping("/register")
    public String register(HttpSession session,User user, Model model) {
    	return null;
    }
    //修改密码
    @RequestMapping("/modifypasswd")
    public String modifypasswd(HttpSession session, Model model) {
    	return null;
    }
}
