package com.spring.mvc.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class HomeController {
	
//	@RequestMapping(path="/home", method=RequestMethod.GET)
//	public String home() {
//		System.out.println("########################################### inside Controller");
//		return "index";   //View Resolver maps the index to index.jsp
//	}
//	
//	//Sending data using Model
//	@RequestMapping("/help")
//	public String help(Model model) {
//		System.out.println("########################################### inside help Controller");
//		
//		// Adding String
//		model.addAttribute("name", "Jahangeer");
//		
//		// Adding Collection
//		List<String> hobbies = new ArrayList<String>();
//		hobbies.add("Drawing");
//		hobbies.add("Painting");
//		hobbies.add("Running");
//		model.addAttribute("hobbies", hobbies);
//		
//		return "help";   //View Resolver maps the index to index.jsp
//	}
//	
//	//Sending data using ModelAndView
//	@RequestMapping("/contact")
//	public ModelAndView contact() {
//		System.out.println("########################################### inside contact Controller");
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("name", "Jahangeer");
//		modelAndView.addObject("contactNumber", new Long(23));
//		
//		modelAndView.setViewName("contact");
//		
//		return modelAndView;
//	}
}
