package com.pwms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class DefaultController {
	@RequestMapping("/index")
	public String directView(){
		return "index";
	}
}
