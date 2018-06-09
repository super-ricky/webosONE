package com.ricky.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping(path="/")
	String home(ModelMap modal){
		modal.addAttribute("title", "CRUD Example");
		System.out.println("hi");
		return "index";
	}
	
	@RequestMapping(path="/partials/{page}")
	String partialHandler(@PathVariable("page") final String page){
		return page;
	}
}
