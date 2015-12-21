package com.pwms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 验证是否为app请求
 * @author Administrator
 *
 */
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
	public String publishmsg(HttpServletRequest request, String msg, String returnView){
		if(verifyClient(request))
    	{
			outJson("{\"msg\":\""+msg+"\"}");
    		return null;
    	}
		return returnView;
	}
	public String mapToJson(Map map){
		String resultStr="{";
		for (Object key : map.keySet()) {
			String str = "\""+key+"\":\""+map.get(key)+"\",";
			resultStr=resultStr+str;
		}
		if(resultStr.charAt(resultStr.length()-1)==','){
		    resultStr.substring(0,resultStr.length()-1);
		}
		return resultStr+"}";
	}
	public void outJson(String json){
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		ServletWebRequest servletWebRequest=new ServletWebRequest(request);
		HttpServletResponse response=servletWebRequest.getResponse();
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("Cache-Control","no-cache");
		PrintWriter out =null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print(json);
		out.flush();
		out.close();
	}
}
