package com.jsp.springjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String userId,@RequestParam String password)
	{
		if(userId.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin"))
		{
			model.put("userId", userId);
		return "welcome";
		}else
		{
		model.put("errorMsg", "Please provide correct userId and Password");
		return "login";
		}
	}
	

}
