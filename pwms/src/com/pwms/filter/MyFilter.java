package com.pwms.filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;
/**
 * //����ueditor����ͨ��struts2
 * @author wy
 *
 */
public class MyFilter extends OncePerRequestFilter {    
	@Override
	protected void doFilterInternal(HttpServletRequest req,
			HttpServletResponse resp, FilterChain chain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //�����˵�url
        String url = req.getRequestURI();
        //System.out.println(url);
        if (url.contains("/res/")) {
            System.out.println("��ͨ��spring mvc");
            chain.doFilter(req, resp);
        }else{
            System.out.println("ͨ��spring mvc");
            super.doFilter(req, resp, chain);
        }
		
	}  
 }
