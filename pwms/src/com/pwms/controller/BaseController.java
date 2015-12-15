package com.pwms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class BaseController {
	public boolean verifyClient(HttpServletRequest request)
	{
		String is_app=(String) request.getAttribute("is_app");
		if(is_app.equals("1"))
		{
			return true;
		}
		else
		{
			return false;     
		}
	}

}
