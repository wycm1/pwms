package com.pwms.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pwms.pojo.User;
import com.pwms.pojo.Userinfo;
import com.pwms.service.IUserService;
import com.pwms.service.IUserinfoService;
import com.pwms.tools.Md5Util;
import com.pwms.tools.Validate;
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
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
	    System.out.println("执行过来了");
	    int userId = Integer.parseInt(request.getParameter("id"));
	    User user = this.userService.getUserById(userId);
	    model.addAttribute("user", user);
	    return "hello";
	}
	/**
	 * 通过身份证号，学号，验证是否为该学校学生
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/validateuser")  
	public @ResponseBody Map<String,Object> login(HttpServletRequest request) throws IOException{  
	       System.out.println(request.getParameterMap());  
	       Map<String,Object> map = new HashMap<String,Object>();  
	       if(request.getParameter("name").equals("123")){  
	    	   System.out.println("城东");  
	    	   map.put("msg", "成功");  
	       }else{  
	           System.out.println("失败");  
	           map.put("msg", "失败");  
	        }  
	        return map;  
	}  
    //登陆
    @RequestMapping("/login")
    public String login(HttpSession session, HttpServletRequest request, User user, Model model) {
    	this.userService.login(session, user.getName(), user.getPassword());
    	return publishmsg(request,"success",null);
    }
    //注销
    @RequestMapping("/logout")
    public String logout(HttpSession session, HttpServletRequest request, Model model) {
    	this.userService.logout(session);
    	return publishmsg(request,"success",null);
    }
    //查看个人信息
    //待修改
    @RequestMapping("/userinfo")
    public String getuserinfo(HttpSession session, int userid, Model model) {
    	Userinfo userinfo = this.userinfoService.getUserinfoByUserid(userid);
    	model.addAttribute(userinfo);
    	return null;
    }
    /**
     * 用户注册
     * @param session
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/register")
    public String register(HttpSession session,User user, Model model) {
    	return null;
    }
    //修改密码
    @RequestMapping("/modifypasswd")
    public String modifypasswd(String oldpasswd, String passwd, String repasswd, HttpServletRequest request, HttpSession session, Model model) {
    	User userOld = (User) session.getAttribute("user");
    	oldpasswd = Md5Util.Convert2Md5(oldpasswd);
    	if(!userOld.getPassword().equals(oldpasswd)){
    		return publishmsg(request,"旧密码错误",null);
    	}
    	else if(!passwd.equals(repasswd)){
    		return publishmsg(request,"两次密码不相同",null);
//    		userService.
    	}
    	else{
    		userOld.setPassword( Md5Util.Convert2Md5(passwd));
    		userService.updateById(userOld);
    		return null;
    	}
    }
}
