package com.pwms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pwms.pojo.User;
import com.pwms.pojo.Userinfo;
import com.pwms.service.IUserService;
import com.pwms.service.IUserinfoService;

@Controller
public class TestController {
	@Resource
    private IUserService userService;
	private IUserinfoService userinfoService;
    @RequestMapping("/test")
    public String test(HttpSession session, HttpServletRequest request, @ModelAttribute User user1, Userinfo userinfo, Model model)
    {
    	
    	userService.login(session, "xb", "1234");
    	User user=(User) session.getAttribute("user");
    	System.out.println("i:"+user1.getName()+"user1.id"+user1.getId());
    	System.out.println("userinfo:"+userinfo.getId());
//    	String identity="510923";
//    	if(!userService.chkinfo(identity, "xb", "13101"))
//    	{
//    		model.addAttribute("msg", "没有你的信息");
//    	}
//    	User user= new User();
//    	user.setName("xb");
//    	user.setStuOrJobid("13101");
//    	user.setPassword("1234");
//    	user.setProcessId(0);
//    	user.setRegisterTime(new Date());
//    	user.setType(0);
//    	userService.register(user, identity);
    	return "hello";
    }
}
