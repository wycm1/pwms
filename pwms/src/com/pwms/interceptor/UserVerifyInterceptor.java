package com.pwms.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.pwms.pojo.User;

public class UserVerifyInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("after:执行过来了");
//		response.sendRedirect("/");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse response,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("post:执行过来了");
//		response.sendRedirect("/");
	}
	@SuppressWarnings("deprecation")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session= request.getSession();
		User user=(User) session.getAttribute("user");
		if(user==null)
		{
			response.sendRedirect(request.getContextPath()+"/test1");
			return false;
		}
		return true;
	}

}
