package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.Services.UserServices;
import com.spring.mvc.model.User;


@Controller
public class Enroll {
	
	@Autowired
	private UserServices userService;

	@RequestMapping("/enroll")
	public String showRegistration() {
		return "enroll";
	}
	
	@RequestMapping(path = "/process", method=RequestMethod.POST)
	public String process(@ModelAttribute User user) {
		userService.createUser(user);
		return "success";
	}
	

}
