package com.pwms.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pwms.pojo.User;
import com.pwms.service.IUserService;

public class UserVerifyInterceptor implements HandlerInterceptor {
	@Resource
    private IUserService userService;
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("after:ִ�й�����");
//		response.sendRedirect("/");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse response,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("post:ִ�й�����");
//		response.sendRedirect("/");
	}
	@SuppressWarnings("deprecation")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ִ�е�������");
		HttpSession session= request.getSession();
		session.setAttribute("user", userService.getUserById(4));//�����ֶ�����session
		User user=(User) session.getAttribute("user");
		if(user==null)
		{
			response.sendRedirect(request.getContextPath()+"/login.html");
			return false;
		}
		return true;
	}

}
