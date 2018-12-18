package com.spring.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {

	@RequestMapping(path="/start/{name}",method=RequestMethod.GET)
	public String start(@PathVariable String name, ModelMap model) {
		String str="Hello!! " + name+" ..?";
		System.out.println(str);
		return "start";
	}
	
}
